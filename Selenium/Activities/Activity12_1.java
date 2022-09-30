package examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity12_1 {

    public static void main(String[] args){
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.training-support.net/selenium/iframes");

        System.out.println("The page title : " + driver.getTitle());

        driver.switchTo().frame(0);

        System.out.println("Frame1 heading : " + driver.findElement(By.cssSelector("div.content")).getText());

        WebElement button1 = driver.findElement(By.cssSelector("button"));
        System.out.println(button1.getText());
        System.out.println(button1.getCssValue("background-color"));
        button1.click();

        System.out.println(button1.getText());
        System.out.println(button1.getCssValue("background-color"));

        driver.switchTo().defaultContent();

        driver.switchTo().frame(1);

        System.out.println("Frame2 heading : " + driver.findElement(By.cssSelector("div.content")).getText());

        WebElement button2 = driver.findElement(By.cssSelector("button"));
        System.out.println(button1.getText());
        System.out.println(button1.getCssValue("background-color"));
        button1.click();

        System.out.println(button1.getText());
        System.out.println(button1.getCssValue("background-color"));

        driver.switchTo().defaultContent();

        driver.close();
    }
}
