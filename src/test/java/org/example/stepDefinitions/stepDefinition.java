package org.example.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.filter.session.SessionFilter;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.example.resources.APIResources;
import org.example.resources.TestDataBuild;
import org.example.resources.Utils;
import org.example.resources.body;

import java.io.FileNotFoundException;
import java.io.IOException;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class stepDefinition extends Utils {
    org.example.resources.body Body=new body();
    TestDataBuild data=new TestDataBuild();
    String basepath;
    String body;
    String placekey="place_id";
    static String place_id;
    String method;
    String sampleresponse;
    JsonPath jsonPath;
    SessionFilter session=new SessionFilter();
    RequestSpecification reqspecc;
    Response response;



    @Given("Add place Payload with {string} {string} {string}")
    public void add_place_payload_with(String name, String address, String language) throws IOException {

        method="post";
        body=Body.getaddplacebody();
        sampleresponse=Body.getaddplacesampleresponse();

        //RestAssured code
        /*
        given - all input fields go here
        when - http method and endpoint/basepath go here
        then - assertion and response go here
         */

        reqspecc=given().spec(requestSpecifications())
                .body(data.addPlacePayload(name,address,language));
        //RestAssured.baseURI=BaseURI;


    }
    @When("user calls {string} with {string} http request")
    public void user_calls_with_http_request(String resource, String method) {
        APIResources resourceAPI=APIResources.valueOf(resource);
         basepath=resourceAPI.getResource();
         switch (method){
             case "POST":
                 response=reqspecc.when().post(basepath);break;
             case "GET":
                 response=reqspecc.when().get(basepath);break;
             case "DELETE":
                 response=reqspecc.when().post(basepath);break;
             case "PUT":
                 response=reqspecc.when().put(basepath);break;
             default:
                 System.out.println("Please input valid method type");
         }

    }
    @Then("the API call got success with status code {int}")
    public void the_api_call_got_success_with_status_code(Integer statuscode) {
        // Write code here that turns the phrase above into concrete actions
        assertEquals(response.getStatusCode(), statuscode);
    }
    @Then("{string} in response body is {string}")
    public void in_response_body_is(String key, String value) {
        assertEquals(getJsonValue(response,key),value);
    }
    @Then("Verify place_Id created maps to {string} using {string}")
    public void verify_place_id_created_maps_to_using(String namevalue, String resource) throws IOException {
        // Write code here that turns the phrase above into concrete actions
        place_id= getJsonValue(response,"place_id");
        reqspecc=given().spec(requestSpecifications()).queryParam("place_id",place_id);
        user_calls_with_http_request(resource,"GET");
        assertEquals(getJsonValue(response,"name"),namevalue);
    }
    @Given("DeletePlace Payload build")
    public void delete_place_payload_build() throws IOException {
        reqspecc=given().spec(requestSpecifications()).body(data.deletePlaceBody(place_id));

    }

}
