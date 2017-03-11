
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/VISHNU VARDHAN/Sridevi-backend/MyBranch/conf/routes
// @DATE:Sat Mar 11 22:26:35 IST 2017

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

  
    // @LINE:20
    def deleteRestAdmin(id:Integer): Call = {
      import ReverseRouteContext.empty
      Call("DELETE", _prefix + { _defaultPrefix } + "rest/" + implicitly[PathBindable[Integer]].unbind("id", id))
    }
  
    // @LINE:19
    def updateRestAdmin(id:Integer): Call = {
      import ReverseRouteContext.empty
      Call("PUT", _prefix + { _defaultPrefix } + "update_a_restaurant/" + implicitly[PathBindable[Integer]].unbind("id", id))
    }
  
    // @LINE:11
    def getRestaurantByID(id:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "restaurants_by_id/" + implicitly[PathBindable[Integer]].unbind("id", id))
    }
  
    // @LINE:24
    def getRestaurantsFromSearchFilter(area:java.lang.String = null , restaurantname:java.lang.String = null): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "search_restaurants_by_name_area" + queryString(List(if(area == null ) None else Some(implicitly[QueryStringBindable[java.lang.String]].unbind("area", area)), if(restaurantname == null) None else Some(implicitly[QueryStringBindable[java.lang.String]].unbind("restaurantname", restaurantname)))))
    }
  
    // @LINE:26
    def getRestaurantsBySearchFilter(keyword:java.lang.String, collection:java.lang.String = null, cost1:Integer = null, cost2:Integer = null, delivery:Integer = null): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "filter" + queryString(List(Some(implicitly[QueryStringBindable[java.lang.String]].unbind("keyword", keyword)), if(collection == null) None else Some(implicitly[QueryStringBindable[java.lang.String]].unbind("collection", collection)), if(cost1 == null) None else Some(implicitly[QueryStringBindable[Integer]].unbind("cost1", cost1)), if(cost2 == null) None else Some(implicitly[QueryStringBindable[Integer]].unbind("cost2", cost2)), if(delivery == null) None else Some(implicitly[QueryStringBindable[Integer]].unbind("delivery", delivery)))))
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

  // @LINE:43
  class ReverseCollectionController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:45
    def createCollection(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "collection")
    }
  
    // @LINE:43
    def getCollectionsList(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "get_all_collections")
    }
  
    // @LINE:47
    def deleteCollection(ctype:String): Call = {
      import ReverseRouteContext.empty
      Call("DELETE", _prefix + { _defaultPrefix } + "delete_collection/" + implicitly[PathBindable[String]].unbind("ctype", dynamicString(ctype)))
    }
  
    // @LINE:46
    def updateCollection(ctype:String): Call = {
      import ReverseRouteContext.empty
      Call("PUT", _prefix + { _defaultPrefix } + "update_a_collection/" + implicitly[PathBindable[String]].unbind("ctype", dynamicString(ctype)))
    }
  
    // @LINE:44
    def getCollectionByID(ctype:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "collections_by_id/" + implicitly[PathBindable[String]].unbind("ctype", dynamicString(ctype)))
    }
  
  }

  // @LINE:29
  class ReverseMemberController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:32
    def createMember(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "create_member")
    }
  
    // @LINE:29
    def getMembersList(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "members_list")
    }
  
  }

  // @LINE:37
  class ReverseImageController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:38
    def downloadImage(id:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "images/" + implicitly[PathBindable[String]].unbind("id", dynamicString(id)))
    }
  
    // @LINE:39
    def deleteImage(id:String): Call = {
      import ReverseRouteContext.empty
      Call("DELETE", _prefix + { _defaultPrefix } + "images/" + implicitly[PathBindable[String]].unbind("id", dynamicString(id)))
    }
  
    // @LINE:37
    def uploadImage(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "images")
    }
  
  }

  // @LINE:56
  class ReverseUserController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:58
    def getCurrentUser(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "users/current")
    }
  
    // @LINE:56
    def signIn(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "users/signin")
    }
  
    // @LINE:57
    def signOut(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "users/signout")
    }
  
  }

  // @LINE:51
  class ReverseImagesController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:51
    def getImagesList(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "get_all_images")
    }
  
  }


}
