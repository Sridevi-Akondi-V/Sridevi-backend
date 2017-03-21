
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/VISHNU VARDHAN/Sridevi-backend/MyBranch/conf/routes
// @DATE:Tue Mar 21 07:58:46 IST 2017

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:10
  class ReverseRestaurantController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:29
    def getRestaurantsByFilters: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RestaurantController.getRestaurantsByFilters",
      """
        function(keyword0,collection1,time2,cost13,cost24,delivery5) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "filter_restaurants" + _qS([(keyword0 == null ? null : (""" + implicitly[QueryStringBindable[java.lang.String]].javascriptUnbind + """)("keyword", keyword0)), (collection1 == null ? null : (""" + implicitly[QueryStringBindable[java.lang.String]].javascriptUnbind + """)("collection", collection1)), (time2 == null ? null : (""" + implicitly[QueryStringBindable[java.lang.String]].javascriptUnbind + """)("time", time2)), (cost13 == null ? null : (""" + implicitly[QueryStringBindable[Integer]].javascriptUnbind + """)("cost1", cost13)), (cost24 == null ? null : (""" + implicitly[QueryStringBindable[Integer]].javascriptUnbind + """)("cost2", cost24)), (delivery5 == null ? null : (""" + implicitly[QueryStringBindable[Integer]].javascriptUnbind + """)("delivery", delivery5))])})
        }
      """
    )
  
    // @LINE:20
    def deleteRestAdmin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RestaurantController.deleteRestAdmin",
      """
        function(id0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "rest/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:26
    def getRestaurantsBySearchFilter: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RestaurantController.getRestaurantsBySearchFilter",
      """
        function(keyword0,collection1,time2,cost13,cost24,delivery5) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "filter" + _qS([(keyword0 == null ? null : (""" + implicitly[QueryStringBindable[java.lang.String]].javascriptUnbind + """)("keyword", keyword0)), (collection1 == null ? null : (""" + implicitly[QueryStringBindable[java.lang.String]].javascriptUnbind + """)("collection", collection1)), (time2 == null ? null : (""" + implicitly[QueryStringBindable[java.lang.String]].javascriptUnbind + """)("time", time2)), (cost13 == null ? null : (""" + implicitly[QueryStringBindable[Integer]].javascriptUnbind + """)("cost1", cost13)), (cost24 == null ? null : (""" + implicitly[QueryStringBindable[Integer]].javascriptUnbind + """)("cost2", cost24)), (delivery5 == null ? null : (""" + implicitly[QueryStringBindable[Integer]].javascriptUnbind + """)("delivery", delivery5))])})
        }
      """
    )
  
    // @LINE:67
    def AvgRatingofRestaurant: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RestaurantController.AvgRatingofRestaurant",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "avg_rating_restaurant" + _qS([(id0 == null ? null : (""" + implicitly[QueryStringBindable[Integer]].javascriptUnbind + """)("id", id0))])})
        }
      """
    )
  
    // @LINE:12
    def getRestaurant: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RestaurantController.getRestaurant",
      """
        function(id0,rating1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "restaurants/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id0) + _qS([(rating1 == null ? null : (""" + implicitly[QueryStringBindable[Integer]].javascriptUnbind + """)("rating", rating1))])})
        }
      """
    )
  
    // @LINE:19
    def updateRestAdmin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RestaurantController.updateRestAdmin",
      """
        function(id0) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "update_a_restaurant/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:69
    def Reviews_Ratings_Restaurant: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RestaurantController.Reviews_Ratings_Restaurant",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ratings_reviews" + _qS([(id0 == null ? null : (""" + implicitly[QueryStringBindable[Integer]].javascriptUnbind + """)("id", id0))])})
        }
      """
    )
  
    // @LINE:11
    def getRestaurantByID: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RestaurantController.getRestaurantByID",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "restaurants_by_id/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:27
    def getNearbyRestaurantsBySearch: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RestaurantController.getNearbyRestaurantsBySearch",
      """
        function(keyword0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "search/" + (""" + implicitly[PathBindable[java.lang.String]].javascriptUnbind + """)("keyword", keyword0)})
        }
      """
    )
  
    // @LINE:24
    def getRestaurantsFromSearchFilter: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RestaurantController.getRestaurantsFromSearchFilter",
      """
        function(area0,restaurantname1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "search_restaurants_by_name_area" + _qS([(area0 == null ? null : (""" + implicitly[QueryStringBindable[java.lang.String]].javascriptUnbind + """)("area", area0)), (restaurantname1 == null ? null : (""" + implicitly[QueryStringBindable[java.lang.String]].javascriptUnbind + """)("restaurantname", restaurantname1))])})
        }
      """
    )
  
    // @LINE:25
    def getNearbyRestaurants: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RestaurantController.getNearbyRestaurants",
      """
        function(latitude0,longitude1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "search_nearby_restaurants/" + (""" + implicitly[PathBindable[java.lang.Double]].javascriptUnbind + """)("latitude", latitude0) + _qS([(""" + implicitly[QueryStringBindable[java.lang.Double]].javascriptUnbind + """)("longitude", longitude1)])})
        }
      """
    )
  
    // @LINE:10
    def getRestaurantsList: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RestaurantController.getRestaurantsList",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "list_of_all_restaurants"})
        }
      """
    )
  
    // @LINE:18
    def createRestAdmin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RestaurantController.createRestAdmin",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "rest"})
        }
      """
    )
  
    // @LINE:15
    def getCollectionType: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RestaurantController.getCollectionType",
      """
        function(collection0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "collections/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("collection", encodeURIComponent(collection0))})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:47
  class ReverseCollectionController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:49
    def createCollection: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CollectionController.createCollection",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "collection"})
        }
      """
    )
  
    // @LINE:47
    def getCollectionsList: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CollectionController.getCollectionsList",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "get_all_collections"})
        }
      """
    )
  
    // @LINE:51
    def deleteCollection: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CollectionController.deleteCollection",
      """
        function(ctype0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "delete_collection/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("ctype", encodeURIComponent(ctype0))})
        }
      """
    )
  
    // @LINE:50
    def updateCollection: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CollectionController.updateCollection",
      """
        function(ctype0) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "update_a_collection/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("ctype", encodeURIComponent(ctype0))})
        }
      """
    )
  
    // @LINE:48
    def getCollectionByID: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CollectionController.getCollectionByID",
      """
        function(ctype0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "collections_by_id/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("ctype", encodeURIComponent(ctype0))})
        }
      """
    )
  
  }

  // @LINE:32
  class ReverseMemberController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:32
    def getMembersList: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MemberController.getMembersList",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "members_list"})
        }
      """
    )
  
    // @LINE:35
    def updateMember: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MemberController.updateMember",
      """
        function(id0) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "update_members/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:34
    def createMember: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MemberController.createMember",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "create_member"})
        }
      """
    )
  
    // @LINE:36
    def deleteMember: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MemberController.deleteMember",
      """
        function(id0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "delete_member/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:33
    def getMemberByID: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MemberController.getMemberByID",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "members/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
  }

  // @LINE:41
  class ReverseImageController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:42
    def downloadImage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ImageController.downloadImage",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "images/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("id", encodeURIComponent(id0))})
        }
      """
    )
  
    // @LINE:43
    def deleteImage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ImageController.deleteImage",
      """
        function(id0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "images/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("id", encodeURIComponent(id0))})
        }
      """
    )
  
    // @LINE:41
    def uploadImage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ImageController.uploadImage",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "images"})
        }
      """
    )
  
  }

  // @LINE:60
  class ReverseUserController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:62
    def getCurrentUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.getCurrentUser",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/current"})
        }
      """
    )
  
    // @LINE:60
    def signIn: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.signIn",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/signin"})
        }
      """
    )
  
    // @LINE:61
    def signOut: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.signOut",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/signout"})
        }
      """
    )
  
    // @LINE:63
    def userDob: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.userDob",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/users_dob"})
        }
      """
    )
  
  }

  // @LINE:66
  class ReverseRatingController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:66
    def postRatingRestaurants: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RatingController.postRatingRestaurants",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "users/rating"})
        }
      """
    )
  
  }

  // @LINE:55
  class ReverseImagesController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:55
    def getImagesList: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ImagesController.getImagesList",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "get_all_images"})
        }
      """
    )
  
  }


}
