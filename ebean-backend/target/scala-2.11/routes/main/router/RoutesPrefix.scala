
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/User/Desktop/8391/lab2/ebean-backend/conf/routes
// @DATE:Wed Sep 29 10:44:05 CDT 2021


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
