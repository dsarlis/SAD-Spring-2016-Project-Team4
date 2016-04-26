package util;

import com.fasterxml.jackson.databind.JsonNode;

public interface IAPICall {
    JsonNode callAPI(String queryApi);
    JsonNode postAPI(String queryApi, JsonNode jnode);
    JsonNode putAPI(String queryApi, JsonNode jnode);
    JsonNode deleteAPI(String queryApi);
    JsonNode createResponse(APICall.ResponseType type);
}
