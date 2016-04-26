
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
object mail_detail extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[PMessage,String,String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(mail: PMessage, username: String, userId: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.52*/("""

<html>
    <head>
        <link href='"""),_display_(Seq[Any](/*5.22*/routes/*5.28*/.Assets.at("css/bootstrap.min.css"))),format.raw/*5.63*/("""' rel="stylesheet"/>
        <link href='"""),_display_(Seq[Any](/*6.22*/routes/*6.28*/.Assets.at("css/header.css"))),format.raw/*6.56*/("""' rel="stylesheet"/>
        <script src='"""),_display_(Seq[Any](/*7.23*/routes/*7.29*/.Assets.at("js/jquery-1.1.js"))),format.raw/*7.59*/("""'></script>
    </head>
    <body>
        <div id="header">"""),_display_(Seq[Any](/*10.27*/fixed/*10.32*/.header(username, Long.parseLong(userId), Long.parseLong(userId)))),format.raw/*10.97*/("""</div>
        <div class="container">
            <h1>Mail Detail</h1>
            <p>From: """),_display_(Seq[Any](/*13.23*/mail/*13.27*/.getFromUserMail)),format.raw/*13.43*/("""</p>
            <p>To: """),_display_(Seq[Any](/*14.21*/mail/*14.25*/.getToUserMail)),format.raw/*14.39*/("""</p>
            <p>Title: """),_display_(Seq[Any](/*15.24*/mail/*15.28*/.getMailTitle)),format.raw/*15.41*/("""</p>
            <p>Content: """),_display_(Seq[Any](/*16.26*/mail/*16.30*/.getMailContent)),format.raw/*16.45*/("""</p>
            <p>Date: """),_display_(Seq[Any](/*17.23*/mail/*17.27*/.getMailDate)),format.raw/*17.39*/("""</p>

            <h2>Reply</h2>
            """),_display_(Seq[Any](/*20.14*/fixed/*20.19*/.write_message(mail.getFromUserMail))),format.raw/*20.55*/("""
        </div>
    </body>
</html>




"""))}
    }
    
    def render(mail:PMessage,username:String,userId:String): play.api.templates.HtmlFormat.Appendable = apply(mail,username,userId)
    
    def f:((PMessage,String,String) => play.api.templates.HtmlFormat.Appendable) = (mail,username,userId) => apply(mail,username,userId)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Apr 07 14:52:40 PDT 2016
                    SOURCE: /home/dimitris/CMU/SA&D/Project/ApacheCMDA-Frontend/app/views/mail_detail.scala.html
                    HASH: 7110c46759fc0d4b0c517b9f7790e0eec0228825
                    MATRIX: 796->1|940->51|1016->92|1030->98|1086->133|1163->175|1177->181|1226->209|1304->252|1318->258|1369->288|1466->349|1480->354|1567->419|1697->513|1710->517|1748->533|1809->558|1822->562|1858->576|1922->604|1935->608|1970->621|2036->651|2049->655|2086->670|2149->697|2162->701|2196->713|2278->759|2292->764|2350->800
                    LINES: 26->1|29->1|33->5|33->5|33->5|34->6|34->6|34->6|35->7|35->7|35->7|38->10|38->10|38->10|41->13|41->13|41->13|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|45->17|45->17|45->17|48->20|48->20|48->20
                    -- GENERATED --
                */
            