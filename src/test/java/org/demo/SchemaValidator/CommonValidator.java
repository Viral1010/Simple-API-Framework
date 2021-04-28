package org.demo.SchemaValidator;

import com.squareup.okhttp.Response;
import org.demo.core.Logger;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.Assert;

import java.io.IOException;

public class CommonValidator {

Logger logger = new Logger();
    public void statusCodeShouldBe(Response response, int expectedStatusCode) {

        logger.logStep("Validate status code should be" + expectedStatusCode);
        Assert.assertTrue(response.code() == expectedStatusCode);
    }




    public JSONObject getBodyJsonObject(Response response) {

        JSONObject object = null;
        try {
            object = (JSONObject) new JSONParser().parse(response.body().string());
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return object;
    }


}
