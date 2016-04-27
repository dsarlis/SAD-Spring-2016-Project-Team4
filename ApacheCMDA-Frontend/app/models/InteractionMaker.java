package models;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

/**
 * Created by Mandy on 4/17/16.
 */
public class InteractionMaker {
    private Interaction comment;
    private Interaction suggestion;
    private Interaction reply;
    ObjectNode node;

    public InteractionMaker(ObjectNode node) {
        comment=new Comment();
        suggestion=new Suggestion();
        reply=new Reply();
        this.node = node;
    }

    public JsonNode createComment(){
        return comment.create(node);
    }

    public JsonNode createSuggestion(){
        return suggestion.create(node);
    }

    public JsonNode createReply(){return reply.create(node);}
}
