
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

object q23 extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<!DOCTYPE html>

<html>

    <link rel="stylesheet" href="https://unpkg.com/leaflet@1.7.1/dist/leaflet.css"
    integrity="sha512-xodZBNTC5n17Xt2atTPuE1HxjVMSvLVW9ocqUKLsCC5CXdbqCmblAshOMAS6/keqq/sMZMZ19scR4PsZChSR7A=="
    crossorigin=""/>
        <!-- Make sure you put this AFTER Leaflet's CSS -->
    <script src="https://unpkg.com/leaflet@1.7.1/dist/leaflet.js"
    integrity="sha512-XQoYMqMTK8LvdxXYG3nZ448hOEQiglfqkJs1NOQV44cWnUrBc8PkAOcXy20w0vlaXaVUearIOBhiXZ5V3ynxwA=="
    crossorigin=""></script>

    <style>
            .button """),format.raw/*15.21*/("""{"""),format.raw/*15.22*/("""
                """),format.raw/*16.17*/("""background-color: #4CAF50; /* Green */
                border: none;
                color: white;
                padding: 15px 32px;
                text-align: center;
                text-decoration: none;
                display: inline-block;
                font-size: 16px;
                margin: 4px 2px;
                cursor: pointer;
            """),format.raw/*26.13*/("""}"""),format.raw/*26.14*/("""

            """),format.raw/*28.13*/("""#mapid """),format.raw/*28.20*/("""{"""),format.raw/*28.21*/(""" """),format.raw/*28.22*/("""height: 600px; """),format.raw/*28.37*/("""}"""),format.raw/*28.38*/("""
    """),format.raw/*29.5*/("""</style>

    <body>

        <header class="topbar">
            <h1 class="focused" style="font-size: 37px;
                color: #57a957">
                Query 2.3 Map Search
            </h1>

        </header>

        <div>
            <p class="focused" style="font-size: 20px;
                color: #3F51B5">
                """),_display_(/*44.18*/message),format.raw/*44.25*/("""
            """),format.raw/*45.13*/("""</p>

        </div>

        <form action = """"),_display_(/*49.26*/routes/*49.32*/.HomeController.q23Handler()),format.raw/*49.60*/("""" method="GET">
            <label>Conference</label>
            <input type = "text" maxlength="100" id="conference" name="conference">
            <label>Years</label>
            <input type = "text" maxlength="100" id="years" name="years">
            <button id="api-get-page"  class="button" type="submit">2.3 Map Search</button>
        </form>

        <div id="mapid"></div>
        <script>

                let icws = """),format.raw/*60.28*/("""{"""),format.raw/*60.29*/("""
                    """),format.raw/*61.21*/("""LVx: 36.1699,//vegas
                    LVy: -115.1398,
                    SDx: 32.7157,//san diego
                    SDy: -117.611,
                    OFx: 28.5384,//orlando florida
                    OFy: -81.3789,
                    CIx: 41.8781,//chicago illinois
                    CIy: -87.6298,
                    SLx: 40.7608,//salt lake city utah
                    SLy: -111.8910,
                    BCx: 39.9042,//beijing china
                    BCy: 116.4074,
                    LAx: 34.0522,//los angeles
                    LAy: -118.2437,
                    MFx: 25.7617,//miami florida
                    MFy: -80.1918,
                    DCx: 38.9072,//washington dc
                    DCy: -77.0369,
                    HHx: 21.3069,//honolulu hawaii
                    HHy: -157.8583,
                    SCx: 37.3541,//santa clara california
                    SCy: -121.9552,
                    AAx: 61.2181,//anchorage alaska
                    AAy: -149.9003,
                    NYx: 40.7128,//new york city
                    NYy: -74.0060,
                    SFx: 37.7749,//san francisco
                    SFy: -122.4194,
                    MIx: 45.4642,//milan italy
                    MIy: 9.1900,
                    //no duplicates for 2017 honolulu, 2018 san fran, 2020 beijing
                    //add them if you want but I couldn't store a key as a number
                """),format.raw/*93.17*/("""}"""),format.raw/*93.18*/("""

                """),format.raw/*95.17*/("""let scc = """),format.raw/*95.27*/("""{"""),format.raw/*95.28*/("""
                    """),format.raw/*96.21*/("""BIx: 12.9716,//bangalore india
                    BIy: 77.5946,
                    //bangalore is only unique value (2009)
                    //the rest of the values appear in icws
                """),format.raw/*100.17*/("""}"""),format.raw/*100.18*/("""

                """),format.raw/*102.17*/("""var mymap = L.map('mapid').setView([0, 0], 2);

                L.tileLayer('https://api.maptiler.com/maps/streets/"""),format.raw/*104.68*/("""{"""),format.raw/*104.69*/("""z"""),format.raw/*104.70*/("""}"""),format.raw/*104.71*/("""/"""),format.raw/*104.72*/("""{"""),format.raw/*104.73*/("""x"""),format.raw/*104.74*/("""}"""),format.raw/*104.75*/("""/"""),format.raw/*104.76*/("""{"""),format.raw/*104.77*/("""y"""),format.raw/*104.78*/("""}"""),format.raw/*104.79*/(""".png?key=dcj0rBj8ACT4YDvql2hH', """),format.raw/*104.111*/("""{"""),format.raw/*104.112*/("""
                    """),format.raw/*105.21*/("""attribution: '<a href="https://www.maptiler.com/copyright/" target="_blank">&copy; MapTiler</a> <a href="https://www.openstreetmap.org/copyright" target="_blank">&copy; OpenStreetMap contributors</a>',
                """),format.raw/*106.17*/("""}"""),format.raw/*106.18*/(""").addTo(mymap);

                //var marker = L.marker([51.5, -.09]).addTo(mymap); //londok UK test marker
                var LV = L.marker([icws["LVx"], icws["LVy"]]).addTo(mymap);
                var SD = L.marker([icws["SDx"], icws["SDy"]]).addTo(mymap);
                var OF = L.marker([icws["OFx"], icws["OFy"]]).addTo(mymap);
                var BC = L.marker([icws["BCx"], icws["BCy"]]).addTo(mymap);
                var HH = L.marker([icws["HHx"], icws["HHy"]]).addTo(mymap);
                var SF = L.marker([icws["SFx"], icws["SFy"]]).addTo(mymap);
                var SC = L.marker([icws["SCx"], icws["SCy"]]).addTo(mymap);
                var MF = L.marker([icws["MFx"], icws["MFy"]]).addTo(mymap);
                var DC = L.marker([icws["DCx"], icws["DCy"]]).addTo(mymap);
                var MI = L.marker([icws["MIx"], icws["MIy"]]).addTo(mymap);
                var LA = L.marker([icws["LAx"], icws["LAy"]]).addTo(mymap);
                var AA = L.marker([icws["AAx"], icws["AAy"]]).addTo(mymap);
                var SL = L.marker([icws["SLx"], icws["SLy"]]).addTo(mymap);
                var CI = L.marker([icws["CIx"], icws["CIy"]]).addTo(mymap);
                var NY = L.marker([icws["NYx"], icws["NYy"]]).addTo(mymap);

                var BI = L.marker([scc["BIx"], scc["BIy"]]).addTo(mymap);
        </script>

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
                  DATE: 2021-10-06T16:38:30.018
                  SOURCE: /Users/andrewbrkich/Desktop/CS_7340_Lab2/Frontend/app/views/q23.scala.html
                  HASH: e5bf06a964d16212afce05bc83c9fa66f705cc52
                  MATRIX: 946->1|1057->19|1626->562|1655->563|1700->580|2088->940|2117->941|2159->955|2194->962|2223->963|2252->964|2295->979|2324->980|2356->985|2720->1322|2748->1329|2789->1342|2863->1389|2878->1395|2927->1423|3385->1853|3414->1854|3463->1875|4926->3310|4955->3311|5001->3329|5039->3339|5068->3340|5117->3361|5347->3562|5377->3563|5424->3581|5568->3696|5598->3697|5628->3698|5658->3699|5688->3700|5718->3701|5748->3702|5778->3703|5808->3704|5838->3705|5868->3706|5898->3707|5960->3739|5991->3740|6041->3761|6288->3979|6318->3980
                  LINES: 28->1|33->2|46->15|46->15|47->16|57->26|57->26|59->28|59->28|59->28|59->28|59->28|59->28|60->29|75->44|75->44|76->45|80->49|80->49|80->49|91->60|91->60|92->61|124->93|124->93|126->95|126->95|126->95|127->96|131->100|131->100|133->102|135->104|135->104|135->104|135->104|135->104|135->104|135->104|135->104|135->104|135->104|135->104|135->104|135->104|135->104|136->105|137->106|137->106
                  -- GENERATED --
              */
          