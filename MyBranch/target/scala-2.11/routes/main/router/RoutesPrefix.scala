
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/VISHNU VARDHAN/Sridevi-backend/MyBranch/conf/routes
// @DATE:Sun Mar 19 17:46:25 IST 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
