package examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class Activity8_1 {

    public static void main(String[] args){
        WebDriver driver = new FirefoxDriver();

        driver.get("https://training-support.net/selenium/tables");

        System.out.println("The number of rows in table : " + driver.findElements(By.xpath("//table[contains(@class,'striped table')]//tbody//tr")).size());

        System.out.println("The number of columns in table : " + driver.findElements(By.xpath("//table[contains(@class,'striped table')]//tbody//tr[1]//td")).size());

        System.out.println("Contents of the 3rd row of the table : ");

        List<WebElement> cells = driver.findElements(By.xpath("//table[contains(@class,'striped table')]//tbody//tr[3]//td"));

        for(WebElement elem: cells){
            System.out.println(elem.getText());
        }

        System.out.println("Contents of the 2nd row and 2nd column of the table : " + driver.findElement(By.xpath("//table[contains(@class,'striped table')]//tbody//tr[2]//td[2]")).getText());

        driver.close();
    }
}
