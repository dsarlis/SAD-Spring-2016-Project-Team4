
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
object join_group extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Long,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(userName: String, userId: Long):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.34*/("""

<html>
    <head>
        <link href='"""),_display_(Seq[Any](/*5.22*/routes/*5.28*/.Assets.at("css/bootstrap.min.css"))),format.raw/*5.63*/("""'
        rel="stylesheet"/>
        <link href='"""),_display_(Seq[Any](/*7.22*/routes/*7.28*/.Assets.at("css/header.css"))),format.raw/*7.56*/("""'
        rel="stylesheet"/>

        <script src='"""),_display_(Seq[Any](/*10.23*/routes/*10.29*/.Assets.at("js/jquery-1.1.js"))),format.raw/*10.59*/("""'></script>
    </head>
    <body>
        <div id="header">
        """),_display_(Seq[Any](/*14.10*/fixed/*14.15*/.header(userName, userId, userId))),format.raw/*14.48*/("""
        </div>
        <div class="container">
            <div class="alert-info" role="alert">
                """),_display_(Seq[Any](/*18.18*/if(flash.containsKey("success"))/*18.50*/ {_display_(Seq[Any](format.raw/*18.52*/("""
                    """),_display_(Seq[Any](/*19.22*/flash/*19.27*/.get("success"))),format.raw/*19.42*/("""
                """)))})),format.raw/*20.18*/("""
                """),_display_(Seq[Any](/*21.18*/if(flash.containsKey("failed"))/*21.49*/ {_display_(Seq[Any](format.raw/*21.51*/("""
                    """),_display_(Seq[Any](/*22.22*/flash/*22.27*/.get("failed"))),format.raw/*22.41*/("""
                """)))})),format.raw/*23.18*/("""
            </div>
            <div>
                <h3>Join group</h3>
                <form action=""""),_display_(Seq[Any](/*27.32*/routes/*27.38*/.GroupController.joinGroup())),format.raw/*27.66*/("""" method="POST">
                    <input type="hidden" name="userID" value=""""),_display_(Seq[Any](/*28.64*/userId)),format.raw/*28.70*/("""">
                    <input type="text" name="groupUrl" placeholder="pass code">
                    <button type="submit">Join</button>
                </form>
            </div>
        </div>
    </body>
</html>




"""))}
    }
    
    def render(userName:String,userId:Long): play.api.templates.HtmlFormat.Appendable = apply(userName,userId)
    
    def f:((String,Long) => play.api.templates.HtmlFormat.Appendable) = (userName,userId) => apply(userName,userId)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Apr 07 14:52:40 PDT 2016
                    SOURCE: /home/dimitris/CMU/SA&D/Project/ApacheCMDA-Frontend/app/views/join_group.scala.html
                    HASH: 2d7bad56449b5101ba7442539d0e919ada07f555
                    MATRIX: 784->1|910->33|986->74|1000->80|1056->115|1141->165|1155->171|1204->199|1292->251|1307->257|1359->287|1465->357|1479->362|1534->395|1685->510|1726->542|1766->544|1824->566|1838->571|1875->586|1925->604|1979->622|2019->653|2059->655|2117->677|2131->682|2167->696|2217->714|2358->819|2373->825|2423->853|2539->933|2567->939
                    LINES: 26->1|29->1|33->5|33->5|33->5|35->7|35->7|35->7|38->10|38->10|38->10|42->14|42->14|42->14|46->18|46->18|46->18|47->19|47->19|47->19|48->20|49->21|49->21|49->21|50->22|50->22|50->22|51->23|55->27|55->27|55->27|56->28|56->28
                    -- GENERATED --
                */
            