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

public class Activity7 {

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
    public void clickOnAllCoursesInMenuItem(){
        //Click on All Courses link in the menu
        driver.findElement(By.xpath("//a[text()='All Courses']")).click();
    }

    @Test
    public void findAllCourses(){
        //Wait for page to load
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//article[contains(@class,'courses')]"))));

        //Find all course elements
        List<WebElement> courses = driver.findElements(By.xpath("//article[contains(@class,'courses')]"));

        //Print the number of courses
        System.out.println("The number of courses in the page : " + courses.size());
    }

    @AfterClass
    public void closeBrowser(){
        driver.close();
    }
}
