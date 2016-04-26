
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
object signup extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html>
  <head>
    <title>Zentasks</title>
    <link href='"""),_display_(Seq[Any](/*5.18*/routes/*5.24*/.Assets.at("css/bootstrap.min.css"))),format.raw/*5.59*/("""'
    rel="stylesheet"/>
    <link href='"""),_display_(Seq[Any](/*7.18*/routes/*7.24*/.Assets.at("css/header.css"))),format.raw/*7.52*/("""'
    rel="stylesheet"/>
    <link href='"""),_display_(Seq[Any](/*9.18*/routes/*9.24*/.Assets.at("css/login.css"))),format.raw/*9.51*/("""'
    rel="stylesheet"/>

    <script src='"""),_display_(Seq[Any](/*12.19*/routes/*12.25*/.Assets.at("js/jquery-1.1.js"))),format.raw/*12.55*/("""'></script>
    <script src='"""),_display_(Seq[Any](/*13.19*/routes/*13.25*/.Assets.at("js/login.js"))),format.raw/*13.50*/("""'></script>
  </head>
  <body>
  <div id="header">
    """),_display_(Seq[Any](/*17.6*/fixed/*17.11*/.header("undefined",-1,-1))),format.raw/*17.37*/("""
  </div>
  <form class="form-horizontal" action=""""),_display_(Seq[Any](/*19.42*/routes/*19.48*/.SignupController.register())),format.raw/*19.76*/("""" enctype="multipart/form-data" method="post">
    """),_display_(Seq[Any](/*20.6*/flashmsg())),format.raw/*20.16*/("""
    <div class="container-fluid row">
      <div class="col-xs-10 col-xs-offset-1 col-md-6 col-md-offset-3 col-lg-4 col-lg-offset-4">
        <div class="login-box">
          <div class="form-title">
            <h1><a href='/login' class="title_lable ">Log in</a> / <a href='/signup' class="title_lable active">Sign
              up</a></h1>
          </div>
          """),_display_(Seq[Any](/*28.12*/flashmsg())),format.raw/*28.22*/("""
          <div class="form-group">
            <label for="inputUname" class="col-sm-2 control-label">Username</label>

            <div class="col-sm-10">
              <input type="text" class="form-control" name="username" id="inputUname" placeholder="User Name">
            </div>
          </div>

          <div class="form-group">
            <label for="inputEmail" class="col-sm-2 control-label">Email</label>

            <div class="col-sm-10">
              <input type="email" class="form-control" name="email" id="inputEmail" placeholder="Email">
            </div>
          </div>
          <div class="form-group">
            <label for="inputPassword" class="col-sm-2 control-label">Password</label>

            <div class="col-sm-10">
              <input type="password" class="form-control" id="inputPassword" name="password"
              placeholder="Password">
            </div>
          </div>
        </div>
        <div class="form-group">
          <label for="in-File" class="col-sm-2 control-label">Avatar</label>
          <div class="col-sm-10">
            <input type="file" name="avatar" class="form-control" id="in-File" onchange="loadFile(event)">
            <img width="150" id="output"/>
            <script>
                var loadFile = function(event) """),format.raw/*59.48*/("""{"""),format.raw/*59.49*/("""
                var output = document.getElementById('output');
                output.src = URL.createObjectURL(event.target.files[0]);
                """),format.raw/*62.17*/("""}"""),format.raw/*62.18*/(""";
            </script>
          </div>
        </div>
        <div class="form-group">
          <div class="col-sm-offset-2 col-sm-10">
            <button type="submit" class="btn btn-primary">Sign Up</button>
          </div>
        </div>
      </div>
    </div>
  </form>
</body>
</html>
"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Apr 07 14:52:40 PDT 2016
                    SOURCE: /home/dimitris/CMU/SA&D/Project/ApacheCMDA-Frontend/app/views/signup.scala.html
                    HASH: 3e76cade2922259c91b2d1cd0294ec38ed050f69
                    MATRIX: 856->0|968->77|982->83|1038->118|1115->160|1129->166|1178->194|1255->236|1269->242|1317->269|1397->313|1412->319|1464->349|1530->379|1545->385|1592->410|1683->466|1697->471|1745->497|1832->548|1847->554|1897->582|1984->634|2016->644|2425->1017|2457->1027|3787->2329|3816->2330|3998->2484|4027->2485
                    LINES: 29->1|33->5|33->5|33->5|35->7|35->7|35->7|37->9|37->9|37->9|40->12|40->12|40->12|41->13|41->13|41->13|45->17|45->17|45->17|47->19|47->19|47->19|48->20|48->20|56->28|56->28|87->59|87->59|90->62|90->62
                    -- GENERATED --
                */
            