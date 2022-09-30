package projectWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Activity8 {

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
    public void clickOnContactInMenuItem(){
        //Click on Contact link in the menu
        driver.findElement(By.xpath("//a[text()='Contact']")).click();
    }

    @Test
    public void fillContactInfoAndSendMessage(){
        WebElement fullNameField = driver.findElement(By.xpath("//div[label[contains(text(),'Full Name')]]//input"));

        //Wait for the page to load
        wait.until(ExpectedConditions.visibilityOf(fullNameField));

        //Enter contact details and send message
        fullNameField.sendKeys("FirstName LastName");
        driver.findElement(By.xpath("//div[label[contains(text(),'Email')]]//input")).sendKeys("abc@test.com");
        driver.findElement(By.xpath("//div[label[contains(text(),'Subject')]]//input")).sendKeys("Subject");
        driver.findElement(By.xpath("//div[label[contains(text(),'Comment')]]//textarea")).sendKeys("Comment");
        driver.findElement(By.xpath("//button[text()='Send Message']")).click();
    }

    @Test
    public void printTheConfirmationMessage(){
        System.out.println("The confirmation message : " + driver.findElement(By.xpath("//div[contains(@class,'confirmation-container')]//p")).getText());
    }

    @AfterClass
    public void closeBrowser(){
        driver.close();
    }
}
