package projectWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Activity6 {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeClass
    public void setup(){
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        //Navigate to URL
        driver.get("https://alchemy.hguy.co/lms/");
    }

    @Test(priority = 0)
    public void clickOnMyAccountMenuItem(){
        //Verify page title
        driver.findElement(By.xpath("//a[text()='My Account']")).click();
    }

    @Test(priority = 1)
    public void verifyNewPageTitle(){
        //Wait for page to load
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[starts-with(@class,'ld-login')]"))));

        //Verify page title
        Assert.assertEquals(driver.getTitle(), "My Account – Alchemy LMS");
    }

    @Test(priority = 2)
    public void clickOnLoginButton(){
        //Click on log in button
        driver.findElement(By.xpath("//a[starts-with(@class,'ld-login')]")).click();
    }

    @Test(priority = 3)
    public void enterCredentialsAndLogin(){
        //Wait for login form to appear
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("loginform"))));

        //Enter credentials and login
        driver.findElement(By.id("user_login")).sendKeys("root");
        driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
        driver.findElement(By.id("wp-submit")).click();
    }

    @Test(priority = 4)
    public void verifyUserIsLoggedIn(){
        //Wait for page to load
        WebElement displayName = driver.findElement(By.xpath("(//span[@class='display-name'])[1]"));
        wait.until(ExpectedConditions.visibilityOf(displayName));

        //Verify user is logged in
        Assert.assertEquals(displayName.getText(),"root");
    }

    @AfterClass
    public void closeBrowser(){
        driver.close();
    }
}
