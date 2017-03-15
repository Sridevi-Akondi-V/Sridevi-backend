package controllers;


import com.fasterxml.jackson.databind.JsonNode;
import com.google.inject.Inject;
import controllers.security.Authenticator;
import models.Member;

import play.Logger;
import play.db.jpa.JPAApi;
import play.db.jpa.Transactional;
import play.libs.Json;
import play.mvc.Result;

import javax.persistence.TypedQuery;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

import java.util.List;


import exceptions.NotFoundException;
import services.UserService;

import static play.mvc.Controller.request;
import static play.mvc.Results.badRequest;
import static play.mvc.Results.notFound;
import static play.mvc.Results.ok;

/* Created by Sridevi Akondi*/


public class MemberController {

    public MemberController() {

    }

    private JPAApi jpaApi;
    private UserService userService;
    private static SecureRandom rnd = new SecureRandom();

    @Inject
    public MemberController(JPAApi jpaApi, UserService userService) {

        this.jpaApi = jpaApi;
        this.userService = userService;
    }

    @Transactional
    public Result getMembersList() {
        TypedQuery<Member> query = jpaApi.em().createQuery("SELECT m FROM Member m", Member.class);
        List<Member> members = query.getResultList();
        JsonNode json = Json.toJson(members);
        return ok(json);
    }


    @Transactional
    public Result getMemberByID(Integer id) {
        Member m = jpaApi.em().find(Member.class, id);
        JsonNode json = Json.toJson(m);
        return ok(json);
    }


    @Transactional
    public Result createMember() throws NoSuchAlgorithmException {
        final JsonNode json = request().body().asJson();
        if (null == json) {
            return badRequest("Unable to get json from request");
        }
        final Member m = Json.fromJson(json, Member.class);
        if (null == m) {
            return badRequest("Unable to parse json to Member object");
        }
        String q1 = "Select m from Member m where m.uname='" + m.getUname() + "'";
        TypedQuery<Member> query = jpaApi.em().createQuery(q1, Member.class);
        List<Member> members = query.getResultList();
        if (!members.isEmpty()) {
            return badRequest("username already exists");
        }
        String salt = createSalt(20);
        String q = getSaltedHash(getSHA256(m.getPwd()), salt);
        Logger.debug(q);
        m.setPwd(salt + q);
        jpaApi.em().merge(m);
        Logger.debug(m.getPwd() + "" + m.getUname());
        return ok(json);
    }

    public static String getSHA256(String message) throws NoSuchAlgorithmException {
        MessageDigest sha256 = MessageDigest.getInstance("SHA-256");
        sha256.reset();
        sha256.update(message.getBytes());
        byte[] digest = sha256.digest();
        return String.format("%0" + (digest.length << 1) + "x", new BigInteger(1,
                digest));
    }


    public static String getSaltedHash(String message, String salt) throws NoSuchAlgorithmException {
        return getSHA256(salt + getSHA256(message));
    }


    private static String createSalt(int length) throws NoSuchAlgorithmException {
        byte[] msg = new byte[40];
        rnd.nextBytes(msg);
        MessageDigest sha256 = MessageDigest.getInstance("SHA-256");
        sha256.reset();
        byte[] digest = sha256.digest(msg);
        return String.format("%0" + (digest.length << 1) + "x", new BigInteger(1, digest)).substring(0, length);
    }


    @Transactional
    @Authenticator
    public Result updateMember(Integer id) {
        final JsonNode json = request().body().asJson();
        if (null == json) {
            return badRequest("not found");
        }
        Member m = Json.fromJson(json, Member.class);
        if (null == m) {
            return badRequest("not found");
        }
        Member originalmember = jpaApi.em().find(Member.class, id);
        originalmember.setEmail(m.getEmail());
        originalmember.setPwd(m.getPwd());
        originalmember.setDob(m.getDob());
        originalmember.setUser_Address(m.getUser_Address());
        jpaApi.em().merge(originalmember);
        return ok("the following member is updated" + originalmember.getEmail() + originalmember.getPwd() + originalmember.getDob() + originalmember.getUser_Address());
    }

    @Transactional
    public Result deleteMember(Integer id){
        Member m=jpaApi.em().find(Member.class,id);
        jpaApi.em().remove(m);
        return ok();
    }
}