
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
object workflow_edit extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[Workflow,String,Long,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(wf: Workflow, userName: String, userId: Long):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.48*/("""

<!doctype html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Document</title>

        <link href='"""),_display_(Seq[Any](/*9.22*/routes/*9.28*/.Assets.at("css/bootstrap.min.css"))),format.raw/*9.63*/("""' rel="stylesheet"/>
        <link href='"""),_display_(Seq[Any](/*10.22*/routes/*10.28*/.Assets.at("css/header.css"))),format.raw/*10.56*/("""' rel="stylesheet"/>
        <link href='"""),_display_(Seq[Any](/*11.22*/routes/*11.28*/.Assets.at("css/editor.css"))),format.raw/*11.56*/("""' rel="stylesheet"/>
        <script src='"""),_display_(Seq[Any](/*12.23*/routes/*12.29*/.Assets.at("js/jquery-1.1.js"))),format.raw/*12.59*/("""'></script>
    </head>
    <body>
        <div id="header">
        """),_display_(Seq[Any](/*16.10*/fixed/*16.15*/.header(userName, userId, userId))),format.raw/*16.48*/("""
        </div>
        <div class="container">
            <h2>Update Workflow</h2>
            <hr>
            <div class="row">
                <div class="col-md-6">
                    <h4>Immutable</h4>
                    <table class="table">
                        <tr><td>Author</td><td>"""),_display_(Seq[Any](/*25.49*/wf/*25.51*/.getUserName)),format.raw/*25.63*/("""</td></tr>
                        <tr><td>Image</td><td><a href=""""),_display_(Seq[Any](/*26.57*/wf/*26.59*/.getWfImg)),format.raw/*26.68*/("""">Link</a></td></tr>
                    </table>
                </div>
                <div class="col-md-6">
                    <img width="100%" src=""""),_display_(Seq[Any](/*30.45*/wf/*30.47*/.getWfImg)),format.raw/*30.56*/("""">
                </div>
            </div>
            <hr>
            <div class="editor row">
                <div class="col-md-6">
                    <form class="form-horizontal" action=""""),_display_(Seq[Any](/*36.60*/routes/*36.66*/.WorkflowController.editFlow(wf.getId))),format.raw/*36.104*/("""" method="POST">
                        <input type="hidden" name="userID" value=""""),_display_(Seq[Any](/*37.68*/userId)),format.raw/*37.74*/("""">
                        <input type="hidden" name="wfID" value=""""),_display_(Seq[Any](/*38.66*/wf/*38.68*/.getId)),format.raw/*38.74*/("""">
                        <div class="form-group">
                            <label for="in-Title" class="col-sm-2 control-label">Title</label>
                            <div class="col-sm-10">
                                <input type="text" name="wfTitle" class="form-control" id="in-Title" placeholder="Title" value=""""),_display_(Seq[Any](/*42.130*/wf/*42.132*/.getWfTitle)),format.raw/*42.143*/("""">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="in-Category" class="col-sm-2 control-label">Category</label>
                            <div class="col-sm-10">
                                <input type="text" name="wfCategory" class="form-control" id="in-Category" placeholder="Category" value=""""),_display_(Seq[Any](/*48.139*/wf/*48.141*/.getWfCategory)),format.raw/*48.155*/("""">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="in-Code" class="col-sm-2 control-label">Code</label>
                            <div class="col-sm-10">
                                <textarea type="text" name="wfCode" class="form-control" id="in-Code" placeholder="Code">"""),_display_(Seq[Any](/*54.123*/wf/*54.125*/.getWfCode)),format.raw/*54.135*/("""</textarea>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="in-Desc" class="col-sm-2 control-label">Description</label>
                            <div class="col-sm-10">
                                <input type="text" name="wfDesc" class="form-control" id="in-Desc" placeholder="Description" value=""""),_display_(Seq[Any](/*60.134*/wf/*60.136*/.getWfDesc)),format.raw/*60.146*/("""">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="in-input" class="col-sm-2 control-label">Input</label>
                            <div class="col-sm-10">
                                <input type="text" name="wfInput" class="form-control" id="in-Input" placeholder="Input" value=""""),_display_(Seq[Any](/*66.130*/wf/*66.132*/.getInputString)),format.raw/*66.147*/("""">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="in-Output" class="col-sm-2 control-label">Output</label>
                            <div class="col-sm-10">
                                <input type="text" name="wfOutput" class="form-control" id="in-Output" placeholder="Output" value=""""),_display_(Seq[Any](/*72.133*/wf/*72.135*/.getOutputString)),format.raw/*72.151*/("""">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="in-Tag" class="col-sm-2 control-label">Tags</label>
                            <div class="col-sm-10">
                                <input type="text" name="wfTag" class="form-control" id="in-Tag" placeholder="Tags" value=""""),_display_(Seq[Any](/*78.125*/wf/*78.127*/.getTagsString)),format.raw/*78.141*/("""">
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-sm-offset-2 col-sm-10">
                                <button type="submit" class="btn btn-primary">Update</button>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>




"""))}
    }
    
    def render(wf:Workflow,userName:String,userId:Long): play.api.templates.HtmlFormat.Appendable = apply(wf,userName,userId)
    
    def f:((Workflow,String,Long) => play.api.templates.HtmlFormat.Appendable) = (wf,userName,userId) => apply(wf,userName,userId)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Apr 07 14:52:41 PDT 2016
                    SOURCE: /home/dimitris/CMU/SA&D/Project/ApacheCMDA-Frontend/app/views/workflow_edit.scala.html
                    HASH: 777e8eb2f3d18846e843f46890f36817bcba3ee0
                    MATRIX: 796->1|936->47|1102->178|1116->184|1172->219|1250->261|1265->267|1315->295|1393->337|1408->343|1458->371|1537->414|1552->420|1604->450|1710->520|1724->525|1779->558|2115->858|2126->860|2160->872|2263->939|2274->941|2305->950|2497->1106|2508->1108|2539->1117|2772->1314|2787->1320|2848->1358|2968->1442|2996->1448|3100->1516|3111->1518|3139->1524|3504->1852|3516->1854|3550->1865|3996->2274|4008->2276|4045->2290|4467->2675|4479->2677|4512->2687|4961->3099|4973->3101|5006->3111|5437->3505|5449->3507|5487->3522|5923->3921|5935->3923|5974->3939|6397->4325|6409->4327|6446->4341
                    LINES: 26->1|29->1|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|44->16|44->16|44->16|53->25|53->25|53->25|54->26|54->26|54->26|58->30|58->30|58->30|64->36|64->36|64->36|65->37|65->37|66->38|66->38|66->38|70->42|70->42|70->42|76->48|76->48|76->48|82->54|82->54|82->54|88->60|88->60|88->60|94->66|94->66|94->66|100->72|100->72|100->72|106->78|106->78|106->78
                    -- GENERATED --
                */
            