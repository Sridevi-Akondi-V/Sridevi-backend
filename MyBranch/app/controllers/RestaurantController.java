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

import javax.persistence.Column;
import javax.persistence.TypedQuery;
import java.util.List;
import exceptions.NotFoundException;
import static play.mvc.Controller.request;
import static play.mvc.Results.badRequest;
import static play.mvc.Results.notFound;
import static play.mvc.Results.ok;
import javax.persistence.Query;
/* Edited by Sridevi Akondi */
/* Import Restaurant model */


        public class RestaurantController {

            public RestaurantController() {

            }

            private JPAApi jpaApi;

            @Inject
            public RestaurantController(JPAApi jpaApi) {

                this.jpaApi = jpaApi;
            }

            @Transactional
            @Authenticator
            @IsAdmin
            public Result getRestaurantsList() {
                TypedQuery<Restaurant> query = jpaApi.em().createQuery("SELECT r FROM Restaurant r", Restaurant.class);
                List<Restaurant> rest = query.getResultList();
                JsonNode json = Json.toJson(rest);
                return ok(json);
            }

            @Transactional
            @Authenticator
            public Result getRestaurantByID(Integer id) {
                Restaurant i = jpaApi.em().find(Restaurant.class, id);
                JsonNode json = Json.toJson(i);
                return ok(json);
            }


            /*List  of restaurants in each collection*/

            @Transactional
            public Result getCollectionType(String collection) {
                String q="SELECT r FROM Restaurant r where r.ctype= '"+collection+"' ";
                TypedQuery<Restaurant> query = jpaApi.em().createQuery(q, Restaurant.class );
                List<Restaurant> rest = query.getResultList();
                JsonNode json = Json.toJson(rest);
                return ok(json);
            }


    /* Creating, Updating and Deleting operations that will be performed by the admin */

            @Transactional
            @Authenticator
            @IsAdmin
            public Result createRestAdmin() {
                final JsonNode json = request().body().asJson();
                if (null == json) {
                    Logger.error("Unable to get json from request");
                    return badRequest("Unable to get json from request");
                }
                final Restaurant r = Json.fromJson(json, Restaurant.class);
                    if (null == r) {
                        Logger.error("Unable to parse json to Member object");
                        return badRequest("Unable to parse json to Member object");
                    }

                jpaApi.em().merge(r);
                    return ok(json);
                }

            @Transactional
            @Authenticator
            @IsAdmin
            public Result updateRestAdmin(Integer id) {
                final JsonNode json = request().body().asJson();
                if (null == json) {
                    return badRequest("not found");
                }
                Restaurant r = Json.fromJson(json, Restaurant.class);
                if (null == r) {
                    return badRequest("not found");
                }

                Restaurant existingRes = jpaApi.em().find(Restaurant.class, id);
                existingRes.setName(r.getName());
                existingRes.setCuisine(r.getCuisine());
                existingRes.setNumber(r.getNumber());
                existingRes.setAddress(r.getAddress());
                existingRes.setHomePage(r.getHomePage());
                existingRes.setFbUrl(r.getFbUrl());
                existingRes.setWorkHours(r.getWorkHours());
                existingRes.setArea(r.getArea());
                existingRes.setCollection(r.getCollection());
                existingRes.setLatitude(r.getLatitude());
                existingRes.setLongitude(r.getLongitude());
                existingRes.setImage(r.getImage());
                existingRes.setDescription(r.getDescription());
                jpaApi.em().merge(existingRes);
                return ok("the following restaurant is updated " +existingRes.getName()+existingRes.getCuisine()+existingRes.getNumber()+existingRes.getAddress()+existingRes.getHomePage()+ existingRes.getFbUrl()+existingRes.getWorkHours()+existingRes.getArea() +existingRes.getCollection() +existingRes.getLatitude()+existingRes.getLongitude()+existingRes.getImage() +existingRes.getDescription());
            }


            @Transactional
            @Authenticator
            @IsAdmin
            public Result deleteRestAdmin(Integer id) {
                Restaurant r = jpaApi.em().find(Restaurant.class, id);
                jpaApi.em().remove(r);
                return ok();
            }


            @Transactional
            public Result getRestaurantsFromSearchFilter(String area, String restaurantname) {
                String q="SELECT r FROM Restaurant r ";
                if (null != area ) {
                    q += "where r.area  LIKE '%"+area+"%' ";
                }

                else if (null != restaurantname ) {
                    q += "where r.name LIKE '%"+restaurantname+"%'";
                }

                else {
                    return badRequest("not found");
                }
                TypedQuery<Restaurant> query = jpaApi.em().createQuery(q, Restaurant.class );
                List<Restaurant> rest = query.getResultList();
                JsonNode json = Json.toJson(rest);
                return ok(json);
            }

            /*Search on Restaurants based on lat, long and distance values */
            @Transactional
            public Result getNearbyRestaurants(Double latitude, Double longitude) {
                Query query=jpaApi.em().createNativeQuery("SELECT *,SQRT(POW(69.1 * (latitude - ?1),2) + POW (69.1 * (?2- longitude) * COS(latitude / 57.3), 2)) AS distance FROM tb_restaurants HAVING distance < 10 ORDER BY distance ");
                query.setParameter(1,latitude);
                query.setParameter(2,longitude);
                List<Restaurant> rest = query.getResultList();
                JsonNode json = Json.toJson(rest);
                return ok(json);
            }

            @Transactional
            public Result getNearbyRestaurantsBySearch(String keyword) {
                Query query=jpaApi.em().createNativeQuery("SELECT * FROM tb_restaurants WHERE MATCH(Description,Cuisine,Restaurants_names,Area) AGAINST(?1 IN NATURAL LANGUAGE MODE)");
                query.setParameter(1,keyword);
                List<Restaurant> rest = query.getResultList();
                JsonNode json = Json.toJson(rest);
                return ok(json);
            }

            @Transactional
            public Result getNearbyRestaurantsByFilterSearch(String keyword,String cuisine,String collection) {
                List<Restaurant> rest;
                String[] arr= new String[4];
                arr[2]= cuisine;
                arr[3]= collection;
                String[] names= {"Cuisine", "Collection_Type"};
                String q="SELECT * FROM tb_restaurants WHERE MATCH(Description,Cuisine,Restaurants_names,Area) AGAINST(?1 IN NATURAL LANGUAGE MODE)";
                Query query = jpaApi.em().createNativeQuery(q);
                query.setParameter(1, keyword);
                rest = query.getResultList();
                int i,j;
                for ( i=2, j=0 ;i<arr.length && j<names.length ; i++) {
                    if (arr[i] != null) {
                        String q1 = "where " + names[j] + "= ?"+i;
                        Query query1 = jpaApi.em().createNativeQuery("SELECT * from (" + q + ") AS T " + q1);
                        query1.setParameter(1, keyword);
                        query1.setParameter(i,arr[i]);
                        Logger.debug(arr[i]);
                        rest = query1.getResultList();
                    }
                    JsonNode json = Json.toJson(rest);
                    return ok(json);
                }
                JsonNode json = Json.toJson(rest);
                return ok(json);
            }
        }
