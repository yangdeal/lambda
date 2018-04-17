package org.yangdeal;

import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.Context;

public class Hello implements RequestHandler<Request, Response> {

    @Override
    public Response handleRequest(Request request, Context context) {
        return new Response();
    }
}