package examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_2 {

    public static void main(String[] args){
        WebDriver driver = new FirefoxDriver();

        driver.get(" https://www.training-support.net/selenium/simple-form");

        System.out.println("The page title : " + driver.getTitle());

        driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Firstname");

        driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Lastname");

        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc@test.com");

        driver.findElement(By.xpath("//input[@id='number']")).sendKeys("1234567890");

        driver.findElement(By.xpath("//input[@value='submit']")).click();

        driver.close();
    }
}
