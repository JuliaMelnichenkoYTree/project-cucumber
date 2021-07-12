package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class NewsPage {
    SelenideElement header = $x("//*[@id='sdgBod']");
    SelenideElement cityName = $x("//*[@id=\"yDmH0d\"]/c-wiz/div/div[2]/div[2]/div/aside/c-wiz/div/div[1]/div/div[1]/div/div[1]/h2");
    SelenideElement temperature = $x("//*[@id=\"yDmH0d\"]/c-wiz/div/div[2]/div[2]/div/aside/c-wiz/div/div[1]/div/div[2]/div[1]/div[1]/span");
    ElementsCollection news = $$x("//*[@class='VDXfz']");

    public boolean isLoaded() {
        return (header.shouldBe(Condition.visible).getText().equals("News"));
    }

    public String getCity(){
        return cityName.shouldBe(Condition.visible).getText();
    }

    public boolean isWeatherDisplayed() {
        return temperature.shouldBe(Condition.visible).isDisplayed();
    }

    public void open() {
        Selenide.open("https://news.google.com/");
    }

    public int getNewsNumber(){
        return news.size();
    }
}
