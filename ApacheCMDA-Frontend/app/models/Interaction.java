package models;

import util.APICall;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

/**
 * Created by Mandy on 4/17/16.
 */
public interface Interaction {
      JsonNode create(ObjectNode node);
}
