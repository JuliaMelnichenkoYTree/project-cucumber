package test.scenarios;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.FeatureWrapper;
import io.cucumber.testng.PickleWrapper;
import org.testng.annotations.Test;
import test.common.BaseTest;

@CucumberOptions(
        glue = {"com.github.test"},
        plugin = {
                "pretty",
                "summary",
                "html:build/cucumber-reports/cucumber-pretty",
                "json:build/cucumber-reports/CucumberTestReport.json",
                "rerun:build/cucumber-reports/rerun.txt"
        },
        features = {"src/test/resources/features"}
)
public class NewsPageTest extends BaseTest {
        @SuppressWarnings({"groupsTestNG"})
        @Test(
                groups = "cucumber",
                dataProvider = "scenarios",
                description = "This test demonstrates how to use Selenide, TestNG, Cucumber...")
        public void runScenario(PickleWrapper pickleWrapper, FeatureWrapper featureWrapper) {
                super.runScenario(pickleWrapper, featureWrapper);
        }
}
