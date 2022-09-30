package examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity10_1 {

    public static void main(String[] args){
        WebDriver driver = new FirefoxDriver();

        driver.get(" https://www.training-support.net/selenium/input-events");

        System.out.println("The page title : " + driver.getTitle());

        WebElement cubeObj = driver.findElement(By.id("wrapD3Cube"));

        Actions actions = new Actions(driver);

        actions.click(cubeObj).perform();

        System.out.println("Active side : " +  driver.findElement(By.className("active")).getText());

        actions.doubleClick(cubeObj).perform();

        System.out.println("Active side : " + driver.findElement(By.className("active")).getText());

        actions.contextClick(cubeObj).perform();

        System.out.println("Active side : " + driver.findElement(By.className("active")).getText());

        driver.close();
    }
}
