package examples;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity11_1 {

    public static void main(String[] args){
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.training-support.net/selenium/javascript-alerts");

        System.out.println("The page title : " + driver.getTitle());

        driver.findElement(By.id("simple")).click();

        Alert alert = driver.switchTo().alert();

        System.out.println(alert.getText());
        alert.accept();

        driver.close();
    }
}
