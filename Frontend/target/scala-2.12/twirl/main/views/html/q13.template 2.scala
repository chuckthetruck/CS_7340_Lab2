
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


Seq[Any](format.raw/*1.32*/("""
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
                  DATE: 2021-10-08T15:23:09.793
                  SOURCE: C:/Users/CJ/Desktop/8391/CS_7340_Lab2/Frontend/app/views/q13.scala.html
                  HASH: 85c1e6511efe7f913f52d4f64afffb100617ef42
                  MATRIX: 958->1|1083->31|1111->33|1198->93|1226->94|1271->112|1669->482|1698->483|1731->489|2537->1268|2577->1292|2616->1293|2666->1315|2720->1342|2759->1365|2798->1366|2854->1394|2886->1399|2914->1406|2975->1436|3025->1458|3080->1482|3130->1504|3212->1559|3227->1565|3276->1593
                  LINES: 28->1|33->1|34->2|38->6|38->6|39->7|49->17|49->17|50->18|80->48|80->48|80->48|81->49|82->50|82->50|82->50|84->52|84->52|84->52|86->54|87->55|88->56|91->59|95->63|95->63|95->63
                  -- GENERATED --
              */
          