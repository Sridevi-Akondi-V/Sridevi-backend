package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import com.google.inject.Inject;
import controllers.security.Authenticator;
import controllers.security.IsAdmin;
import models.Restaurant;
import models.Member;
import models.Rating;
import play.Logger;
import play.db.jpa.JPAApi;
import play.db.jpa.Transactional;
import play.libs.Json;
import play.mvc.Result;
import static play.mvc.Results.ok;
import javax.persistence.Query;
import static play.mvc.Controller.request;
import static play.mvc.Results.badRequest;

/* Created By Sridevi Akondi*/

public class RatingController {

    public RatingController() {

    }

    private JPAApi jpaApi;

    @Inject
    public RatingController(JPAApi jpaApi) {

        this.jpaApi = jpaApi;
    }

    @Transactional
    @Authenticator
    public Result postRatingRestaurants() {
        final JsonNode json = request().body().asJson();
        if (null == json) {
            Logger.error("Unable to get json from request");
            return badRequest("Unable to get json from request");
        }
        final Rating rating = Json.fromJson(json, Rating.class);
        if (null == rating) {
            return badRequest("Unable to parse json");
        }
        jpaApi.em().merge(rating);
        return ok(json);
    }
}
