
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/User/Desktop/8391/lab2/ebean-backend/conf/routes
// @DATE:Fri Oct 08 12:19:51 CDT 2021


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
