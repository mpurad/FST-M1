package projectWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Activity5 {

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
    public void clickOnMyAccountMenuItem(){
        //Click on My Account link in the menu
        driver.findElement(By.xpath("//a[text()='My Account']")).click();
    }

    @Test
    public void verifyNewPageTitle(){
        //Wait for page to load
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[starts-with(@class,'ld-login')]"))));

        //Verify page title
        Assert.assertEquals(driver.getTitle(), "My Account – Alchemy LMS");
    }

    @AfterClass
    public void closeBrowser(){
        driver.close();
    }
}
