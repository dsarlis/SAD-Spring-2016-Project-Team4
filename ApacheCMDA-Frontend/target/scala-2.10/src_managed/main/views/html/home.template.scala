
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object home extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(username: String, userId: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.36*/("""
<!doctype html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Document</title>
        <link href='"""),_display_(Seq[Any](/*7.22*/routes/*7.28*/.Assets.at("css/bootstrap.min.css"))),format.raw/*7.63*/("""' rel="stylesheet"/>
        <link href='"""),_display_(Seq[Any](/*8.22*/routes/*8.28*/.Assets.at("css/header.css"))),format.raw/*8.56*/("""' rel="stylesheet"/>
        <link href='"""),_display_(Seq[Any](/*9.22*/routes/*9.28*/.Assets.at("css/home.css"))),format.raw/*9.54*/("""' rel="stylesheet"/>
        <script src='"""),_display_(Seq[Any](/*10.23*/routes/*10.29*/.Assets.at("js/jquery-1.1.js"))),format.raw/*10.59*/("""'></script>
        <script src='"""),_display_(Seq[Any](/*11.23*/routes/*11.29*/.Assets.at("js/home.js"))),format.raw/*11.53*/("""'></script>
    </head>
    <body>
        <div id="header">"""),_display_(Seq[Any](/*14.27*/fixed/*14.32*/.header(username, Long.parseLong(userId), Long.parseLong(userId)))),format.raw/*14.97*/("""</div>
        <section class="sec-2">
            <div class="banner">
                <div class="hello">
                    <p>Workflow</p>
                    <p>Centric Scientific Social Network</p>
                </div>
                <div class="entry">
                    """),_display_(Seq[Any](/*22.22*/if(userId != "-1")/*22.40*/{_display_(Seq[Any](format.raw/*22.41*/("""
                        <a href="/timeline/0">Explore Workflows ></a>
                    """)))}/*24.22*/else/*24.26*/{_display_(Seq[Any](format.raw/*24.27*/("""
                        <a href="/login">Explore Workflows ></a>
                    """)))})),format.raw/*26.22*/("""

                </div>
            </div>
        </section>
    </body>
</html>"""))}
    }
    
    def render(username:String,userId:String): play.api.templates.HtmlFormat.Appendable = apply(username,userId)
    
    def f:((String,String) => play.api.templates.HtmlFormat.Appendable) = (username,userId) => apply(username,userId)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Apr 07 14:52:40 PDT 2016
                    SOURCE: /home/dimitris/CMU/SA&D/Project/ApacheCMDA-Frontend/app/views/home.scala.html
                    HASH: f767fdaabb26ed41c4f65e084dd08dd6f34ab786
                    MATRIX: 780->1|908->35|1072->164|1086->170|1142->205|1219->247|1233->253|1282->281|1359->323|1373->329|1420->355|1499->398|1514->404|1566->434|1636->468|1651->474|1697->498|1794->559|1808->564|1895->629|2216->914|2243->932|2282->933|2393->1025|2406->1029|2445->1030|2564->1117
                    LINES: 26->1|29->1|35->7|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|42->14|42->14|42->14|50->22|50->22|50->22|52->24|52->24|52->24|54->26
                    -- GENERATED --
                */
            