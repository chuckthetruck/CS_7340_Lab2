// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/andrewbrkich/Desktop/CS_7340_Lab2/Frontend/conf/routes
// @DATE:Fri Oct 08 21:53:43 CDT 2021


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
