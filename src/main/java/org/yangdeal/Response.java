package org.yangdeal;

import java.util.HashMap;
import java.util.Map;

public class Response {
    boolean isBase64Encoded = false;
    int statusCode = 200;
    String body = "test";
    Map<String, String> headers = new HashMap<>();

    public boolean isBase64Encoded() {
        return isBase64Encoded;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public String getBody() {
        return body;
    }

    public Map<String, String> getHeaders() {
        return headers;
    }
}
