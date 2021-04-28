package org.demo.core;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;

public class Utility {

    public JSONObject getConfig() {

        JSONParser jsonParser = new JSONParser();
        Object obj = null;
        try {
            FileReader reader = new FileReader("src/test/resources/Config/config.json");
            obj = jsonParser.parse(reader);
        } catch (Exception e) {
            System.err.println("Failed to read config file, Please try adjusting the Config file Path");
        }
        return (JSONObject) obj;
    }

    public String getBaseURL()
    {
        JSONObject config = getConfig();
        return  config.get("baseURl").toString();
    }



    public String prepareFullURL(String endpoint)
    {
        return getBaseURL()+endpoint;
    }







}
