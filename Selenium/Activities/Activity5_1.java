package examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_1 {

    public static void main(String[] args){
        WebDriver driver = new FirefoxDriver();

        driver.get(" https://training-support.net/selenium/dynamic-controls");

        System.out.println("The page title : " + driver.getTitle());

        WebElement checkBox = driver.findElement(By.xpath("//input[@type='checkbox']"));

        if(checkBox.isDisplayed()){
            System.out.println("Checkbox is displayed");
        }else{
            System.out.println("Checkbox is not displayed");
        }

        driver.findElement(By.xpath("//button[@id='toggleCheckbox']")).click();

        if(checkBox.isDisplayed()){
            System.out.println("Checkbox is displayed");
        }else{
            System.out.println("Checkbox is not displayed");
        }

        driver.close();
    }
}
