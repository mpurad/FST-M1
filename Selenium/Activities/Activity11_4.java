package examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity11_4 {

    public static void main(String[] args){
        WebDriver driver = new FirefoxDriver();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        driver.get("https://www.training-support.net/selenium/tab-opener");

        System.out.println("The page title : " + driver.getTitle());

        String parentWindow = driver.getWindowHandle();
        System.out.println("Parent window handle : " + parentWindow);

        driver.findElement(By.id("launcher")).click();

        wait.until(ExpectedConditions.numberOfWindowsToBe(2));

        System.out.println("Window handles : " + driver.getWindowHandles());

        for(String handle:driver.getWindowHandles()){
            if(handle!=parentWindow){
                driver.switchTo().window(handle);
            }
        }

        String secondTab = driver.getWindowHandle();

        System.out.println("Current window : " + secondTab);

        wait.until(ExpectedConditions.titleIs("Newtab"));
        System.out.println("The page title of current tab : " + driver.getTitle());
        System.out.println("The new heading : " + driver.findElement(By.xpath("//div[@class='content']")).getText());

        driver.findElement(By.id("actionButton")).click();
        wait.until(ExpectedConditions.numberOfWindowsToBe(3));

        System.out.println("Window handles : " + driver.getWindowHandles());

        for(String handle:driver.getWindowHandles()){
            if(handle!=parentWindow && handle!=secondTab){
                driver.switchTo().window(handle);
            }
        }

        System.out.println("Current window : " + driver.getWindowHandle());

        wait.until(ExpectedConditions.titleIs("Newtab2"));
        System.out.println("The page title of current tab : " + driver.getTitle());
        System.out.println("The new heading : " + driver.findElement(By.xpath("//div[@class='content']")).getText());

        driver.quit();
    }
}
