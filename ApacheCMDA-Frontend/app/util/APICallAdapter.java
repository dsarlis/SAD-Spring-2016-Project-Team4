package util;

import com.fasterxml.jackson.databind.JsonNode;

public class APICallAdapter implements IAPICall {
    private static APICallAdapter adapter;
    private static IAPICall apiCall = APICall.getAPICall();

    private APICallAdapter() {}

    public static APICallAdapter getAPICallAdapter() {
        if (adapter == null) {
            adapter = new APICallAdapter();
        }
        return adapter;
    }

    @Override
    public JsonNode callAPI(String queryApi) {
        System.out.println("Adapter called to handle get request");
        return apiCall.callAPI(queryApi);
    }

    @Override
    public JsonNode postAPI(String queryApi, JsonNode jnode) {
        System.out.println("Adapter called to handle post request");
        return apiCall.postAPI(queryApi, jnode);
    }

    @Override
    public JsonNode putAPI(String queryApi, JsonNode jnode) {
        System.out.println("Adapter called to handle put request");
        return apiCall.putAPI(queryApi, jnode);
    }

    @Override
    public JsonNode deleteAPI(String queryApi) {
        System.out.println("Adapter called to handle delete request");
        return apiCall.deleteAPI(queryApi);
    }

    @Override
    public JsonNode createResponse(APICall.ResponseType type) {
        System.out.println("Adapter called to create response");
        return apiCall.createResponse(type);
    }
}
