package controllers;


import com.fasterxml.jackson.databind.JsonNode;
import com.google.common.collect.Lists;
import com.google.inject.Inject;
import controllers.security.Authenticator;
import controllers.security.IsAdmin;
import models.Restaurant;
import models.Collection;
import play.Logger;
import play.db.jpa.JPAApi;
import play.db.jpa.Transactional;
import play.libs.Json;
import play.mvc.Result;
import javax.persistence.TypedQuery;
import java.util.List;
import exceptions.NotFoundException;
import static play.mvc.Controller.request;
import static play.mvc.Results.badRequest;
import static play.mvc.Results.notFound;
import static play.mvc.Results.ok;

/* Created by Sridevi Akondi*/

public class CollectionController {

    public CollectionController() {

    }

    private JPAApi jpaApi;

    @Inject
    public CollectionController(JPAApi jpaApi) {

        this.jpaApi = jpaApi;
    }

    @Transactional
    public Result getCollectionsList() {
        TypedQuery<Collection> query = jpaApi.em().createQuery("SELECT c FROM Collection c", Collection.class);
        List<Collection> coll = query.getResultList();
        JsonNode json = Json.toJson(coll);
        return ok(json);
    }

    @Transactional
    @Authenticator
    @IsAdmin
    public Result getCollectionByID(String ctype) {
        Collection c = jpaApi.em().find(Collection.class, ctype);
        JsonNode json = Json.toJson(c);
        return ok(json);
    }


    @Transactional
    @Authenticator
    @IsAdmin
    public Result createCollection() {
        final JsonNode json = request().body().asJson();
        if (null == json) {
            Logger.error("Unable to get json from request");
            return badRequest("Unable to get json from request");
        }
        final Collection c= Json.fromJson(json, Collection.class);
        if (null == c) {
            Logger.error("Unable to parse json to Member object");
            return badRequest("Unable to parse json to Member object");
        }

        jpaApi.em().merge(c);
        return ok(json);
    }

    @Transactional
    @Authenticator
    @IsAdmin
    public Result updateCollection(String ctype) {
        final JsonNode json = request().body().asJson();
        if (null == json) {
            return badRequest("not found");
        }
        Collection c = Json.fromJson(json, Collection.class);
        if (null == c) {
            return badRequest("not found");
        }

        Collection existingColl = jpaApi.em().find(Collection.class, ctype);
        existingColl.setCollection(c.getCollection());
        existingColl.setCollectionUrl(c.getCollectionUrl());
        jpaApi.em().merge(existingColl);
        return ok("the following collection is updated " +existingColl.getCollection() +existingColl.getCollectionUrl());
    }

    @Transactional
    @Authenticator
    @IsAdmin
    public Result deleteCollection(String ctype) {
        Collection c = jpaApi.em().find(Collection.class, ctype);
        jpaApi.em().remove(c);
        return ok();
    }
}