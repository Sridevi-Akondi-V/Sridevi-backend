package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import controllers.security.Authenticator;
import controllers.security.IsAdmin;
import models.Member;
import models.User;
import play.Logger;
import play.db.jpa.Transactional;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import services.UserService;
import javax.inject.Inject;

import java.security.NoSuchAlgorithmException;
import java.util.List;

public class UserController extends Controller {

    private UserService userService;
    List<Member> m;
    final JsonNode json= Json.toJson(m);

    @Inject
    public UserController(UserService userService) {
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
