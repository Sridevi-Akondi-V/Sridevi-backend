
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/sakondi/Desktop/Sridevi-backend/MyBranch/conf/routes
// @DATE:Thu Mar 16 13:26:29 IST 2017

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
  // @LINE:30
  MemberController_6: controllers.MemberController,
  // @LINE:39
  ImageController_0: controllers.ImageController,
  // @LINE:45
  CollectionController_3: controllers.CollectionController,
  // @LINE:53
  ImagesController_7: controllers.ImagesController,
  // @LINE:58
  UserController_2: controllers.UserController,
  // @LINE:64
  RatingController_5: controllers.RatingController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Assets_4: controllers.Assets,
    // @LINE:10
    RestaurantController_1: controllers.RestaurantController,
    // @LINE:30
    MemberController_6: controllers.MemberController,
    // @LINE:39
    ImageController_0: controllers.ImageController,
    // @LINE:45
    CollectionController_3: controllers.CollectionController,
    // @LINE:53
    ImagesController_7: controllers.ImagesController,
    // @LINE:58
    UserController_2: controllers.UserController,
    // @LINE:64
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
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """restaurants_by_id/""" + "$" + """id<[^/]+>""", """controllers.RestaurantController.getRestaurantByID(id:Integer, rating:Integer ?= null)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """collections/""" + "$" + """collection<[^/]+>""", """controllers.RestaurantController.getCollectionType(collection:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """rest""", """controllers.RestaurantController.createRestAdmin()"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """update_a_restaurant/""" + "$" + """id<[^/]+>""", """controllers.RestaurantController.updateRestAdmin(id:Integer)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """rest/""" + "$" + """id<[^/]+>""", """controllers.RestaurantController.deleteRestAdmin(id:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """search_restaurants_by_name_area""", """controllers.RestaurantController.getRestaurantsFromSearchFilter(area:java.lang.String ?= null , restaurantname:java.lang.String ?= null)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """search_nearby_restaurants/""" + "$" + """latitude<[^/]+>""", """controllers.RestaurantController.getNearbyRestaurants(latitude:java.lang.Double, longitude:java.lang.Double)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """filter""", """controllers.RestaurantController.getRestaurantsBySearchFilter(keyword:java.lang.String ?= null , collection:java.lang.String ?= null, time:java.lang.String ?= null , cost1:Integer ?= null, cost2:Integer ?= null, delivery:Integer ?= null)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """search/""" + "$" + """keyword<[^/]+>""", """controllers.RestaurantController.getNearbyRestaurantsBySearch(keyword:java.lang.String)"""),
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
    RestaurantController_1.getRestaurantByID(fakeValue[Integer], fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RestaurantController",
      "getRestaurantByID",
      Seq(classOf[Integer], classOf[Integer]),
      "GET",
      """""",
      this.prefix + """restaurants_by_id/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_RestaurantController_getCollectionType3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("collections/"), DynamicPart("collection", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RestaurantController_getCollectionType3_invoker = createInvoker(
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
  private[this] lazy val controllers_RestaurantController_createRestAdmin4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("rest")))
  )
  private[this] lazy val controllers_RestaurantController_createRestAdmin4_invoker = createInvoker(
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
  private[this] lazy val controllers_RestaurantController_updateRestAdmin5_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("update_a_restaurant/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RestaurantController_updateRestAdmin5_invoker = createInvoker(
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
  private[this] lazy val controllers_RestaurantController_deleteRestAdmin6_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("rest/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RestaurantController_deleteRestAdmin6_invoker = createInvoker(
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
  private[this] lazy val controllers_RestaurantController_getRestaurantsFromSearchFilter7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("search_restaurants_by_name_area")))
  )
  private[this] lazy val controllers_RestaurantController_getRestaurantsFromSearchFilter7_invoker = createInvoker(
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
  private[this] lazy val controllers_RestaurantController_getNearbyRestaurants8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("search_nearby_restaurants/"), DynamicPart("latitude", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RestaurantController_getNearbyRestaurants8_invoker = createInvoker(
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
  private[this] lazy val controllers_RestaurantController_getRestaurantsBySearchFilter9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("filter")))
  )
  private[this] lazy val controllers_RestaurantController_getRestaurantsBySearchFilter9_invoker = createInvoker(
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
  private[this] lazy val controllers_RestaurantController_getNearbyRestaurantsBySearch10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("search/"), DynamicPart("keyword", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RestaurantController_getNearbyRestaurantsBySearch10_invoker = createInvoker(
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

  // @LINE:30
  private[this] lazy val controllers_MemberController_getMembersList11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("members_list")))
  )
  private[this] lazy val controllers_MemberController_getMembersList11_invoker = createInvoker(
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

  // @LINE:31
  private[this] lazy val controllers_MemberController_getMemberByID12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("members/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_MemberController_getMemberByID12_invoker = createInvoker(
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

  // @LINE:32
  private[this] lazy val controllers_MemberController_createMember13_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("create_member")))
  )
  private[this] lazy val controllers_MemberController_createMember13_invoker = createInvoker(
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

  // @LINE:33
  private[this] lazy val controllers_MemberController_updateMember14_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("update_members/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_MemberController_updateMember14_invoker = createInvoker(
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

  // @LINE:34
  private[this] lazy val controllers_MemberController_deleteMember15_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("delete_member/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_MemberController_deleteMember15_invoker = createInvoker(
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

  // @LINE:39
  private[this] lazy val controllers_ImageController_uploadImage16_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("images")))
  )
  private[this] lazy val controllers_ImageController_uploadImage16_invoker = createInvoker(
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

  // @LINE:40
  private[this] lazy val controllers_ImageController_downloadImage17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("images/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ImageController_downloadImage17_invoker = createInvoker(
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

  // @LINE:41
  private[this] lazy val controllers_ImageController_deleteImage18_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("images/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ImageController_deleteImage18_invoker = createInvoker(
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

  // @LINE:45
  private[this] lazy val controllers_CollectionController_getCollectionsList19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("get_all_collections")))
  )
  private[this] lazy val controllers_CollectionController_getCollectionsList19_invoker = createInvoker(
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

  // @LINE:46
  private[this] lazy val controllers_CollectionController_getCollectionByID20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("collections_by_id/"), DynamicPart("ctype", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CollectionController_getCollectionByID20_invoker = createInvoker(
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

  // @LINE:47
  private[this] lazy val controllers_CollectionController_createCollection21_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("collection")))
  )
  private[this] lazy val controllers_CollectionController_createCollection21_invoker = createInvoker(
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

  // @LINE:48
  private[this] lazy val controllers_CollectionController_updateCollection22_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("update_a_collection/"), DynamicPart("ctype", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CollectionController_updateCollection22_invoker = createInvoker(
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

  // @LINE:49
  private[this] lazy val controllers_CollectionController_deleteCollection23_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("delete_collection/"), DynamicPart("ctype", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CollectionController_deleteCollection23_invoker = createInvoker(
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

  // @LINE:53
  private[this] lazy val controllers_ImagesController_getImagesList24_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("get_all_images")))
  )
  private[this] lazy val controllers_ImagesController_getImagesList24_invoker = createInvoker(
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

  // @LINE:58
  private[this] lazy val controllers_UserController_signIn25_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/signin")))
  )
  private[this] lazy val controllers_UserController_signIn25_invoker = createInvoker(
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

  // @LINE:59
  private[this] lazy val controllers_UserController_signOut26_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/signout")))
  )
  private[this] lazy val controllers_UserController_signOut26_invoker = createInvoker(
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

  // @LINE:60
  private[this] lazy val controllers_UserController_getCurrentUser27_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/current")))
  )
  private[this] lazy val controllers_UserController_getCurrentUser27_invoker = createInvoker(
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

  // @LINE:61
  private[this] lazy val controllers_UserController_userDob28_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/users_dob")))
  )
  private[this] lazy val controllers_UserController_userDob28_invoker = createInvoker(
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

  // @LINE:64
  private[this] lazy val controllers_RatingController_postRatingRestaurants29_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/rating")))
  )
  private[this] lazy val controllers_RatingController_postRatingRestaurants29_invoker = createInvoker(
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

  // @LINE:65
  private[this] lazy val controllers_RestaurantController_AvgRatingofRestaurant30_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("avg_rating_restaurant")))
  )
  private[this] lazy val controllers_RestaurantController_AvgRatingofRestaurant30_invoker = createInvoker(
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

  // @LINE:67
  private[this] lazy val controllers_RestaurantController_Reviews_Ratings_Restaurant31_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ratings_reviews")))
  )
  private[this] lazy val controllers_RestaurantController_Reviews_Ratings_Restaurant31_invoker = createInvoker(
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
      call(params.fromPath[Integer]("id", None), params.fromQuery[Integer]("rating", Some(null))) { (id, rating) =>
        controllers_RestaurantController_getRestaurantByID2_invoker.call(RestaurantController_1.getRestaurantByID(id, rating))
      }
  
    // @LINE:15
    case controllers_RestaurantController_getCollectionType3_route(params) =>
      call(params.fromPath[String]("collection", None)) { (collection) =>
        controllers_RestaurantController_getCollectionType3_invoker.call(RestaurantController_1.getCollectionType(collection))
      }
  
    // @LINE:18
    case controllers_RestaurantController_createRestAdmin4_route(params) =>
      call { 
        controllers_RestaurantController_createRestAdmin4_invoker.call(RestaurantController_1.createRestAdmin())
      }
  
    // @LINE:19
    case controllers_RestaurantController_updateRestAdmin5_route(params) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_RestaurantController_updateRestAdmin5_invoker.call(RestaurantController_1.updateRestAdmin(id))
      }
  
    // @LINE:20
    case controllers_RestaurantController_deleteRestAdmin6_route(params) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_RestaurantController_deleteRestAdmin6_invoker.call(RestaurantController_1.deleteRestAdmin(id))
      }
  
    // @LINE:24
    case controllers_RestaurantController_getRestaurantsFromSearchFilter7_route(params) =>
      call(params.fromQuery[java.lang.String]("area", Some(null )), params.fromQuery[java.lang.String]("restaurantname", Some(null))) { (area, restaurantname) =>
        controllers_RestaurantController_getRestaurantsFromSearchFilter7_invoker.call(RestaurantController_1.getRestaurantsFromSearchFilter(area, restaurantname))
      }
  
    // @LINE:25
    case controllers_RestaurantController_getNearbyRestaurants8_route(params) =>
      call(params.fromPath[java.lang.Double]("latitude", None), params.fromQuery[java.lang.Double]("longitude", None)) { (latitude, longitude) =>
        controllers_RestaurantController_getNearbyRestaurants8_invoker.call(RestaurantController_1.getNearbyRestaurants(latitude, longitude))
      }
  
    // @LINE:26
    case controllers_RestaurantController_getRestaurantsBySearchFilter9_route(params) =>
      call(params.fromQuery[java.lang.String]("keyword", Some(null )), params.fromQuery[java.lang.String]("collection", Some(null)), params.fromQuery[java.lang.String]("time", Some(null )), params.fromQuery[Integer]("cost1", Some(null)), params.fromQuery[Integer]("cost2", Some(null)), params.fromQuery[Integer]("delivery", Some(null))) { (keyword, collection, time, cost1, cost2, delivery) =>
        controllers_RestaurantController_getRestaurantsBySearchFilter9_invoker.call(RestaurantController_1.getRestaurantsBySearchFilter(keyword, collection, time, cost1, cost2, delivery))
      }
  
    // @LINE:27
    case controllers_RestaurantController_getNearbyRestaurantsBySearch10_route(params) =>
      call(params.fromPath[java.lang.String]("keyword", None)) { (keyword) =>
        controllers_RestaurantController_getNearbyRestaurantsBySearch10_invoker.call(RestaurantController_1.getNearbyRestaurantsBySearch(keyword))
      }
  
    // @LINE:30
    case controllers_MemberController_getMembersList11_route(params) =>
      call { 
        controllers_MemberController_getMembersList11_invoker.call(MemberController_6.getMembersList())
      }
  
    // @LINE:31
    case controllers_MemberController_getMemberByID12_route(params) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_MemberController_getMemberByID12_invoker.call(MemberController_6.getMemberByID(id))
      }
  
    // @LINE:32
    case controllers_MemberController_createMember13_route(params) =>
      call { 
        controllers_MemberController_createMember13_invoker.call(MemberController_6.createMember())
      }
  
    // @LINE:33
    case controllers_MemberController_updateMember14_route(params) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_MemberController_updateMember14_invoker.call(MemberController_6.updateMember(id))
      }
  
    // @LINE:34
    case controllers_MemberController_deleteMember15_route(params) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_MemberController_deleteMember15_invoker.call(MemberController_6.deleteMember(id))
      }
  
    // @LINE:39
    case controllers_ImageController_uploadImage16_route(params) =>
      call { 
        controllers_ImageController_uploadImage16_invoker.call(ImageController_0.uploadImage())
      }
  
    // @LINE:40
    case controllers_ImageController_downloadImage17_route(params) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_ImageController_downloadImage17_invoker.call(ImageController_0.downloadImage(id))
      }
  
    // @LINE:41
    case controllers_ImageController_deleteImage18_route(params) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_ImageController_deleteImage18_invoker.call(ImageController_0.deleteImage(id))
      }
  
    // @LINE:45
    case controllers_CollectionController_getCollectionsList19_route(params) =>
      call { 
        controllers_CollectionController_getCollectionsList19_invoker.call(CollectionController_3.getCollectionsList())
      }
  
    // @LINE:46
    case controllers_CollectionController_getCollectionByID20_route(params) =>
      call(params.fromPath[String]("ctype", None)) { (ctype) =>
        controllers_CollectionController_getCollectionByID20_invoker.call(CollectionController_3.getCollectionByID(ctype))
      }
  
    // @LINE:47
    case controllers_CollectionController_createCollection21_route(params) =>
      call { 
        controllers_CollectionController_createCollection21_invoker.call(CollectionController_3.createCollection())
      }
  
    // @LINE:48
    case controllers_CollectionController_updateCollection22_route(params) =>
      call(params.fromPath[String]("ctype", None)) { (ctype) =>
        controllers_CollectionController_updateCollection22_invoker.call(CollectionController_3.updateCollection(ctype))
      }
  
    // @LINE:49
    case controllers_CollectionController_deleteCollection23_route(params) =>
      call(params.fromPath[String]("ctype", None)) { (ctype) =>
        controllers_CollectionController_deleteCollection23_invoker.call(CollectionController_3.deleteCollection(ctype))
      }
  
    // @LINE:53
    case controllers_ImagesController_getImagesList24_route(params) =>
      call { 
        controllers_ImagesController_getImagesList24_invoker.call(ImagesController_7.getImagesList())
      }
  
    // @LINE:58
    case controllers_UserController_signIn25_route(params) =>
      call { 
        controllers_UserController_signIn25_invoker.call(UserController_2.signIn())
      }
  
    // @LINE:59
    case controllers_UserController_signOut26_route(params) =>
      call { 
        controllers_UserController_signOut26_invoker.call(UserController_2.signOut())
      }
  
    // @LINE:60
    case controllers_UserController_getCurrentUser27_route(params) =>
      call { 
        controllers_UserController_getCurrentUser27_invoker.call(UserController_2.getCurrentUser())
      }
  
    // @LINE:61
    case controllers_UserController_userDob28_route(params) =>
      call { 
        controllers_UserController_userDob28_invoker.call(UserController_2.userDob())
      }
  
    // @LINE:64
    case controllers_RatingController_postRatingRestaurants29_route(params) =>
      call { 
        controllers_RatingController_postRatingRestaurants29_invoker.call(RatingController_5.postRatingRestaurants())
      }
  
    // @LINE:65
    case controllers_RestaurantController_AvgRatingofRestaurant30_route(params) =>
      call(params.fromQuery[Integer]("id", Some(null))) { (id) =>
        controllers_RestaurantController_AvgRatingofRestaurant30_invoker.call(RestaurantController_1.AvgRatingofRestaurant(id))
      }
  
    // @LINE:67
    case controllers_RestaurantController_Reviews_Ratings_Restaurant31_route(params) =>
      call(params.fromQuery[Integer]("id", Some(null))) { (id) =>
        controllers_RestaurantController_Reviews_Ratings_Restaurant31_invoker.call(RestaurantController_1.Reviews_Ratings_Restaurant(id))
      }
  }
}
