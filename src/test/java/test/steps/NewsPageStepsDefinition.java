package test.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.NewsPage;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class NewsPageStepsDefinition {
    NewsPage newsPage = new NewsPage();

    @When("^Google News page is open$")
    public void open() {
        newsPage.open();
    }

    @Then("^News Page is successfully loaded$")
    public void checkPageLoading() {
        assertTrue(newsPage.isLoaded());
    }

    @And("^I see the weather in \"([^\"]*)\"$")
    public void checkWeather(String city) {
        if (newsPage.getCity().equals(city)) System.out.println(newsPage.getWeather());
        else System.out.println("Weather for your city not found");
    }

    @And("^I see the number of news is more than (*)$")
    public void checkNewsNumber(int number) {
        assertTrue(newsPage.getNewsNumber() > number);
    }

}
