package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import models.Comment;
import models.Suggestion;
import util.APICall;
import util.APICallAdapter;
import util.Constants;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Na on 4/22/16.
 */
public class WorkflowBuilderSuggestion implements WorkflowBuilderInterface {
    private static final APICallAdapter adapter = APICallAdapter.getAPICallAdapter();

    @Override
    public List<Suggestion> getSuggestion(Long wid) {
        JsonNode suggetionNode = adapter.callAPI(Constants.NEW_BACKEND
                + "suggestion/getSuggestionForWorkflow/" + wid.toString());
        List<Suggestion> suggestionList = new ArrayList<>();
        for (JsonNode n: suggetionNode) {
            Suggestion cur = new Suggestion(n);
            suggestionList.add(cur);
        }

        return suggestionList;
    }

    @Override
    public List<Comment> getComment(Long wid) {
        return null;
    }


    public static List<Suggestion> getWorkflowSuggestion(Long wid) {
        JsonNode suggetionNode = adapter.callAPI(Constants.NEW_BACKEND + "suggestion/getSuggestionForWorkflow/" + wid.toString());
        List<Suggestion> suggestionList = new ArrayList<>();
        for (JsonNode n: suggetionNode) {
            Suggestion cur = new Suggestion(n);
            suggestionList.add(cur);
        }

        return suggestionList;
    }



}
