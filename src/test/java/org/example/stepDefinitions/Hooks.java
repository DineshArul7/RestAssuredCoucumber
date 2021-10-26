package org.example.stepDefinitions;

import io.cucumber.java.Before;

import java.io.IOException;

public class Hooks {

    @Before("@DeletePlace")
    public void beforeDeleteScenario() throws IOException {
        stepDefinition step=new stepDefinition();
        if(stepDefinition.place_id==null){
            step.add_place_payload_with("Dinesh Karthick","Chandrataal","Hindi");
            step.user_calls_with_http_request("AddPlaceAPI","POST");
            step.verify_place_id_created_maps_to_using("Dinesh Karthick","getPlaceAPI");
        }
    }
}
