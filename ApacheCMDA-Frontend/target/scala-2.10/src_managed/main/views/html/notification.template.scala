
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
object notification extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template5[List[User],List[PMessage],List[PMessage],String,String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(req: List[User], inbox: List[PMessage], outbox: List[PMessage], username: String, userId: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.100*/("""
<!doctype html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Document</title>
        <link href='"""),_display_(Seq[Any](/*7.22*/routes/*7.28*/.Assets.at("css/bootstrap.min.css"))),format.raw/*7.63*/("""'
        rel="stylesheet"/>
        <link href='"""),_display_(Seq[Any](/*9.22*/routes/*9.28*/.Assets.at("css/header.css"))),format.raw/*9.56*/("""'
        rel="stylesheet"/>
        <style>
            .dark"""),format.raw/*12.18*/("""{"""),format.raw/*12.19*/("""
                background-color:#F3F3F3;
            """),format.raw/*14.13*/("""}"""),format.raw/*14.14*/("""
        </style>
        <script src='"""),_display_(Seq[Any](/*16.23*/routes/*16.29*/.Assets.at("js/jquery-1.1.js"))),format.raw/*16.59*/("""'></script>
    </head>
    <body>
        <div id="header">
        """),_display_(Seq[Any](/*20.10*/fixed/*20.15*/.header(username, Long.parseLong(userId), Long.parseLong(userId)))),format.raw/*20.80*/("""
        </div>

        <div class="container">
            """),_display_(Seq[Any](/*24.14*/flashmsg())),format.raw/*24.24*/("""
            <h1>Notification Center</h1>
            <hr>
            """),_display_(Seq[Any](/*27.14*/if(req.isEmpty & inbox.isEmpty & outbox.isEmpty)/*27.62*/ {_display_(Seq[Any](format.raw/*27.64*/("""
                <p>You don't have new messages.</p>
            """)))}/*29.15*/else/*29.20*/{_display_(Seq[Any](format.raw/*29.21*/("""
                """),_display_(Seq[Any](/*30.18*/if(!req.isEmpty)/*30.34*/ {_display_(Seq[Any](format.raw/*30.36*/("""
                    <h2>Friend Requests</h2>
                    <table class="table">
                        <tr><th>User</th><th>Email</th><th>Action</th></tr>
                        """),_display_(Seq[Any](/*34.26*/for( result <- req) yield /*34.45*/ {_display_(Seq[Any](format.raw/*34.47*/("""
                            <tr>
                                <td>"""),_display_(Seq[Any](/*36.38*/result/*36.44*/.getUserName)),format.raw/*36.56*/("""</td>
                                <td>"""),_display_(Seq[Any](/*37.38*/result/*37.44*/.getEmail)),format.raw/*37.53*/("""</td>
                                <td><a href="/friends/accept/"""),_display_(Seq[Any](/*38.63*/result/*38.69*/.getId)),format.raw/*38.75*/("""">Accept</a> <a href="/friends/reject/"""),_display_(Seq[Any](/*38.114*/result/*38.120*/.getId)),format.raw/*38.126*/("""">Reject</a></td>
                            </tr>
                        """)))})),format.raw/*40.26*/("""
                    </table>
                """)))})),format.raw/*42.18*/("""

                """),_display_(Seq[Any](/*44.18*/if(!inbox.isEmpty)/*44.36*/ {_display_(Seq[Any](format.raw/*44.38*/("""
                    <h2>Inbox</h2>
                    <table class="table">
                        <tr><th>From</th><th>Title</th><th>Date</th></tr>
                        """),_display_(Seq[Any](/*48.26*/for( result <- inbox) yield /*48.47*/ {_display_(Seq[Any](format.raw/*48.49*/("""
                            """),_display_(Seq[Any](/*49.30*/if(result.isReadstatus)/*49.53*/{_display_(Seq[Any](format.raw/*49.54*/("""
                                <tr class="dark">
                            """)))}/*51.30*/else/*51.34*/{_display_(Seq[Any](format.raw/*51.35*/("""
                                <tr>
                            """)))})),format.raw/*53.30*/("""
                                <td>"""),_display_(Seq[Any](/*54.38*/result/*54.44*/.getFromUserMail)),format.raw/*54.60*/("""</td>
                                <td><a href="/mail/detail/"""),_display_(Seq[Any](/*55.60*/result/*55.66*/.getId)),format.raw/*55.72*/("""">"""),_display_(Seq[Any](/*55.75*/result/*55.81*/.getMailTitle)),format.raw/*55.94*/("""</a></td>
                                <td>"""),_display_(Seq[Any](/*56.38*/result/*56.44*/.getMailDate)),format.raw/*56.56*/("""</td>
                            </tr>
                        """)))})),format.raw/*58.26*/("""
                    </table>
                """)))})),format.raw/*60.18*/("""

                """),_display_(Seq[Any](/*62.18*/if(!outbox.isEmpty)/*62.37*/ {_display_(Seq[Any](format.raw/*62.39*/("""
                    <h2>OutBox</h2>
                    <table class="table">
                        <tr><th>To</th><th>Title</th><th>Date</th><th>isRead</th></tr>
                        """),_display_(Seq[Any](/*66.26*/for( result <- outbox) yield /*66.48*/ {_display_(Seq[Any](format.raw/*66.50*/("""
                            <tr>
                                <td>"""),_display_(Seq[Any](/*68.38*/result/*68.44*/.getToUserMail)),format.raw/*68.58*/("""</td>
                                <td>"""),_display_(Seq[Any](/*69.38*/result/*69.44*/.getMailTitle)),format.raw/*69.57*/("""</td>
                                <td>"""),_display_(Seq[Any](/*70.38*/result/*70.44*/.getMailDate)),format.raw/*70.56*/("""</td>
                                <td>"""),_display_(Seq[Any](/*71.38*/result/*71.44*/.isReadstatus)),format.raw/*71.57*/("""</td>
                            </tr>
                        """)))})),format.raw/*73.26*/("""
                    </table>
                """)))})),format.raw/*75.18*/("""
            """)))})),format.raw/*76.14*/("""
        <hr>
            <h3>Private Mail</h3>
            """),_display_(Seq[Any](/*79.14*/fixed/*79.19*/.write_message(""))),format.raw/*79.37*/("""
        </div>
    </body>
</html>




"""))}
    }
    
    def render(req:List[User],inbox:List[PMessage],outbox:List[PMessage],username:String,userId:String): play.api.templates.HtmlFormat.Appendable = apply(req,inbox,outbox,username,userId)
    
    def f:((List[User],List[PMessage],List[PMessage],String,String) => play.api.templates.HtmlFormat.Appendable) = (req,inbox,outbox,username,userId) => apply(req,inbox,outbox,username,userId)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Apr 07 14:52:40 PDT 2016
                    SOURCE: /home/dimitris/CMU/SA&D/Project/ApacheCMDA-Frontend/app/views/notification.scala.html
                    HASH: 6f1c24559ef3c1267c40e1bf3e85cb6d3d39aa4a
                    MATRIX: 829->1|1022->99|1186->228|1200->234|1256->269|1341->319|1355->325|1404->353|1494->415|1523->416|1606->471|1635->472|1711->512|1726->518|1778->548|1884->618|1898->623|1985->688|2083->750|2115->760|2223->832|2280->880|2320->882|2405->949|2418->954|2457->955|2511->973|2536->989|2576->991|2801->1180|2836->1199|2876->1201|2983->1272|2998->1278|3032->1290|3111->1333|3126->1339|3157->1348|3261->1416|3276->1422|3304->1428|3380->1467|3396->1473|3425->1479|3534->1556|3613->1603|3668->1622|3695->1640|3735->1642|3948->1819|3985->1840|4025->1842|4091->1872|4123->1895|4162->1896|4261->1976|4274->1980|4313->1981|4412->2048|4486->2086|4501->2092|4539->2108|4640->2173|4655->2179|4683->2185|4722->2188|4737->2194|4772->2207|4855->2254|4870->2260|4904->2272|5001->2337|5080->2384|5135->2403|5163->2422|5203->2424|5430->2615|5468->2637|5508->2639|5615->2710|5630->2716|5666->2730|5745->2773|5760->2779|5795->2792|5874->2835|5889->2841|5923->2853|6002->2896|6017->2902|6052->2915|6149->2980|6228->3027|6274->3041|6371->3102|6385->3107|6425->3125
                    LINES: 26->1|29->1|35->7|35->7|35->7|37->9|37->9|37->9|40->12|40->12|42->14|42->14|44->16|44->16|44->16|48->20|48->20|48->20|52->24|52->24|55->27|55->27|55->27|57->29|57->29|57->29|58->30|58->30|58->30|62->34|62->34|62->34|64->36|64->36|64->36|65->37|65->37|65->37|66->38|66->38|66->38|66->38|66->38|66->38|68->40|70->42|72->44|72->44|72->44|76->48|76->48|76->48|77->49|77->49|77->49|79->51|79->51|79->51|81->53|82->54|82->54|82->54|83->55|83->55|83->55|83->55|83->55|83->55|84->56|84->56|84->56|86->58|88->60|90->62|90->62|90->62|94->66|94->66|94->66|96->68|96->68|96->68|97->69|97->69|97->69|98->70|98->70|98->70|99->71|99->71|99->71|101->73|103->75|104->76|107->79|107->79|107->79
                    -- GENERATED --
                */
            