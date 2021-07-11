package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import pages.NewsPage;

import static org.testng.AssertJUnit.assertTrue;

public class NewsSite {

    @Test
    public void testNewsSite(){


        NewsPage page = new NewsPage();
        assertTrue(page.isLoaded());

    }

}
