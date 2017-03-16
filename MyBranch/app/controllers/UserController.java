package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import controllers.security.Authenticator;
import controllers.security.IsAdmin;
import models.Member;
import models.Rating;
import models.Restaurant;
import org.joda.time.Years;
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
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/* Created by Sridevi Akondi*/

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
        JsonNode json2;
        Date today = new Date();
        LocalDate localDate = today.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate dob = m.getDob().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int age= Period.between(dob,localDate).getYears();
        Logger.debug(String.valueOf(age));
        if( localDate.getMonth() == dob.getMonth() && localDate.getDayOfMonth() == dob.getDayOfMonth()) {
                String q = "SELECT * FROM mavericks_project.tb_restaurants;";
                Query query1 = jpaApi.em().createNativeQuery(q);
                List<Restaurant> rest = query1.getResultList();
                int id = ThreadLocalRandom.current().nextInt(1, rest.size() + 1);
                Restaurant i = jpaApi.em().find(Restaurant.class, id);
                JsonNode json1 = Json.toJson(i);
                json2=Json.toJson(age);
            String bothJson = "["+json1+","+json2+"]"; //Put both objects in an array of 2 elements
            return ok(bothJson);
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

    /* @Transactional
    @Authenticator
    public Result RatingsByCurrentUser(String uname) {
        List<Rating> ratingList;
        String q = "SELECT tb_member.*,tb_restaurants.id,tb_ratings.User_Reviews ,(tb_ratings.Rating) AS rating_average  FROM mavericks_project.tb_ratings inner join tb_restaurants on tb_restaurants.id = tb_ratings.r_fid inner join tb_member on tb_member.Username = tb_ratings.uname_fid where tb_member.Username = ?1";
        Query query = jpaApi.em().createNativeQuery(q);
        query.setParameter(1,uname);
        ratingList = query.getResultList();
        JsonNode json = Json.toJson(ratingList);
        return ok(json);
    } */
}
