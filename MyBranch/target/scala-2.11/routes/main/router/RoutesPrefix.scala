
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/bmanisha/Sridevi-backend/MyBranch/conf/routes
// @DATE:Tue Mar 21 10:28:10 IST 2017


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
