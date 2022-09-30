package projectWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Activity4 {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeClass
    public void setup(){
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        //Navigate to URL
        driver.get("https://alchemy.hguy.co/lms/");
    }

    @Test
    public void verifySecondMostPopularCourseTitle(){
        //Verify course title
        Assert.assertEquals(driver.findElement(By.xpath("(//h3[@class='entry-title'])[2]")).getText(), "Email Marketing Strategies");

        //Close the browser
        driver.close();
    }
}
