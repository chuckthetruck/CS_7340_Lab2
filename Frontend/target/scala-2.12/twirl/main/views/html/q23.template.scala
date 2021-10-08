
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

object q23 extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[String,Integer,Integer,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String, year1: Integer, year2: Integer, conf: String):play.twirl.api.HtmlFormat.Appendable = {
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
            <h4 class="focused" style="font-size: 22px;
                color: #57a957">
                Input ICWS or SCC for Conference
            </h4>
            <h4 class="focused" style="font-size: 22px;
                color: #57a957">
                Input Year Range Between 2003 - 2020
            </h4>

        </header>

        <div>
            <p class="focused" style="font-size: 20px;
                color: #3F51B5">
                """),_display_(/*52.18*/message),format.raw/*52.25*/("""
            """),format.raw/*53.13*/("""</p>

        </div>

        <form action = """"),_display_(/*57.26*/routes/*57.32*/.HomeController.q23Handler()),format.raw/*57.60*/("""" method="GET">
            <label>Conference</label>
            <input type = "text" maxlength="100" id="conference" name="conference">
            <label>Year1</label>
            <input type = "text" maxlength="100" id="year1" name="year1">
            <label>Year2</label>
            <input type = "text" maxlength="100" id="year2" name="year2">
            <button id="api-get-page"  class="button" type="submit">2.3 Map Search</button>
        </form>

        <div id="mapid"></div>
        <script>

                let icws = """),format.raw/*70.28*/("""{"""),format.raw/*70.29*/("""
                    """),format.raw/*71.21*/("""LVx: 36.1699,//vegas 2003
                    LVy: -115.1398,
                    SDx: 32.7157,//san diego 2004
                    SDy: -117.611,
                    OFx: 28.5384,//orlando florida 2005
                    OFy: -81.3789,
                    CIx: 41.8781,//chicago illinois 2006
                    CIy: -87.6298,
                    SLx: 40.7608,//salt lake city utah 2007
                    SLy: -111.8910,
                    BCx: 39.9042,//beijing china 2008
                    BCy: 116.4074,
                    LAx: 34.0522,//los angeles 2009
                    LAy: -118.2437,
                    MFx: 25.7617,//miami florida 2010
                    MFy: -80.1918,
                    DCx: 38.9072,//washington dc 2011
                    DCy: -77.0369,
                    HHx: 21.3069,//honolulu hawaii 2012
                    HHy: -157.8583,
                    SCx: 37.3541,//santa clara california 2013
                    SCy: -121.9552,
                    AAx: 61.2181,//anchorage alaska 2014
                    AAy: -149.9003,
                    NYx: 40.7128,//new york city 2015
                    NYy: -74.0060,
                    SFx: 37.7749,//san francisco 2016
                    SFy: -122.4194,
                    HH2x: 21.3069,//honolulu hawaii 2017 (duplicate)
                    HH2y: -157.8583,
                    SF2x: 37.7749,//san francisco 2018 (duplicate)
                    SF2y: -122.4194,
                    MIx: 45.4642,//milan italy 2019
                    MIy: 9.1900,
                    BC2x: 39.9042,//beijing china 2020 (duplicate)
                    BC2y: 116.4074,
                """),format.raw/*107.17*/("""}"""),format.raw/*107.18*/("""

                """),format.raw/*109.17*/("""let scc = """),format.raw/*109.27*/("""{"""),format.raw/*109.28*/("""
                    """),format.raw/*110.21*/("""LVx: 36.1699,//vegas 2003
                    LVy: -115.1398,
                    SDx: 32.7157,//san diego 2004
                    SDy: -117.611,
                    OFx: 28.5384,//orlando florida 2005
                    OFy: -81.3789,
                    CIx: 41.8781,//chicago illinois 2006
                    CIy: -87.6298,
                    SLx: 40.7608,//salt lake city utah 2007
                    SLy: -111.8910,
                    BCx: 39.9042,//beijing china 2008
                    BCy: 116.4074,
                    BIx: 12.9716,//bangalore india
                    BIy: 77.5946,
                    MFx: 25.7617,//miami florida 2010
                    MFy: -80.1918,
                    DCx: 38.9072,//washington dc 2011
                    DCy: -77.0369,
                    HHx: 21.3069,//honolulu hawaii 2012
                    HHy: -157.8583,
                    SCx: 37.3541,//santa clara california 2013
                    SCy: -121.9552,
                    AAx: 61.2181,//anchorage alaska 2014
                    AAy: -149.9003,
                    NYx: 40.7128,//new york city 2015
                    NYy: -74.0060,
                    SFx: 37.7749,//san francisco 2016
                    SFy: -122.4194,
                    HH2x: 21.3069,//honolulu hawaii 2017 (duplicate)
                    HH2y: -157.8583,
                    SF2x: 37.7749,//san francisco 2018 (duplicate)
                    SF2y: -122.4194,
                    MIx: 45.4642,//milan italy 2019
                    MIy: 9.1900,
                    BC2x: 39.9042,//beijing china 2020 (duplicate)
                    BC2y: 116.4074,
                    //bangalore is only unique value (2009) in scc
                    //the rest of the values appear in icws with the same year
                """),format.raw/*148.17*/("""}"""),format.raw/*148.18*/("""

                """),format.raw/*150.17*/("""var mymap = L.map('mapid').setView([0, 0], 2);

                L.tileLayer('https://api.maptiler.com/maps/streets/"""),format.raw/*152.68*/("""{"""),format.raw/*152.69*/("""z"""),format.raw/*152.70*/("""}"""),format.raw/*152.71*/("""/"""),format.raw/*152.72*/("""{"""),format.raw/*152.73*/("""x"""),format.raw/*152.74*/("""}"""),format.raw/*152.75*/("""/"""),format.raw/*152.76*/("""{"""),format.raw/*152.77*/("""y"""),format.raw/*152.78*/("""}"""),format.raw/*152.79*/(""".png?key=dcj0rBj8ACT4YDvql2hH', """),format.raw/*152.111*/("""{"""),format.raw/*152.112*/("""
                    """),format.raw/*153.21*/("""attribution: '<a href="https://www.maptiler.com/copyright/" target="_blank">&copy; MapTiler</a> <a href="https://www.openstreetmap.org/copyright" target="_blank">&copy; OpenStreetMap contributors</a>',
                """),format.raw/*154.17*/("""}"""),format.raw/*154.18*/(""").addTo(mymap);

                if ("""),_display_(/*156.22*/conf/*156.26*/.equals("ICWS")),format.raw/*156.41*/(""")
                """),format.raw/*157.17*/("""{"""),format.raw/*157.18*/("""
                    """),format.raw/*158.21*/("""if ("""),_display_(/*158.26*/year1),format.raw/*158.31*/(""" """),format.raw/*158.32*/("""!= 0)
                    """),format.raw/*159.21*/("""{"""),format.raw/*159.22*/("""
                        """),format.raw/*160.25*/("""for (let i = """),_display_(/*160.39*/year1),format.raw/*160.44*/("""; i <= """),_display_(/*160.52*/year2),format.raw/*160.57*/("""; i++)
                        """),format.raw/*161.25*/("""{"""),format.raw/*161.26*/("""
                            """),format.raw/*162.29*/("""if (i == 2003)
                                var LV = L.marker([icws["LVx"], icws["LVy"]]).addTo(mymap);
                            else if (i == 2004)
                                var SD = L.marker([icws["SDx"], icws["SDy"]]).addTo(mymap);
                            else if (i == 2005)
                                var OF = L.marker([icws["OFx"], icws["OFy"]]).addTo(mymap);
                            else if (i == 2006)
                                var CI = L.marker([icws["CIx"], icws["CIy"]]).addTo(mymap);
                            else if (i == 2007)
                                var SL = L.marker([icws["SLx"], icws["SLy"]]).addTo(mymap);
                            else if (i == 2008)
                                var BC = L.marker([icws["BCx"], icws["BCy"]]).addTo(mymap);
                            else if (i == 2009)
                                var LA = L.marker([icws["LAx"], icws["LAy"]]).addTo(mymap);
                            else if (i == 2010)
                                var MF = L.marker([icws["MFx"], icws["MFy"]]).addTo(mymap);
                            else if (i == 2011)
                                var DC = L.marker([icws["DCx"], icws["DCy"]]).addTo(mymap);
                            else if (i == 2012)
                                var HH = L.marker([icws["HHx"], icws["HHy"]]).addTo(mymap);
                            else if (i == 2013)
                                var SC = L.marker([icws["SCx"], icws["SCy"]]).addTo(mymap);
                            else if (i == 2014)
                                var AA = L.marker([icws["AAx"], icws["AAy"]]).addTo(mymap);
                            else if (i == 2015)
                                var NY = L.marker([icws["NYx"], icws["NYy"]]).addTo(mymap);
                            else if (i == 2016)
                                var SF = L.marker([icws["SFx"], icws["SFy"]]).addTo(mymap);
                            else if (i == 2017)
                                var HH = L.marker([icws["HHx"], icws["HHy"]]).addTo(mymap);
                            else if (i == 2018)
                                var SF = L.marker([icws["SFx"], icws["SFy"]]).addTo(mymap);
                            else if (i == 2019)
                                var MI = L.marker([icws["MIx"], icws["MIy"]]).addTo(mymap);
                            else if (i == 2020)
                                var BC = L.marker([icws["BCx"], icws["BCy"]]).addTo(mymap);
                        """),format.raw/*198.25*/("""}"""),format.raw/*198.26*/("""
                    """),format.raw/*199.21*/("""}"""),format.raw/*199.22*/("""
                """),format.raw/*200.17*/("""}"""),format.raw/*200.18*/("""
                """),format.raw/*201.17*/("""else if ("""),_display_(/*201.27*/conf/*201.31*/.equals("SCC")),format.raw/*201.45*/(""")
                """),format.raw/*202.17*/("""{"""),format.raw/*202.18*/("""
                    """),format.raw/*203.21*/("""if ("""),_display_(/*203.26*/year1),format.raw/*203.31*/(""" """),format.raw/*203.32*/("""!= 0)
                    """),format.raw/*204.21*/("""{"""),format.raw/*204.22*/("""
                        """),format.raw/*205.25*/("""for (let i = """),_display_(/*205.39*/year1),format.raw/*205.44*/("""; i <= """),_display_(/*205.52*/year2),format.raw/*205.57*/("""; i++)
                        """),format.raw/*206.25*/("""{"""),format.raw/*206.26*/("""
                            """),format.raw/*207.29*/("""if (i == 2003)
                                var LV = L.marker([icws["LVx"], icws["LVy"]]).addTo(mymap);
                            else if (i == 2004)
                                var SD = L.marker([icws["SDx"], icws["SDy"]]).addTo(mymap);
                            else if (i == 2005)
                                var OF = L.marker([icws["OFx"], icws["OFy"]]).addTo(mymap);
                            else if (i == 2006)
                                var CI = L.marker([icws["CIx"], icws["CIy"]]).addTo(mymap);
                            else if (i == 2007)
                                var SL = L.marker([icws["SLx"], icws["SLy"]]).addTo(mymap);
                            else if (i == 2008)
                                var BC = L.marker([icws["BCx"], icws["BCy"]]).addTo(mymap);
                            else if (i == 2009)
                                var BI = L.marker([scc["BIx"], scc["BIy"]]).addTo(mymap);
                            else if (i == 2010)
                                var MF = L.marker([icws["MFx"], icws["MFy"]]).addTo(mymap);
                            else if (i == 2011)
                                var DC = L.marker([icws["DCx"], icws["DCy"]]).addTo(mymap);
                            else if (i == 2012)
                                var HH = L.marker([icws["HHx"], icws["HHy"]]).addTo(mymap);
                            else if (i == 2013)
                                var SC = L.marker([icws["SCx"], icws["SCy"]]).addTo(mymap);
                            else if (i == 2014)
                                var AA = L.marker([icws["AAx"], icws["AAy"]]).addTo(mymap);
                            else if (i == 2015)
                                var NY = L.marker([icws["NYx"], icws["NYy"]]).addTo(mymap);
                            else if (i == 2016)
                                var SF = L.marker([icws["SFx"], icws["SFy"]]).addTo(mymap);
                            else if (i == 2017)
                                var HH = L.marker([icws["HHx"], icws["HHy"]]).addTo(mymap);
                            else if (i == 2018)
                                var SF = L.marker([icws["SFx"], icws["SFy"]]).addTo(mymap);
                            else if (i == 2019)
                                var MI = L.marker([icws["MIx"], icws["MIy"]]).addTo(mymap);
                            else if (i == 2020)
                                var BC = L.marker([icws["BCx"], icws["BCy"]]).addTo(mymap);
                        """),format.raw/*243.25*/("""}"""),format.raw/*243.26*/("""
                    """),format.raw/*244.21*/("""}"""),format.raw/*244.22*/("""
                """),format.raw/*245.17*/("""}"""),format.raw/*245.18*/("""

                """),format.raw/*247.17*/("""//var marker = L.marker([51.5, -.09]).addTo(mymap); //londok UK test marker
                // var LV = L.marker([icws["LVx"], icws["LVy"]]).addTo(mymap);
                // var SD = L.marker([icws["SDx"], icws["SDy"]]).addTo(mymap);
                // var OF = L.marker([icws["OFx"], icws["OFy"]]).addTo(mymap);
                // var BC = L.marker([icws["BCx"], icws["BCy"]]).addTo(mymap);
                // var HH = L.marker([icws["HHx"], icws["HHy"]]).addTo(mymap);
                // var SF = L.marker([icws["SFx"], icws["SFy"]]).addTo(mymap);
                // var SC = L.marker([icws["SCx"], icws["SCy"]]).addTo(mymap);
                // var MF = L.marker([icws["MFx"], icws["MFy"]]).addTo(mymap);
                // var DC = L.marker([icws["DCx"], icws["DCy"]]).addTo(mymap);
                // var MI = L.marker([icws["MIx"], icws["MIy"]]).addTo(mymap);
                // var LA = L.marker([icws["LAx"], icws["LAy"]]).addTo(mymap);
                // var AA = L.marker([icws["AAx"], icws["AAy"]]).addTo(mymap);
                // var SL = L.marker([icws["SLx"], icws["SLy"]]).addTo(mymap);
                // var CI = L.marker([icws["CIx"], icws["CIy"]]).addTo(mymap);
                // var NY = L.marker([icws["NYx"], icws["NYy"]]).addTo(mymap);
                //
                // var BI = L.marker([scc["BIx"], scc["BIy"]]).addTo(mymap);
        </script>

    </body>
</html>"""))
      }
    }
  }

  def render(message:String,year1:Integer,year2:Integer,conf:String): play.twirl.api.HtmlFormat.Appendable = apply(message,year1,year2,conf)

  def f:((String,Integer,Integer,String) => play.twirl.api.HtmlFormat.Appendable) = (message,year1,year2,conf) => apply(message,year1,year2,conf)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-10-08T13:16:59.385
                  SOURCE: /Users/andrewbrkich/Desktop/CS_7340_Lab2/Frontend/app/views/q23.scala.html
                  HASH: 506beecaca64780087dc3ea1766c025ae087a1ec
                  MATRIX: 969->1|1126->65|1695->608|1724->609|1769->626|2157->986|2186->987|2228->1001|2263->1008|2292->1009|2321->1010|2364->1025|2393->1026|2425->1031|3105->1684|3133->1691|3174->1704|3248->1751|3263->1757|3312->1785|3877->2322|3906->2323|3955->2344|5642->4002|5672->4003|5719->4021|5758->4031|5788->4032|5838->4053|7668->5854|7698->5855|7745->5873|7889->5988|7919->5989|7949->5990|7979->5991|8009->5992|8039->5993|8069->5994|8099->5995|8129->5996|8159->5997|8189->5998|8219->5999|8281->6031|8312->6032|8362->6053|8609->6271|8639->6272|8705->6310|8719->6314|8756->6329|8803->6347|8833->6348|8883->6369|8916->6374|8943->6379|8973->6380|9028->6406|9058->6407|9112->6432|9154->6446|9181->6451|9217->6459|9244->6464|9304->6495|9334->6496|9392->6525|11932->9036|11962->9037|12012->9058|12042->9059|12088->9076|12118->9077|12164->9094|12202->9104|12216->9108|12252->9122|12299->9140|12329->9141|12379->9162|12412->9167|12439->9172|12469->9173|12524->9199|12554->9200|12608->9225|12650->9239|12677->9244|12713->9252|12740->9257|12800->9288|12830->9289|12888->9318|15426->11827|15456->11828|15506->11849|15536->11850|15582->11867|15612->11868|15659->11886
                  LINES: 28->1|33->2|46->15|46->15|47->16|57->26|57->26|59->28|59->28|59->28|59->28|59->28|59->28|60->29|83->52|83->52|84->53|88->57|88->57|88->57|101->70|101->70|102->71|138->107|138->107|140->109|140->109|140->109|141->110|179->148|179->148|181->150|183->152|183->152|183->152|183->152|183->152|183->152|183->152|183->152|183->152|183->152|183->152|183->152|183->152|183->152|184->153|185->154|185->154|187->156|187->156|187->156|188->157|188->157|189->158|189->158|189->158|189->158|190->159|190->159|191->160|191->160|191->160|191->160|191->160|192->161|192->161|193->162|229->198|229->198|230->199|230->199|231->200|231->200|232->201|232->201|232->201|232->201|233->202|233->202|234->203|234->203|234->203|234->203|235->204|235->204|236->205|236->205|236->205|236->205|236->205|237->206|237->206|238->207|274->243|274->243|275->244|275->244|276->245|276->245|278->247
                  -- GENERATED --
              */
          