package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import models.Suggestion;
import models.Comment;
import util.APICall;
import util.Constants;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Na on 4/22/16.
 */
public interface WorkflowBuilderInterface {

    List<Suggestion> getSuggestion(Long wid);

    List<Comment> getComment(Long wid);
}
