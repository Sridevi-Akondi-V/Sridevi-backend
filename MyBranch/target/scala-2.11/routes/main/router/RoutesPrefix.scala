
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/sakondi/Desktop/Backend-Java/MyBranch/conf/routes
// @DATE:Fri Mar 10 15:34:37 IST 2017


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
