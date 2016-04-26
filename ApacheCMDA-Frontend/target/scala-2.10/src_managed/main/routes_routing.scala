// @SOURCE:/home/dimitris/CMU/SA&D/Project/ApacheCMDA-Frontend/conf/routes
// @HASH:cdc485fcc14b0c2edd58c94df96a94b1b36de137
// @DATE:Thu Apr 07 14:52:37 PDT 2016


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_ClimateServiceController_home0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climatehome"))))
        

// @LINE:11
private[this] lazy val controllers_BugReportController_reports1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("bugs"))))
        

// @LINE:12
private[this] lazy val controllers_BugReportController_newReport2 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("newReport"))))
        

// @LINE:13
private[this] lazy val controllers_BugReportController_list3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("bug/list"))))
        

// @LINE:14
private[this] lazy val controllers_BugReportController_deleteReport4 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("delete/report"))))
        

// @LINE:15
private[this] lazy val controllers_BugReportController_solveReport5 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("solve/report"))))
        

// @LINE:18
private[this] lazy val controllers_AboutusController_aboutUs6 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("aboutus"))))
        

// @LINE:19
private[this] lazy val controllers_AboutusController_aboutProject7 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("aboutProject"))))
        

// @LINE:22
private[this] lazy val controllers_ClimateServiceController_home8 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate"))))
        

// @LINE:23
private[this] lazy val controllers_ClimateServiceController_tutorial9 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/tutorial"))))
        

// @LINE:24
private[this] lazy val controllers_ClimateServiceController_climateServices10 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/climateServices"))))
        

// @LINE:25
private[this] lazy val controllers_ClimateServiceController_mostRecentlyAddedClimateServices11 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/mostRecentlyAddedClimateServices"))))
        

// @LINE:26
private[this] lazy val controllers_ClimateServiceController_mostRecentlyUsedClimateServices12 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/mostRecentlyUsedClimateServices"))))
        

// @LINE:27
private[this] lazy val controllers_ClimateServiceController_mostPopularClimateServices13 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/mostPopularClimateServices"))))
        

// @LINE:28
private[this] lazy val controllers_ClimateServiceController_newClimateService14 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/new/climateServices"))))
        

// @LINE:29
private[this] lazy val controllers_ClimateServiceController_deleteClimateService15 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/delete/climateServices"))))
        

// @LINE:30
private[this] lazy val controllers_ClimateServiceController_downloadClimateService16 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/download/climateServices"))))
        

// @LINE:31
private[this] lazy val controllers_ClimateServiceController_editClimateService17 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/edit/climateServices"))))
        

// @LINE:32
private[this] lazy val controllers_ClimateServiceController_addClimateServices18 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/new/climateServices"))))
        

// @LINE:33
private[this] lazy val controllers_ClimateServiceController_oneService19 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/oneService"))))
        

// @LINE:35
private[this] lazy val controllers_DatasetController_datasetList20 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/datasets"))))
        

// @LINE:36
private[this] lazy val controllers_DatasetController_searchDataset21 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/searchDataSet"))))
        

// @LINE:37
private[this] lazy val controllers_DatasetController_getSearchResult22 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/getSearchResult"))))
        

// @LINE:40
private[this] lazy val controllers_Assets_at23 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        

// @LINE:45
private[this] lazy val controllers_Application_home24 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:46
private[this] lazy val controllers_Application_home25 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("home"))))
        

// @LINE:47
private[this] lazy val controllers_Application_login26 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
        

// @LINE:48
private[this] lazy val controllers_Application_authenticate27 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
        

// @LINE:49
private[this] lazy val controllers_Application_index28 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("index"))))
        

// @LINE:50
private[this] lazy val controllers_Application_logout29 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("logout"))))
        

// @LINE:51
private[this] lazy val controllers_ProfileController_profile30 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("profile/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:52
private[this] lazy val controllers_SignupController_signUp31 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("signup"))))
        

// @LINE:53
private[this] lazy val controllers_SignupController_register32 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("signup/register"))))
        

// @LINE:54
private[this] lazy val controllers_SearchController_index33 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("search"))))
        

// @LINE:55
private[this] lazy val controllers_SearchController_search34 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("searchResult"))))
        

// @LINE:56
private[this] lazy val controllers_ProfileController_follow35 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("follow/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:57
private[this] lazy val controllers_ProfileController_unfollow36 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("unfollow/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:58
private[this] lazy val controllers_ProfileController_sendRequest37 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("befriend/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:59
private[this] lazy val controllers_ProfileController_deleteFriend38 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("deletefriend/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:63
private[this] lazy val controllers_WorkflowController_main39 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("workflow"))))
        

// @LINE:64
private[this] lazy val controllers_TimelineController_main40 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("timeline/"),DynamicPart("offset", """[^/]+""",true))))
        

// @LINE:65
private[this] lazy val controllers_WorkflowController_createFlow41 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("workflow/new"))))
        

// @LINE:66
private[this] lazy val controllers_WorkflowController_getPublicWorkflow42 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("workflow/getPublicWorkflow"))))
        

// @LINE:67
private[this] lazy val controllers_WorkflowController_workflowDetail43 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("workflow/get/"),DynamicPart("wid", """[^/]+""",true))))
        

// @LINE:68
private[this] lazy val controllers_WorkflowController_edit44 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("workflow/update/"),DynamicPart("wid", """[^/]+""",true))))
        

// @LINE:69
private[this] lazy val controllers_WorkflowController_editFlow45 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("workflow/edit/"),DynamicPart("wid", """[^/]+""",true))))
        

// @LINE:70
private[this] lazy val controllers_WorkflowController_addComment46 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("workflow/addComment/"),DynamicPart("wid", """[^/]+""",true))))
        

// @LINE:71
private[this] lazy val controllers_WorkflowController_addReply47 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("workflow/addReply/"),DynamicPart("toUserId", """[^/]+""",true),StaticPart("/"),DynamicPart("commentId", """[^/]+""",true),StaticPart("/"),DynamicPart("wid", """[^/]+""",true))))
        

// @LINE:72
private[this] lazy val controllers_WorkflowController_thumbUp48 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("workflow/thumbUp/"),DynamicPart("commentId", """[^/]+""",true),StaticPart("/"),DynamicPart("wid", """[^/]+""",true))))
        

// @LINE:73
private[this] lazy val controllers_WorkflowController_thumbDown49 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("workflow/thumbDown/"),DynamicPart("commentId", """[^/]+""",true),StaticPart("/"),DynamicPart("wid", """[^/]+""",true))))
        

// @LINE:74
private[this] lazy val controllers_WorkflowController_deleteWorkflow50 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("workflow/delete/"),DynamicPart("wid", """[^/]+""",true))))
        

// @LINE:76
private[this] lazy val controllers_WorkflowController_addTag51 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("workflow/tags/add/wf/"),DynamicPart("wid", """[^/]+""",true),StaticPart("/tag/"),DynamicPart("tg", """[^/]+""",true))))
        

// @LINE:77
private[this] lazy val controllers_WorkflowController_deleteTag52 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("workflow/tags/delete/wf/"),DynamicPart("wid", """[^/]+""",true),StaticPart("/tag/"),DynamicPart("tg", """[^/]+""",true))))
        

// @LINE:78
private[this] lazy val controllers_WorkflowController_parseXML53 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("workflow/import"))))
        

// @LINE:82
private[this] lazy val controllers_GroupController_create54 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("group/create"))))
        

// @LINE:83
private[this] lazy val controllers_GroupController_createGroup55 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("group/creategroup"))))
        

// @LINE:84
private[this] lazy val controllers_GroupController_join56 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("group/join"))))
        

// @LINE:85
private[this] lazy val controllers_GroupController_joinGroup57 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("group/joingroup"))))
        

// @LINE:89
private[this] lazy val controllers_NotificationController_main58 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("notifications"))))
        

// @LINE:90
private[this] lazy val controllers_NotificationController_accpetFriend59 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("friends/accept/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:91
private[this] lazy val controllers_NotificationController_rejectFriend60 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("friends/reject/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:92
private[this] lazy val controllers_NotificationController_sendMessage61 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("mail/sendmail"))))
        

// @LINE:93
private[this] lazy val controllers_NotificationController_pmdetailpage62 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("mail/detail/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:94
private[this] lazy val controllers_NotificationController_getNotifications63 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("notifications/count"))))
        

// @LINE:97
private[this] lazy val controllers_WorkflowController_addSuggestion64 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("suggestion/addSuggestion/"),DynamicPart("wid", """[^/]+""",true))))
        

// @LINE:98
private[this] lazy val controllers_WorkflowController_addSuggestionTag65 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("suggestion/addSuggestionTag/"),DynamicPart("suggestionID", """[^/]+""",true))))
        

// @LINE:99
private[this] lazy val controllers_WorkflowController_voteToSuggestion66 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("suggestion/voteToSuggestion/"),DynamicPart("suggestionID", """[^/]+""",true))))
        
def documentation = List(("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climatehome""","""controllers.ClimateServiceController.home(email:String ?= null, vfile:String ?= null, dataset:String ?= null)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """bugs""","""controllers.BugReportController.reports()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """newReport""","""controllers.BugReportController.newReport()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """bug/list""","""controllers.BugReportController.list()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """delete/report""","""controllers.BugReportController.deleteReport()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """solve/report""","""controllers.BugReportController.solveReport()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """aboutus""","""controllers.AboutusController.aboutUs()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """aboutProject""","""controllers.AboutusController.aboutProject()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate""","""controllers.ClimateServiceController.home(email:String ?= null, vfile:String ?= null, dataset:String ?= null)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/tutorial""","""controllers.ClimateServiceController.tutorial()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/climateServices""","""controllers.ClimateServiceController.climateServices()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/mostRecentlyAddedClimateServices""","""controllers.ClimateServiceController.mostRecentlyAddedClimateServices()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/mostRecentlyUsedClimateServices""","""controllers.ClimateServiceController.mostRecentlyUsedClimateServices()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/mostPopularClimateServices""","""controllers.ClimateServiceController.mostPopularClimateServices()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/new/climateServices""","""controllers.ClimateServiceController.newClimateService()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/delete/climateServices""","""controllers.ClimateServiceController.deleteClimateService()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/download/climateServices""","""controllers.ClimateServiceController.downloadClimateService()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/edit/climateServices""","""controllers.ClimateServiceController.editClimateService()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/new/climateServices""","""controllers.ClimateServiceController.addClimateServices()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/oneService""","""controllers.ClimateServiceController.oneService(url:String ?= null)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/datasets""","""controllers.DatasetController.datasetList()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/searchDataSet""","""controllers.DatasetController.searchDataset()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/getSearchResult""","""controllers.DatasetController.getSearchResult()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""GET""", prefix,"""controllers.Application.home()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """home""","""controllers.Application.home()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Application.login()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Application.authenticate()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """index""","""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """logout""","""controllers.Application.logout()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """profile/$id<[^/]+>""","""controllers.ProfileController.profile(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """signup""","""controllers.SignupController.signUp()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """signup/register""","""controllers.SignupController.register()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """search""","""controllers.SearchController.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """searchResult""","""controllers.SearchController.search(category:String ?= "", keywd:String ?= "")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """follow/$id<[^/]+>""","""controllers.ProfileController.follow(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """unfollow/$id<[^/]+>""","""controllers.ProfileController.unfollow(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """befriend/$id<[^/]+>""","""controllers.ProfileController.sendRequest(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """deletefriend/$id<[^/]+>""","""controllers.ProfileController.deleteFriend(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """workflow""","""controllers.WorkflowController.main()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """timeline/$offset<[^/]+>""","""controllers.TimelineController.main(offset:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """workflow/new""","""controllers.WorkflowController.createFlow()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """workflow/getPublicWorkflow""","""controllers.WorkflowController.getPublicWorkflow()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """workflow/get/$wid<[^/]+>""","""controllers.WorkflowController.workflowDetail(wid:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """workflow/update/$wid<[^/]+>""","""controllers.WorkflowController.edit(wid:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """workflow/edit/$wid<[^/]+>""","""controllers.WorkflowController.editFlow(wid:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """workflow/addComment/$wid<[^/]+>""","""controllers.WorkflowController.addComment(wid:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """workflow/addReply/$toUserId<[^/]+>/$commentId<[^/]+>/$wid<[^/]+>""","""controllers.WorkflowController.addReply(toUserId:Long, commentId:Long, wid:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """workflow/thumbUp/$commentId<[^/]+>/$wid<[^/]+>""","""controllers.WorkflowController.thumbUp(commentId:Long, wid:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """workflow/thumbDown/$commentId<[^/]+>/$wid<[^/]+>""","""controllers.WorkflowController.thumbDown(commentId:Long, wid:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """workflow/delete/$wid<[^/]+>""","""controllers.WorkflowController.deleteWorkflow(wid:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """workflow/tags/add/wf/$wid<[^/]+>/tag/$tg<[^/]+>""","""controllers.WorkflowController.addTag(wid:Long, tg:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """workflow/tags/delete/wf/$wid<[^/]+>/tag/$tg<[^/]+>""","""controllers.WorkflowController.deleteTag(wid:Long, tg:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """workflow/import""","""controllers.WorkflowController.parseXML(wid:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """group/create""","""controllers.GroupController.create()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """group/creategroup""","""controllers.GroupController.createGroup()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """group/join""","""controllers.GroupController.join()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """group/joingroup""","""controllers.GroupController.joinGroup()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """notifications""","""controllers.NotificationController.main()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """friends/accept/$id<[^/]+>""","""controllers.NotificationController.accpetFriend(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """friends/reject/$id<[^/]+>""","""controllers.NotificationController.rejectFriend(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """mail/sendmail""","""controllers.NotificationController.sendMessage()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """mail/detail/$id<[^/]+>""","""controllers.NotificationController.pmdetailpage(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """notifications/count""","""controllers.NotificationController.getNotifications()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """suggestion/addSuggestion/$wid<[^/]+>""","""controllers.WorkflowController.addSuggestion(wid:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """suggestion/addSuggestionTag/$suggestionID<[^/]+>""","""controllers.WorkflowController.addSuggestionTag(suggestionID:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """suggestion/voteToSuggestion/$suggestionID<[^/]+>""","""controllers.WorkflowController.voteToSuggestion(suggestionID:Long)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_ClimateServiceController_home0(params) => {
   call(params.fromQuery[String]("email", Some(null)), params.fromQuery[String]("vfile", Some(null)), params.fromQuery[String]("dataset", Some(null))) { (email, vfile, dataset) =>
        invokeHandler(controllers.ClimateServiceController.home(email, vfile, dataset), HandlerDef(this, "controllers.ClimateServiceController", "home", Seq(classOf[String], classOf[String], classOf[String]),"GET", """ Home page""", Routes.prefix + """climatehome"""))
   }
}
        

// @LINE:11
case controllers_BugReportController_reports1(params) => {
   call { 
        invokeHandler(controllers.BugReportController.reports(), HandlerDef(this, "controllers.BugReportController", "reports", Nil,"GET", """ BugReporting""", Routes.prefix + """bugs"""))
   }
}
        

// @LINE:12
case controllers_BugReportController_newReport2(params) => {
   call { 
        invokeHandler(controllers.BugReportController.newReport(), HandlerDef(this, "controllers.BugReportController", "newReport", Nil,"GET", """""", Routes.prefix + """newReport"""))
   }
}
        

// @LINE:13
case controllers_BugReportController_list3(params) => {
   call { 
        invokeHandler(controllers.BugReportController.list(), HandlerDef(this, "controllers.BugReportController", "list", Nil,"GET", """""", Routes.prefix + """bug/list"""))
   }
}
        

// @LINE:14
case controllers_BugReportController_deleteReport4(params) => {
   call { 
        invokeHandler(controllers.BugReportController.deleteReport(), HandlerDef(this, "controllers.BugReportController", "deleteReport", Nil,"POST", """""", Routes.prefix + """delete/report"""))
   }
}
        

// @LINE:15
case controllers_BugReportController_solveReport5(params) => {
   call { 
        invokeHandler(controllers.BugReportController.solveReport(), HandlerDef(this, "controllers.BugReportController", "solveReport", Nil,"POST", """""", Routes.prefix + """solve/report"""))
   }
}
        

// @LINE:18
case controllers_AboutusController_aboutUs6(params) => {
   call { 
        invokeHandler(controllers.AboutusController.aboutUs(), HandlerDef(this, "controllers.AboutusController", "aboutUs", Nil,"GET", """ About Us""", Routes.prefix + """aboutus"""))
   }
}
        

// @LINE:19
case controllers_AboutusController_aboutProject7(params) => {
   call { 
        invokeHandler(controllers.AboutusController.aboutProject(), HandlerDef(this, "controllers.AboutusController", "aboutProject", Nil,"GET", """""", Routes.prefix + """aboutProject"""))
   }
}
        

// @LINE:22
case controllers_ClimateServiceController_home8(params) => {
   call(params.fromQuery[String]("email", Some(null)), params.fromQuery[String]("vfile", Some(null)), params.fromQuery[String]("dataset", Some(null))) { (email, vfile, dataset) =>
        invokeHandler(controllers.ClimateServiceController.home(email, vfile, dataset), HandlerDef(this, "controllers.ClimateServiceController", "home", Seq(classOf[String], classOf[String], classOf[String]),"GET", """ Climate Model""", Routes.prefix + """climate"""))
   }
}
        

// @LINE:23
case controllers_ClimateServiceController_tutorial9(params) => {
   call { 
        invokeHandler(controllers.ClimateServiceController.tutorial(), HandlerDef(this, "controllers.ClimateServiceController", "tutorial", Nil,"GET", """""", Routes.prefix + """climate/tutorial"""))
   }
}
        

// @LINE:24
case controllers_ClimateServiceController_climateServices10(params) => {
   call { 
        invokeHandler(controllers.ClimateServiceController.climateServices(), HandlerDef(this, "controllers.ClimateServiceController", "climateServices", Nil,"GET", """""", Routes.prefix + """climate/climateServices"""))
   }
}
        

// @LINE:25
case controllers_ClimateServiceController_mostRecentlyAddedClimateServices11(params) => {
   call { 
        invokeHandler(controllers.ClimateServiceController.mostRecentlyAddedClimateServices(), HandlerDef(this, "controllers.ClimateServiceController", "mostRecentlyAddedClimateServices", Nil,"GET", """""", Routes.prefix + """climate/mostRecentlyAddedClimateServices"""))
   }
}
        

// @LINE:26
case controllers_ClimateServiceController_mostRecentlyUsedClimateServices12(params) => {
   call { 
        invokeHandler(controllers.ClimateServiceController.mostRecentlyUsedClimateServices(), HandlerDef(this, "controllers.ClimateServiceController", "mostRecentlyUsedClimateServices", Nil,"GET", """""", Routes.prefix + """climate/mostRecentlyUsedClimateServices"""))
   }
}
        

// @LINE:27
case controllers_ClimateServiceController_mostPopularClimateServices13(params) => {
   call { 
        invokeHandler(controllers.ClimateServiceController.mostPopularClimateServices(), HandlerDef(this, "controllers.ClimateServiceController", "mostPopularClimateServices", Nil,"GET", """""", Routes.prefix + """climate/mostPopularClimateServices"""))
   }
}
        

// @LINE:28
case controllers_ClimateServiceController_newClimateService14(params) => {
   call { 
        invokeHandler(controllers.ClimateServiceController.newClimateService(), HandlerDef(this, "controllers.ClimateServiceController", "newClimateService", Nil,"POST", """""", Routes.prefix + """climate/new/climateServices"""))
   }
}
        

// @LINE:29
case controllers_ClimateServiceController_deleteClimateService15(params) => {
   call { 
        invokeHandler(controllers.ClimateServiceController.deleteClimateService(), HandlerDef(this, "controllers.ClimateServiceController", "deleteClimateService", Nil,"POST", """""", Routes.prefix + """climate/delete/climateServices"""))
   }
}
        

// @LINE:30
case controllers_ClimateServiceController_downloadClimateService16(params) => {
   call { 
        invokeHandler(controllers.ClimateServiceController.downloadClimateService(), HandlerDef(this, "controllers.ClimateServiceController", "downloadClimateService", Nil,"POST", """""", Routes.prefix + """climate/download/climateServices"""))
   }
}
        

// @LINE:31
case controllers_ClimateServiceController_editClimateService17(params) => {
   call { 
        invokeHandler(controllers.ClimateServiceController.editClimateService(), HandlerDef(this, "controllers.ClimateServiceController", "editClimateService", Nil,"POST", """""", Routes.prefix + """climate/edit/climateServices"""))
   }
}
        

// @LINE:32
case controllers_ClimateServiceController_addClimateServices18(params) => {
   call { 
        invokeHandler(controllers.ClimateServiceController.addClimateServices(), HandlerDef(this, "controllers.ClimateServiceController", "addClimateServices", Nil,"GET", """""", Routes.prefix + """climate/new/climateServices"""))
   }
}
        

// @LINE:33
case controllers_ClimateServiceController_oneService19(params) => {
   call(params.fromQuery[String]("url", Some(null))) { (url) =>
        invokeHandler(controllers.ClimateServiceController.oneService(url), HandlerDef(this, "controllers.ClimateServiceController", "oneService", Seq(classOf[String]),"GET", """""", Routes.prefix + """climate/oneService"""))
   }
}
        

// @LINE:35
case controllers_DatasetController_datasetList20(params) => {
   call { 
        invokeHandler(controllers.DatasetController.datasetList(), HandlerDef(this, "controllers.DatasetController", "datasetList", Nil,"GET", """Keyword search""", Routes.prefix + """climate/datasets"""))
   }
}
        

// @LINE:36
case controllers_DatasetController_searchDataset21(params) => {
   call { 
        invokeHandler(controllers.DatasetController.searchDataset(), HandlerDef(this, "controllers.DatasetController", "searchDataset", Nil,"GET", """""", Routes.prefix + """climate/searchDataSet"""))
   }
}
        

// @LINE:37
case controllers_DatasetController_getSearchResult22(params) => {
   call { 
        invokeHandler(controllers.DatasetController.getSearchResult(), HandlerDef(this, "controllers.DatasetController", "getSearchResult", Nil,"GET", """""", Routes.prefix + """climate/getSearchResult"""))
   }
}
        

// @LINE:40
case controllers_Assets_at23(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        

// @LINE:45
case controllers_Application_home24(params) => {
   call { 
        invokeHandler(controllers.Application.home(), HandlerDef(this, "controllers.Application", "home", Nil,"GET", """""", Routes.prefix + """"""))
   }
}
        

// @LINE:46
case controllers_Application_home25(params) => {
   call { 
        invokeHandler(controllers.Application.home(), HandlerDef(this, "controllers.Application", "home", Nil,"GET", """""", Routes.prefix + """home"""))
   }
}
        

// @LINE:47
case controllers_Application_login26(params) => {
   call { 
        invokeHandler(controllers.Application.login(), HandlerDef(this, "controllers.Application", "login", Nil,"GET", """""", Routes.prefix + """login"""))
   }
}
        

// @LINE:48
case controllers_Application_authenticate27(params) => {
   call { 
        invokeHandler(controllers.Application.authenticate(), HandlerDef(this, "controllers.Application", "authenticate", Nil,"POST", """""", Routes.prefix + """login"""))
   }
}
        

// @LINE:49
case controllers_Application_index28(params) => {
   call { 
        invokeHandler(controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Nil,"GET", """""", Routes.prefix + """index"""))
   }
}
        

// @LINE:50
case controllers_Application_logout29(params) => {
   call { 
        invokeHandler(controllers.Application.logout(), HandlerDef(this, "controllers.Application", "logout", Nil,"GET", """""", Routes.prefix + """logout"""))
   }
}
        

// @LINE:51
case controllers_ProfileController_profile30(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.ProfileController.profile(id), HandlerDef(this, "controllers.ProfileController", "profile", Seq(classOf[Long]),"GET", """""", Routes.prefix + """profile/$id<[^/]+>"""))
   }
}
        

// @LINE:52
case controllers_SignupController_signUp31(params) => {
   call { 
        invokeHandler(controllers.SignupController.signUp(), HandlerDef(this, "controllers.SignupController", "signUp", Nil,"GET", """""", Routes.prefix + """signup"""))
   }
}
        

// @LINE:53
case controllers_SignupController_register32(params) => {
   call { 
        invokeHandler(controllers.SignupController.register(), HandlerDef(this, "controllers.SignupController", "register", Nil,"POST", """""", Routes.prefix + """signup/register"""))
   }
}
        

// @LINE:54
case controllers_SearchController_index33(params) => {
   call { 
        invokeHandler(controllers.SearchController.index(), HandlerDef(this, "controllers.SearchController", "index", Nil,"GET", """""", Routes.prefix + """search"""))
   }
}
        

// @LINE:55
case controllers_SearchController_search34(params) => {
   call(params.fromQuery[String]("category", Some("")), params.fromQuery[String]("keywd", Some(""))) { (category, keywd) =>
        invokeHandler(controllers.SearchController.search(category, keywd), HandlerDef(this, "controllers.SearchController", "search", Seq(classOf[String], classOf[String]),"GET", """""", Routes.prefix + """searchResult"""))
   }
}
        

// @LINE:56
case controllers_ProfileController_follow35(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.ProfileController.follow(id), HandlerDef(this, "controllers.ProfileController", "follow", Seq(classOf[Long]),"GET", """""", Routes.prefix + """follow/$id<[^/]+>"""))
   }
}
        

// @LINE:57
case controllers_ProfileController_unfollow36(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.ProfileController.unfollow(id), HandlerDef(this, "controllers.ProfileController", "unfollow", Seq(classOf[Long]),"GET", """""", Routes.prefix + """unfollow/$id<[^/]+>"""))
   }
}
        

// @LINE:58
case controllers_ProfileController_sendRequest37(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.ProfileController.sendRequest(id), HandlerDef(this, "controllers.ProfileController", "sendRequest", Seq(classOf[Long]),"GET", """""", Routes.prefix + """befriend/$id<[^/]+>"""))
   }
}
        

// @LINE:59
case controllers_ProfileController_deleteFriend38(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.ProfileController.deleteFriend(id), HandlerDef(this, "controllers.ProfileController", "deleteFriend", Seq(classOf[Long]),"GET", """""", Routes.prefix + """deletefriend/$id<[^/]+>"""))
   }
}
        

// @LINE:63
case controllers_WorkflowController_main39(params) => {
   call { 
        invokeHandler(controllers.WorkflowController.main(), HandlerDef(this, "controllers.WorkflowController", "main", Nil,"GET", """ display and show work flow""", Routes.prefix + """workflow"""))
   }
}
        

// @LINE:64
case controllers_TimelineController_main40(params) => {
   call(params.fromPath[Long]("offset", None)) { (offset) =>
        invokeHandler(controllers.TimelineController.main(offset), HandlerDef(this, "controllers.TimelineController", "main", Seq(classOf[Long]),"GET", """""", Routes.prefix + """timeline/$offset<[^/]+>"""))
   }
}
        

// @LINE:65
case controllers_WorkflowController_createFlow41(params) => {
   call { 
        invokeHandler(controllers.WorkflowController.createFlow(), HandlerDef(this, "controllers.WorkflowController", "createFlow", Nil,"POST", """""", Routes.prefix + """workflow/new"""))
   }
}
        

// @LINE:66
case controllers_WorkflowController_getPublicWorkflow42(params) => {
   call { 
        invokeHandler(controllers.WorkflowController.getPublicWorkflow(), HandlerDef(this, "controllers.WorkflowController", "getPublicWorkflow", Nil,"GET", """""", Routes.prefix + """workflow/getPublicWorkflow"""))
   }
}
        

// @LINE:67
case controllers_WorkflowController_workflowDetail43(params) => {
   call(params.fromPath[Long]("wid", None)) { (wid) =>
        invokeHandler(controllers.WorkflowController.workflowDetail(wid), HandlerDef(this, "controllers.WorkflowController", "workflowDetail", Seq(classOf[Long]),"GET", """""", Routes.prefix + """workflow/get/$wid<[^/]+>"""))
   }
}
        

// @LINE:68
case controllers_WorkflowController_edit44(params) => {
   call(params.fromPath[Long]("wid", None)) { (wid) =>
        invokeHandler(controllers.WorkflowController.edit(wid), HandlerDef(this, "controllers.WorkflowController", "edit", Seq(classOf[Long]),"GET", """""", Routes.prefix + """workflow/update/$wid<[^/]+>"""))
   }
}
        

// @LINE:69
case controllers_WorkflowController_editFlow45(params) => {
   call(params.fromPath[Long]("wid", None)) { (wid) =>
        invokeHandler(controllers.WorkflowController.editFlow(wid), HandlerDef(this, "controllers.WorkflowController", "editFlow", Seq(classOf[Long]),"POST", """""", Routes.prefix + """workflow/edit/$wid<[^/]+>"""))
   }
}
        

// @LINE:70
case controllers_WorkflowController_addComment46(params) => {
   call(params.fromPath[Long]("wid", None)) { (wid) =>
        invokeHandler(controllers.WorkflowController.addComment(wid), HandlerDef(this, "controllers.WorkflowController", "addComment", Seq(classOf[Long]),"POST", """""", Routes.prefix + """workflow/addComment/$wid<[^/]+>"""))
   }
}
        

// @LINE:71
case controllers_WorkflowController_addReply47(params) => {
   call(params.fromPath[Long]("toUserId", None), params.fromPath[Long]("commentId", None), params.fromPath[Long]("wid", None)) { (toUserId, commentId, wid) =>
        invokeHandler(controllers.WorkflowController.addReply(toUserId, commentId, wid), HandlerDef(this, "controllers.WorkflowController", "addReply", Seq(classOf[Long], classOf[Long], classOf[Long]),"POST", """""", Routes.prefix + """workflow/addReply/$toUserId<[^/]+>/$commentId<[^/]+>/$wid<[^/]+>"""))
   }
}
        

// @LINE:72
case controllers_WorkflowController_thumbUp48(params) => {
   call(params.fromPath[Long]("commentId", None), params.fromPath[Long]("wid", None)) { (commentId, wid) =>
        invokeHandler(controllers.WorkflowController.thumbUp(commentId, wid), HandlerDef(this, "controllers.WorkflowController", "thumbUp", Seq(classOf[Long], classOf[Long]),"GET", """""", Routes.prefix + """workflow/thumbUp/$commentId<[^/]+>/$wid<[^/]+>"""))
   }
}
        

// @LINE:73
case controllers_WorkflowController_thumbDown49(params) => {
   call(params.fromPath[Long]("commentId", None), params.fromPath[Long]("wid", None)) { (commentId, wid) =>
        invokeHandler(controllers.WorkflowController.thumbDown(commentId, wid), HandlerDef(this, "controllers.WorkflowController", "thumbDown", Seq(classOf[Long], classOf[Long]),"GET", """""", Routes.prefix + """workflow/thumbDown/$commentId<[^/]+>/$wid<[^/]+>"""))
   }
}
        

// @LINE:74
case controllers_WorkflowController_deleteWorkflow50(params) => {
   call(params.fromPath[Long]("wid", None)) { (wid) =>
        invokeHandler(controllers.WorkflowController.deleteWorkflow(wid), HandlerDef(this, "controllers.WorkflowController", "deleteWorkflow", Seq(classOf[Long]),"GET", """""", Routes.prefix + """workflow/delete/$wid<[^/]+>"""))
   }
}
        

// @LINE:76
case controllers_WorkflowController_addTag51(params) => {
   call(params.fromPath[Long]("wid", None), params.fromPath[String]("tg", None)) { (wid, tg) =>
        invokeHandler(controllers.WorkflowController.addTag(wid, tg), HandlerDef(this, "controllers.WorkflowController", "addTag", Seq(classOf[Long], classOf[String]),"GET", """""", Routes.prefix + """workflow/tags/add/wf/$wid<[^/]+>/tag/$tg<[^/]+>"""))
   }
}
        

// @LINE:77
case controllers_WorkflowController_deleteTag52(params) => {
   call(params.fromPath[Long]("wid", None), params.fromPath[String]("tg", None)) { (wid, tg) =>
        invokeHandler(controllers.WorkflowController.deleteTag(wid, tg), HandlerDef(this, "controllers.WorkflowController", "deleteTag", Seq(classOf[Long], classOf[String]),"GET", """""", Routes.prefix + """workflow/tags/delete/wf/$wid<[^/]+>/tag/$tg<[^/]+>"""))
   }
}
        

// @LINE:78
case controllers_WorkflowController_parseXML53(params) => {
   call(params.fromQuery[Long]("wid", None)) { (wid) =>
        invokeHandler(controllers.WorkflowController.parseXML(wid), HandlerDef(this, "controllers.WorkflowController", "parseXML", Seq(classOf[Long]),"GET", """""", Routes.prefix + """workflow/import"""))
   }
}
        

// @LINE:82
case controllers_GroupController_create54(params) => {
   call { 
        invokeHandler(controllers.GroupController.create(), HandlerDef(this, "controllers.GroupController", "create", Nil,"GET", """ group""", Routes.prefix + """group/create"""))
   }
}
        

// @LINE:83
case controllers_GroupController_createGroup55(params) => {
   call { 
        invokeHandler(controllers.GroupController.createGroup(), HandlerDef(this, "controllers.GroupController", "createGroup", Nil,"POST", """""", Routes.prefix + """group/creategroup"""))
   }
}
        

// @LINE:84
case controllers_GroupController_join56(params) => {
   call { 
        invokeHandler(controllers.GroupController.join(), HandlerDef(this, "controllers.GroupController", "join", Nil,"GET", """""", Routes.prefix + """group/join"""))
   }
}
        

// @LINE:85
case controllers_GroupController_joinGroup57(params) => {
   call { 
        invokeHandler(controllers.GroupController.joinGroup(), HandlerDef(this, "controllers.GroupController", "joinGroup", Nil,"POST", """""", Routes.prefix + """group/joingroup"""))
   }
}
        

// @LINE:89
case controllers_NotificationController_main58(params) => {
   call { 
        invokeHandler(controllers.NotificationController.main(), HandlerDef(this, "controllers.NotificationController", "main", Nil,"GET", """ notifications""", Routes.prefix + """notifications"""))
   }
}
        

// @LINE:90
case controllers_NotificationController_accpetFriend59(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.NotificationController.accpetFriend(id), HandlerDef(this, "controllers.NotificationController", "accpetFriend", Seq(classOf[Long]),"GET", """""", Routes.prefix + """friends/accept/$id<[^/]+>"""))
   }
}
        

// @LINE:91
case controllers_NotificationController_rejectFriend60(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.NotificationController.rejectFriend(id), HandlerDef(this, "controllers.NotificationController", "rejectFriend", Seq(classOf[Long]),"GET", """""", Routes.prefix + """friends/reject/$id<[^/]+>"""))
   }
}
        

// @LINE:92
case controllers_NotificationController_sendMessage61(params) => {
   call { 
        invokeHandler(controllers.NotificationController.sendMessage(), HandlerDef(this, "controllers.NotificationController", "sendMessage", Nil,"POST", """""", Routes.prefix + """mail/sendmail"""))
   }
}
        

// @LINE:93
case controllers_NotificationController_pmdetailpage62(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.NotificationController.pmdetailpage(id), HandlerDef(this, "controllers.NotificationController", "pmdetailpage", Seq(classOf[Long]),"GET", """""", Routes.prefix + """mail/detail/$id<[^/]+>"""))
   }
}
        

// @LINE:94
case controllers_NotificationController_getNotifications63(params) => {
   call { 
        invokeHandler(controllers.NotificationController.getNotifications(), HandlerDef(this, "controllers.NotificationController", "getNotifications", Nil,"GET", """""", Routes.prefix + """notifications/count"""))
   }
}
        

// @LINE:97
case controllers_WorkflowController_addSuggestion64(params) => {
   call(params.fromPath[Long]("wid", None)) { (wid) =>
        invokeHandler(controllers.WorkflowController.addSuggestion(wid), HandlerDef(this, "controllers.WorkflowController", "addSuggestion", Seq(classOf[Long]),"POST", """ suggestion""", Routes.prefix + """suggestion/addSuggestion/$wid<[^/]+>"""))
   }
}
        

// @LINE:98
case controllers_WorkflowController_addSuggestionTag65(params) => {
   call(params.fromPath[Long]("suggestionID", None)) { (suggestionID) =>
        invokeHandler(controllers.WorkflowController.addSuggestionTag(suggestionID), HandlerDef(this, "controllers.WorkflowController", "addSuggestionTag", Seq(classOf[Long]),"POST", """""", Routes.prefix + """suggestion/addSuggestionTag/$suggestionID<[^/]+>"""))
   }
}
        

// @LINE:99
case controllers_WorkflowController_voteToSuggestion66(params) => {
   call(params.fromPath[Long]("suggestionID", None)) { (suggestionID) =>
        invokeHandler(controllers.WorkflowController.voteToSuggestion(suggestionID), HandlerDef(this, "controllers.WorkflowController", "voteToSuggestion", Seq(classOf[Long]),"GET", """""", Routes.prefix + """suggestion/voteToSuggestion/$suggestionID<[^/]+>"""))
   }
}
        
}

}
     