
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
object flashmsg extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](_display_(Seq[Any](/*1.2*/if(flash.containsKey("error"))/*1.32*/ {_display_(Seq[Any](format.raw/*1.34*/("""

    <div class="alert alert-danger" role="alert">
        <strong>Oops!</strong> """),_display_(Seq[Any](/*4.33*/flash/*4.38*/.get("error"))),format.raw/*4.51*/("""
        <a class="close" data-dismiss="alert">x</a>
    </div>

""")))})),format.raw/*8.2*/("""

"""),_display_(Seq[Any](/*10.2*/if(flash.containsKey("success"))/*10.34*/ {_display_(Seq[Any](format.raw/*10.36*/("""

    <div class="alert alert-success" role="alert">
        """),_display_(Seq[Any](/*13.10*/flash/*13.15*/.get("success"))),format.raw/*13.30*/("""
        <a class="close" data-dismiss="alert">x</a>
    </div>

""")))})),format.raw/*17.2*/("""
"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Apr 07 14:52:40 PDT 2016
                    SOURCE: /home/dimitris/CMU/SA&D/Project/ApacheCMDA-Frontend/app/views/flashmsg.scala.html
                    HASH: 1e3abfe1f2ef816edd3a08e323195ab7f4472ca4
                    MATRIX: 867->1|905->31|944->33|1063->117|1076->122|1110->135|1206->201|1244->204|1285->236|1325->238|1423->300|1437->305|1474->320|1571->386
                    LINES: 29->1|29->1|29->1|32->4|32->4|32->4|36->8|38->10|38->10|38->10|41->13|41->13|41->13|45->17
                    -- GENERATED --
                */
            