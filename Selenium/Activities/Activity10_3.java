package examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity10_3 {

    public static void main(String[] args){
        WebDriver driver = new FirefoxDriver();

        driver.get("https://training-support.net/selenium/drag-drop");

        System.out.println("The page title : " + driver.getTitle());

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        WebElement ballElem = driver.findElement(By.id("draggable"));
        WebElement dropzone1 = driver.findElement(By.id("droppable"));
        WebElement dropzone2 = driver.findElement(By.id("dropzone2"));

        wait.until(ExpectedConditions.elementToBeClickable(ballElem));

        Actions actions = new Actions(driver);

        actions.dragAndDrop(ballElem, dropzone1).perform();

        if(wait.until(ExpectedConditions.attributeToBeNotEmpty(dropzone1, "background-color"))){
            System.out.println("Ball dropped to zone1");
        }else{
            System.out.println("Ball not dropped to zone1");
        }

        actions.dragAndDrop(ballElem, dropzone2).perform();

        if(wait.until(ExpectedConditions.attributeToBeNotEmpty(dropzone2, "background-color"))){
            System.out.println("Ball dropped to zone2");
        }else{
            System.out.println("Ball not dropped to zone2");
        }

        driver.close();
    }
}
