
package views.html.fixed

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
object write_message extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(toAddress: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.21*/("""

<form action=""""),_display_(Seq[Any](/*3.16*/routes/*3.22*/.NotificationController.sendMessage())),format.raw/*3.59*/("""" method="POST">
    <p>
        To: <input type="text" name="toUserMail" placeholder="toUserMail" value=""""),_display_(Seq[Any](/*5.83*/toAddress)),format.raw/*5.92*/("""">
        Title: <input type="text" name="mailTitle" placeholder="mailTitle">
    </p>
    <textarea type="text" name="mailContent" placeholder="mailContent" rows="5" cols="100"></textarea>
    <p><button type="submit">Send</button></p>
</form>"""))}
    }
    
    def render(toAddress:String): play.api.templates.HtmlFormat.Appendable = apply(toAddress)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (toAddress) => apply(toAddress)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Apr 07 14:52:42 PDT 2016
                    SOURCE: /home/dimitris/CMU/SA&D/Project/ApacheCMDA-Frontend/app/views/fixed/write_message.scala.html
                    HASH: a953237ae0e7e66bc9f4784e1fca525adc06227e
                    MATRIX: 788->1|901->20|953->37|967->43|1025->80|1167->187|1197->196
                    LINES: 26->1|29->1|31->3|31->3|31->3|33->5|33->5
                    -- GENERATED --
                */
            