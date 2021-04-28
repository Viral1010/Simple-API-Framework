package org.demo.ObjectRepository;

import com.squareup.okhttp.Response;
import org.demo.SchemaValidator.CommonValidator;
import org.json.simple.JSONObject;

public class HealthPOJO {


    String status;
    String code;
    String version;

    public String getMahesh() {
        return mahesh;
    }

    public void setMahesh(String mahesh) {
        this.mahesh = mahesh;
    }

    String mahesh;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void assignValue(Response response)
    {
        CommonValidator validator = new CommonValidator();
        JSONObject object =  validator.getBodyJsonObject(response);
        setStatus(object.get("status").toString());
        setCode(object.get("code").toString());
        setVersion(object.get("version").toString());

    }



}
