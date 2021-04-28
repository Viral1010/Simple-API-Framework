package org.demo.ObjectRepository;

import com.squareup.okhttp.Response;
import org.demo.SchemaValidator.CommonValidator;
import org.json.simple.JSONObject;

public class EulaPOJO {


    String eula_b64;

    public String getEula_b64() {
        return eula_b64;
    }

    public void setEula_b64(String eula_b64) {
        this.eula_b64 = eula_b64;
    }

    public void assignValue(Response response)
    {
        CommonValidator validator = new CommonValidator();
        JSONObject object =  validator.getBodyJsonObject(response);

        setEula_b64(object.get("eula_b64").toString());
    }




}
