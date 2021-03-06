
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object q14 extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.19*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html>

    <style>
            .button """),format.raw/*6.21*/("""{"""),format.raw/*6.22*/("""
                """),format.raw/*7.17*/("""background-color: #4CAF50; /* Green */
                border: none;
                color: white;
                padding: 15px 32px;
                text-align: center;
                text-decoration: none;
                display: inline-block;
                font-size: 16px;
                margin: 4px 2px;
                cursor: pointer;
            """),format.raw/*17.13*/("""}"""),format.raw/*17.14*/("""
    """),format.raw/*18.5*/("""</style>

    <body>

        <header class="topbar">
            <h1 class="focused" style="font-size: 37px;
                color: #57a957">
                Query 1.4 Authors Search
            </h1>

        </header>

        <div>
            <p class="focused" style="font-size: 20px;
                color: #3F51B5">
                """),_display_(/*33.18*/message),format.raw/*33.25*/("""
            """),format.raw/*34.13*/("""</p>

        </div>

        <form action = """"),_display_(/*38.26*/routes/*38.32*/.HomeController.q14Handler()),format.raw/*38.60*/("""" method="GET">
            <button id="api-get-page"  class="button" type="submit">1.4 Authors Search</button>
        </form>
    </body>
</html>"""))
      }
    }
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-10-08T14:45:41.087
                  SOURCE: C:/Users/CJ/Desktop/8391/CS_7340_Lab2/Frontend/app/views/q14.scala.html
                  HASH: c5076744c8dd776d1245beaa587ece1c8e769ff0
                  MATRIX: 946->1|1058->18|1086->20|1173->80|1201->81|1246->99|1644->469|1673->470|1706->476|2089->832|2117->839|2159->853|2237->904|2252->910|2301->938
                  LINES: 28->1|33->1|34->2|38->6|38->6|39->7|49->17|49->17|50->18|65->33|65->33|66->34|70->38|70->38|70->38
                  -- GENERATED --
              */
          