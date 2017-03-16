
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/sakondi/Desktop/Sridevi-backend/MyBranch/conf/routes
// @DATE:Thu Mar 16 12:25:16 IST 2017


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
