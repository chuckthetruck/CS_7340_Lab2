
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

object q13 extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[List[String]],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(articles: List[List[String]]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<!DOCTYPE html>
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
                Query 1.3 Researcher Search
            </h1>

        </header>

        <div>
            <table>
                <tr>
                    <th>Title</th>
                    <th>Conference</th>
                    <th>Publisher</th>
                    <th>Year</th>
                    <th>Journal</th>
                    <th>Volume</th>
                    <th>Issue</th>
                    <th>Pages</th>
                    <th>URL</th>
                    <th>EE</th>
                    <th>CrossRef</th>
                    <th>ISBN</th>
                </tr>


                """),_display_(/*48.18*/for(article <- articles) yield /*48.42*/{_display_(Seq[Any](format.raw/*48.43*/("""
                    """),format.raw/*49.21*/("""<tr>
                    """),_display_(/*50.22*/for(element <- article) yield /*50.45*/{_display_(Seq[Any](format.raw/*50.46*/("""

                        """),format.raw/*52.25*/("""<td>"""),_display_(/*52.30*/element),format.raw/*52.37*/("""</td>

                    """)))}),format.raw/*54.22*/("""
                    """),format.raw/*55.21*/("""</tr>
                """)))}),format.raw/*56.18*/("""


                """),format.raw/*59.17*/("""</table>

        </div>

        <form action = """"),_display_(/*63.26*/routes/*63.32*/.HomeController.q13Handler()),format.raw/*63.60*/("""" method="GET">
            <label>Author Name</label>
            <input type = "text" maxlength="100" id="name" name="name">
            <label>Year</label>
            <input type = "text" maxlength="100" id="year" name="year">
            <button id="api-get-page"  class="button" type="submit">1.3 Researcher Search</button>
        </form>
    </body>
</html>"""))
      }
    }
  }

  def render(articles:List[List[String]]): play.twirl.api.HtmlFormat.Appendable = apply(articles)

  def f:((List[List[String]]) => play.twirl.api.HtmlFormat.Appendable) = (articles) => apply(articles)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-10-08T21:53:44.510
                  SOURCE: /Users/andrewbrkich/Desktop/CS_7340_Lab2/Frontend/app/views/q13.scala.html
                  HASH: 813b95f11fcc93e232b60cfc6d0ccf76e79ecca0
                  MATRIX: 958->1|1082->32|1165->88|1193->89|1237->106|1625->466|1654->467|1686->472|2462->1221|2502->1245|2541->1246|2590->1267|2643->1293|2682->1316|2721->1317|2775->1343|2807->1348|2835->1355|2894->1383|2943->1404|2997->1427|3044->1446|3122->1497|3137->1503|3186->1531
                  LINES: 28->1|33->2|37->6|37->6|38->7|48->17|48->17|49->18|79->48|79->48|79->48|80->49|81->50|81->50|81->50|83->52|83->52|83->52|85->54|86->55|87->56|90->59|94->63|94->63|94->63
                  -- GENERATED --
              */
          