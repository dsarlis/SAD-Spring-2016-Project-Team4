package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import models.User;
import models.Workflow;
import play.mvc.Controller;
import play.mvc.Result;
import util.APICallAdapter;
import util.Constants;
import views.html.search;

import java.util.ArrayList;

public class SearchController extends Controller{
    private static final APICallAdapter adapter = APICallAdapter.getAPICallAdapter();

    public static boolean notpass() {
        if (session("id") == null) {
            return true;
        }
        return false;
    }

    public static Result index() {
        if (notpass()) return redirect(routes.Application.login());
        return ok(search.render(session("username"), session("id"), null, null, null));
    }

    public static Result search(String category, String keywd) {
        if (notpass()) return redirect(routes.Application.login());
        String path = null;
        ArrayList<User> userArr = new ArrayList<User>();

        switch (category) {
            case "user":
                path = "users";
                JsonNode response = adapter.callAPI(Constants.NEW_BACKEND + path + "/search/" + keywd + "/json");
                if (response == null || response.has("error")) {
                    flash("error", response.get("error").textValue());
                    return ok(search.render(session("username"), session("id"), null, null, null));
                }
                for (JsonNode n: response) {
                    User obj = new User();
                    obj.setUserName(n.get("userName").textValue());
                    try {
                        obj.setEmail(n.get("email").textValue());
                    } catch (Exception e){
                        obj.setEmail("");
                    }
                    obj.setUserName(n.get("userName").textValue()); obj.setId(Long.parseLong(n.get("id").toString()));
                    obj.setAvatar(n.get("avatar").textValue());

                    userArr.add(obj);
                }
                return ok(search.render(session("username"), session("id"), category, userArr, null));
            case "tag":
                ArrayList<Workflow> wfArr = new ArrayList<Workflow>();
                JsonNode wfresponse = adapter.callAPI(Constants.NEW_BACKEND + "workflow/getByTag/tag/" + keywd);
                for (JsonNode n: wfresponse) {
                    Workflow wf = new Workflow(n);
                    wfArr.add(wf);
                }
                return ok(search.render(session("username"), session("id"), category, null, wfArr));
            case "workflow":
                ArrayList<Workflow> wfArrt = new ArrayList<Workflow>();
                JsonNode wfresponset = adapter.callAPI(Constants.NEW_BACKEND + "workflow/getByTitle/title/" + keywd);
                for (JsonNode n: wfresponset) {
                    Workflow wf = new Workflow(n);
                    wfArrt.add(wf);
                }
                return ok(search.render(session("username"), session("id"), category, null, wfArrt));
        }

        return ok(search.render(session("username"), session("id"), category, null, null));
    }
}
