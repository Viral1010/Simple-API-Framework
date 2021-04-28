package org.demo.RequestBuilder;

import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import org.demo.ObjectRepository.EulaPOJO;
import org.demo.core.GetResponseHelper;
import org.demo.core.Logger;
import org.demo.core.Utility;
import org.testng.Assert;

public class EulaGETRequestBuilder {


    EulaPOJO eulaPojo = new EulaPOJO();
    Logger logger = new Logger();

    public Response eulaGETRequest(String endPoint)
    {
        Utility utility = new Utility();
        logger.logStep("Full URL: " + utility.prepareFullURL(endPoint));

        GetResponseHelper responseHelper = new GetResponseHelper();
        Request request = new Request.Builder()
                .url(utility.prepareFullURL(endPoint))
                .method("GET", null)
                .build();
        logger.logStep("Request : " +request.toString()  );

        Response response = responseHelper.getResponse(request);
        eulaPojo.assignValue(response);
        logger.logStep("Response : " +response.body()  );


        return response;
    }

    public void validateEulaGETResponse()
    {
        logger.logStep("Verify Get Health Request Response " );
        Assert.assertTrue(!eulaPojo.getEula_b64().equals(null));
    }

}
