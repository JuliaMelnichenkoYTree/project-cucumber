package test.scenarios;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(glue = "steps", features = {"src/test/resources/features"})
public class TestRunner extends AbstractTestNGCucumberTests {

}
