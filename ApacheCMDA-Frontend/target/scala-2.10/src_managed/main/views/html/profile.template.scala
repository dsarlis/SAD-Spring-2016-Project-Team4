
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
object profile extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template9[User,List[User],List[User],List[User],String,String,Boolean,Boolean,Boolean,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(user: User, follows: List[User], followees: List[User], myFriends: List[User], self_name: String, self_id: String, isFollower: Boolean, isFollowee: Boolean, isFriend: Boolean):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.178*/("""

<html>
    <head>
        <link href='"""),_display_(Seq[Any](/*5.22*/routes/*5.28*/.Assets.at("css/bootstrap.min.css"))),format.raw/*5.63*/("""' rel="stylesheet"/>
        <link href='"""),_display_(Seq[Any](/*6.22*/routes/*6.28*/.Assets.at("css/header.css"))),format.raw/*6.56*/("""' rel="stylesheet"/>
        <link href='"""),_display_(Seq[Any](/*7.22*/routes/*7.28*/.Assets.at("css/profile.css"))),format.raw/*7.57*/("""' rel="stylesheet"/>
        <script src='"""),_display_(Seq[Any](/*8.23*/routes/*8.29*/.Assets.at("js/jquery-1.1.js"))),format.raw/*8.59*/("""'></script>
        <title>Profile</title>
    </head>
    <body>
        <div id="header">
        """),_display_(Seq[Any](/*13.10*/fixed/*13.15*/.header(self_name, user.getId, Long.parseLong(self_id)))),format.raw/*13.70*/("""
        </div>

        <div class="container">
            """),_display_(Seq[Any](/*17.14*/flashmsg())),format.raw/*17.24*/("""
            <div class="row profile-header">
                <div class="col-md-6">
                    <img src=""""),_display_(Seq[Any](/*20.32*/user/*20.36*/.getAvatar)),format.raw/*20.46*/("""" class="align-right avatar">
                </div>
                <div class="col-md-6">
                    <h1>"""),_display_(Seq[Any](/*23.26*/user/*23.30*/.getUserName())),format.raw/*23.44*/("""</h1>
                    <p>"""),_display_(Seq[Any](/*24.25*/user/*24.29*/.getEmail())),format.raw/*24.40*/("""</p>
                </div>
            </div>
            """),_display_(Seq[Any](/*27.14*/if(self_name != user.getUserName)/*27.47*/ {_display_(Seq[Any](format.raw/*27.49*/("""
                """),_display_(Seq[Any](/*28.18*/if(!isFollower)/*28.33*/ {_display_(Seq[Any](format.raw/*28.35*/("""
                    <p><a href="/follow/"""),_display_(Seq[Any](/*29.42*/user/*29.46*/.getId)),format.raw/*29.52*/("""">Follow</a></p>
                """)))})),format.raw/*30.18*/("""
                """),_display_(Seq[Any](/*31.18*/if(isFollower)/*31.32*/ {_display_(Seq[Any](format.raw/*31.34*/("""
                    <p><a href="/unfollow/"""),_display_(Seq[Any](/*32.44*/user/*32.48*/.getId)),format.raw/*32.54*/("""">Unfollow</a></p>
                """)))})),format.raw/*33.18*/("""
                """),_display_(Seq[Any](/*34.18*/if(!isFriend)/*34.31*/ {_display_(Seq[Any](format.raw/*34.33*/("""
                    <p><a href="/befriend/"""),_display_(Seq[Any](/*35.44*/user/*35.48*/.getId)),format.raw/*35.54*/("""">Send Friend Request</a></p>
                """)))}/*36.19*/else/*36.24*/{_display_(Seq[Any](format.raw/*36.25*/("""
                    <p>We are friends.</p>
                    <p><a href="/deletefriend/"""),_display_(Seq[Any](/*38.48*/user/*38.52*/.getId)),format.raw/*38.58*/("""">Delete Friend</a></p>
                """)))})),format.raw/*39.18*/("""
                <p><a href="/">BackHome</a></p>
            """)))})),format.raw/*41.14*/("""
            <div class="row">
                <div class="col-md-4">
                    <div class="well">
                        <h3>Followers</h3>
                        <table class="table">
                        """),_display_(Seq[Any](/*47.26*/for( follower <- follows) yield /*47.51*/ {_display_(Seq[Any](format.raw/*47.53*/("""
                            <tr><td><a href="/profile/"""),_display_(Seq[Any](/*48.56*/follower/*48.64*/.getId)),format.raw/*48.70*/("""">"""),_display_(Seq[Any](/*48.73*/follower/*48.81*/.getUserName)),format.raw/*48.93*/("""</a></td><td>"""),_display_(Seq[Any](/*48.107*/follower/*48.115*/.getEmail)),format.raw/*48.124*/("""</td></tr>
                        """)))})),format.raw/*49.26*/("""
                        </table>
                    </div>
                </div>
                <div class="col-md-4">
                    <div class="well">
                        <h3>Followees</h3>
                        <table class="table">
                        """),_display_(Seq[Any](/*57.26*/for( followee <- followees) yield /*57.53*/ {_display_(Seq[Any](format.raw/*57.55*/("""
                            <tr><td><a href="/profile/"""),_display_(Seq[Any](/*58.56*/followee/*58.64*/.getId)),format.raw/*58.70*/("""">"""),_display_(Seq[Any](/*58.73*/followee/*58.81*/.getUserName)),format.raw/*58.93*/("""</a></td><td>"""),_display_(Seq[Any](/*58.107*/followee/*58.115*/.getEmail)),format.raw/*58.124*/("""</td></tr>
                        """)))})),format.raw/*59.26*/("""
                        </table>
                    </div>
                </div>
                """),_display_(Seq[Any](/*63.18*/if(self_name == user.getUserName)/*63.51*/ {_display_(Seq[Any](format.raw/*63.53*/("""
                    <div class="col-md-4">
                        <div class="well">
                            <h3>Friends</h3>
                            <table class="table">
                            """),_display_(Seq[Any](/*68.30*/for( friend <- myFriends) yield /*68.55*/ {_display_(Seq[Any](format.raw/*68.57*/("""
                                <tr><td><a href="/profile/"""),_display_(Seq[Any](/*69.60*/friend/*69.66*/.getId)),format.raw/*69.72*/("""">"""),_display_(Seq[Any](/*69.75*/friend/*69.81*/.getUserName)),format.raw/*69.93*/("""</a></td> <td>"""),_display_(Seq[Any](/*69.108*/friend/*69.114*/.getEmail)),format.raw/*69.123*/("""</td></tr>
                            """)))})),format.raw/*70.30*/("""
                            </table>
                        </div>
                    </div>
                """)))})),format.raw/*74.18*/("""
            </div>
        </div>
    </body>
</html>





"""))}
    }
    
    def render(user:User,follows:List[User],followees:List[User],myFriends:List[User],self_name:String,self_id:String,isFollower:Boolean,isFollowee:Boolean,isFriend:Boolean): play.api.templates.HtmlFormat.Appendable = apply(user,follows,followees,myFriends,self_name,self_id,isFollower,isFollowee,isFriend)
    
    def f:((User,List[User],List[User],List[User],String,String,Boolean,Boolean,Boolean) => play.api.templates.HtmlFormat.Appendable) = (user,follows,followees,myFriends,self_name,self_id,isFollower,isFollowee,isFriend) => apply(user,follows,followees,myFriends,self_name,self_id,isFollower,isFollowee,isFriend)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Apr 07 14:52:41 PDT 2016
                    SOURCE: /home/dimitris/CMU/SA&D/Project/ApacheCMDA-Frontend/app/views/profile.scala.html
                    HASH: cca74a2baccd1e6ce9f2dd4852c7cfe59ae9e3e1
                    MATRIX: 845->1|1116->177|1192->218|1206->224|1262->259|1339->301|1353->307|1402->335|1479->377|1493->383|1543->412|1621->455|1635->461|1686->491|1823->592|1837->597|1914->652|2012->714|2044->724|2196->840|2209->844|2241->854|2394->971|2407->975|2443->989|2509->1019|2522->1023|2555->1034|2651->1094|2693->1127|2733->1129|2787->1147|2811->1162|2851->1164|2929->1206|2942->1210|2970->1216|3036->1250|3090->1268|3113->1282|3153->1284|3233->1328|3246->1332|3274->1338|3342->1374|3396->1392|3418->1405|3458->1407|3538->1451|3551->1455|3579->1461|3645->1509|3658->1514|3697->1515|3824->1606|3837->1610|3865->1616|3938->1657|4032->1719|4291->1942|4332->1967|4372->1969|4464->2025|4481->2033|4509->2039|4548->2042|4565->2050|4599->2062|4650->2076|4668->2084|4700->2093|4768->2129|5080->2405|5123->2432|5163->2434|5255->2490|5272->2498|5300->2504|5339->2507|5356->2515|5390->2527|5441->2541|5459->2549|5491->2558|5559->2594|5696->2695|5738->2728|5778->2730|6025->2941|6066->2966|6106->2968|6202->3028|6217->3034|6245->3040|6284->3043|6299->3049|6333->3061|6385->3076|6401->3082|6433->3091|6505->3131|6650->3244
                    LINES: 26->1|29->1|33->5|33->5|33->5|34->6|34->6|34->6|35->7|35->7|35->7|36->8|36->8|36->8|41->13|41->13|41->13|45->17|45->17|48->20|48->20|48->20|51->23|51->23|51->23|52->24|52->24|52->24|55->27|55->27|55->27|56->28|56->28|56->28|57->29|57->29|57->29|58->30|59->31|59->31|59->31|60->32|60->32|60->32|61->33|62->34|62->34|62->34|63->35|63->35|63->35|64->36|64->36|64->36|66->38|66->38|66->38|67->39|69->41|75->47|75->47|75->47|76->48|76->48|76->48|76->48|76->48|76->48|76->48|76->48|76->48|77->49|85->57|85->57|85->57|86->58|86->58|86->58|86->58|86->58|86->58|86->58|86->58|86->58|87->59|91->63|91->63|91->63|96->68|96->68|96->68|97->69|97->69|97->69|97->69|97->69|97->69|97->69|97->69|97->69|98->70|102->74
                    -- GENERATED --
                */
            