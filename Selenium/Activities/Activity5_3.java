package examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_3 {

    public static void main(String[] args){
        WebDriver driver = new FirefoxDriver();

        driver.get(" https://training-support.net/selenium/dynamic-controls");

        System.out.println("The page title : " + driver.getTitle());

        WebElement testBox = driver.findElement(By.xpath("//input[@id='input-text']"));

        if(testBox.isEnabled()){
            System.out.println("Checkbox is enabled");
        }else{
            System.out.println("Checkbox is not enabled");
        }

        driver.findElement(By.xpath("//button[@id='toggleInput']")).click();

        if(testBox.isEnabled()){
            System.out.println("Checkbox is enabled");
        }else{
            System.out.println("Checkbox is not enabled");
        }

        driver.close();
    }
}
