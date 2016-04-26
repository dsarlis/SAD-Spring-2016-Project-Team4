
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
object search extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template5[String,String,String,List[User],List[Workflow],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(username: String, userId: String, category: String, results: List[User], resultswf: List[Workflow]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.102*/("""

<!doctype html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Document</title>
        <link href='"""),_display_(Seq[Any](/*8.22*/routes/*8.28*/.Assets.at("css/bootstrap.min.css"))),format.raw/*8.63*/("""'
        rel="stylesheet"/>
        <link href='"""),_display_(Seq[Any](/*10.22*/routes/*10.28*/.Assets.at("css/header.css"))),format.raw/*10.56*/("""'
        rel="stylesheet"/>

        <script src='"""),_display_(Seq[Any](/*13.23*/routes/*13.29*/.Assets.at("js/jquery-1.1.js"))),format.raw/*13.59*/("""'></script>
    </head>
    <body>
        <div id="header">
        """),_display_(Seq[Any](/*17.10*/fixed/*17.15*/.header(username, Long.parseLong(userId), Long.parseLong(userId)))),format.raw/*17.80*/("""
        </div>
        <div class="container row">
            <div class="col-md-8 col-md-offset-1">
                <form action="/searchResult">
                    <div class="input-group">
                        <div class="input-group-btn">
                            <button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"><span id="searchLabel">User</span> <span class="caret"></span></button>
                            <ul id="search-category" class="dropdown-menu">
                                <li><a href="javascript:void(0)" data-opt="user">User</a></li>
                                <li><a href="javascript:void(0)" data-opt="workflow">Workflow</a></li>
                                <li><a href="javascript:void(0)" data-opt="tag">Tag</a></li>
                            </ul>
                        </div> <!-- /btn-group -->
                        <input type="hidden" value="user" name="category" id="input-category">
                        <input type="text" class="form-control" placeholder="Search for..." name="keywd" aria-label="...">
                        <span class="input-group-btn">
                            <input class="btn btn-default" type="submit">Search</input>
                        </span>
                    </div> <!-- /input-group -->
                </form>
                """),_display_(Seq[Any](/*38.18*/if((results != null && results.size > 0) || (resultswf != null && resultswf.size > 0))/*38.104*/ {_display_(Seq[Any](format.raw/*38.106*/("""
                    <h3>Search result:</h3>
                    <table class="table">
                        """),_display_(Seq[Any](/*41.26*/if(category.equals("user"))/*41.53*/ {_display_(Seq[Any](format.raw/*41.55*/("""
                            <tr><th>User</th><th>Email</th><th>View</th></tr>
                            """),_display_(Seq[Any](/*43.30*/for( result <- results) yield /*43.53*/ {_display_(Seq[Any](format.raw/*43.55*/("""
                                <tr>
                                    <td>"""),_display_(Seq[Any](/*45.42*/result/*45.48*/.getUserName)),format.raw/*45.60*/("""</td>
                                    <td>"""),_display_(Seq[Any](/*46.42*/result/*46.48*/.getEmail)),format.raw/*46.57*/("""</td>
                                    <td><a href="/profile/"""),_display_(Seq[Any](/*47.60*/result/*47.66*/.getId)),format.raw/*47.72*/("""">More</a></td>
                                </tr>
                            """)))})),format.raw/*49.30*/("""
                        """)))})),format.raw/*50.26*/("""
                        """),_display_(Seq[Any](/*51.26*/if(category.equals("tag") || category.equals("workflow"))/*51.83*/ {_display_(Seq[Any](format.raw/*51.85*/("""
                            <tr><th>Title</th><th>Description</th></tr>
                            """),_display_(Seq[Any](/*53.30*/for( result <- resultswf) yield /*53.55*/ {_display_(Seq[Any](format.raw/*53.57*/("""
                                <tr>
                                    <td><a href="/workflow/get/"""),_display_(Seq[Any](/*55.65*/result/*55.71*/.getId)),format.raw/*55.77*/("""">"""),_display_(Seq[Any](/*55.80*/result/*55.86*/.getWfTitle)),format.raw/*55.97*/("""</a></td>
                                    <td>"""),_display_(Seq[Any](/*56.42*/result/*56.48*/.getWfDesc)),format.raw/*56.58*/("""</td>
                                </tr>
                            """)))})),format.raw/*58.30*/("""
                        """)))})),format.raw/*59.26*/("""
                    </table>

                """)))}/*62.19*/else/*62.24*/{_display_(Seq[Any](format.raw/*62.25*/("""
                    """),_display_(Seq[Any](/*63.22*/if(category != null)/*63.42*/ {_display_(Seq[Any](format.raw/*63.44*/("""
                        <h3>We haven't find any matches.</h3>
                    """)))})),format.raw/*65.22*/("""
                """)))})),format.raw/*66.18*/("""
            </div>
        </div>
        <script src='"""),_display_(Seq[Any](/*69.23*/routes/*69.29*/.Assets.at("/js/wf-search.js"))),format.raw/*69.59*/("""'></script>
    </body>
</html>







"""))}
    }
    
    def render(username:String,userId:String,category:String,results:List[User],resultswf:List[Workflow]): play.api.templates.HtmlFormat.Appendable = apply(username,userId,category,results,resultswf)
    
    def f:((String,String,String,List[User],List[Workflow]) => play.api.templates.HtmlFormat.Appendable) = (username,userId,category,results,resultswf) => apply(username,userId,category,results,resultswf)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Apr 07 14:52:40 PDT 2016
                    SOURCE: /home/dimitris/CMU/SA&D/Project/ApacheCMDA-Frontend/app/views/search.scala.html
                    HASH: a910341ccb4178811fe15302176d56be4da34d33
                    MATRIX: 815->1|1010->101|1175->231|1189->237|1245->272|1331->322|1346->328|1396->356|1484->408|1499->414|1551->444|1657->514|1671->519|1758->584|3206->1996|3302->2082|3343->2084|3491->2196|3527->2223|3567->2225|3711->2333|3750->2356|3790->2358|3905->2437|3920->2443|3954->2455|4037->2502|4052->2508|4083->2517|4184->2582|4199->2588|4227->2594|4342->2677|4400->2703|4462->2729|4528->2786|4568->2788|4706->2890|4747->2915|4787->2917|4925->3019|4940->3025|4968->3031|5007->3034|5022->3040|5055->3051|5142->3102|5157->3108|5189->3118|5294->3191|5352->3217|5419->3266|5432->3271|5471->3272|5529->3294|5558->3314|5598->3316|5714->3400|5764->3418|5857->3475|5872->3481|5924->3511
                    LINES: 26->1|29->1|36->8|36->8|36->8|38->10|38->10|38->10|41->13|41->13|41->13|45->17|45->17|45->17|66->38|66->38|66->38|69->41|69->41|69->41|71->43|71->43|71->43|73->45|73->45|73->45|74->46|74->46|74->46|75->47|75->47|75->47|77->49|78->50|79->51|79->51|79->51|81->53|81->53|81->53|83->55|83->55|83->55|83->55|83->55|83->55|84->56|84->56|84->56|86->58|87->59|90->62|90->62|90->62|91->63|91->63|91->63|93->65|94->66|97->69|97->69|97->69
                    -- GENERATED --
                */
            