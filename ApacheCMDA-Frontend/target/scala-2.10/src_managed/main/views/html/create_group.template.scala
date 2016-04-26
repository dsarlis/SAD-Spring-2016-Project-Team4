
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
object create_group extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[String,Long,List[Group],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(userName: String, userId: Long, groups: List[Group]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.55*/("""

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
                """),_display_(Seq[Any](/*18.18*/if(flash.containsKey("linkstring"))/*18.53*/ {_display_(Seq[Any](format.raw/*18.55*/("""
                    Congratulations, the pass for the group is """),_display_(Seq[Any](/*19.65*/flash/*19.70*/.get("linkstring"))),format.raw/*19.88*/(""" !
                """)))})),format.raw/*20.18*/("""
                """),_display_(Seq[Any](/*21.18*/if(flash.containsKey("failed"))/*21.49*/ {_display_(Seq[Any](format.raw/*21.51*/("""
                    """),_display_(Seq[Any](/*22.22*/flash/*22.27*/.get("failed"))),format.raw/*22.41*/("""
                """)))})),format.raw/*23.18*/("""
            </div>
            <div>
                <h3>Create new group</h3>
                <form action=""""),_display_(Seq[Any](/*27.32*/routes/*27.38*/.GroupController.createGroup())),format.raw/*27.68*/("""" method="POST">
                    <input type="hidden" name="userID" value=""""),_display_(Seq[Any](/*28.64*/userId)),format.raw/*28.70*/("""">
                    <input type="text" name="groupName" placeholder="groupName">
                    <input type="text" name="groupDescription" placeholder="groupDescription">
                    <button type="submit">Create</button>
                </form>
            </div>

            <h1>Your Groups</h1>
            """),_display_(Seq[Any](/*36.14*/if(groups != null)/*36.32*/ {_display_(Seq[Any](format.raw/*36.34*/("""
                <table>
                    <tr><th>Group Name</th><th>Pass code</th></tr>
                    """),_display_(Seq[Any](/*39.22*/for( group <- groups) yield /*39.43*/ {_display_(Seq[Any](format.raw/*39.45*/("""
                        <tr>
                            <td>"""),_display_(Seq[Any](/*41.34*/group/*41.39*/.getGroupName)),format.raw/*41.52*/("""</td>
                            <td>"""),_display_(Seq[Any](/*42.34*/group/*42.39*/.getGroupUrl)),format.raw/*42.51*/("""</td>
                        </tr>
                    """)))})),format.raw/*44.22*/("""
                </table>
            """)))}/*46.15*/else/*46.20*/{_display_(Seq[Any](format.raw/*46.21*/("""
                <p>You are not the admin of any group!</p>
            """)))})),format.raw/*48.14*/("""
        </div>
    </body>
</html>





"""))}
    }
    
    def render(userName:String,userId:Long,groups:List[Group]): play.api.templates.HtmlFormat.Appendable = apply(userName,userId,groups)
    
    def f:((String,Long,List[Group]) => play.api.templates.HtmlFormat.Appendable) = (userName,userId,groups) => apply(userName,userId,groups)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Apr 07 14:52:40 PDT 2016
                    SOURCE: /home/dimitris/CMU/SA&D/Project/ApacheCMDA-Frontend/app/views/create_group.scala.html
                    HASH: 15e93dc2cae18ec893b8e9a10edca460b24c4329
                    MATRIX: 798->1|945->54|1021->95|1035->101|1091->136|1176->186|1190->192|1239->220|1327->272|1342->278|1394->308|1500->378|1514->383|1569->416|1720->531|1764->566|1804->568|1905->633|1919->638|1959->656|2011->676|2065->694|2105->725|2145->727|2203->749|2217->754|2253->768|2303->786|2450->897|2465->903|2517->933|2633->1013|2661->1019|3024->1346|3051->1364|3091->1366|3240->1479|3277->1500|3317->1502|3416->1565|3430->1570|3465->1583|3540->1622|3554->1627|3588->1639|3677->1696|3735->1736|3748->1741|3787->1742|3892->1815
                    LINES: 26->1|29->1|33->5|33->5|33->5|35->7|35->7|35->7|38->10|38->10|38->10|42->14|42->14|42->14|46->18|46->18|46->18|47->19|47->19|47->19|48->20|49->21|49->21|49->21|50->22|50->22|50->22|51->23|55->27|55->27|55->27|56->28|56->28|64->36|64->36|64->36|67->39|67->39|67->39|69->41|69->41|69->41|70->42|70->42|70->42|72->44|74->46|74->46|74->46|76->48
                    -- GENERATED --
                */
            