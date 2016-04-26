
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
object timeline extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template4[String,Long,List[Workflow],Long,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(userName: String, userId: Long, allTimeline: List[Workflow], offset: Long):play.api.templates.HtmlFormat.Appendable = {
        _display_ {
def /*18.14*/plus/*18.18*/(input: Long) = {{
                input + 1
            }};def /*21.14*/minus/*21.19*/(input: Long) = {{
                input - 1
            }};
Seq[Any](format.raw/*1.77*/("""
<!doctype html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Document</title>
        <link href='"""),_display_(Seq[Any](/*7.22*/routes/*7.28*/.Assets.at("css/bootstrap.min.css"))),format.raw/*7.63*/("""' rel="stylesheet"/>
        <link href='"""),_display_(Seq[Any](/*8.22*/routes/*8.28*/.Assets.at("css/header.css"))),format.raw/*8.56*/("""' rel="stylesheet"/>
        <link rel="stylesheet" href='"""),_display_(Seq[Any](/*9.39*/routes/*9.45*/.Assets.at("css/workflow.css"))),format.raw/*9.75*/("""' rel="stylesheet">

        <script src='"""),_display_(Seq[Any](/*11.23*/routes/*11.29*/.Assets.at("js/jquery-1.1.js"))),format.raw/*11.59*/("""'></script>
    </head>
    <body>
        <div id="header">
        """),_display_(Seq[Any](/*15.10*/fixed/*15.15*/.header(userName, userId, userId))),format.raw/*15.48*/("""
        </div>
        <div class="container">
            """),format.raw/*20.14*/("""
            """),format.raw/*23.14*/("""

            """),_display_(Seq[Any](/*25.14*/if(allTimeline != null)/*25.37*/ {_display_(Seq[Any](format.raw/*25.39*/("""
                <h1>Workflows</h1>
                <hr>
                """),_display_(Seq[Any](/*28.18*/for( result <- allTimeline) yield /*28.45*/ {_display_(Seq[Any](format.raw/*28.47*/("""
                    """),_display_(Seq[Any](/*29.22*/if(result.getWfStatus == "norm")/*29.54*/ {_display_(Seq[Any](format.raw/*29.56*/("""
                        """),_display_(Seq[Any](/*30.26*/fixed/*30.31*/.workflowcard(result))),format.raw/*30.52*/("""
                    """)))})),format.raw/*31.22*/("""
                """)))})),format.raw/*32.18*/("""
                <form action="/timeline/"""),_display_(Seq[Any](/*33.42*/plus(offset))),format.raw/*33.54*/(""" ">
                    <button name="subject" type="submit" value="Next Page">Next Page</button>
                </form>
            """)))})),format.raw/*36.14*/("""

            """),_display_(Seq[Any](/*38.14*/if(offset > 0)/*38.28*/ {_display_(Seq[Any](format.raw/*38.30*/("""
                <form action="/timeline/"""),_display_(Seq[Any](/*39.42*/minus(offset))),format.raw/*39.55*/("""">
                    <button name="subject" type="submit" value="Back">Back</button>
                </form>
            """)))})),format.raw/*42.14*/("""
        </div>
    </body>
</html>"""))}
    }
    
    def render(userName:String,userId:Long,allTimeline:List[Workflow],offset:Long): play.api.templates.HtmlFormat.Appendable = apply(userName,userId,allTimeline,offset)
    
    def f:((String,Long,List[Workflow],Long) => play.api.templates.HtmlFormat.Appendable) = (userName,userId,allTimeline,offset) => apply(userName,userId,allTimeline,offset)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Apr 07 14:52:41 PDT 2016
                    SOURCE: /home/dimitris/CMU/SA&D/Project/ApacheCMDA-Frontend/app/views/timeline.scala.html
                    HASH: b2d42f1492f5d85a82343be9ad7ad44cda5f7744
                    MATRIX: 802->1|956->665|969->669|1042->741|1056->746|1144->76|1308->205|1322->211|1378->246|1455->288|1469->294|1518->322|1612->381|1626->387|1677->417|1756->460|1771->466|1823->496|1929->566|1943->571|1998->604|2086->727|2127->804|2178->819|2210->842|2250->844|2360->918|2403->945|2443->947|2501->969|2542->1001|2582->1003|2644->1029|2658->1034|2701->1055|2755->1077|2805->1095|2883->1137|2917->1149|3084->1284|3135->1299|3158->1313|3198->1315|3276->1357|3311->1370|3467->1494
                    LINES: 26->1|28->18|28->18|30->21|30->21|33->1|39->7|39->7|39->7|40->8|40->8|40->8|41->9|41->9|41->9|43->11|43->11|43->11|47->15|47->15|47->15|50->20|51->23|53->25|53->25|53->25|56->28|56->28|56->28|57->29|57->29|57->29|58->30|58->30|58->30|59->31|60->32|61->33|61->33|64->36|66->38|66->38|66->38|67->39|67->39|70->42
                    -- GENERATED --
                */
            