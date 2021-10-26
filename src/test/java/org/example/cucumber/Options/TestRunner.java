package org.example.cucumber.Options;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/org/example/features", glue = {"org/example/stepDefinitions"}
                    ,dryRun = false,plugin ={ "html:target/site/cucumber-pretty.html","json:target/jsonReports/cucumber-report.json"})
public class TestRunner {

//tags = "@DeletePlace"
}
