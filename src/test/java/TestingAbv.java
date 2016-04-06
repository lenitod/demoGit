import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Chris on 8/16/2015.
 */
public class TestingAbv {

    private WebDriver driver;


    @org.testng.annotations.Test
    public void testName() throws Exception {

    }

    @After
    public void TearDown()
    {
        //Closing WebDriver
        driver.quit();
New lesson for git task
    }
}
