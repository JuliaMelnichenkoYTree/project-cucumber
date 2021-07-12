import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        glue = {"steps"},
        features = {"src/test/resources/features"},
        plugin = {
                "pretty",
                "summary",
                "html:build/cucumber-reports/cucumber-pretty",
                "json:build/cucumber-reports/CucumberTestReport.json",
                "rerun:build/cucumber-reports/rerun.txt"})
public class TestRunner extends AbstractTestNGCucumberTests {

}
