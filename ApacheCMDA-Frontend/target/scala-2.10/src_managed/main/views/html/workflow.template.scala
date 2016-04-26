
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
object workflow extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[String,Long,List[Group],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(userName: String, userId: Long, groups: List[Group]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.55*/("""
<!doctype html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Document</title>
        <link href='"""),_display_(Seq[Any](/*7.22*/routes/*7.28*/.Assets.at("css/bootstrap.min.css"))),format.raw/*7.63*/("""' rel="stylesheet"/>
        <link href='"""),_display_(Seq[Any](/*8.22*/routes/*8.28*/.Assets.at("css/header.css"))),format.raw/*8.56*/("""' rel="stylesheet"/>
        <script src='"""),_display_(Seq[Any](/*9.23*/routes/*9.29*/.Assets.at("js/jquery-1.1.js"))),format.raw/*9.59*/("""'></script>
    </head>
    <body>
        <div id="header">
        """),_display_(Seq[Any](/*13.10*/fixed/*13.15*/.header(userName, userId, userId))),format.raw/*13.48*/("""
        </div>
        <div class="container">
            """),_display_(Seq[Any](/*16.14*/flashmsg())),format.raw/*16.24*/("""
            <h3>Create new workflow</h3>
            <hr>
            <div class="row">
                <div class="col-md-8">
                    <form class="form-horizontal" action=""""),_display_(Seq[Any](/*21.60*/routes/*21.66*/.WorkflowController.createFlow())),format.raw/*21.98*/("""" enctype="multipart/form-data" method="POST">
                        <input type="hidden" name="userID" value=""""),_display_(Seq[Any](/*22.68*/userId)),format.raw/*22.74*/("""">
                        <div class="form-group">
                            <label for="in-Title" class="col-sm-2 control-label">Title</label>
                            <div class="col-sm-10">
                                <input type="text" name="wfTitle" class="form-control" id="in-Title" placeholder="Title">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="in-Category" class="col-sm-2 control-label">Category</label>
                            <div class="col-sm-10">
                                <input type="text" name="wfCategory" class="form-control" id="in-Category" placeholder="Category">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="in-Code" class="col-sm-2 control-label">Code</label>
                            <div class="col-sm-10">
                                <textarea type="text" name="wfCode" class="form-control" id="in-Code" placeholder="Code"></textarea>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="in-Desc" class="col-sm-2 control-label">Description</label>
                            <div class="col-sm-10">
                                <input type="text" name="wfDesc" class="form-control" id="in-Desc" placeholder="Description">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="in-Input" class="col-sm-2 control-label">Input</label>
                            <div class="col-sm-10">
                                <input type="text" name="wfInput" class="form-control" id="in-Input" placeholder="Input&#09;(Separated by '|')">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="in-Output" class="col-sm-2 control-label">Output</label>
                            <div class="col-sm-10">
                                <input type="text" name="wfOutput" class="form-control" id="in-Output" placeholder="Output&#09;(Separated by '|')">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="in-Tag" class="col-sm-2 control-label">Tags</label>
                            <div class="col-sm-10">
                                <input type="text" name="wfTag" class="form-control" id="in-Tag" placeholder="Tags   &#09;(Separated by ',')">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="in-File" class="col-sm-2 control-label">Image</label>
                            <div class="col-sm-10">
                                <input type="file" name="image" class="form-control" id="in-File">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="in-Select" class="col-sm-2 control-label">Group</label>
                            <div class="col-sm-10">
                                <select name="wfVisibility" id="in-Select" class="form-control">
                                    <option value="0">public</option>
                                    """),_display_(Seq[Any](/*76.38*/if(groups != null)/*76.56*/ {_display_(Seq[Any](format.raw/*76.58*/("""
                                        """),_display_(Seq[Any](/*77.42*/for( group <- groups) yield /*77.63*/ {_display_(Seq[Any](format.raw/*77.65*/("""
                                            <option value=""""),_display_(Seq[Any](/*78.61*/group/*78.66*/.getId)),format.raw/*78.72*/("""">"""),_display_(Seq[Any](/*78.75*/group/*78.80*/.getGroupName)),format.raw/*78.93*/("""</option>
                                        """)))})),format.raw/*79.42*/("""
                                    """)))})),format.raw/*80.38*/("""
                                </select>
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-sm-offset-2 col-sm-10">
                                <button type="submit" class="btn btn-default">Submit</button>
                            </div>
                        </div>
                    </form>
                    <h3>Import workflow from MyExperiment</h3>
                    <hr>
                    <form class="form-horizontal"  action="/workflow/import">
                        <div class="form-group">
                            <label for="in-Tag" class="col-sm-2 control-label">Workflow ID</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" name="wid"  placeholder="MyExperiment id">
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-sm-offset-2 col-sm-10">
                                <button type="submit" class="btn btn-default">Submit</button>
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
    
    def render(userName:String,userId:Long,groups:List[Group]): play.api.templates.HtmlFormat.Appendable = apply(userName,userId,groups)
    
    def f:((String,Long,List[Group]) => play.api.templates.HtmlFormat.Appendable) = (userName,userId,groups) => apply(userName,userId,groups)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Apr 07 14:52:40 PDT 2016
                    SOURCE: /home/dimitris/CMU/SA&D/Project/ApacheCMDA-Frontend/app/views/workflow.scala.html
                    HASH: 4afd149b048cb6c5d2e156e9f3d0006e86400e24
                    MATRIX: 794->1|941->54|1105->183|1119->189|1175->224|1252->266|1266->272|1315->300|1393->343|1407->349|1458->379|1564->449|1578->454|1633->487|1730->548|1762->558|1985->745|2000->751|2054->783|2204->897|2232->903|5822->4457|5849->4475|5889->4477|5967->4519|6004->4540|6044->4542|6141->4603|6155->4608|6183->4614|6222->4617|6236->4622|6271->4635|6354->4686|6424->4724
                    LINES: 26->1|29->1|35->7|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|41->13|41->13|41->13|44->16|44->16|49->21|49->21|49->21|50->22|50->22|104->76|104->76|104->76|105->77|105->77|105->77|106->78|106->78|106->78|106->78|106->78|106->78|107->79|108->80
                    -- GENERATED --
                */
            