// @SOURCE:/home/dimitris/CMU/SA&D/Project/ApacheCMDA-Frontend/conf/routes
// @HASH:cdc485fcc14b0c2edd58c94df96a94b1b36de137
// @DATE:Thu Apr 07 14:52:37 PDT 2016

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:99
// @LINE:98
// @LINE:97
// @LINE:94
// @LINE:93
// @LINE:92
// @LINE:91
// @LINE:90
// @LINE:89
// @LINE:85
// @LINE:84
// @LINE:83
// @LINE:82
// @LINE:78
// @LINE:77
// @LINE:76
// @LINE:74
// @LINE:73
// @LINE:72
// @LINE:71
// @LINE:70
// @LINE:69
// @LINE:68
// @LINE:67
// @LINE:66
// @LINE:65
// @LINE:64
// @LINE:63
// @LINE:59
// @LINE:58
// @LINE:57
// @LINE:56
// @LINE:55
// @LINE:54
// @LINE:53
// @LINE:52
// @LINE:51
// @LINE:50
// @LINE:49
// @LINE:48
// @LINE:47
// @LINE:46
// @LINE:45
// @LINE:40
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:19
// @LINE:18
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:6
package controllers {

// @LINE:40
class ReverseAssets {
    

// @LINE:40
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:64
class ReverseTimelineController {
    

// @LINE:64
def main(offset:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "timeline/" + implicitly[PathBindable[Long]].unbind("offset", offset))
}
                                                
    
}
                          

// @LINE:19
// @LINE:18
class ReverseAboutusController {
    

// @LINE:19
def aboutProject(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "aboutProject")
}
                                                

// @LINE:18
def aboutUs(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "aboutus")
}
                                                
    
}
                          

// @LINE:99
// @LINE:98
// @LINE:97
// @LINE:78
// @LINE:77
// @LINE:76
// @LINE:74
// @LINE:73
// @LINE:72
// @LINE:71
// @LINE:70
// @LINE:69
// @LINE:68
// @LINE:67
// @LINE:66
// @LINE:65
// @LINE:63
class ReverseWorkflowController {
    

// @LINE:63
def main(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "workflow")
}
                                                

// @LINE:74
def deleteWorkflow(wid:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "workflow/delete/" + implicitly[PathBindable[Long]].unbind("wid", wid))
}
                                                

// @LINE:72
def thumbUp(commentId:Long, wid:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "workflow/thumbUp/" + implicitly[PathBindable[Long]].unbind("commentId", commentId) + "/" + implicitly[PathBindable[Long]].unbind("wid", wid))
}
                                                

// @LINE:71
def addReply(toUserId:Long, commentId:Long, wid:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "workflow/addReply/" + implicitly[PathBindable[Long]].unbind("toUserId", toUserId) + "/" + implicitly[PathBindable[Long]].unbind("commentId", commentId) + "/" + implicitly[PathBindable[Long]].unbind("wid", wid))
}
                                                

// @LINE:99
def voteToSuggestion(suggestionID:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "suggestion/voteToSuggestion/" + implicitly[PathBindable[Long]].unbind("suggestionID", suggestionID))
}
                                                

// @LINE:73
def thumbDown(commentId:Long, wid:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "workflow/thumbDown/" + implicitly[PathBindable[Long]].unbind("commentId", commentId) + "/" + implicitly[PathBindable[Long]].unbind("wid", wid))
}
                                                

// @LINE:68
def edit(wid:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "workflow/update/" + implicitly[PathBindable[Long]].unbind("wid", wid))
}
                                                

// @LINE:65
def createFlow(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "workflow/new")
}
                                                

// @LINE:77
def deleteTag(wid:Long, tg:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "workflow/tags/delete/wf/" + implicitly[PathBindable[Long]].unbind("wid", wid) + "/tag/" + implicitly[PathBindable[String]].unbind("tg", dynamicString(tg)))
}
                                                

// @LINE:69
def editFlow(wid:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "workflow/edit/" + implicitly[PathBindable[Long]].unbind("wid", wid))
}
                                                

// @LINE:76
def addTag(wid:Long, tg:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "workflow/tags/add/wf/" + implicitly[PathBindable[Long]].unbind("wid", wid) + "/tag/" + implicitly[PathBindable[String]].unbind("tg", dynamicString(tg)))
}
                                                

// @LINE:78
def parseXML(wid:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "workflow/import" + queryString(List(Some(implicitly[QueryStringBindable[Long]].unbind("wid", wid)))))
}
                                                

// @LINE:67
def workflowDetail(wid:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "workflow/get/" + implicitly[PathBindable[Long]].unbind("wid", wid))
}
                                                

// @LINE:70
def addComment(wid:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "workflow/addComment/" + implicitly[PathBindable[Long]].unbind("wid", wid))
}
                                                

// @LINE:97
def addSuggestion(wid:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "suggestion/addSuggestion/" + implicitly[PathBindable[Long]].unbind("wid", wid))
}
                                                

// @LINE:98
def addSuggestionTag(suggestionID:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "suggestion/addSuggestionTag/" + implicitly[PathBindable[Long]].unbind("suggestionID", suggestionID))
}
                                                

// @LINE:66
def getPublicWorkflow(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "workflow/getPublicWorkflow")
}
                                                
    
}
                          

// @LINE:59
// @LINE:58
// @LINE:57
// @LINE:56
// @LINE:51
class ReverseProfileController {
    

// @LINE:56
def follow(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "follow/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:51
def profile(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "profile/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:59
def deleteFriend(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "deletefriend/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:57
def unfollow(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "unfollow/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:58
def sendRequest(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "befriend/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                
    
}
                          

// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
class ReverseBugReportController {
    

// @LINE:11
def reports(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "bugs")
}
                                                

// @LINE:15
def solveReport(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "solve/report")
}
                                                

// @LINE:14
def deleteReport(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "delete/report")
}
                                                

// @LINE:13
def list(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "bug/list")
}
                                                

// @LINE:12
def newReport(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "newReport")
}
                                                
    
}
                          

// @LINE:53
// @LINE:52
class ReverseSignupController {
    

// @LINE:52
def signUp(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "signup")
}
                                                

// @LINE:53
def register(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "signup/register")
}
                                                
    
}
                          

// @LINE:85
// @LINE:84
// @LINE:83
// @LINE:82
class ReverseGroupController {
    

// @LINE:84
def join(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "group/join")
}
                                                

// @LINE:82
def create(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "group/create")
}
                                                

// @LINE:85
def joinGroup(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "group/joingroup")
}
                                                

// @LINE:83
def createGroup(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "group/creategroup")
}
                                                
    
}
                          

// @LINE:50
// @LINE:49
// @LINE:48
// @LINE:47
// @LINE:46
// @LINE:45
class ReverseApplication {
    

// @LINE:50
def logout(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "logout")
}
                                                

// @LINE:46
// @LINE:45
def home(): Call = {
   () match {
// @LINE:45
case () if true => Call("GET", _prefix)
                                                        
// @LINE:46
case () if true => Call("GET", _prefix + { _defaultPrefix } + "home")
                                                        
   }
}
                                                

// @LINE:48
def authenticate(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "login")
}
                                                

// @LINE:49
def index(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "index")
}
                                                

// @LINE:47
def login(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "login")
}
                                                
    
}
                          

// @LINE:55
// @LINE:54
class ReverseSearchController {
    

// @LINE:55
def search(category:String = "", keywd:String = ""): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "searchResult" + queryString(List(if(category == "") None else Some(implicitly[QueryStringBindable[String]].unbind("category", category)), if(keywd == "") None else Some(implicitly[QueryStringBindable[String]].unbind("keywd", keywd)))))
}
                                                

// @LINE:54
def index(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "search")
}
                                                
    
}
                          

// @LINE:94
// @LINE:93
// @LINE:92
// @LINE:91
// @LINE:90
// @LINE:89
class ReverseNotificationController {
    

// @LINE:92
def sendMessage(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "mail/sendmail")
}
                                                

// @LINE:90
def accpetFriend(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "friends/accept/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:89
def main(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "notifications")
}
                                                

// @LINE:91
def rejectFriend(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "friends/reject/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:93
def pmdetailpage(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "mail/detail/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:94
def getNotifications(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "notifications/count")
}
                                                
    
}
                          

// @LINE:37
// @LINE:36
// @LINE:35
class ReverseDatasetController {
    

// @LINE:37
def getSearchResult(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "climate/getSearchResult")
}
                                                

// @LINE:36
def searchDataset(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "climate/searchDataSet")
}
                                                

// @LINE:35
def datasetList(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "climate/datasets")
}
                                                
    
}
                          

// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:6
class ReverseClimateServiceController {
    

// @LINE:32
def addClimateServices(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "climate/new/climateServices")
}
                                                

// @LINE:25
def mostRecentlyAddedClimateServices(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "climate/mostRecentlyAddedClimateServices")
}
                                                

// @LINE:31
def editClimateService(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "climate/edit/climateServices")
}
                                                

// @LINE:27
def mostPopularClimateServices(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "climate/mostPopularClimateServices")
}
                                                

// @LINE:23
def tutorial(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "climate/tutorial")
}
                                                

// @LINE:33
def oneService(url:String = null): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "climate/oneService" + queryString(List(if(url == null) None else Some(implicitly[QueryStringBindable[String]].unbind("url", url)))))
}
                                                

// @LINE:30
def downloadClimateService(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "climate/download/climateServices")
}
                                                

// @LINE:26
def mostRecentlyUsedClimateServices(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "climate/mostRecentlyUsedClimateServices")
}
                                                

// @LINE:24
def climateServices(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "climate/climateServices")
}
                                                

// @LINE:28
def newClimateService(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "climate/new/climateServices")
}
                                                

// @LINE:22
// @LINE:6
def home(email:String = null, vfile:String = null, dataset:String = null): Call = {
   (email: @unchecked, vfile: @unchecked, dataset: @unchecked) match {
// @LINE:6
case (email, vfile, dataset) if true => Call("GET", _prefix + { _defaultPrefix } + "climatehome" + queryString(List(if(email == null) None else Some(implicitly[QueryStringBindable[String]].unbind("email", email)), if(vfile == null) None else Some(implicitly[QueryStringBindable[String]].unbind("vfile", vfile)), if(dataset == null) None else Some(implicitly[QueryStringBindable[String]].unbind("dataset", dataset)))))
                                                        
// @LINE:22
case (email, vfile, dataset) if true => Call("GET", _prefix + { _defaultPrefix } + "climate" + queryString(List(if(email == null) None else Some(implicitly[QueryStringBindable[String]].unbind("email", email)), if(vfile == null) None else Some(implicitly[QueryStringBindable[String]].unbind("vfile", vfile)), if(dataset == null) None else Some(implicitly[QueryStringBindable[String]].unbind("dataset", dataset)))))
                                                        
   }
}
                                                

// @LINE:29
def deleteClimateService(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "climate/delete/climateServices")
}
                                                
    
}
                          
}
                  


// @LINE:99
// @LINE:98
// @LINE:97
// @LINE:94
// @LINE:93
// @LINE:92
// @LINE:91
// @LINE:90
// @LINE:89
// @LINE:85
// @LINE:84
// @LINE:83
// @LINE:82
// @LINE:78
// @LINE:77
// @LINE:76
// @LINE:74
// @LINE:73
// @LINE:72
// @LINE:71
// @LINE:70
// @LINE:69
// @LINE:68
// @LINE:67
// @LINE:66
// @LINE:65
// @LINE:64
// @LINE:63
// @LINE:59
// @LINE:58
// @LINE:57
// @LINE:56
// @LINE:55
// @LINE:54
// @LINE:53
// @LINE:52
// @LINE:51
// @LINE:50
// @LINE:49
// @LINE:48
// @LINE:47
// @LINE:46
// @LINE:45
// @LINE:40
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:19
// @LINE:18
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:6
package controllers.javascript {

// @LINE:40
class ReverseAssets {
    

// @LINE:40
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:64
class ReverseTimelineController {
    

// @LINE:64
def main : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.TimelineController.main",
   """
      function(offset) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "timeline/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("offset", offset)})
      }
   """
)
                        
    
}
              

// @LINE:19
// @LINE:18
class ReverseAboutusController {
    

// @LINE:19
def aboutProject : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AboutusController.aboutProject",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "aboutProject"})
      }
   """
)
                        

// @LINE:18
def aboutUs : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AboutusController.aboutUs",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "aboutus"})
      }
   """
)
                        
    
}
              

// @LINE:99
// @LINE:98
// @LINE:97
// @LINE:78
// @LINE:77
// @LINE:76
// @LINE:74
// @LINE:73
// @LINE:72
// @LINE:71
// @LINE:70
// @LINE:69
// @LINE:68
// @LINE:67
// @LINE:66
// @LINE:65
// @LINE:63
class ReverseWorkflowController {
    

// @LINE:63
def main : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.WorkflowController.main",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "workflow"})
      }
   """
)
                        

// @LINE:74
def deleteWorkflow : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.WorkflowController.deleteWorkflow",
   """
      function(wid) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "workflow/delete/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("wid", wid)})
      }
   """
)
                        

// @LINE:72
def thumbUp : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.WorkflowController.thumbUp",
   """
      function(commentId,wid) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "workflow/thumbUp/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("commentId", commentId) + "/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("wid", wid)})
      }
   """
)
                        

// @LINE:71
def addReply : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.WorkflowController.addReply",
   """
      function(toUserId,commentId,wid) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "workflow/addReply/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("toUserId", toUserId) + "/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("commentId", commentId) + "/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("wid", wid)})
      }
   """
)
                        

// @LINE:99
def voteToSuggestion : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.WorkflowController.voteToSuggestion",
   """
      function(suggestionID) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "suggestion/voteToSuggestion/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("suggestionID", suggestionID)})
      }
   """
)
                        

// @LINE:73
def thumbDown : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.WorkflowController.thumbDown",
   """
      function(commentId,wid) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "workflow/thumbDown/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("commentId", commentId) + "/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("wid", wid)})
      }
   """
)
                        

// @LINE:68
def edit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.WorkflowController.edit",
   """
      function(wid) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "workflow/update/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("wid", wid)})
      }
   """
)
                        

// @LINE:65
def createFlow : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.WorkflowController.createFlow",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "workflow/new"})
      }
   """
)
                        

// @LINE:77
def deleteTag : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.WorkflowController.deleteTag",
   """
      function(wid,tg) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "workflow/tags/delete/wf/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("wid", wid) + "/tag/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("tg", encodeURIComponent(tg))})
      }
   """
)
                        

// @LINE:69
def editFlow : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.WorkflowController.editFlow",
   """
      function(wid) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "workflow/edit/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("wid", wid)})
      }
   """
)
                        

// @LINE:76
def addTag : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.WorkflowController.addTag",
   """
      function(wid,tg) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "workflow/tags/add/wf/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("wid", wid) + "/tag/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("tg", encodeURIComponent(tg))})
      }
   """
)
                        

// @LINE:78
def parseXML : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.WorkflowController.parseXML",
   """
      function(wid) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "workflow/import" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("wid", wid)])})
      }
   """
)
                        

// @LINE:67
def workflowDetail : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.WorkflowController.workflowDetail",
   """
      function(wid) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "workflow/get/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("wid", wid)})
      }
   """
)
                        

// @LINE:70
def addComment : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.WorkflowController.addComment",
   """
      function(wid) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "workflow/addComment/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("wid", wid)})
      }
   """
)
                        

// @LINE:97
def addSuggestion : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.WorkflowController.addSuggestion",
   """
      function(wid) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "suggestion/addSuggestion/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("wid", wid)})
      }
   """
)
                        

// @LINE:98
def addSuggestionTag : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.WorkflowController.addSuggestionTag",
   """
      function(suggestionID) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "suggestion/addSuggestionTag/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("suggestionID", suggestionID)})
      }
   """
)
                        

// @LINE:66
def getPublicWorkflow : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.WorkflowController.getPublicWorkflow",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "workflow/getPublicWorkflow"})
      }
   """
)
                        
    
}
              

// @LINE:59
// @LINE:58
// @LINE:57
// @LINE:56
// @LINE:51
class ReverseProfileController {
    

// @LINE:56
def follow : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ProfileController.follow",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "follow/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:51
def profile : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ProfileController.profile",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "profile/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:59
def deleteFriend : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ProfileController.deleteFriend",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "deletefriend/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:57
def unfollow : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ProfileController.unfollow",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "unfollow/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:58
def sendRequest : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ProfileController.sendRequest",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "befriend/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        
    
}
              

// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
class ReverseBugReportController {
    

// @LINE:11
def reports : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BugReportController.reports",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "bugs"})
      }
   """
)
                        

// @LINE:15
def solveReport : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BugReportController.solveReport",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "solve/report"})
      }
   """
)
                        

// @LINE:14
def deleteReport : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BugReportController.deleteReport",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "delete/report"})
      }
   """
)
                        

// @LINE:13
def list : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BugReportController.list",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "bug/list"})
      }
   """
)
                        

// @LINE:12
def newReport : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BugReportController.newReport",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "newReport"})
      }
   """
)
                        
    
}
              

// @LINE:53
// @LINE:52
class ReverseSignupController {
    

// @LINE:52
def signUp : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.SignupController.signUp",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signup"})
      }
   """
)
                        

// @LINE:53
def register : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.SignupController.register",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "signup/register"})
      }
   """
)
                        
    
}
              

// @LINE:85
// @LINE:84
// @LINE:83
// @LINE:82
class ReverseGroupController {
    

// @LINE:84
def join : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.GroupController.join",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "group/join"})
      }
   """
)
                        

// @LINE:82
def create : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.GroupController.create",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "group/create"})
      }
   """
)
                        

// @LINE:85
def joinGroup : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.GroupController.joinGroup",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "group/joingroup"})
      }
   """
)
                        

// @LINE:83
def createGroup : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.GroupController.createGroup",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "group/creategroup"})
      }
   """
)
                        
    
}
              

// @LINE:50
// @LINE:49
// @LINE:48
// @LINE:47
// @LINE:46
// @LINE:45
class ReverseApplication {
    

// @LINE:50
def logout : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.logout",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
      }
   """
)
                        

// @LINE:46
// @LINE:45
def home : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.home",
   """
      function() {
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "home"})
      }
      }
   """
)
                        

// @LINE:48
def authenticate : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.authenticate",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        

// @LINE:49
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "index"})
      }
   """
)
                        

// @LINE:47
def login : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.login",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        
    
}
              

// @LINE:55
// @LINE:54
class ReverseSearchController {
    

// @LINE:55
def search : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.SearchController.search",
   """
      function(category,keywd) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "searchResult" + _qS([(category == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("category", category)), (keywd == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("keywd", keywd))])})
      }
   """
)
                        

// @LINE:54
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.SearchController.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "search"})
      }
   """
)
                        
    
}
              

// @LINE:94
// @LINE:93
// @LINE:92
// @LINE:91
// @LINE:90
// @LINE:89
class ReverseNotificationController {
    

// @LINE:92
def sendMessage : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.NotificationController.sendMessage",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "mail/sendmail"})
      }
   """
)
                        

// @LINE:90
def accpetFriend : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.NotificationController.accpetFriend",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "friends/accept/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:89
def main : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.NotificationController.main",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "notifications"})
      }
   """
)
                        

// @LINE:91
def rejectFriend : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.NotificationController.rejectFriend",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "friends/reject/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:93
def pmdetailpage : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.NotificationController.pmdetailpage",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "mail/detail/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:94
def getNotifications : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.NotificationController.getNotifications",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "notifications/count"})
      }
   """
)
                        
    
}
              

// @LINE:37
// @LINE:36
// @LINE:35
class ReverseDatasetController {
    

// @LINE:37
def getSearchResult : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DatasetController.getSearchResult",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climate/getSearchResult"})
      }
   """
)
                        

// @LINE:36
def searchDataset : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DatasetController.searchDataset",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climate/searchDataSet"})
      }
   """
)
                        

// @LINE:35
def datasetList : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DatasetController.datasetList",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climate/datasets"})
      }
   """
)
                        
    
}
              

// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:6
class ReverseClimateServiceController {
    

// @LINE:32
def addClimateServices : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.addClimateServices",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climate/new/climateServices"})
      }
   """
)
                        

// @LINE:25
def mostRecentlyAddedClimateServices : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.mostRecentlyAddedClimateServices",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climate/mostRecentlyAddedClimateServices"})
      }
   """
)
                        

// @LINE:31
def editClimateService : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.editClimateService",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "climate/edit/climateServices"})
      }
   """
)
                        

// @LINE:27
def mostPopularClimateServices : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.mostPopularClimateServices",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climate/mostPopularClimateServices"})
      }
   """
)
                        

// @LINE:23
def tutorial : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.tutorial",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climate/tutorial"})
      }
   """
)
                        

// @LINE:33
def oneService : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.oneService",
   """
      function(url) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climate/oneService" + _qS([(url == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("url", url))])})
      }
   """
)
                        

// @LINE:30
def downloadClimateService : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.downloadClimateService",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "climate/download/climateServices"})
      }
   """
)
                        

// @LINE:26
def mostRecentlyUsedClimateServices : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.mostRecentlyUsedClimateServices",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climate/mostRecentlyUsedClimateServices"})
      }
   """
)
                        

// @LINE:24
def climateServices : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.climateServices",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climate/climateServices"})
      }
   """
)
                        

// @LINE:28
def newClimateService : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.newClimateService",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "climate/new/climateServices"})
      }
   """
)
                        

// @LINE:22
// @LINE:6
def home : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.home",
   """
      function(email, vfile, dataset) {
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climatehome" + _qS([(email == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("email", email)), (vfile == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("vfile", vfile)), (dataset == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("dataset", dataset))])})
      }
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climate" + _qS([(email == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("email", email)), (vfile == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("vfile", vfile)), (dataset == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("dataset", dataset))])})
      }
      }
   """
)
                        

// @LINE:29
def deleteClimateService : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.deleteClimateService",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "climate/delete/climateServices"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:99
// @LINE:98
// @LINE:97
// @LINE:94
// @LINE:93
// @LINE:92
// @LINE:91
// @LINE:90
// @LINE:89
// @LINE:85
// @LINE:84
// @LINE:83
// @LINE:82
// @LINE:78
// @LINE:77
// @LINE:76
// @LINE:74
// @LINE:73
// @LINE:72
// @LINE:71
// @LINE:70
// @LINE:69
// @LINE:68
// @LINE:67
// @LINE:66
// @LINE:65
// @LINE:64
// @LINE:63
// @LINE:59
// @LINE:58
// @LINE:57
// @LINE:56
// @LINE:55
// @LINE:54
// @LINE:53
// @LINE:52
// @LINE:51
// @LINE:50
// @LINE:49
// @LINE:48
// @LINE:47
// @LINE:46
// @LINE:45
// @LINE:40
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:19
// @LINE:18
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:6
package controllers.ref {


// @LINE:40
class ReverseAssets {
    

// @LINE:40
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:64
class ReverseTimelineController {
    

// @LINE:64
def main(offset:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.TimelineController.main(offset), HandlerDef(this, "controllers.TimelineController", "main", Seq(classOf[Long]), "GET", """""", _prefix + """timeline/$offset<[^/]+>""")
)
                      
    
}
                          

// @LINE:19
// @LINE:18
class ReverseAboutusController {
    

// @LINE:19
def aboutProject(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AboutusController.aboutProject(), HandlerDef(this, "controllers.AboutusController", "aboutProject", Seq(), "GET", """""", _prefix + """aboutProject""")
)
                      

// @LINE:18
def aboutUs(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AboutusController.aboutUs(), HandlerDef(this, "controllers.AboutusController", "aboutUs", Seq(), "GET", """ About Us""", _prefix + """aboutus""")
)
                      
    
}
                          

// @LINE:99
// @LINE:98
// @LINE:97
// @LINE:78
// @LINE:77
// @LINE:76
// @LINE:74
// @LINE:73
// @LINE:72
// @LINE:71
// @LINE:70
// @LINE:69
// @LINE:68
// @LINE:67
// @LINE:66
// @LINE:65
// @LINE:63
class ReverseWorkflowController {
    

// @LINE:63
def main(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.WorkflowController.main(), HandlerDef(this, "controllers.WorkflowController", "main", Seq(), "GET", """ display and show work flow""", _prefix + """workflow""")
)
                      

// @LINE:74
def deleteWorkflow(wid:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.WorkflowController.deleteWorkflow(wid), HandlerDef(this, "controllers.WorkflowController", "deleteWorkflow", Seq(classOf[Long]), "GET", """""", _prefix + """workflow/delete/$wid<[^/]+>""")
)
                      

// @LINE:72
def thumbUp(commentId:Long, wid:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.WorkflowController.thumbUp(commentId, wid), HandlerDef(this, "controllers.WorkflowController", "thumbUp", Seq(classOf[Long], classOf[Long]), "GET", """""", _prefix + """workflow/thumbUp/$commentId<[^/]+>/$wid<[^/]+>""")
)
                      

// @LINE:71
def addReply(toUserId:Long, commentId:Long, wid:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.WorkflowController.addReply(toUserId, commentId, wid), HandlerDef(this, "controllers.WorkflowController", "addReply", Seq(classOf[Long], classOf[Long], classOf[Long]), "POST", """""", _prefix + """workflow/addReply/$toUserId<[^/]+>/$commentId<[^/]+>/$wid<[^/]+>""")
)
                      

// @LINE:99
def voteToSuggestion(suggestionID:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.WorkflowController.voteToSuggestion(suggestionID), HandlerDef(this, "controllers.WorkflowController", "voteToSuggestion", Seq(classOf[Long]), "GET", """""", _prefix + """suggestion/voteToSuggestion/$suggestionID<[^/]+>""")
)
                      

// @LINE:73
def thumbDown(commentId:Long, wid:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.WorkflowController.thumbDown(commentId, wid), HandlerDef(this, "controllers.WorkflowController", "thumbDown", Seq(classOf[Long], classOf[Long]), "GET", """""", _prefix + """workflow/thumbDown/$commentId<[^/]+>/$wid<[^/]+>""")
)
                      

// @LINE:68
def edit(wid:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.WorkflowController.edit(wid), HandlerDef(this, "controllers.WorkflowController", "edit", Seq(classOf[Long]), "GET", """""", _prefix + """workflow/update/$wid<[^/]+>""")
)
                      

// @LINE:65
def createFlow(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.WorkflowController.createFlow(), HandlerDef(this, "controllers.WorkflowController", "createFlow", Seq(), "POST", """""", _prefix + """workflow/new""")
)
                      

// @LINE:77
def deleteTag(wid:Long, tg:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.WorkflowController.deleteTag(wid, tg), HandlerDef(this, "controllers.WorkflowController", "deleteTag", Seq(classOf[Long], classOf[String]), "GET", """""", _prefix + """workflow/tags/delete/wf/$wid<[^/]+>/tag/$tg<[^/]+>""")
)
                      

// @LINE:69
def editFlow(wid:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.WorkflowController.editFlow(wid), HandlerDef(this, "controllers.WorkflowController", "editFlow", Seq(classOf[Long]), "POST", """""", _prefix + """workflow/edit/$wid<[^/]+>""")
)
                      

// @LINE:76
def addTag(wid:Long, tg:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.WorkflowController.addTag(wid, tg), HandlerDef(this, "controllers.WorkflowController", "addTag", Seq(classOf[Long], classOf[String]), "GET", """""", _prefix + """workflow/tags/add/wf/$wid<[^/]+>/tag/$tg<[^/]+>""")
)
                      

// @LINE:78
def parseXML(wid:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.WorkflowController.parseXML(wid), HandlerDef(this, "controllers.WorkflowController", "parseXML", Seq(classOf[Long]), "GET", """""", _prefix + """workflow/import""")
)
                      

// @LINE:67
def workflowDetail(wid:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.WorkflowController.workflowDetail(wid), HandlerDef(this, "controllers.WorkflowController", "workflowDetail", Seq(classOf[Long]), "GET", """""", _prefix + """workflow/get/$wid<[^/]+>""")
)
                      

// @LINE:70
def addComment(wid:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.WorkflowController.addComment(wid), HandlerDef(this, "controllers.WorkflowController", "addComment", Seq(classOf[Long]), "POST", """""", _prefix + """workflow/addComment/$wid<[^/]+>""")
)
                      

// @LINE:97
def addSuggestion(wid:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.WorkflowController.addSuggestion(wid), HandlerDef(this, "controllers.WorkflowController", "addSuggestion", Seq(classOf[Long]), "POST", """ suggestion""", _prefix + """suggestion/addSuggestion/$wid<[^/]+>""")
)
                      

// @LINE:98
def addSuggestionTag(suggestionID:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.WorkflowController.addSuggestionTag(suggestionID), HandlerDef(this, "controllers.WorkflowController", "addSuggestionTag", Seq(classOf[Long]), "POST", """""", _prefix + """suggestion/addSuggestionTag/$suggestionID<[^/]+>""")
)
                      

// @LINE:66
def getPublicWorkflow(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.WorkflowController.getPublicWorkflow(), HandlerDef(this, "controllers.WorkflowController", "getPublicWorkflow", Seq(), "GET", """""", _prefix + """workflow/getPublicWorkflow""")
)
                      
    
}
                          

// @LINE:59
// @LINE:58
// @LINE:57
// @LINE:56
// @LINE:51
class ReverseProfileController {
    

// @LINE:56
def follow(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ProfileController.follow(id), HandlerDef(this, "controllers.ProfileController", "follow", Seq(classOf[Long]), "GET", """""", _prefix + """follow/$id<[^/]+>""")
)
                      

// @LINE:51
def profile(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ProfileController.profile(id), HandlerDef(this, "controllers.ProfileController", "profile", Seq(classOf[Long]), "GET", """""", _prefix + """profile/$id<[^/]+>""")
)
                      

// @LINE:59
def deleteFriend(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ProfileController.deleteFriend(id), HandlerDef(this, "controllers.ProfileController", "deleteFriend", Seq(classOf[Long]), "GET", """""", _prefix + """deletefriend/$id<[^/]+>""")
)
                      

// @LINE:57
def unfollow(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ProfileController.unfollow(id), HandlerDef(this, "controllers.ProfileController", "unfollow", Seq(classOf[Long]), "GET", """""", _prefix + """unfollow/$id<[^/]+>""")
)
                      

// @LINE:58
def sendRequest(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ProfileController.sendRequest(id), HandlerDef(this, "controllers.ProfileController", "sendRequest", Seq(classOf[Long]), "GET", """""", _prefix + """befriend/$id<[^/]+>""")
)
                      
    
}
                          

// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
class ReverseBugReportController {
    

// @LINE:11
def reports(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.BugReportController.reports(), HandlerDef(this, "controllers.BugReportController", "reports", Seq(), "GET", """ BugReporting""", _prefix + """bugs""")
)
                      

// @LINE:15
def solveReport(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.BugReportController.solveReport(), HandlerDef(this, "controllers.BugReportController", "solveReport", Seq(), "POST", """""", _prefix + """solve/report""")
)
                      

// @LINE:14
def deleteReport(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.BugReportController.deleteReport(), HandlerDef(this, "controllers.BugReportController", "deleteReport", Seq(), "POST", """""", _prefix + """delete/report""")
)
                      

// @LINE:13
def list(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.BugReportController.list(), HandlerDef(this, "controllers.BugReportController", "list", Seq(), "GET", """""", _prefix + """bug/list""")
)
                      

// @LINE:12
def newReport(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.BugReportController.newReport(), HandlerDef(this, "controllers.BugReportController", "newReport", Seq(), "GET", """""", _prefix + """newReport""")
)
                      
    
}
                          

// @LINE:53
// @LINE:52
class ReverseSignupController {
    

// @LINE:52
def signUp(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.SignupController.signUp(), HandlerDef(this, "controllers.SignupController", "signUp", Seq(), "GET", """""", _prefix + """signup""")
)
                      

// @LINE:53
def register(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.SignupController.register(), HandlerDef(this, "controllers.SignupController", "register", Seq(), "POST", """""", _prefix + """signup/register""")
)
                      
    
}
                          

// @LINE:85
// @LINE:84
// @LINE:83
// @LINE:82
class ReverseGroupController {
    

// @LINE:84
def join(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.GroupController.join(), HandlerDef(this, "controllers.GroupController", "join", Seq(), "GET", """""", _prefix + """group/join""")
)
                      

// @LINE:82
def create(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.GroupController.create(), HandlerDef(this, "controllers.GroupController", "create", Seq(), "GET", """ group""", _prefix + """group/create""")
)
                      

// @LINE:85
def joinGroup(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.GroupController.joinGroup(), HandlerDef(this, "controllers.GroupController", "joinGroup", Seq(), "POST", """""", _prefix + """group/joingroup""")
)
                      

// @LINE:83
def createGroup(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.GroupController.createGroup(), HandlerDef(this, "controllers.GroupController", "createGroup", Seq(), "POST", """""", _prefix + """group/creategroup""")
)
                      
    
}
                          

// @LINE:50
// @LINE:49
// @LINE:48
// @LINE:47
// @LINE:46
// @LINE:45
class ReverseApplication {
    

// @LINE:50
def logout(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.logout(), HandlerDef(this, "controllers.Application", "logout", Seq(), "GET", """""", _prefix + """logout""")
)
                      

// @LINE:45
def home(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.home(), HandlerDef(this, "controllers.Application", "home", Seq(), "GET", """""", _prefix + """""")
)
                      

// @LINE:48
def authenticate(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.authenticate(), HandlerDef(this, "controllers.Application", "authenticate", Seq(), "POST", """""", _prefix + """login""")
)
                      

// @LINE:49
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """""", _prefix + """index""")
)
                      

// @LINE:47
def login(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.login(), HandlerDef(this, "controllers.Application", "login", Seq(), "GET", """""", _prefix + """login""")
)
                      
    
}
                          

// @LINE:55
// @LINE:54
class ReverseSearchController {
    

// @LINE:55
def search(category:String, keywd:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.SearchController.search(category, keywd), HandlerDef(this, "controllers.SearchController", "search", Seq(classOf[String], classOf[String]), "GET", """""", _prefix + """searchResult""")
)
                      

// @LINE:54
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.SearchController.index(), HandlerDef(this, "controllers.SearchController", "index", Seq(), "GET", """""", _prefix + """search""")
)
                      
    
}
                          

// @LINE:94
// @LINE:93
// @LINE:92
// @LINE:91
// @LINE:90
// @LINE:89
class ReverseNotificationController {
    

// @LINE:92
def sendMessage(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.NotificationController.sendMessage(), HandlerDef(this, "controllers.NotificationController", "sendMessage", Seq(), "POST", """""", _prefix + """mail/sendmail""")
)
                      

// @LINE:90
def accpetFriend(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.NotificationController.accpetFriend(id), HandlerDef(this, "controllers.NotificationController", "accpetFriend", Seq(classOf[Long]), "GET", """""", _prefix + """friends/accept/$id<[^/]+>""")
)
                      

// @LINE:89
def main(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.NotificationController.main(), HandlerDef(this, "controllers.NotificationController", "main", Seq(), "GET", """ notifications""", _prefix + """notifications""")
)
                      

// @LINE:91
def rejectFriend(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.NotificationController.rejectFriend(id), HandlerDef(this, "controllers.NotificationController", "rejectFriend", Seq(classOf[Long]), "GET", """""", _prefix + """friends/reject/$id<[^/]+>""")
)
                      

// @LINE:93
def pmdetailpage(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.NotificationController.pmdetailpage(id), HandlerDef(this, "controllers.NotificationController", "pmdetailpage", Seq(classOf[Long]), "GET", """""", _prefix + """mail/detail/$id<[^/]+>""")
)
                      

// @LINE:94
def getNotifications(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.NotificationController.getNotifications(), HandlerDef(this, "controllers.NotificationController", "getNotifications", Seq(), "GET", """""", _prefix + """notifications/count""")
)
                      
    
}
                          

// @LINE:37
// @LINE:36
// @LINE:35
class ReverseDatasetController {
    

// @LINE:37
def getSearchResult(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DatasetController.getSearchResult(), HandlerDef(this, "controllers.DatasetController", "getSearchResult", Seq(), "GET", """""", _prefix + """climate/getSearchResult""")
)
                      

// @LINE:36
def searchDataset(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DatasetController.searchDataset(), HandlerDef(this, "controllers.DatasetController", "searchDataset", Seq(), "GET", """""", _prefix + """climate/searchDataSet""")
)
                      

// @LINE:35
def datasetList(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DatasetController.datasetList(), HandlerDef(this, "controllers.DatasetController", "datasetList", Seq(), "GET", """Keyword search""", _prefix + """climate/datasets""")
)
                      
    
}
                          

// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:6
class ReverseClimateServiceController {
    

// @LINE:32
def addClimateServices(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClimateServiceController.addClimateServices(), HandlerDef(this, "controllers.ClimateServiceController", "addClimateServices", Seq(), "GET", """""", _prefix + """climate/new/climateServices""")
)
                      

// @LINE:25
def mostRecentlyAddedClimateServices(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClimateServiceController.mostRecentlyAddedClimateServices(), HandlerDef(this, "controllers.ClimateServiceController", "mostRecentlyAddedClimateServices", Seq(), "GET", """""", _prefix + """climate/mostRecentlyAddedClimateServices""")
)
                      

// @LINE:31
def editClimateService(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClimateServiceController.editClimateService(), HandlerDef(this, "controllers.ClimateServiceController", "editClimateService", Seq(), "POST", """""", _prefix + """climate/edit/climateServices""")
)
                      

// @LINE:27
def mostPopularClimateServices(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClimateServiceController.mostPopularClimateServices(), HandlerDef(this, "controllers.ClimateServiceController", "mostPopularClimateServices", Seq(), "GET", """""", _prefix + """climate/mostPopularClimateServices""")
)
                      

// @LINE:23
def tutorial(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClimateServiceController.tutorial(), HandlerDef(this, "controllers.ClimateServiceController", "tutorial", Seq(), "GET", """""", _prefix + """climate/tutorial""")
)
                      

// @LINE:33
def oneService(url:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClimateServiceController.oneService(url), HandlerDef(this, "controllers.ClimateServiceController", "oneService", Seq(classOf[String]), "GET", """""", _prefix + """climate/oneService""")
)
                      

// @LINE:30
def downloadClimateService(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClimateServiceController.downloadClimateService(), HandlerDef(this, "controllers.ClimateServiceController", "downloadClimateService", Seq(), "POST", """""", _prefix + """climate/download/climateServices""")
)
                      

// @LINE:26
def mostRecentlyUsedClimateServices(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClimateServiceController.mostRecentlyUsedClimateServices(), HandlerDef(this, "controllers.ClimateServiceController", "mostRecentlyUsedClimateServices", Seq(), "GET", """""", _prefix + """climate/mostRecentlyUsedClimateServices""")
)
                      

// @LINE:24
def climateServices(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClimateServiceController.climateServices(), HandlerDef(this, "controllers.ClimateServiceController", "climateServices", Seq(), "GET", """""", _prefix + """climate/climateServices""")
)
                      

// @LINE:28
def newClimateService(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClimateServiceController.newClimateService(), HandlerDef(this, "controllers.ClimateServiceController", "newClimateService", Seq(), "POST", """""", _prefix + """climate/new/climateServices""")
)
                      

// @LINE:6
def home(email:String, vfile:String, dataset:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClimateServiceController.home(email, vfile, dataset), HandlerDef(this, "controllers.ClimateServiceController", "home", Seq(classOf[String], classOf[String], classOf[String]), "GET", """ Home page""", _prefix + """climatehome""")
)
                      

// @LINE:29
def deleteClimateService(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClimateServiceController.deleteClimateService(), HandlerDef(this, "controllers.ClimateServiceController", "deleteClimateService", Seq(), "POST", """""", _prefix + """climate/delete/climateServices""")
)
                      
    
}
                          
}
        
    