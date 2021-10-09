
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/CJ/Desktop/8391/CS_7340_Lab2/ebean-backend/conf/routes
// @DATE:Fri Oct 08 17:12:35 CDT 2021

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:8
  class ReversePaperController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:14
    def productiveAuthors: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PaperController.productiveAuthors",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "productiveauthors"})
        }
      """
    )
  
    // @LINE:12
    def authorNameYearSearch: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PaperController.authorNameYearSearch",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "authoryear"})
        }
      """
    )
  
    // @LINE:8
    def paperSearch: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PaperController.paperSearch",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "paper"})
        }
      """
    )
  
    // @LINE:10
    def journalSearch: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PaperController.journalSearch",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "journal"})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }


}
