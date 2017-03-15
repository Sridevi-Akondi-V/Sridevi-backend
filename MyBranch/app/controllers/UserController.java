package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import controllers.security.Authenticator;
import controllers.security.IsAdmin;
import models.Member;
import models.Restaurant;
import play.Logger;
import play.db.jpa.JPAApi;
import play.db.jpa.Transactional;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import services.UserService;
import javax.inject.Inject;
import javax.persistence.Query;

import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class UserController extends Controller {

    private UserService userService;
    List<Member> m;
    final JsonNode json= Json.toJson(m);

    private JPAApi jpaApi;

    @Inject
    public UserController(UserService userService, JPAApi jpaApi) {

        this.jpaApi = jpaApi;
        this.userService = userService;
    }


    public Result createUser() throws NoSuchAlgorithmException {
        return status(NOT_IMPLEMENTED);
    }

    public Result getUser(Integer id) {

        return status(NOT_IMPLEMENTED);
    }

    public Result updateUser(Integer id) {

        return status(NOT_IMPLEMENTED);
    }

    public Result deleteUser(Integer id) {

        return status(NOT_IMPLEMENTED);
    }


    @Transactional
    public Result signIn() throws NoSuchAlgorithmException {

        Member m = userService.authenticate(request().getQueryString("username"),request().getQueryString("password"));
        if (null==m) {
            return unauthorized("invalid credentials");
        }

        Logger.debug("auth:{}",m.getAuthToken());
        return ok(Json.toJson(m));
    }

    @Transactional
    @Authenticator
    public Result userDob() {
        final Member m= (Member) ctx().args.get("user");
        Date today = new Date();
        LocalDate localDate = today.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate dob = m.getDob().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        /*Logger.debug(today.toString());
        Logger.debug(m.getDob().toString());
        Logger.debug(String.valueOf(dob.getMonthValue())); */
        if( localDate.getMonth() == dob.getMonth() && localDate.getDayOfMonth() == dob.getDayOfMonth()) {
                String q = "SELECT * FROM mavericks_project.tb_restaurants;";
                Query query1 = jpaApi.em().createNativeQuery(q);
                List<Restaurant> rest = query1.getResultList();
                int id = ThreadLocalRandom.current().nextInt(1, rest.size() + 1);
                Logger.debug(String.valueOf(rest.size()));
                Logger.debug(String.valueOf(id));
                Restaurant i = jpaApi.em().find(Restaurant.class, id);
                JsonNode json1 = Json.toJson(i);
                return ok(json1);
        }
        return  ok();
    }


    @Transactional
    @Authenticator
    public Result signOut() {
        final Member m = (Member) ctx().args.get("user");
        m.setAuthToken("");
        m.setExpTime(null);
        return ok();
    }

    @Transactional
    @Authenticator
    @IsAdmin
    public Result getCurrentUser() {

        final Member m = (Member) ctx().args.get("user");
        if(System.currentTimeMillis()> m.getExpTime().getTime()) {
            return unauthorized("Token expired");
        }
        if (m.getRole() != Member.Role.ADMIN) {
            return forbidden();
        }
        JsonNode json=Json.toJson(m);
        return ok(Json.toJson(json));
    }

}
