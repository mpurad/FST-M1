package examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity6_1 {

    public static void main(String[] args){
        WebDriver driver = new FirefoxDriver();

        driver.get(" https://training-support.net/selenium/dynamic-controls");

        System.out.println("The page title : " + driver.getTitle());

        WebElement checkBox = driver.findElement(By.xpath("//input[@type='checkbox']"));

        driver.findElement(By.xpath("//button[@id='toggleCheckbox']")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.invisibilityOf(checkBox));

        driver.findElement(By.xpath("//button[@id='toggleCheckbox']")).click();

        wait.until(ExpectedConditions.visibilityOf(checkBox));

        driver.close();
    }
}
