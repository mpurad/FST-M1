package examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_3 {

    public static void main(String[] args){
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.training-support.net/selenium/target-practice");

        System.out.println("The page title : " + driver.getTitle());

        System.out.println("The third header : " + driver.findElement(By.xpath("//h3[@id='third-header']")).getText());

        System.out.println("The fifth header : " + driver.findElement(By.xpath("//h5[contains(@class,'green')]")).getText() + " The colour : " + driver.findElement(By.xpath("//h5[contains(@class,'green')]")).getCssValue("color"));

        System.out.println("The class attribute values of violet button : " + driver.findElement(By.xpath("//button[contains(@class,'violet')]")).getAttribute("class"));

        System.out.println("The grey button text : " + driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[3]/button[2]")).getText());

        driver.close();
    }
}
