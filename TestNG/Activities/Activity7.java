package examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

public class Activity7 {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeClass
    public void setup(){
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        driver.get("https://www.training-support.net/selenium/login-form");
    }

    @DataProvider(name = "Authentication")
    public static Object[][] credentials(){
        return new Object[][] {{ "admin", "password"}};
    }

    @Test(dataProvider="Authentication")
    public void loginTest(String username, String password){
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.xpath("//button[text()='Log in']")).click();

        Assert.assertEquals(driver.findElement(By.id("action-confirmation")).getText(), "Welcome Back, admin");
    }

    @AfterClass
    public void tearDown(){
        driver.close();
    }
}
