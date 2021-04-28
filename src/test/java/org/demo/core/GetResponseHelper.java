package org.demo.core;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import java.io.IOException;

public class GetResponseHelper {

    public Response getResponse(Request request)  {

        OkHttpClient client = new OkHttpClient();
        Response response = null;
       try{
           response = client.newCall(request).execute();
       }catch (Exception e)
       {
           System.err.println("Facing issue to Call the Request");
       }
        return response;

    }

    public int getStatusCode(Response response) {
        return response.code();
    }














}
