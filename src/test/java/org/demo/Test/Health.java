package org.demo.Test;

import com.squareup.okhttp.Response;
import org.demo.ObjectRepository.EulaPOJO;
import org.demo.RequestBuilder.EulaGETRequestBuilder;
import org.demo.RequestBuilder.HealthGETRequestBuilder;
import org.demo.SchemaValidator.CommonValidator;
import org.demo.core.GetResponseHelper;
import org.demo.core.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Health {



    @Test
    public void verifyHealth()
    {
        Logger logger = new Logger();
        HealthGETRequestBuilder health = new HealthGETRequestBuilder();
        EulaGETRequestBuilder eula = new EulaGETRequestBuilder();
        CommonValidator validator = new CommonValidator();
        GetResponseHelper responseHelper = new GetResponseHelper();



        logger.logTitle("Test : Verify Health Request with GET Type");


        Response response = health.healthGETRequest("/healthz");

        validator.statusCodeShouldBe(response,200);
        health.validateHealthGetResponse();

        if(responseHelper.getStatusCode(response) == 200) {

            Response eulaResponse = eula.eulaGETRequest("/api/v3/rest/default/eula?tenant=1kosmos");
            validator.statusCodeShouldBe(eulaResponse, 200);
            eula.validateEulaGETResponse();
        }

    }





}






