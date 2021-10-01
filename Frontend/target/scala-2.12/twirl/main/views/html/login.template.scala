
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


Seq[Any](format.raw/*1.28*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
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
                <button id="api-get-page" class="button" type="query12">1.2 Journal Search</button>
            </div>
            <div class="grid-item">
                <button id="api-get-page" class="button" type="query13">1.3 Author Title Search</button>
            </div>
            <div class="grid-item">
                <button id="api-get-page" class="button" type="query14">1.4 Authors With 10+ Papers</button>
            </div>
            <div class="grid-item"></div>
            <div class="grid-item">
                <button id="api-get-page" class="button" type="query15">1.5 Conference Location Search</button>
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
                <button id="api-get-page" class="button" type="query21">2.1 Author Paper Search</button>
            </div>

            <div class="grid-item">
                <button id="api-get-page" class="button" type="query12">2.2 Productive Authors Co-Authors</button>
            </div>
            <div class="grid-item">
                <button id="api-get-page" class="button" type="query13">2.3 Map of Conference Locations</button>
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
                  DATE: 2021-10-01T13:42:17.226
                  SOURCE: C:/Users/CJ/Desktop/8391/lab2/Frontend/app/views/login.scala.html
                  HASH: 34c468551b803c405f8a0cdad2d04bb676856ddb
                  MATRIX: 948->1|1069->27|1097->29|1188->93|1216->94|1257->108|1428->252|1457->253|1496->265|1535->276|1564->277|1606->291|1827->485|1856->486|1895->498|1931->506|1960->507|2002->521|2359->851|2388->852|2421->858|3980->2392|3995->2398|4041->2423
                  LINES: 28->1|33->1|34->2|38->6|38->6|39->7|43->11|43->11|45->13|45->13|45->13|46->14|51->19|51->19|53->21|53->21|53->21|54->22|64->32|64->32|65->33|94->62|94->62|94->62
                  -- GENERATED --
              */
          