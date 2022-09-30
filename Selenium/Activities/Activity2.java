package examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {

    public static void main(String[] args){
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.training-support.net/");

        String pageTitle = driver.getTitle();

        System.out.println("The page title : " + pageTitle);

        System.out.println(driver.findElement(By.id("about-link")).getText());

        System.out.println(driver.findElement(By.className("green")).getText());

        System.out.println(driver.findElement(By.linkText("About Us")).getText());

        System.out.println(driver.findElement(By.cssSelector(".green")).getText());

        driver.close();
    }
}
