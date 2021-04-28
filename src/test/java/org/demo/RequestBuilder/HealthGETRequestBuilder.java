package org.demo.RequestBuilder;

import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import org.demo.ObjectRepository.HealthPOJO;
import org.demo.core.GetResponseHelper;
import org.demo.core.Logger;
import org.demo.core.Utility;
import org.testng.Assert;



//This class will contain the all the methods related to the Health Get Request

public class HealthGETRequestBuilder {

    HealthPOJO healthpojo = new HealthPOJO();
    Logger logger = new Logger();

    public Response healthGETRequest(String endPoint) {

        Utility utility = new Utility();

        logger.logStep("Full URL: " + utility.prepareFullURL(endPoint));
        GetResponseHelper responseHelper = new GetResponseHelper();
        Request request = new Request.Builder()
                .url(utility.prepareFullURL(endPoint))
                .method("GET", null)
                .build();
        logger.logStep("Request : " +request.toString()  );

        Response response = responseHelper.getResponse(request);

        logger.logStep("Response : " +response.body().toString()  );

        healthpojo.assignValue(response);

        return response;
    }

    public void validateHealthGetResponse() {

        logger.logStep("Verify Get Health Request Response " );

        Assert.assertTrue(healthpojo.getStatus().equals("all services operational"));
        Assert.assertTrue(healthpojo.getCode().equals("200"));
        Assert.assertTrue(healthpojo.getVersion().equals("HotFix_ENGG1K-2365.c7b62efa71adaa4921e46f2e9a6f1d2475b426cd.1619512370819r"));
    }


}
