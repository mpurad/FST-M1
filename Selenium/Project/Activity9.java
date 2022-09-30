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
import java.util.List;

public class Activity9 {

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
    public void clickOnAllCoursesInMenuItem(){
        //Click on All Courses link in the menu
        driver.findElement(By.xpath("//a[text()='All Courses']")).click();
    }

    @Test(priority = 1)
    public void navigateToACourse(){
        WebElement seeMoreLink = driver.findElement(By.xpath("(//article[contains(@class,'courses')]//a[text()='See more...'])[1]"));
        //Wait for page to load
        wait.until(ExpectedConditions.visibilityOf(seeMoreLink));

        //Click on a course
        seeMoreLink.click();
    }

    @Test(priority = 2)
    public void enrollToCourse(){
        //Wait for page to load
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[@class='ld-button']"))));

        //Click on login to enroll button
        driver.findElement(By.xpath("//a[@class='ld-button']")).click();

        //login
        driver.findElement(By.id("user_login")).sendKeys("root");
        driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
        driver.findElement(By.id("wp-submit")).click();
    }

    @Test(priority = 3)
    public void clickOnALessonAndVerifyCourseTitle(){
        //Wait for page to load
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[contains(@class,'ld-course-status')]"))));

        //Click on a lesson
        driver.findElement(By.xpath("(//div[@class='ld-item-title'])[1]")).click();
    }

    @Test(priority = 4)
    public void verifyLessonPageTitleAndCompetionStatus(){
        //Wait for the page to load
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//h1[text()='Developing Strategy']"))));

        //Verify page title
        Assert.assertEquals(driver.getTitle(),"Developing Strategy – Alchemy LMS");

        //Verify completion status
        Assert.assertEquals(driver.findElement(By.xpath("//div[@class='ld-lesson-status']//div[contains(@class,'ld-status-complete')]")).getText(), "COMPLETE");
    }

    @AfterClass
    public void closeBrowser(){
        driver.close();
    }
}
