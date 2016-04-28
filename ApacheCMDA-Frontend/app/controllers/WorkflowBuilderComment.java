package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import models.Comment;
import models.Reply;
import models.Suggestion;
import util.APICall;
import util.APICallAdapter;
import util.Constants;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Na on 4/22/16.
 */
public class WorkflowBuilderComment implements WorkflowBuilderInterface{
    private static final APICallAdapter adapter = APICallAdapter.getAPICallAdapter();

    @Override
    public List<Suggestion> getSuggestion(Long wid) {
        List<Suggestion> suggestionList = new ArrayList<>();
        return suggestionList;
    }

    @Override
    public List<Comment> getComment(Long wid) {
        List<Comment> commentRes = new ArrayList<>();
        JsonNode commentNode = adapter.callAPI(Constants.NEW_BACKEND
                + "workflow/getComments/" + wid.toString());

        for (int i = 0; i < commentNode.size(); i++) {
            JsonNode node = commentNode.get(i);
            Comment comment = new Comment(node);
            commentRes.add(comment);
        }

        return commentRes;
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




    public static List<Comment> getWorkflowComment(Long wid) {
        List<Comment> commentRes = new ArrayList<>();
        JsonNode commentNode = adapter.callAPI(Constants.NEW_BACKEND + "workflow/getComments/" + wid.toString());

        for (int i = 0; i < commentNode.size(); i++) {
            JsonNode node = commentNode.get(i);
            Comment comment = new Comment(node);
            commentRes.add(comment);
        }

        return commentRes;
    }

    public static List<List<Reply>> getWorkflowReply(Long wid) {
        List<Comment> commentRes = new ArrayList<>();
        JsonNode commentList = adapter.callAPI(Constants.NEW_BACKEND + "workflow/getComments/" + wid.toString());
        List<List<Reply>> replyRes = new ArrayList<>();

        for (int i = 0; i < commentList.size(); i++) {
            JsonNode node = commentList.get(i);
            Comment comment = new Comment(node);
            commentRes.add(comment);
            Long commentId = comment.getId();
            JsonNode replyList = adapter.callAPI(Constants.NEW_BACKEND + "Comment/getReply/" + commentId.toString());
            List<Reply> listReply = new ArrayList<>();
            for (int j = 0; j < replyList.size(); j++) {
                JsonNode rNode = replyList.get(j);
                Reply reply = new Reply(rNode);
                listReply.add(reply);
            }
            replyRes.add(listReply);
        }

        return replyRes;
    }
}
