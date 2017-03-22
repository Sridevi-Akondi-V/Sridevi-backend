
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/bmanisha/Sridevi-backend/MyBranch/conf/routes
// @DATE:Tue Mar 21 10:28:10 IST 2017

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:10
  class ReverseRestaurantController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:29
    def getRestaurantsByFilters(keyword:java.lang.String = null, collection:java.lang.String = null, time:java.lang.String = null , cost1:Integer = null, cost2:Integer = null, delivery:Integer = null): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "filter_restaurants" + queryString(List(if(keyword == null) None else Some(implicitly[QueryStringBindable[java.lang.String]].unbind("keyword", keyword)), if(collection == null) None else Some(implicitly[QueryStringBindable[java.lang.String]].unbind("collection", collection)), if(time == null ) None else Some(implicitly[QueryStringBindable[java.lang.String]].unbind("time", time)), if(cost1 == null) None else Some(implicitly[QueryStringBindable[Integer]].unbind("cost1", cost1)), if(cost2 == null) None else Some(implicitly[QueryStringBindable[Integer]].unbind("cost2", cost2)), if(delivery == null) None else Some(implicitly[QueryStringBindable[Integer]].unbind("delivery", delivery)))))
    }
  
    // @LINE:20
    def deleteRestAdmin(id:Integer): Call = {
      import ReverseRouteContext.empty
      Call("DELETE", _prefix + { _defaultPrefix } + "rest/" + implicitly[PathBindable[Integer]].unbind("id", id))
    }
  
    // @LINE:26
    def getRestaurantsBySearchFilter(keyword:java.lang.String = null , collection:java.lang.String = null, time:java.lang.String = null , cost1:Integer = null, cost2:Integer = null, delivery:Integer = null): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "filter" + queryString(List(if(keyword == null ) None else Some(implicitly[QueryStringBindable[java.lang.String]].unbind("keyword", keyword)), if(collection == null) None else Some(implicitly[QueryStringBindable[java.lang.String]].unbind("collection", collection)), if(time == null ) None else Some(implicitly[QueryStringBindable[java.lang.String]].unbind("time", time)), if(cost1 == null) None else Some(implicitly[QueryStringBindable[Integer]].unbind("cost1", cost1)), if(cost2 == null) None else Some(implicitly[QueryStringBindable[Integer]].unbind("cost2", cost2)), if(delivery == null) None else Some(implicitly[QueryStringBindable[Integer]].unbind("delivery", delivery)))))
    }
  
    // @LINE:67
    def AvgRatingofRestaurant(id:Integer = null): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "avg_rating_restaurant" + queryString(List(if(id == null) None else Some(implicitly[QueryStringBindable[Integer]].unbind("id", id)))))
    }
  
    // @LINE:12
    def getRestaurant(id:Integer, rating:Integer = null): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "restaurants/" + implicitly[PathBindable[Integer]].unbind("id", id) + queryString(List(if(rating == null) None else Some(implicitly[QueryStringBindable[Integer]].unbind("rating", rating)))))
    }
  
    // @LINE:19
    def updateRestAdmin(id:Integer): Call = {
      import ReverseRouteContext.empty
      Call("PUT", _prefix + { _defaultPrefix } + "update_a_restaurant/" + implicitly[PathBindable[Integer]].unbind("id", id))
    }
  
    // @LINE:69
    def Reviews_Ratings_Restaurant(id:Integer = null): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "ratings_reviews" + queryString(List(if(id == null) None else Some(implicitly[QueryStringBindable[Integer]].unbind("id", id)))))
    }
  
    // @LINE:11
    def getRestaurantByID(id:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "restaurants_by_id/" + implicitly[PathBindable[Integer]].unbind("id", id))
    }
  
    // @LINE:27
    def getNearbyRestaurantsBySearch(keyword:java.lang.String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "search/" + implicitly[PathBindable[java.lang.String]].unbind("keyword", keyword))
    }
  
    // @LINE:24
    def getRestaurantsFromSearchFilter(area:java.lang.String = null , restaurantname:java.lang.String = null): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "search_restaurants_by_name_area" + queryString(List(if(area == null ) None else Some(implicitly[QueryStringBindable[java.lang.String]].unbind("area", area)), if(restaurantname == null) None else Some(implicitly[QueryStringBindable[java.lang.String]].unbind("restaurantname", restaurantname)))))
    }
  
    // @LINE:25
    def getNearbyRestaurants(latitude:java.lang.Double, longitude:java.lang.Double): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "search_nearby_restaurants/" + implicitly[PathBindable[java.lang.Double]].unbind("latitude", latitude) + queryString(List(Some(implicitly[QueryStringBindable[java.lang.Double]].unbind("longitude", longitude)))))
    }
  
    // @LINE:10
    def getRestaurantsList(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "list_of_all_restaurants")
    }
  
    // @LINE:18
    def createRestAdmin(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "rest")
    }
  
    // @LINE:15
    def getCollectionType(collection:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "collections/" + implicitly[PathBindable[String]].unbind("collection", dynamicString(collection)))
    }
  
  }

  // @LINE:6
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def versioned(file:Asset): Call = {
      implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:47
  class ReverseCollectionController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:49
    def createCollection(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "collection")
    }
  
    // @LINE:47
    def getCollectionsList(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "get_all_collections")
    }
  
    // @LINE:51
    def deleteCollection(ctype:String): Call = {
      import ReverseRouteContext.empty
      Call("DELETE", _prefix + { _defaultPrefix } + "delete_collection/" + implicitly[PathBindable[String]].unbind("ctype", dynamicString(ctype)))
    }
  
    // @LINE:50
    def updateCollection(ctype:String): Call = {
      import ReverseRouteContext.empty
      Call("PUT", _prefix + { _defaultPrefix } + "update_a_collection/" + implicitly[PathBindable[String]].unbind("ctype", dynamicString(ctype)))
    }
  
    // @LINE:48
    def getCollectionByID(ctype:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "collections_by_id/" + implicitly[PathBindable[String]].unbind("ctype", dynamicString(ctype)))
    }
  
  }

  // @LINE:32
  class ReverseMemberController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:32
    def getMembersList(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "members_list")
    }
  
    // @LINE:35
    def updateMember(id:Integer): Call = {
      import ReverseRouteContext.empty
      Call("PUT", _prefix + { _defaultPrefix } + "update_members/" + implicitly[PathBindable[Integer]].unbind("id", id))
    }
  
    // @LINE:34
    def createMember(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "create_member")
    }
  
    // @LINE:36
    def deleteMember(id:Integer): Call = {
      import ReverseRouteContext.empty
      Call("DELETE", _prefix + { _defaultPrefix } + "delete_member/" + implicitly[PathBindable[Integer]].unbind("id", id))
    }
  
    // @LINE:33
    def getMemberByID(id:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "members/" + implicitly[PathBindable[Integer]].unbind("id", id))
    }
  
  }

  // @LINE:41
  class ReverseImageController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:42
    def downloadImage(id:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "images/" + implicitly[PathBindable[String]].unbind("id", dynamicString(id)))
    }
  
    // @LINE:43
    def deleteImage(id:String): Call = {
      import ReverseRouteContext.empty
      Call("DELETE", _prefix + { _defaultPrefix } + "images/" + implicitly[PathBindable[String]].unbind("id", dynamicString(id)))
    }
  
    // @LINE:41
    def uploadImage(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "images")
    }
  
  }

  // @LINE:60
  class ReverseUserController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:62
    def getCurrentUser(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "users/current")
    }
  
    // @LINE:60
    def signIn(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "users/signin")
    }
  
    // @LINE:61
    def signOut(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "users/signout")
    }
  
    // @LINE:63
    def userDob(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "users/users_dob")
    }
  
  }

  // @LINE:66
  class ReverseRatingController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:66
    def postRatingRestaurants(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "users/rating")
    }
  
  }

  // @LINE:55
  class ReverseImagesController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:55
    def getImagesList(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "get_all_images")
    }
  
  }


}
