
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/CJ/Desktop/8391/CS_7340_Lab2/ebean-backend/conf/routes
// @DATE:Fri Oct 08 17:12:35 CDT 2021

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
  HomeController_0: controllers.HomeController,
  // @LINE:8
  PaperController_1: controllers.PaperController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_0: controllers.HomeController,
    // @LINE:8
    PaperController_1: controllers.PaperController
  ) = this(errorHandler, HomeController_0, PaperController_1, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, PaperController_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """paper""", """controllers.PaperController.paperSearch()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """journal""", """controllers.PaperController.journalSearch()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """authoryear""", """controllers.PaperController.authorNameYearSearch()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """productiveauthors""", """controllers.PaperController.productiveAuthors()"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_0.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      """ An example controller showing a sample home page""",
      this.prefix + """"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_PaperController_paperSearch1_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("paper")))
  )
  private[this] lazy val controllers_PaperController_paperSearch1_invoker = createInvoker(
    PaperController_1.paperSearch(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PaperController",
      "paperSearch",
      Nil,
      "POST",
      """""",
      this.prefix + """paper"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_PaperController_journalSearch2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("journal")))
  )
  private[this] lazy val controllers_PaperController_journalSearch2_invoker = createInvoker(
    PaperController_1.journalSearch(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PaperController",
      "journalSearch",
      Nil,
      "POST",
      """""",
      this.prefix + """journal"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_PaperController_authorNameYearSearch3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("authoryear")))
  )
  private[this] lazy val controllers_PaperController_authorNameYearSearch3_invoker = createInvoker(
    PaperController_1.authorNameYearSearch(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PaperController",
      "authorNameYearSearch",
      Nil,
      "POST",
      """""",
      this.prefix + """authoryear"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_PaperController_productiveAuthors4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("productiveauthors")))
  )
  private[this] lazy val controllers_PaperController_productiveAuthors4_invoker = createInvoker(
    PaperController_1.productiveAuthors(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PaperController",
      "productiveAuthors",
      Nil,
      "POST",
      """""",
      this.prefix + """productiveauthors"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_0.index)
      }
  
    // @LINE:8
    case controllers_PaperController_paperSearch1_route(params) =>
      call { 
        controllers_PaperController_paperSearch1_invoker.call(PaperController_1.paperSearch())
      }
  
    // @LINE:10
    case controllers_PaperController_journalSearch2_route(params) =>
      call { 
        controllers_PaperController_journalSearch2_invoker.call(PaperController_1.journalSearch())
      }
  
    // @LINE:12
    case controllers_PaperController_authorNameYearSearch3_route(params) =>
      call { 
        controllers_PaperController_authorNameYearSearch3_invoker.call(PaperController_1.authorNameYearSearch())
      }
  
    // @LINE:14
    case controllers_PaperController_productiveAuthors4_route(params) =>
      call { 
        controllers_PaperController_productiveAuthors4_invoker.call(PaperController_1.productiveAuthors())
      }
  }
}
