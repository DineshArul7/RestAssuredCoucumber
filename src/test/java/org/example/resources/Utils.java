package org.example.resources;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.io.*;
import java.util.Properties;

public class Utils {
    public static RequestSpecification reqspec;
    JsonPath jsonPath;
    public RequestSpecification requestSpecifications() throws IOException {
if(reqspec == null) {
    PrintStream log = new PrintStream(new FileOutputStream("logging.txt"));
    reqspec = new RequestSpecBuilder().setBaseUri(getGlobalValue("baseURI")).
            addQueryParam(getGlobalValue("key"), getGlobalValue("value")).setContentType(ContentType.JSON)
            .addFilter(RequestLoggingFilter.logRequestTo(log))
            .addFilter(ResponseLoggingFilter.logResponseTo(log))
            .build();
    return reqspec;
}
return reqspec;
    }

        public JsonPath stringToJsonPath(String response)
        {
            return new JsonPath(response);
        }
        public String getGlobalValue(String key) throws IOException {
            Properties prop=new Properties();
            FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"/src/test/java/org/example/resources/global.properties");
            prop.load(file);
            return prop.getProperty(key);
        }
        public String getJsonValue(Response response, String path){
            jsonPath=stringToJsonPath(response.asString());
            return jsonPath.get(path).toString();
        }
}
