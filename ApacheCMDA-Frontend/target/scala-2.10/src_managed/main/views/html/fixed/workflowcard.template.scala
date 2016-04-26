
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
object workflowcard extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Workflow,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(wf: Workflow):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.16*/("""

<div class="card well">
    <p class="right-top">"""),_display_(Seq[Any](/*4.27*/wf/*4.29*/.getWfCategory)),format.raw/*4.43*/("""</p>
    <h4 class="title"><a href="/workflow/get/"""),_display_(Seq[Any](/*5.47*/wf/*5.49*/.getId)),format.raw/*5.55*/("""">"""),_display_(Seq[Any](/*5.58*/wf/*5.60*/.getWfTitle)),format.raw/*5.71*/("""</a></h4>
    <div class="row">

        <div class="col-md-2 right-border">
            <img class="timeline-profile" src=""""),_display_(Seq[Any](/*9.49*/wf/*9.51*/.getAvatar)),format.raw/*9.61*/("""" alt="small-img">
            <p class="card-content"><a href="/profile/"""),_display_(Seq[Any](/*10.56*/wf/*10.58*/.getUserId)),format.raw/*10.68*/("""">"""),_display_(Seq[Any](/*10.71*/wf/*10.73*/.getUserName)),format.raw/*10.85*/("""</a></p>
        </div>
        <div class="col-md-10">
            <div class="description">
                <a href="/workflow/get/"""),_display_(Seq[Any](/*14.41*/wf/*14.43*/.getId)),format.raw/*14.49*/("""">
                    <img width="100" height="120" src=""""),_display_(Seq[Any](/*15.57*/wf/*15.59*/.getWfImg)),format.raw/*15.68*/("""" alt="small-img">
                </a>
                <p>"""),_display_(Seq[Any](/*17.21*/wf/*17.23*/.getWfDesc)),format.raw/*17.33*/("""</p>
                <div class="clear"></div>
            </div>
            <ul class="tags">
            """),_display_(Seq[Any](/*21.14*/for( tag <- wf.getTags) yield /*21.37*/ {_display_(Seq[Any](format.raw/*21.39*/("""
                <li>"""),_display_(Seq[Any](/*22.22*/tag)),format.raw/*22.25*/("""</li>
            """)))})),format.raw/*23.14*/("""
            </ul>
        </div>
    </div>
</div>"""))}
    }
    
    def render(wf:Workflow): play.api.templates.HtmlFormat.Appendable = apply(wf)
    
    def f:((Workflow) => play.api.templates.HtmlFormat.Appendable) = (wf) => apply(wf)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Apr 07 14:52:42 PDT 2016
                    SOURCE: /home/dimitris/CMU/SA&D/Project/ApacheCMDA-Frontend/app/views/fixed/workflowcard.scala.html
                    HASH: 73a341878eaf9701dddbe0f0d4cca2b059b63f62
                    MATRIX: 789->1|897->15|984->67|994->69|1029->83|1115->134|1125->136|1152->142|1190->145|1200->147|1232->158|1392->283|1402->285|1433->295|1543->369|1554->371|1586->381|1625->384|1636->386|1670->398|1840->532|1851->534|1879->540|1974->599|1985->601|2016->610|2112->670|2123->672|2155->682|2300->791|2339->814|2379->816|2437->838|2462->841|2513->860
                    LINES: 26->1|29->1|32->4|32->4|32->4|33->5|33->5|33->5|33->5|33->5|33->5|37->9|37->9|37->9|38->10|38->10|38->10|38->10|38->10|38->10|42->14|42->14|42->14|43->15|43->15|43->15|45->17|45->17|45->17|49->21|49->21|49->21|50->22|50->22|51->23
                    -- GENERATED --
                */
            