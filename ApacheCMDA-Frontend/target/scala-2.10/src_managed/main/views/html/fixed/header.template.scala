
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
object header extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[String,Long,Long,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(username: String, userId: Long, sessionUser: Long):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.53*/("""

<script src='"""),_display_(Seq[Any](/*3.15*/routes/*3.21*/.Assets.at("js/bootstrap.min.js"))),format.raw/*3.54*/("""'></script>
<script src='"""),_display_(Seq[Any](/*4.15*/routes/*4.21*/.Assets.at("js/header.js"))),format.raw/*4.47*/("""'></script>

<nav class="navbar navbar-default header">
    <div class="container">
            <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse"
            data-target=".navbar-collapse">
                <span class="sr-only">Toggle navigation</span> <span
            class="icon-bar"></span> <span class="icon-bar"></span> <span
            class="icon-bar"></span>
            </button>
            <a class="navbar-brand" style="padding-bottom: 0 ;" href="/"><img src='"""),_display_(Seq[Any](/*16.85*/routes/*16.91*/.Assets.at("images/NASA_JPL_logo.png"))),format.raw/*16.129*/("""' style="height: 40px ; width: 220px ;"></a>
        </div>
            <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav">

            """),_display_(Seq[Any](/*22.14*/if(username != "undefined")/*22.41*/ {_display_(Seq[Any](format.raw/*22.43*/("""
                <li class="hide" id="userFlag">This is hidden</li>
                <li class="title_lable"><a href="/">Home <span class="sr-only">(current)</span></a></li>
                <li class="title_lable"><a href="/search">Search</a></li>
                <li class="title_lable"><a href="/workflow">Workflow</a></li>
                <li class="title_lable"><a href="/timeline/0">Timeline</a></li>
                <li class="title_lable">
                    <a href="/notifications">Notification</a>
                    <div class="reddot hide"></div>
                </li>
                <li><a href="/workflow/getPublicWorkflow">Forum</a></li>
            """)))})),format.raw/*33.14*/("""
            </ul>
            <ul class="nav navbar-nav navbar-right">
            """),_display_(Seq[Any](/*36.14*/if(username != "undefined")/*36.41*/ {_display_(Seq[Any](format.raw/*36.43*/("""
                <li class="dropdown">
                    <a href="#" id="currentuser" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">"""),_display_(Seq[Any](/*38.155*/username)),format.raw/*38.163*/(""" <span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="/group/create">Create Group</a ></li>
                        <li><a href="/group/join">Join Group</a ></li>
                        <li><a href="/profile/"""),_display_(Seq[Any](/*42.48*/sessionUser)),format.raw/*42.59*/("""">Profile</a></li>
                        <li><a href="/logout">Logout</a ></li>
                    </ul>
                </li>
            """)))})),format.raw/*46.14*/("""
            </ul>
        </div><!-- /.navbar-collapse -->
    </div><!-- /.container-fluid -->
</nav>
"""))}
    }
    
    def render(username:String,userId:Long,sessionUser:Long): play.api.templates.HtmlFormat.Appendable = apply(username,userId,sessionUser)
    
    def f:((String,Long,Long) => play.api.templates.HtmlFormat.Appendable) = (username,userId,sessionUser) => apply(username,userId,sessionUser)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Apr 07 14:52:42 PDT 2016
                    SOURCE: /home/dimitris/CMU/SA&D/Project/ApacheCMDA-Frontend/app/views/fixed/header.scala.html
                    HASH: 646bcf2ae11df35e89f46efed3098851507f388a
                    MATRIX: 791->1|936->52|987->68|1001->74|1055->107|1116->133|1130->139|1177->165|1818->770|1833->776|1894->814|2207->1091|2243->1118|2283->1120|2983->1788|3104->1873|3140->1900|3180->1902|3410->2095|3441->2103|3750->2376|3783->2387|3958->2530
                    LINES: 26->1|29->1|31->3|31->3|31->3|32->4|32->4|32->4|44->16|44->16|44->16|50->22|50->22|50->22|61->33|64->36|64->36|64->36|66->38|66->38|70->42|70->42|74->46
                    -- GENERATED --
                */
            