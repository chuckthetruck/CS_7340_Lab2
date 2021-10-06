
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

object login extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(authorizeMessage: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<!DOCTYPE html>
<html>

    <style>
        .grid-container """),format.raw/*6.25*/("""{"""),format.raw/*6.26*/("""
            """),format.raw/*7.13*/("""display: grid;
            grid-template-columns: auto auto auto;
            background-color: #2196F3;
            padding: 10px;
        """),format.raw/*11.9*/("""}"""),format.raw/*11.10*/("""

        """),format.raw/*13.9*/(""".grid-item """),format.raw/*13.20*/("""{"""),format.raw/*13.21*/("""
            """),format.raw/*14.13*/("""background-color: rgba(255, 255, 255, 0.8);
            border: 1px solid rgba(0, 0, 0, 0.8);
            padding: 5px;
            font-size: 30px;
            text-align: center;
        """),format.raw/*19.9*/("""}"""),format.raw/*19.10*/("""

        """),format.raw/*21.9*/(""".button """),format.raw/*21.17*/("""{"""),format.raw/*21.18*/("""
            """),format.raw/*22.13*/("""background-color: #4CAF50; /* Green */
            border: none;
            color: white;
            padding: 15px 32px;
            text-align: center;
            text-decoration: none;
            display: inline-block;
            font-size: 16px;
            margin: 4px 2px;
            cursor: pointer;
        """),format.raw/*32.9*/("""}"""),format.raw/*32.10*/("""
    """),format.raw/*33.5*/("""</style>


    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <title>Play Setup Demo</title>
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">

            <!-- Compiled and minified JavaScript -->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
        <link rel="shortcut icon" type="image/x-icon" href="docs/images/favicon.ico" />
        <link rel="stylesheet" href="https://unpkg.com/leaflet@1.5.1/dist/leaflet.css" integrity="sha512-xwE/Az9zrjBIphAcBb3F6JVqxf46+CDLwfLMHloNu6KEQCAWi6HcDUbeOfBIptF7tcCzusKFjFw2yuvEpDL9wQ==" crossorigin=""/>
        <script src="https://unpkg.com/leaflet@1.5.1/dist/leaflet.js" integrity="sha512-GffPMF3RvMeYyc1LWMHtK8EbPv0iNZ8/oTtHPx9/cc2ILxQ+u905qIwdpULaqDkyBKgOaB57QTMg7ztg8Jm2Og==" crossorigin=""></script>
    </head>
    <body>

        <header class="topbar">
            <h1 class="focused" style="font-size: 37px;
                color: #57a957">
                <strong>Part 1 Queries</strong>
            </h1>
        </header>


        <div class="grid-container">
            <div class="grid-item">
                <form action = """"),_display_(/*62.34*/routes/*62.40*/.HomeController.query11()),format.raw/*62.65*/("""" method="GET">
                    <button id="api-get-page"  class="button" type="submit">1.1 Paper Search</button>
                </form>

            </div>

            <div class="grid-item">
                <form action = """"),_display_(/*69.34*/routes/*69.40*/.HomeController.query12()),format.raw/*69.65*/("""" method="GET">
                    <button id="api-get-page" class="button" type="submit">1.2 Journal Search</button>
                </form>
            </div>
            <div class="grid-item">
                <form action = """"),_display_(/*74.34*/routes/*74.40*/.HomeController.query13()),format.raw/*74.65*/("""" method="GET">
                    <button id="api-get-page" class="button" type="submit">1.3 Author Title Search</button>
                </form>
            </div>
            <div class="grid-item">
                <form action = """"),_display_(/*79.34*/routes/*79.40*/.HomeController.query14()),format.raw/*79.65*/("""" method="GET">
                    <button id="api-get-page" class="button" type="submit">1.4 Authors With 10+ Papers</button>
                </form>
            </div>
            <div class="grid-item"></div>
            <div class="grid-item">
                <form action = """"),_display_(/*85.34*/routes/*85.40*/.HomeController.query15()),format.raw/*85.65*/("""" method="GET">
                    <button id="api-get-page" class="button" type="submit">1.5 Conference Location Search</button>
                </form>
            </div>
        </div>


        <header class="topbar">
            <h1 class="focused" style="font-size: 37px;
                color: #57a957">
                <strong>Part 2 Queries</strong>
            </h1>
        </header>


        <div class="grid-container">
            <div class="grid-item">
                <form action = """"),_display_(/*102.34*/routes/*102.40*/.HomeController.query21()),format.raw/*102.65*/("""" method="GET">
                    <button id="api-get-page" class="button" type="submit">2.1 Author Paper Search</button>
                </form>
            </div>

            <div class="grid-item">
                <form action = """"),_display_(/*108.34*/routes/*108.40*/.HomeController.query22()),format.raw/*108.65*/("""" method="GET">
                    <button id="api-get-page" class="button" type="submit">2.2 Productive Authors Co-Authors</button>
                </form>
            </div>
            <div class="grid-item">
                <form action = """"),_display_(/*113.34*/routes/*113.40*/.HomeController.query23()),format.raw/*113.65*/("""" method="GET">
                    <button id="api-get-page" class="button" type="submit">2.3 Map of Conference Locations</button>
                </form>
            </div>
        </div>
    </body>
</html>
"""))
      }
    }
  }

  def render(authorizeMessage:String): play.twirl.api.HtmlFormat.Appendable = apply(authorizeMessage)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (authorizeMessage) => apply(authorizeMessage)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-10-05T16:37:16.834
                  SOURCE: /Users/andrewbrkich/Desktop/CS_7340_Lab2/Frontend/app/views/login.scala.html
                  HASH: b222eed3bf7e78c0145103c5e0ea0af14638bb17
                  MATRIX: 948->1|1068->28|1155->88|1183->89|1223->102|1390->242|1419->243|1456->253|1495->264|1524->265|1565->278|1781->467|1810->468|1847->478|1883->486|1912->487|1953->500|2300->820|2329->821|2361->826|3891->2331|3906->2337|3952->2362|4211->2594|4226->2600|4272->2625|4530->2856|4545->2862|4591->2887|4854->3123|4869->3129|4915->3154|5224->3436|5239->3442|5285->3467|5817->3971|5833->3977|5880->4002|6145->4239|6161->4245|6208->4270|6482->4516|6498->4522|6545->4547
                  LINES: 28->1|33->2|37->6|37->6|38->7|42->11|42->11|44->13|44->13|44->13|45->14|50->19|50->19|52->21|52->21|52->21|53->22|63->32|63->32|64->33|93->62|93->62|93->62|100->69|100->69|100->69|105->74|105->74|105->74|110->79|110->79|110->79|116->85|116->85|116->85|133->102|133->102|133->102|139->108|139->108|139->108|144->113|144->113|144->113
                  -- GENERATED --
              */
          