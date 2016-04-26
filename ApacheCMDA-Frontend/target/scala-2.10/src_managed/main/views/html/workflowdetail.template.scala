
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
object workflowdetail extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template6[Workflow,List[Comment],List[List[Reply]],List[Suggestion],String,Long,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(wf: Workflow, comments: List[Comment], replyRes: List[List[Reply]], suggestions: List[Suggestion], userName: String, userId: Long):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.133*/("""
<html>
    <head>
        <link href='"""),_display_(Seq[Any](/*4.22*/routes/*4.28*/.Assets.at("css/bootstrap.min.css"))),format.raw/*4.63*/("""' rel="stylesheet"/>
        <link href='"""),_display_(Seq[Any](/*5.22*/routes/*5.28*/.Assets.at("css/header.css"))),format.raw/*5.56*/("""' rel="stylesheet"/>
        <link rel="stylesheet" href='"""),_display_(Seq[Any](/*6.39*/routes/*6.45*/.Assets.at("css/forum.css"))),format.raw/*6.72*/("""'>
        <link rel="stylesheet" href='"""),_display_(Seq[Any](/*7.39*/routes/*7.45*/.Assets.at("css/prism.css"))),format.raw/*7.72*/("""'>
        <link rel="stylesheet" href='"""),_display_(Seq[Any](/*8.39*/routes/*8.45*/.Assets.at("css/detail.css"))),format.raw/*8.73*/("""'>
        <script src='"""),_display_(Seq[Any](/*9.23*/routes/*9.29*/.Assets.at("js/jquery-1.1.js"))),format.raw/*9.59*/("""'></script>
        <script src='"""),_display_(Seq[Any](/*10.23*/routes/*10.29*/.Assets.at("js/forum.js"))),format.raw/*10.54*/("""'></script>
        <script src='"""),_display_(Seq[Any](/*11.23*/routes/*11.29*/.Assets.at("js/prism.js"))),format.raw/*11.54*/("""'></script>
    </head>
    <body>
        <div id="header">
        """),_display_(Seq[Any](/*15.10*/fixed/*15.15*/.header(userName, userId, userId))),format.raw/*15.48*/("""
        </div>
        <div class="container">
            <h1>"""),_display_(Seq[Any](/*18.18*/wf/*18.20*/.getWfTitle)),format.raw/*18.31*/("""</h1>
            <hr>
            <div class="row">
                <div class="col-md-6">
                    <h3>Workflow</h3>
                    <img src=""""),_display_(Seq[Any](/*23.32*/wf/*23.34*/.getWfImg)),format.raw/*23.43*/("""" class="img-thumbnail main-img">
                </div>
                <div class="col-md-6">
                    <h3>Description</h3>
                    <ul class="list-group workflow-list main-list">
                        <li class="list-group-item"><span class="badge">Name</span> """),_display_(Seq[Any](/*28.86*/wf/*28.88*/.getUserName)),format.raw/*28.100*/("""</li>
                        <li class="list-group-item"><span class="badge">Category</span> """),_display_(Seq[Any](/*29.90*/wf/*29.92*/.getWfCategory)),format.raw/*29.106*/("""</li>
                        <li class="list-group-item"><span class="badge">Detail</span> """),_display_(Seq[Any](/*30.88*/wf/*30.90*/.getWfDesc)),format.raw/*30.100*/("""</li>
                        <li class="list-group-item"><span class="badge">Input</span> """),_display_(Seq[Any](/*31.87*/wf/*31.89*/.getInputString)),format.raw/*31.104*/("""</li>
                        <li class="list-group-item"><span class="badge">Output</span> """),_display_(Seq[Any](/*32.88*/wf/*32.90*/.getOutputString)),format.raw/*32.106*/("""</li>
                        <li class="list-group-item"><span class="badge">
                            Code</span><br><pre><code class="language-css">"""),_display_(Seq[Any](/*34.77*/wf/*34.79*/.getWfCode)),format.raw/*34.89*/("""</code></pre></li>
                        <li class="list-group-item"><span class="badge">Tags</span>
                            <ul class="tags">
                            """),_display_(Seq[Any](/*37.30*/for( tag <- wf.getTags) yield /*37.53*/ {_display_(Seq[Any](format.raw/*37.55*/("""
                                <li class="detail_tag">"""),_display_(Seq[Any](/*38.57*/tag)),format.raw/*38.60*/("""</li>
                            """)))})),format.raw/*39.30*/("""
                            </ul>
                        </li>
                        """),_display_(Seq[Any](/*42.26*/if(wf.isWfEdit)/*42.41*/ {_display_(Seq[Any](format.raw/*42.43*/("""
                            <li class="list-group-item">
                                <span class="badge">Action</span>
                                <a class="btn-sm btn-primary" href="/workflow/update/"""),_display_(Seq[Any](/*45.87*/wf/*45.89*/.getId)),format.raw/*45.95*/("""">Edit</a>
                                <a class="btn-sm btn-danger" href="/workflow/delete/"""),_display_(Seq[Any](/*46.86*/wf/*46.88*/.getId)),format.raw/*46.94*/("""">Delete</a>
                            </li>
                        """)))})),format.raw/*48.26*/("""

                    </ul>
                </div>
            </div>

            <div class="row">
                <h3>Suggestions:</h3>
                <ul class="list-group list-view">
                """),_display_(Seq[Any](/*57.18*/for( i <- 0 until suggestions.size) yield /*57.53*/ {_display_(Seq[Any](format.raw/*57.55*/("""
                    <li class="list-group-item list-view outer-list">
                        <div class="row">
                            <div class="col-md-11">
                                <p>"""),_display_(Seq[Any](/*61.37*/suggestions(i)/*61.51*/.getsContent())),format.raw/*61.65*/("""</p>
                            </div>
                            <div class="col-md-1">
                                <p class="suggestion-like"><a href="javascript:void(0)" data-sugId=""""),_display_(Seq[Any](/*64.102*/suggestions(i)/*64.116*/.getId)),format.raw/*64.122*/("""" class="like"></a> <span>"""),_display_(Seq[Any](/*64.149*/suggestions(i)/*64.163*/.getsVote)),format.raw/*64.172*/("""</span></p>
                            </div>
                        </div>
                        """),_display_(Seq[Any](/*67.26*/if(suggestions(i).getsTag().length > 0)/*67.65*/{_display_(Seq[Any](format.raw/*67.66*/("""
                            <ul class="list-group list-view">
                                <li class="list-group-item list-view">
                                """),_display_(Seq[Any](/*70.34*/for( tag <- suggestions(i).getsTag()) yield /*70.71*/ {_display_(Seq[Any](format.raw/*70.73*/("""
                                    #"""),_display_(Seq[Any](/*71.39*/tag)),format.raw/*71.42*/("""
                                """)))})),format.raw/*72.34*/("""
                                </li>
                            </ul>
                        """)))})),format.raw/*75.26*/("""
                        <form class="form" action=""""),_display_(Seq[Any](/*76.53*/routes/*76.59*/.WorkflowController.addSuggestionTag(suggestions(i).getId))),format.raw/*76.117*/("""" enctype="multipart/form-data" method="POST">
                            <a href="javascript:void(0)" class="toggle">addTag</a>
                            <div class="ninja hide-hood">
                                <input class="form-control input-sm" type="text" name="sTag">
                                <button class="btn-xs btn-primary mt-btn" type="submit">Submit</button>
                            </div>
                        </form>

                    </li>
                """)))})),format.raw/*85.18*/("""
                </ul>
            </div>
            <div class="row">
                <form class="form" role="form" action=""""),_display_(Seq[Any](/*89.57*/routes/*89.63*/.WorkflowController.addSuggestion(wf.getId))),format.raw/*89.106*/(""""
                enctype="multipart/form-data" method="POST">
                    <div class="form-group">
                        <textarea class="form-control" rows="5" name="sContent"></textarea>
                        <button type="submit" class="btn btn-primary mt-btn" >Suggest</button>
                    </div>
                </form>
            </div>

            <div class="row">
                <h3>Comments:</h3>
                <ul class="list-group list-view">
                """),_display_(Seq[Any](/*101.18*/for( i <- 0 until comments.size) yield /*101.50*/ {_display_(Seq[Any](format.raw/*101.52*/("""
                    <li class="list-group-item list-view outer-list">
                        <h4><span class="red">&#35; """),_display_(Seq[Any](/*103.54*/(i + 1))),format.raw/*103.61*/("""</span> &#64; """),_display_(Seq[Any](/*103.76*/(comments(i).getUserName))),format.raw/*103.101*/(""" <small class="right">"""),_display_(Seq[Any](/*103.124*/(new Date(comments(i).getTimestamp).toString))),format.raw/*103.169*/("""</small></h4>
                        <div class="row">
                            <div class="col-md-10">
                                <p>"""),_display_(Seq[Any](/*106.37*/comments(i)/*106.48*/.getContent)),format.raw/*106.59*/("""</p>
                            </div>
                            <div class="col-md-2">
                                <div class="comment-vote">
                                    <a href="javascript:void(0)" data-act="voteup" data-commentId=""""),_display_(Seq[Any](/*110.101*/comments(i)/*110.112*/.getId)),format.raw/*110.118*/("""" data-wfid=""""),_display_(Seq[Any](/*110.132*/wf/*110.134*/.getId)),format.raw/*110.140*/("""" class="vote-thumb vote-up"></a>
                                    <p class="vote-num">"""),_display_(Seq[Any](/*111.58*/comments(i)/*111.69*/.getThumb)),format.raw/*111.78*/("""</p>
                                    <a href="javascript:void(0)" data-act="votedown" data-commentId=""""),_display_(Seq[Any](/*112.103*/comments(i)/*112.114*/.getId)),format.raw/*112.120*/("""" data-wfid=""""),_display_(Seq[Any](/*112.134*/wf/*112.136*/.getId)),format.raw/*112.142*/("""" class="vote-thumb vote-down"></a>
                                </div>
                            </div>
                        </div>
                        <form class="form" action=""""),_display_(Seq[Any](/*116.53*/routes/*116.59*/.WorkflowController.addReply(comments(i).getUser, comments(i).getId, wf.getId))),format.raw/*116.137*/("""" enctype="multipart/form-data" method="POST">
                            <a href="javascript:void(0)" class="toggle">Reply</a>
                            <div class="ninja hide-hood">
                                <input class="form-control input-sm" type="text" name="content">
                                <button class="btn-xs btn-primary mt-btn" type="submit">Submit</button>
                            </div>
                        </form>
                        <ul class="list-group list-view">
                        """),_display_(Seq[Any](/*124.26*/for( j <- 0 until replyRes.get(i).size) yield /*124.65*/ {_display_(Seq[Any](format.raw/*124.67*/("""
                            <li class="list-group-item list-view">
                                <h5>"""),_display_(Seq[Any](/*126.38*/(replyRes.get(i).get(j).getFromUserName))),format.raw/*126.78*/(""" <span class="shy"> &rarr; """),_display_(Seq[Any](/*126.106*/(replyRes.get(i).get(j).getToUserName))),format.raw/*126.144*/("""</span>
                                <small class="right">"""),_display_(Seq[Any](/*127.55*/(new Date(replyRes.get(i).get(j).getTimestamp).toString))),format.raw/*127.111*/("""</small>
                                </h5>
                                <p>"""),_display_(Seq[Any](/*129.37*/("\t" + replyRes.get(i).get(j).getContent))),format.raw/*129.79*/("""</p>

                                <form class="form" action=""""),_display_(Seq[Any](/*131.61*/routes/*131.67*/.WorkflowController.addReply(replyRes.get(i).get(j).getFromUserId, comments(i).getId, wf.getId))),format.raw/*131.162*/("""" enctype="multipart/form-data" method="POST">
                                    <a href="javascript:void(0)" class="toggle">Reply</a>
                                    <div class="ninja hide-hood">
                                        <input class="form-control input-sm" type="text" name="content">
                                        <button class="btn-xs btn-primary mt-btn" type="submit">Submit</button>
                                    </div>

                                </form>
                            </li>
                        """)))})),format.raw/*140.26*/("""
                        </ul>
                    </li>
                """)))})),format.raw/*143.18*/("""
                </ul>
            </div>


            <div class="row">
                <form class="form" role="form" action=""""),_display_(Seq[Any](/*149.57*/routes/*149.63*/.WorkflowController.addComment(wf.getId))),format.raw/*149.103*/(""""
                enctype="multipart/form-data" method="POST">
                    <div class="form-group">
                        <textarea class="form-control" rows="5" name="content"></textarea>
                        <button type="submit" class="btn btn-primary mt-btn" >Comment</button>
                    </div>
                </form>
            </div>
        </div>
    </body>
</html>"""))}
    }
    
    def render(wf:Workflow,comments:List[Comment],replyRes:List[List[Reply]],suggestions:List[Suggestion],userName:String,userId:Long): play.api.templates.HtmlFormat.Appendable = apply(wf,comments,replyRes,suggestions,userName,userId)
    
    def f:((Workflow,List[Comment],List[List[Reply]],List[Suggestion],String,Long) => play.api.templates.HtmlFormat.Appendable) = (wf,comments,replyRes,suggestions,userName,userId) => apply(wf,comments,replyRes,suggestions,userName,userId)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Apr 07 14:52:41 PDT 2016
                    SOURCE: /home/dimitris/CMU/SA&D/Project/ApacheCMDA-Frontend/app/views/workflowdetail.scala.html
                    HASH: b4aa5f51f1926083adb2713c5d2c06425324497d
                    MATRIX: 846->1|1072->132|1147->172|1161->178|1217->213|1294->255|1308->261|1357->289|1451->348|1465->354|1513->381|1589->422|1603->428|1651->455|1727->496|1741->502|1790->530|1850->555|1864->561|1915->591|1985->625|2000->631|2047->656|2117->690|2132->696|2179->721|2285->791|2299->796|2354->829|2455->894|2466->896|2499->907|2696->1068|2707->1070|2738->1079|3064->1369|3075->1371|3110->1383|3241->1478|3252->1480|3289->1494|3418->1587|3429->1589|3462->1599|3590->1691|3601->1693|3639->1708|3768->1801|3779->1803|3818->1819|4009->1974|4020->1976|4052->1986|4266->2164|4305->2187|4345->2189|4438->2246|4463->2249|4530->2284|4656->2374|4680->2389|4720->2391|4966->2601|4977->2603|5005->2609|5137->2705|5148->2707|5176->2713|5280->2785|5522->2991|5573->3026|5613->3028|5850->3229|5873->3243|5909->3257|6138->3449|6162->3463|6191->3469|6255->3496|6279->3510|6311->3519|6450->3622|6498->3661|6537->3662|6740->3829|6793->3866|6833->3868|6908->3907|6933->3910|6999->3944|7129->4042|7218->4095|7233->4101|7314->4159|7843->4656|8007->4784|8022->4790|8088->4833|8623->5331|8672->5363|8713->5365|8874->5489|8904->5496|8956->5511|9005->5536|9066->5559|9135->5604|9316->5748|9337->5759|9371->5770|9659->6020|9681->6031|9711->6037|9763->6051|9776->6053|9806->6059|9934->6150|9955->6161|9987->6170|10132->6277|10154->6288|10184->6294|10236->6308|10249->6310|10279->6316|10509->6509|10525->6515|10627->6593|11202->7131|11258->7170|11299->7172|11441->7277|11504->7317|11570->7345|11632->7383|11731->7445|11811->7501|11931->7584|11996->7626|12099->7692|12115->7698|12234->7793|12830->8356|12937->8430|13104->8560|13120->8566|13184->8606
                    LINES: 26->1|29->1|32->4|32->4|32->4|33->5|33->5|33->5|34->6|34->6|34->6|35->7|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|43->15|43->15|43->15|46->18|46->18|46->18|51->23|51->23|51->23|56->28|56->28|56->28|57->29|57->29|57->29|58->30|58->30|58->30|59->31|59->31|59->31|60->32|60->32|60->32|62->34|62->34|62->34|65->37|65->37|65->37|66->38|66->38|67->39|70->42|70->42|70->42|73->45|73->45|73->45|74->46|74->46|74->46|76->48|85->57|85->57|85->57|89->61|89->61|89->61|92->64|92->64|92->64|92->64|92->64|92->64|95->67|95->67|95->67|98->70|98->70|98->70|99->71|99->71|100->72|103->75|104->76|104->76|104->76|113->85|117->89|117->89|117->89|129->101|129->101|129->101|131->103|131->103|131->103|131->103|131->103|131->103|134->106|134->106|134->106|138->110|138->110|138->110|138->110|138->110|138->110|139->111|139->111|139->111|140->112|140->112|140->112|140->112|140->112|140->112|144->116|144->116|144->116|152->124|152->124|152->124|154->126|154->126|154->126|154->126|155->127|155->127|157->129|157->129|159->131|159->131|159->131|168->140|171->143|177->149|177->149|177->149
                    -- GENERATED --
                */
            