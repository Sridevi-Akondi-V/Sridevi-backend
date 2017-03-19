package controllers;


import antlr.collections.*;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.common.base.Joiner;
import com.google.inject.Inject;
import controllers.security.Authenticator;
import controllers.security.IsAdmin;
import models.Rating;
import models.Restaurant;
import play.Logger;
import play.db.jpa.JPAApi;
import play.db.jpa.Transactional;
import play.libs.Json;
import play.mvc.Result;

import javax.persistence.TypedQuery;
import java.sql.Time;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

import static play.mvc.Controller.request;
import static play.mvc.Results.badRequest;
import static play.mvc.Results.notFound;
import static play.mvc.Results.ok;
import javax.persistence.Query;

/* Import Restaurant model */

/* Created by Sridevi Akondi*/


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
        JsonNode json;
            Restaurant i = jpaApi.em().find(Restaurant.class, id);
            json = Json.toJson(i);
            return ok(json);
        }

    @Transactional
    @Authenticator
    public Result getRestaurant(Integer id, Integer rating) {
        JsonNode json;
        if (rating ==0) {
            Restaurant i = jpaApi.em().find(Restaurant.class, id);
            json = Json.toJson(i);
            return ok(json);
        }
        if (rating == 1){
            List<Rating> ratingList;
            String q = "SELECT tb_restaurants.* , avg(tb_ratings.Rating) as Avg_Rating from tb_restaurants inner join tb_ratings on tb_restaurants.id = tb_ratings.r_fid where tb_ratings.r_fid = ?1 group by tb_restaurants.id";
            Query query = jpaApi.em().createNativeQuery(q);
            query.setParameter(1, id);
            ratingList = query.getResultList();
            json = Json.toJson(ratingList);
            return ok(json);
        }
        return ok();
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
        existingRes.setOpening_time(r.getOpening_time());
        existingRes.setClosing_time(r.getClosing_time());
        existingRes.setFree_delivery(r.getFree_delivery());
        existingRes.setCost(r.getCost());
        jpaApi.em().merge(existingRes);
        return ok("the following restaurant is updated " +existingRes.getName()+existingRes.getCuisine()+existingRes.getNumber()+existingRes.getAddress()+existingRes.getHomePage()+ existingRes.getFbUrl()+existingRes.getWorkHours()+existingRes.getArea() +existingRes.getCollection() +existingRes.getLatitude()+existingRes.getLongitude()+existingRes.getImage() +existingRes.getDescription() +existingRes.getOpening_time() +existingRes.getClosing_time() +existingRes.getFree_delivery() +existingRes.getCost());
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
        Query query=jpaApi.em().createNativeQuery("SELECT *,SQRT(POW(69.1 * (latitude - ?1),2) + POW (69.1 * (?2- longitude) * COS(latitude / 57.3), 2)) AS distance FROM tb_restaurants HAVING distance < 10 ORDER BY distance limit 10");
        query.setParameter(1,latitude);
        query.setParameter(2,longitude);
        List<Restaurant> rest = query.getResultList();
        JsonNode json = Json.toJson(rest);
        return ok(json);
    }

    @Transactional
    public Result getNearbyRestaurantsBySearch(String keyword) {
        Query query=jpaApi.em().createNativeQuery("SELECT * FROM tb_restaurants WHERE MATCH(Description,Cuisine,Restaurants_names,Area) AGAINST(?1 IN BOOLEAN MODE)");
        query.setParameter(1,keyword.concat("*"));
        List<Restaurant> rest = query.getResultList();
        JsonNode json = Json.toJson(rest);
        return ok(json);
    }


    @Transactional
    public Result getRestaurantsBySearchFilter(String keyword, String collection, String time ,Integer cost1, Integer cost2, Integer delivery) {
        List<Restaurant> rest;
        String q1="";
        Query query1;
        JsonNode json;
        Time time1 = new Time(-1,-1,-1);
        if (time != null) {
            time1 = java.sql.Time.valueOf(time);
            Logger.debug("",time1.toString());
        }
        Logger.debug(time1.toString());
        String q = "SELECT * FROM tb_restaurants WHERE MATCH(Description,Cuisine,Restaurants_names,Area) AGAINST(?1 IN BOOLEAN MODE)";
        if(null != keyword && null == collection && null== time && (null == cost1 && null == cost2) && null == delivery) {
            Query query = jpaApi.em().createNativeQuery(q);
            query.setParameter(1,keyword.concat("*"));
            Logger.debug("+",keyword);
            rest = query.getResultList();
            json= Json.toJson(rest);
            return ok(json);
        }
        else {
            if (null != collection && null != time1 && (null != cost1 && null != cost2) && null != delivery) {
                q1 = "where (Collection_Type= ?2 and Opening_Time >= ?3 and Cost between ?4 and ?5 and Free_Delivery= ?6)";
            } else if (null != collection || (null!= time1)|| (null != cost1 && null != cost2) || null != delivery ) {
                q1 = "where (Collection_Type= ?2 or (Opening_Time >= ?3 and ?3 <= Closing_Time or Cost between ?4 and ?5 or Free_Delivery= ?6))";
            }
            query1 = jpaApi.em().createNativeQuery("SELECT * from (" + q + ") AS T " + q1);
            query1.setParameter(1, keyword.concat("*"));
            query1.setParameter(2, collection);
            query1.setParameter(3, time1);
            query1.setParameter(4, cost1);
            query1.setParameter(5, cost2);
            query1.setParameter(6, delivery);
            Logger.debug("-", query1.toString());
            rest = query1.getResultList();
            json = Json.toJson(rest);
            return ok(json);
        }
    }



    @Transactional
    public Result getRestaurantsSearch(String collection, String time ,Integer cost1, Integer cost2,  Integer delivery) {
        //String q1="";
        Query query1;
        JsonNode json;
        List<Restaurant> rest;
        Time time1 = new Time(-1, -1, -1);
        if (time != null) {
            time1 = java.sql.Time.valueOf(time);
            Logger.debug("", time1.toString());
        }

        Logger.debug(time1.toString());
        /*String q = "SELECT * FROM tb_restaurants WHERE MATCH(Description,Cuisine,Restaurants_names,Area) AGAINST(?1 IN BOOLEAN MODE)";
        if(null != keyword && null == collection && null== time && (null == cost1 && null == cost2) && null == delivery) {
            Query query = jpaApi.em().createNativeQuery(q);
            query.setParameter(1,keyword.concat("*"));
            Logger.debug("+",keyword);
            rest = query.getResultList();
            json= Json.toJson(rest);
            return ok(json);
        } */


            /*Map<String,String> filter = new HashMap<>();
            Map<String,String> filter1 = new HashMap<>();
            Map<String,String> filter2 = new HashMap<>();
            Map<String,String> filter3 = new HashMap<>(); */

        List<String> q = new ArrayList<>();

        /*  if(null != collection) {
                    filter.put("  Collection_Type = ?", 1 );
                    q.add("Collection_Type = " + collection);
                }

                if (delivery != 2) {
                    filter.put("  Free_Delivery = ", "?5");
                    q.add("Free_Delivery = " + delivery);

                }

                if( time1 != null ) {
                    filter.put("  Opening_Time <= ", "?2");
                    filter1.put("  Closing_Time  >= ", "?2");

                }

                if( (cost1 != 0 && cost2 != 0)){
                    filter2.put(" Cost >= ","?3");
                    filter2.put(" Cost <= ", "?4");
                    filter.putAll(filter2);
                    q.add("(Cost >= " + cost1 + " and " + " Cost <= " +cost2);
                    } */
        //q.add(createQuery("Free_Delivery","=", String.valueOf(delivery)));
        //q.add(createQuery("Collection_Type", "=", collection))

        //Query query1 = jpaApi.em().createNativeQuery("SELECT * FROM tb_restaurants where ("+collectJoin +")");

      if (null != collection) {
            q.add("  Collection_Type = " + "?1" );
        }

        if (null != delivery) {
            q.add(" Free_Delivery = " + "?5");
        }

        if (null != time1) {
            q.add(" Opening_Time >= " + "?2" + " and " + " Closing_Time <=" + "?2");
        }

        if (null != cost1 && null != cost2) {
            q.add(" Cost >= " + "?3" + " and " + " Cost <=" + "?4");
        }
        //final String collectJoin = q.stream().collect(Collectors.joining(" and "));
        String joiner = Joiner.on(" and ").skipNulls().join(q);
        //Logger.debug(collectJoin);
        Logger.debug(joiner);
        //Query query1 = jpaApi.em().createNativeQuery("SELECT * FROM tb_restaurants where ("+collectJoin+")");
        String q1="SELECT * FROM tb_restaurants where".concat(joiner);
         query1 = jpaApi.em().createNativeQuery(q1);
                query1.setParameter(1,collection);
                query1.setParameter(2,time1);
                query1.setParameter(3,cost1);
                query1.setParameter(4,cost2);
                query1.setParameter(5,delivery);
                Logger.debug(query1.toString());
                if(null ==collection && null== time && null== cost1 && null== cost2 && null ==delivery) {
                    query1 = jpaApi.em().createNativeQuery("SELECT * FROM tb_restaurants");
                }
        rest = query1.getResultList();
                Logger.debug(rest.toString());
        json= Json.toJson(rest);
        return ok(json);

      /*
        if (null != collection) {
            q.add("  r.ctype = " + collection);
        }

        if (null != delivery) {
            q.add("  r.free_delivery = " + String.valueOf(delivery));
        }

        if (null != time1) {
            q.add(" r.opening_time >= " + time1 + " and " + " r.closing_time <=" + time1);
        }

        if (null != cost1 && null != cost2) {
            q.add(" r.cost >= " + cost1 + " and " + " r.cost <=" + cost2);
        }
        final String collectJoin = q.stream().collect(Collectors.joining(" and "));
        Logger.debug(collectJoin);
        q1="SELECT r from Restaurant r where "+collectJoin+" ";
       TypedQuery<Restaurant> query2 = jpaApi.em().createQuery(q1,Restaurant.class);
                Logger.debug(query2.toString());
                rest = query2.getResultList();
        json= Json.toJson(rest);
        return ok(json); */
    }


    @Transactional
    public Result getSearch(String collection, String time ,Integer cost1, Integer cost2,  Integer delivery) {
        List rest;
        String q1="",q2="";
        Query query1;
        JsonNode json;
        Time time1 = new Time(-1,-1,-1);
        if (time != null) {
            time1 = java.sql.Time.valueOf(time);
            Logger.debug("",time1.toString());
        }

        Logger.debug(time1.toString());
        /*String q = "SELECT * FROM tb_restaurants WHERE MATCH(Description,Cuisine,Restaurants_names,Area) AGAINST(?1 IN BOOLEAN MODE)";
        if(null != keyword && null == collection && null== time && (null == cost1 && null == cost2) && null == delivery) {
            Query query = jpaApi.em().createNativeQuery(q);
            query.setParameter(1,keyword.concat("*"));
            Logger.debug("+",keyword);
            rest = query.getResultList();
            json= Json.toJson(rest);
            return ok(json);
        } */


        Map<String,String> filter = new HashMap<>();
        Map<String,String> filter1 = new HashMap<>();
        Map<String,String> filter2 = new HashMap<>();
        Map<String,String> filter3 = new HashMap<>();
        Map<String,String> filter4 = new HashMap<>();


        if(null != collection) {
            filter.put("  Collection_Type = ", "?1" );

        }

        if (2 != delivery) {
            filter.put("  Free_Delivery = ", "?5");
        }

        if( time1 != null ) {

            filter1.put("  Opening_Time <= ", "?2");
            filter1.put("  Closing_Time  >= ", "?2");
            filter.putAll(filter1);
        }


        if( cost1 != 0 && cost2 != 0 ) {
            filter2.put(" Cost >= ", "?3");
            filter2.put(" Cost <= ", "?4");
            filter.putAll(filter2);
        }
        filter.values().removeIf(Objects::isNull);
        Joiner.MapJoiner joiner = Joiner.on(" and ").withKeyValueSeparator("");
        q1= joiner.join(filter);
        Logger.debug(q1);
        query1 = jpaApi.em().createNativeQuery("Select * from tb_restaurants where (" + q1+ ")");
        if(  0 == cost1 || 0 == cost2 || 2 == delivery) {
            if(2==delivery)
            filter3.put("  Free_Delivery = ", "?5");
            if(0==cost1 && 0==cost2) {
                filter3.put(" Cost < ","?3");
                filter3.put(" Cost =","?4");
            }
            Joiner.MapJoiner joiner1 = Joiner.on(" or ").withKeyValueSeparator("");
            q2= joiner1.join(filter3);
            query1 = jpaApi.em().createNativeQuery("Select * from tb_restaurants where (" + q1+ ") or " + q2 +"");
            Logger.debug(q2);

        }
        query1.setParameter(1, collection);
        query1.setParameter(2, time1);
        query1.setParameter(3, cost1);
        query1.setParameter(4, cost2);
        query1.setParameter(5, delivery);
        Logger.debug(query1.toString());
        rest = query1.getResultList();
        json = Json.toJson(rest);
        return ok(json);
    }

    @Transactional
    public Result AvgRatingofRestaurant(Integer id) {
        List<Rating> ratingList;
        Double avg;
        String q = "SELECT tb_restaurants.* , avg(tb_ratings.Rating) as Avg_Rating from tb_restaurants inner join tb_ratings on tb_restaurants.id = tb_ratings.r_fid where tb_ratings.r_fid = ?1 group by tb_restaurants.id";
        Query query = jpaApi.em().createNativeQuery(q);
        query.setParameter(1,id);
        ratingList = query.getResultList();
        JsonNode json = Json.toJson(ratingList);
        return ok(json);
    }

    @Transactional
    @Authenticator
    public  Result Reviews_Ratings_Restaurant(Integer id) {
        List<Rating> ratingList;
        String q = "SELECT tb_ratings.rid, tb_restaurants.id, tb_member.Username, tb_ratings.Rating, tb_ratings.User_Reviews FROM mavericks_project.tb_ratings inner join tb_restaurants on tb_restaurants.id = tb_ratings.r_fid inner join tb_member on tb_member.Username = tb_ratings.uname_fid where tb_restaurants.id = ?1";
        Query query = jpaApi.em().createNativeQuery(q);
        query.setParameter(1,id);
        ratingList = query.getResultList();
        JsonNode json = Json.toJson(ratingList);
        return ok(json);
    }

}
