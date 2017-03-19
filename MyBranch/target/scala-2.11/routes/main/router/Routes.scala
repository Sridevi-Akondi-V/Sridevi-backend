
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/VISHNU VARDHAN/Sridevi-backend/MyBranch/conf/routes
// @DATE:Sun Mar 19 16:59:56 IST 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  Assets_4: controllers.Assets,
  // @LINE:10
  RestaurantController_1: controllers.RestaurantController,
  // @LINE:36
  MemberController_6: controllers.MemberController,
  // @LINE:45
  ImageController_0: controllers.ImageController,
  // @LINE:51
  CollectionController_3: controllers.CollectionController,
  // @LINE:59
  ImagesController_7: controllers.ImagesController,
  // @LINE:64
  UserController_2: controllers.UserController,
  // @LINE:70
  RatingController_5: controllers.RatingController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Assets_4: controllers.Assets,
    // @LINE:10
    RestaurantController_1: controllers.RestaurantController,
    // @LINE:36
    MemberController_6: controllers.MemberController,
    // @LINE:45
    ImageController_0: controllers.ImageController,
    // @LINE:51
    CollectionController_3: controllers.CollectionController,
    // @LINE:59
    ImagesController_7: controllers.ImagesController,
    // @LINE:64
    UserController_2: controllers.UserController,
    // @LINE:70
    RatingController_5: controllers.RatingController
  ) = this(errorHandler, Assets_4, RestaurantController_1, MemberController_6, ImageController_0, CollectionController_3, ImagesController_7, UserController_2, RatingController_5, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Assets_4, RestaurantController_1, MemberController_6, ImageController_0, CollectionController_3, ImagesController_7, UserController_2, RatingController_5, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """list_of_all_restaurants""", """controllers.RestaurantController.getRestaurantsList()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """restaurants_by_id/""" + "$" + """id<[^/]+>""", """controllers.RestaurantController.getRestaurantByID(id:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """restaurants/""" + "$" + """id<[^/]+>""", """controllers.RestaurantController.getRestaurant(id:Integer, rating:Integer ?= null)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """collections/""" + "$" + """collection<[^/]+>""", """controllers.RestaurantController.getCollectionType(collection:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """rest""", """controllers.RestaurantController.createRestAdmin()"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """update_a_restaurant/""" + "$" + """id<[^/]+>""", """controllers.RestaurantController.updateRestAdmin(id:Integer)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """rest/""" + "$" + """id<[^/]+>""", """controllers.RestaurantController.deleteRestAdmin(id:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """search_restaurants_by_name_area""", """controllers.RestaurantController.getRestaurantsFromSearchFilter(area:java.lang.String ?= null , restaurantname:java.lang.String ?= null)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """search_nearby_restaurants/""" + "$" + """latitude<[^/]+>""", """controllers.RestaurantController.getNearbyRestaurants(latitude:java.lang.Double, longitude:java.lang.Double)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """filter""", """controllers.RestaurantController.getRestaurantsBySearchFilter(keyword:java.lang.String ?= null , collection:java.lang.String ?= null, time:java.lang.String ?= null , cost1:Integer ?= null, cost2:Integer ?= null, delivery:Integer ?= null)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """search/""" + "$" + """keyword<[^/]+>""", """controllers.RestaurantController.getNearbyRestaurantsBySearch(keyword:java.lang.String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """filter_search""", """controllers.RestaurantController.getRestaurantsSearch(collection:java.lang.String ?= null, time:java.lang.String ?= null , cost1:Integer ?= null, cost2:Integer ?= null, delivery:Integer ?= null)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """filter_search_123""", """controllers.RestaurantController.getSearch(collection:java.lang.String ?= null, time:java.lang.String ?= null , cost1:Integer ?= 0, cost2:Integer ?= 0, delivery:Integer ?= 2)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """members_list""", """controllers.MemberController.getMembersList()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """members/""" + "$" + """id<[^/]+>""", """controllers.MemberController.getMemberByID(id:Integer)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """create_member""", """controllers.MemberController.createMember()"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """update_members/""" + "$" + """id<[^/]+>""", """controllers.MemberController.updateMember(id:Integer)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """delete_member/""" + "$" + """id<[^/]+>""", """controllers.MemberController.deleteMember(id:Integer)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """images""", """controllers.ImageController.uploadImage()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """images/""" + "$" + """id<[^/]+>""", """controllers.ImageController.downloadImage(id:String)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """images/""" + "$" + """id<[^/]+>""", """controllers.ImageController.deleteImage(id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """get_all_collections""", """controllers.CollectionController.getCollectionsList()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """collections_by_id/""" + "$" + """ctype<[^/]+>""", """controllers.CollectionController.getCollectionByID(ctype:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """collection""", """controllers.CollectionController.createCollection()"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """update_a_collection/""" + "$" + """ctype<[^/]+>""", """controllers.CollectionController.updateCollection(ctype:String)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """delete_collection/""" + "$" + """ctype<[^/]+>""", """controllers.CollectionController.deleteCollection(ctype:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """get_all_images""", """controllers.ImagesController.getImagesList()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users/signin""", """controllers.UserController.signIn()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users/signout""", """controllers.UserController.signOut()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users/current""", """controllers.UserController.getCurrentUser()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users/users_dob""", """controllers.UserController.userDob()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users/rating""", """controllers.RatingController.postRatingRestaurants()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """avg_rating_restaurant""", """controllers.RestaurantController.AvgRatingofRestaurant(id:Integer ?= null)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ratings_reviews""", """controllers.RestaurantController.Reviews_Ratings_Restaurant(id:Integer ?= null)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_Assets_versioned0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned0_invoker = createInvoker(
    Assets_4.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_RestaurantController_getRestaurantsList1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("list_of_all_restaurants")))
  )
  private[this] lazy val controllers_RestaurantController_getRestaurantsList1_invoker = createInvoker(
    RestaurantController_1.getRestaurantsList(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RestaurantController",
      "getRestaurantsList",
      Nil,
      "GET",
      """Restaurants that will be displayed to the users""",
      this.prefix + """list_of_all_restaurants"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_RestaurantController_getRestaurantByID2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("restaurants_by_id/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RestaurantController_getRestaurantByID2_invoker = createInvoker(
    RestaurantController_1.getRestaurantByID(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RestaurantController",
      "getRestaurantByID",
      Seq(classOf[Integer]),
      "GET",
      """""",
      this.prefix + """restaurants_by_id/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_RestaurantController_getRestaurant3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("restaurants/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RestaurantController_getRestaurant3_invoker = createInvoker(
    RestaurantController_1.getRestaurant(fakeValue[Integer], fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RestaurantController",
      "getRestaurant",
      Seq(classOf[Integer], classOf[Integer]),
      "GET",
      """""",
      this.prefix + """restaurants/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_RestaurantController_getCollectionType4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("collections/"), DynamicPart("collection", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RestaurantController_getCollectionType4_invoker = createInvoker(
    RestaurantController_1.getCollectionType(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RestaurantController",
      "getCollectionType",
      Seq(classOf[String]),
      "GET",
      """Restaurants in each collection""",
      this.prefix + """collections/""" + "$" + """collection<[^/]+>"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_RestaurantController_createRestAdmin5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("rest")))
  )
  private[this] lazy val controllers_RestaurantController_createRestAdmin5_invoker = createInvoker(
    RestaurantController_1.createRestAdmin(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RestaurantController",
      "createRestAdmin",
      Nil,
      "POST",
      """CRUD operations that will be performed by the administrator""",
      this.prefix + """rest"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_RestaurantController_updateRestAdmin6_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("update_a_restaurant/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RestaurantController_updateRestAdmin6_invoker = createInvoker(
    RestaurantController_1.updateRestAdmin(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RestaurantController",
      "updateRestAdmin",
      Seq(classOf[Integer]),
      "PUT",
      """""",
      this.prefix + """update_a_restaurant/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:20
  private[this] lazy val controllers_RestaurantController_deleteRestAdmin7_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("rest/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RestaurantController_deleteRestAdmin7_invoker = createInvoker(
    RestaurantController_1.deleteRestAdmin(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RestaurantController",
      "deleteRestAdmin",
      Seq(classOf[Integer]),
      "DELETE",
      """""",
      this.prefix + """rest/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:24
  private[this] lazy val controllers_RestaurantController_getRestaurantsFromSearchFilter8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("search_restaurants_by_name_area")))
  )
  private[this] lazy val controllers_RestaurantController_getRestaurantsFromSearchFilter8_invoker = createInvoker(
    RestaurantController_1.getRestaurantsFromSearchFilter(fakeValue[java.lang.String], fakeValue[java.lang.String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RestaurantController",
      "getRestaurantsFromSearchFilter",
      Seq(classOf[java.lang.String], classOf[java.lang.String]),
      "GET",
      """Get all Restaurants based on a filter that searches by Restaurant Name or Restaurant Area""",
      this.prefix + """search_restaurants_by_name_area"""
    )
  )

  // @LINE:25
  private[this] lazy val controllers_RestaurantController_getNearbyRestaurants9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("search_nearby_restaurants/"), DynamicPart("latitude", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RestaurantController_getNearbyRestaurants9_invoker = createInvoker(
    RestaurantController_1.getNearbyRestaurants(fakeValue[java.lang.Double], fakeValue[java.lang.Double]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RestaurantController",
      "getNearbyRestaurants",
      Seq(classOf[java.lang.Double], classOf[java.lang.Double]),
      "GET",
      """""",
      this.prefix + """search_nearby_restaurants/""" + "$" + """latitude<[^/]+>"""
    )
  )

  // @LINE:26
  private[this] lazy val controllers_RestaurantController_getRestaurantsBySearchFilter10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("filter")))
  )
  private[this] lazy val controllers_RestaurantController_getRestaurantsBySearchFilter10_invoker = createInvoker(
    RestaurantController_1.getRestaurantsBySearchFilter(fakeValue[java.lang.String], fakeValue[java.lang.String], fakeValue[java.lang.String], fakeValue[Integer], fakeValue[Integer], fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RestaurantController",
      "getRestaurantsBySearchFilter",
      Seq(classOf[java.lang.String], classOf[java.lang.String], classOf[java.lang.String], classOf[Integer], classOf[Integer], classOf[Integer]),
      "GET",
      """""",
      this.prefix + """filter"""
    )
  )

  // @LINE:27
  private[this] lazy val controllers_RestaurantController_getNearbyRestaurantsBySearch11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("search/"), DynamicPart("keyword", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RestaurantController_getNearbyRestaurantsBySearch11_invoker = createInvoker(
    RestaurantController_1.getNearbyRestaurantsBySearch(fakeValue[java.lang.String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RestaurantController",
      "getNearbyRestaurantsBySearch",
      Seq(classOf[java.lang.String]),
      "GET",
      """""",
      this.prefix + """search/""" + "$" + """keyword<[^/]+>"""
    )
  )

  // @LINE:28
  private[this] lazy val controllers_RestaurantController_getRestaurantsSearch12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("filter_search")))
  )
  private[this] lazy val controllers_RestaurantController_getRestaurantsSearch12_invoker = createInvoker(
    RestaurantController_1.getRestaurantsSearch(fakeValue[java.lang.String], fakeValue[java.lang.String], fakeValue[Integer], fakeValue[Integer], fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RestaurantController",
      "getRestaurantsSearch",
      Seq(classOf[java.lang.String], classOf[java.lang.String], classOf[Integer], classOf[Integer], classOf[Integer]),
      "GET",
      """""",
      this.prefix + """filter_search"""
    )
  )

  // @LINE:29
  private[this] lazy val controllers_RestaurantController_getSearch13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("filter_search_123")))
  )
  private[this] lazy val controllers_RestaurantController_getSearch13_invoker = createInvoker(
    RestaurantController_1.getSearch(fakeValue[java.lang.String], fakeValue[java.lang.String], fakeValue[Integer], fakeValue[Integer], fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RestaurantController",
      "getSearch",
      Seq(classOf[java.lang.String], classOf[java.lang.String], classOf[Integer], classOf[Integer], classOf[Integer]),
      "GET",
      """""",
      this.prefix + """filter_search_123"""
    )
  )

  // @LINE:36
  private[this] lazy val controllers_MemberController_getMembersList14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("members_list")))
  )
  private[this] lazy val controllers_MemberController_getMembersList14_invoker = createInvoker(
    MemberController_6.getMembersList(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MemberController",
      "getMembersList",
      Nil,
      "GET",
      """The members can be retrieved, created, updated and deleted""",
      this.prefix + """members_list"""
    )
  )

  // @LINE:37
  private[this] lazy val controllers_MemberController_getMemberByID15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("members/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_MemberController_getMemberByID15_invoker = createInvoker(
    MemberController_6.getMemberByID(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MemberController",
      "getMemberByID",
      Seq(classOf[Integer]),
      "GET",
      """""",
      this.prefix + """members/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:38
  private[this] lazy val controllers_MemberController_createMember16_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("create_member")))
  )
  private[this] lazy val controllers_MemberController_createMember16_invoker = createInvoker(
    MemberController_6.createMember(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MemberController",
      "createMember",
      Nil,
      "POST",
      """""",
      this.prefix + """create_member"""
    )
  )

  // @LINE:39
  private[this] lazy val controllers_MemberController_updateMember17_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("update_members/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_MemberController_updateMember17_invoker = createInvoker(
    MemberController_6.updateMember(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MemberController",
      "updateMember",
      Seq(classOf[Integer]),
      "PUT",
      """""",
      this.prefix + """update_members/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:40
  private[this] lazy val controllers_MemberController_deleteMember18_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("delete_member/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_MemberController_deleteMember18_invoker = createInvoker(
    MemberController_6.deleteMember(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MemberController",
      "deleteMember",
      Seq(classOf[Integer]),
      "DELETE",
      """""",
      this.prefix + """delete_member/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:45
  private[this] lazy val controllers_ImageController_uploadImage19_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("images")))
  )
  private[this] lazy val controllers_ImageController_uploadImage19_invoker = createInvoker(
    ImageController_0.uploadImage(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ImageController",
      "uploadImage",
      Nil,
      "POST",
      """ Image controller""",
      this.prefix + """images"""
    )
  )

  // @LINE:46
  private[this] lazy val controllers_ImageController_downloadImage20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("images/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ImageController_downloadImage20_invoker = createInvoker(
    ImageController_0.downloadImage(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ImageController",
      "downloadImage",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """images/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:47
  private[this] lazy val controllers_ImageController_deleteImage21_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("images/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ImageController_deleteImage21_invoker = createInvoker(
    ImageController_0.deleteImage(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ImageController",
      "deleteImage",
      Seq(classOf[String]),
      "DELETE",
      """""",
      this.prefix + """images/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:51
  private[this] lazy val controllers_CollectionController_getCollectionsList22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("get_all_collections")))
  )
  private[this] lazy val controllers_CollectionController_getCollectionsList22_invoker = createInvoker(
    CollectionController_3.getCollectionsList(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CollectionController",
      "getCollectionsList",
      Nil,
      "GET",
      """Collection Class""",
      this.prefix + """get_all_collections"""
    )
  )

  // @LINE:52
  private[this] lazy val controllers_CollectionController_getCollectionByID23_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("collections_by_id/"), DynamicPart("ctype", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CollectionController_getCollectionByID23_invoker = createInvoker(
    CollectionController_3.getCollectionByID(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CollectionController",
      "getCollectionByID",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """collections_by_id/""" + "$" + """ctype<[^/]+>"""
    )
  )

  // @LINE:53
  private[this] lazy val controllers_CollectionController_createCollection24_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("collection")))
  )
  private[this] lazy val controllers_CollectionController_createCollection24_invoker = createInvoker(
    CollectionController_3.createCollection(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CollectionController",
      "createCollection",
      Nil,
      "POST",
      """""",
      this.prefix + """collection"""
    )
  )

  // @LINE:54
  private[this] lazy val controllers_CollectionController_updateCollection25_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("update_a_collection/"), DynamicPart("ctype", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CollectionController_updateCollection25_invoker = createInvoker(
    CollectionController_3.updateCollection(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CollectionController",
      "updateCollection",
      Seq(classOf[String]),
      "PUT",
      """""",
      this.prefix + """update_a_collection/""" + "$" + """ctype<[^/]+>"""
    )
  )

  // @LINE:55
  private[this] lazy val controllers_CollectionController_deleteCollection26_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("delete_collection/"), DynamicPart("ctype", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CollectionController_deleteCollection26_invoker = createInvoker(
    CollectionController_3.deleteCollection(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CollectionController",
      "deleteCollection",
      Seq(classOf[String]),
      "DELETE",
      """""",
      this.prefix + """delete_collection/""" + "$" + """ctype<[^/]+>"""
    )
  )

  // @LINE:59
  private[this] lazy val controllers_ImagesController_getImagesList27_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("get_all_images")))
  )
  private[this] lazy val controllers_ImagesController_getImagesList27_invoker = createInvoker(
    ImagesController_7.getImagesList(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ImagesController",
      "getImagesList",
      Nil,
      "GET",
      """Other Images""",
      this.prefix + """get_all_images"""
    )
  )

  // @LINE:64
  private[this] lazy val controllers_UserController_signIn28_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/signin")))
  )
  private[this] lazy val controllers_UserController_signIn28_invoker = createInvoker(
    UserController_2.signIn(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "signIn",
      Nil,
      "GET",
      """User Controller
POST /users/signup                                                                 controllers.UserController.createUser()""",
      this.prefix + """users/signin"""
    )
  )

  // @LINE:65
  private[this] lazy val controllers_UserController_signOut29_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/signout")))
  )
  private[this] lazy val controllers_UserController_signOut29_invoker = createInvoker(
    UserController_2.signOut(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "signOut",
      Nil,
      "GET",
      """""",
      this.prefix + """users/signout"""
    )
  )

  // @LINE:66
  private[this] lazy val controllers_UserController_getCurrentUser30_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/current")))
  )
  private[this] lazy val controllers_UserController_getCurrentUser30_invoker = createInvoker(
    UserController_2.getCurrentUser(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "getCurrentUser",
      Nil,
      "GET",
      """""",
      this.prefix + """users/current"""
    )
  )

  // @LINE:67
  private[this] lazy val controllers_UserController_userDob31_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/users_dob")))
  )
  private[this] lazy val controllers_UserController_userDob31_invoker = createInvoker(
    UserController_2.userDob(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "userDob",
      Nil,
      "GET",
      """""",
      this.prefix + """users/users_dob"""
    )
  )

  // @LINE:70
  private[this] lazy val controllers_RatingController_postRatingRestaurants32_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/rating")))
  )
  private[this] lazy val controllers_RatingController_postRatingRestaurants32_invoker = createInvoker(
    RatingController_5.postRatingRestaurants(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RatingController",
      "postRatingRestaurants",
      Nil,
      "POST",
      """User Ratings and Reviews""",
      this.prefix + """users/rating"""
    )
  )

  // @LINE:71
  private[this] lazy val controllers_RestaurantController_AvgRatingofRestaurant33_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("avg_rating_restaurant")))
  )
  private[this] lazy val controllers_RestaurantController_AvgRatingofRestaurant33_invoker = createInvoker(
    RestaurantController_1.AvgRatingofRestaurant(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RestaurantController",
      "AvgRatingofRestaurant",
      Seq(classOf[Integer]),
      "GET",
      """""",
      this.prefix + """avg_rating_restaurant"""
    )
  )

  // @LINE:73
  private[this] lazy val controllers_RestaurantController_Reviews_Ratings_Restaurant34_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ratings_reviews")))
  )
  private[this] lazy val controllers_RestaurantController_Reviews_Ratings_Restaurant34_invoker = createInvoker(
    RestaurantController_1.Reviews_Ratings_Restaurant(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RestaurantController",
      "Reviews_Ratings_Restaurant",
      Seq(classOf[Integer]),
      "GET",
      """GET   /rating_by_currentuser                                                        controllers.UserController.RatingsByCurrentUser(uname: java.lang.String ?= null)""",
      this.prefix + """ratings_reviews"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_Assets_versioned0_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned0_invoker.call(Assets_4.versioned(path, file))
      }
  
    // @LINE:10
    case controllers_RestaurantController_getRestaurantsList1_route(params) =>
      call { 
        controllers_RestaurantController_getRestaurantsList1_invoker.call(RestaurantController_1.getRestaurantsList())
      }
  
    // @LINE:11
    case controllers_RestaurantController_getRestaurantByID2_route(params) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_RestaurantController_getRestaurantByID2_invoker.call(RestaurantController_1.getRestaurantByID(id))
      }
  
    // @LINE:12
    case controllers_RestaurantController_getRestaurant3_route(params) =>
      call(params.fromPath[Integer]("id", None), params.fromQuery[Integer]("rating", Some(null))) { (id, rating) =>
        controllers_RestaurantController_getRestaurant3_invoker.call(RestaurantController_1.getRestaurant(id, rating))
      }
  
    // @LINE:15
    case controllers_RestaurantController_getCollectionType4_route(params) =>
      call(params.fromPath[String]("collection", None)) { (collection) =>
        controllers_RestaurantController_getCollectionType4_invoker.call(RestaurantController_1.getCollectionType(collection))
      }
  
    // @LINE:18
    case controllers_RestaurantController_createRestAdmin5_route(params) =>
      call { 
        controllers_RestaurantController_createRestAdmin5_invoker.call(RestaurantController_1.createRestAdmin())
      }
  
    // @LINE:19
    case controllers_RestaurantController_updateRestAdmin6_route(params) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_RestaurantController_updateRestAdmin6_invoker.call(RestaurantController_1.updateRestAdmin(id))
      }
  
    // @LINE:20
    case controllers_RestaurantController_deleteRestAdmin7_route(params) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_RestaurantController_deleteRestAdmin7_invoker.call(RestaurantController_1.deleteRestAdmin(id))
      }
  
    // @LINE:24
    case controllers_RestaurantController_getRestaurantsFromSearchFilter8_route(params) =>
      call(params.fromQuery[java.lang.String]("area", Some(null )), params.fromQuery[java.lang.String]("restaurantname", Some(null))) { (area, restaurantname) =>
        controllers_RestaurantController_getRestaurantsFromSearchFilter8_invoker.call(RestaurantController_1.getRestaurantsFromSearchFilter(area, restaurantname))
      }
  
    // @LINE:25
    case controllers_RestaurantController_getNearbyRestaurants9_route(params) =>
      call(params.fromPath[java.lang.Double]("latitude", None), params.fromQuery[java.lang.Double]("longitude", None)) { (latitude, longitude) =>
        controllers_RestaurantController_getNearbyRestaurants9_invoker.call(RestaurantController_1.getNearbyRestaurants(latitude, longitude))
      }
  
    // @LINE:26
    case controllers_RestaurantController_getRestaurantsBySearchFilter10_route(params) =>
      call(params.fromQuery[java.lang.String]("keyword", Some(null )), params.fromQuery[java.lang.String]("collection", Some(null)), params.fromQuery[java.lang.String]("time", Some(null )), params.fromQuery[Integer]("cost1", Some(null)), params.fromQuery[Integer]("cost2", Some(null)), params.fromQuery[Integer]("delivery", Some(null))) { (keyword, collection, time, cost1, cost2, delivery) =>
        controllers_RestaurantController_getRestaurantsBySearchFilter10_invoker.call(RestaurantController_1.getRestaurantsBySearchFilter(keyword, collection, time, cost1, cost2, delivery))
      }
  
    // @LINE:27
    case controllers_RestaurantController_getNearbyRestaurantsBySearch11_route(params) =>
      call(params.fromPath[java.lang.String]("keyword", None)) { (keyword) =>
        controllers_RestaurantController_getNearbyRestaurantsBySearch11_invoker.call(RestaurantController_1.getNearbyRestaurantsBySearch(keyword))
      }
  
    // @LINE:28
    case controllers_RestaurantController_getRestaurantsSearch12_route(params) =>
      call(params.fromQuery[java.lang.String]("collection", Some(null)), params.fromQuery[java.lang.String]("time", Some(null )), params.fromQuery[Integer]("cost1", Some(null)), params.fromQuery[Integer]("cost2", Some(null)), params.fromQuery[Integer]("delivery", Some(null))) { (collection, time, cost1, cost2, delivery) =>
        controllers_RestaurantController_getRestaurantsSearch12_invoker.call(RestaurantController_1.getRestaurantsSearch(collection, time, cost1, cost2, delivery))
      }
  
    // @LINE:29
    case controllers_RestaurantController_getSearch13_route(params) =>
      call(params.fromQuery[java.lang.String]("collection", Some(null)), params.fromQuery[java.lang.String]("time", Some(null )), params.fromQuery[Integer]("cost1", Some(0)), params.fromQuery[Integer]("cost2", Some(0)), params.fromQuery[Integer]("delivery", Some(2))) { (collection, time, cost1, cost2, delivery) =>
        controllers_RestaurantController_getSearch13_invoker.call(RestaurantController_1.getSearch(collection, time, cost1, cost2, delivery))
      }
  
    // @LINE:36
    case controllers_MemberController_getMembersList14_route(params) =>
      call { 
        controllers_MemberController_getMembersList14_invoker.call(MemberController_6.getMembersList())
      }
  
    // @LINE:37
    case controllers_MemberController_getMemberByID15_route(params) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_MemberController_getMemberByID15_invoker.call(MemberController_6.getMemberByID(id))
      }
  
    // @LINE:38
    case controllers_MemberController_createMember16_route(params) =>
      call { 
        controllers_MemberController_createMember16_invoker.call(MemberController_6.createMember())
      }
  
    // @LINE:39
    case controllers_MemberController_updateMember17_route(params) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_MemberController_updateMember17_invoker.call(MemberController_6.updateMember(id))
      }
  
    // @LINE:40
    case controllers_MemberController_deleteMember18_route(params) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_MemberController_deleteMember18_invoker.call(MemberController_6.deleteMember(id))
      }
  
    // @LINE:45
    case controllers_ImageController_uploadImage19_route(params) =>
      call { 
        controllers_ImageController_uploadImage19_invoker.call(ImageController_0.uploadImage())
      }
  
    // @LINE:46
    case controllers_ImageController_downloadImage20_route(params) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_ImageController_downloadImage20_invoker.call(ImageController_0.downloadImage(id))
      }
  
    // @LINE:47
    case controllers_ImageController_deleteImage21_route(params) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_ImageController_deleteImage21_invoker.call(ImageController_0.deleteImage(id))
      }
  
    // @LINE:51
    case controllers_CollectionController_getCollectionsList22_route(params) =>
      call { 
        controllers_CollectionController_getCollectionsList22_invoker.call(CollectionController_3.getCollectionsList())
      }
  
    // @LINE:52
    case controllers_CollectionController_getCollectionByID23_route(params) =>
      call(params.fromPath[String]("ctype", None)) { (ctype) =>
        controllers_CollectionController_getCollectionByID23_invoker.call(CollectionController_3.getCollectionByID(ctype))
      }
  
    // @LINE:53
    case controllers_CollectionController_createCollection24_route(params) =>
      call { 
        controllers_CollectionController_createCollection24_invoker.call(CollectionController_3.createCollection())
      }
  
    // @LINE:54
    case controllers_CollectionController_updateCollection25_route(params) =>
      call(params.fromPath[String]("ctype", None)) { (ctype) =>
        controllers_CollectionController_updateCollection25_invoker.call(CollectionController_3.updateCollection(ctype))
      }
  
    // @LINE:55
    case controllers_CollectionController_deleteCollection26_route(params) =>
      call(params.fromPath[String]("ctype", None)) { (ctype) =>
        controllers_CollectionController_deleteCollection26_invoker.call(CollectionController_3.deleteCollection(ctype))
      }
  
    // @LINE:59
    case controllers_ImagesController_getImagesList27_route(params) =>
      call { 
        controllers_ImagesController_getImagesList27_invoker.call(ImagesController_7.getImagesList())
      }
  
    // @LINE:64
    case controllers_UserController_signIn28_route(params) =>
      call { 
        controllers_UserController_signIn28_invoker.call(UserController_2.signIn())
      }
  
    // @LINE:65
    case controllers_UserController_signOut29_route(params) =>
      call { 
        controllers_UserController_signOut29_invoker.call(UserController_2.signOut())
      }
  
    // @LINE:66
    case controllers_UserController_getCurrentUser30_route(params) =>
      call { 
        controllers_UserController_getCurrentUser30_invoker.call(UserController_2.getCurrentUser())
      }
  
    // @LINE:67
    case controllers_UserController_userDob31_route(params) =>
      call { 
        controllers_UserController_userDob31_invoker.call(UserController_2.userDob())
      }
  
    // @LINE:70
    case controllers_RatingController_postRatingRestaurants32_route(params) =>
      call { 
        controllers_RatingController_postRatingRestaurants32_invoker.call(RatingController_5.postRatingRestaurants())
      }
  
    // @LINE:71
    case controllers_RestaurantController_AvgRatingofRestaurant33_route(params) =>
      call(params.fromQuery[Integer]("id", Some(null))) { (id) =>
        controllers_RestaurantController_AvgRatingofRestaurant33_invoker.call(RestaurantController_1.AvgRatingofRestaurant(id))
      }
  
    // @LINE:73
    case controllers_RestaurantController_Reviews_Ratings_Restaurant34_route(params) =>
      call(params.fromQuery[Integer]("id", Some(null))) { (id) =>
        controllers_RestaurantController_Reviews_Ratings_Restaurant34_invoker.call(RestaurantController_1.Reviews_Ratings_Restaurant(id))
      }
  }
}
