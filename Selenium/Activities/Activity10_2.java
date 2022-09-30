package examples;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Activity10_2 {

    public static void main(String[] args){
        WebDriver driver = new FirefoxDriver();

        driver.get(" https://www.training-support.net/selenium/input-events");

        System.out.println("The page title : " + driver.getTitle());

        Actions actions = new Actions(driver);

        WebElement keyPressed = driver.findElement(By.id("keyPressed"));

        Action action = actions.sendKeys("M").build();
        action.perform();
        System.out.println("Key pressed : " + keyPressed.getText());

        Action action1 = actions.keyDown(Keys.CONTROL)
                        .sendKeys("a")
                                .sendKeys("c")
                                        .keyUp(Keys.CONTROL).build();

        action1.perform();

        System.out.println("Pressed key : " + keyPressed.getText());

        driver.close();
    }
}
