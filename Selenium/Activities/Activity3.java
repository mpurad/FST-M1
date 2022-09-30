package examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();

        driver.get("https://training-support.net/selenium/simple-form");

        System.out.println("The page title : " + driver.getTitle());

        driver.findElement(By.id("firstName")).sendKeys("Firstname");

        driver.findElement(By.id("lastName")).sendKeys("Lastname");

        driver.findElement(By.id("email")).sendKeys("abc@test.com");

        driver.findElement(By.id("number")).sendKeys("123456789");

        driver.findElement(By.xpath("//input[@value='submit']")).click();

        driver.close();
    }
}
