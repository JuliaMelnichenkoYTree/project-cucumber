package test.common;

import com.codeborne.selenide.WebDriverRunner;
import io.cucumber.core.logging.LoggerFactory;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import static java.lang.invoke.MethodHandles.lookup;

public abstract class BaseTest extends AbstractTestNGCucumberTests {

    @AfterClass
    public void tearDownClass() {
        if (WebDriverRunner.hasWebDriverStarted()) WebDriverRunner.closeWebDriver();
        super.tearDownClass();
    }
}
