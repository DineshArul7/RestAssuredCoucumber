package org.example.resources;

import io.restassured.path.json.JsonPath;

public class commonmethods {

    public JsonPath stringToJsonPath(String response){
        return new JsonPath(response);
    }
}
