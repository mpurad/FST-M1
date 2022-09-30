package examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class Activity8_2 {

    public static void main(String[] args){
        WebDriver driver = new FirefoxDriver();

        driver.get("https://training-support.net/selenium/tables");

        System.out.println("The number of rows in table : " + driver.findElements(By.xpath("//table[@id='sortableTable']//tbody//tr")).size());

        System.out.println("The number of columns in table : " + driver.findElements(By.xpath("//table[@id='sortableTable']//tbody//tr[1]//td")).size());

        System.out.println("Contents of the 2nd row and 2nd column of the table before sorting : " + driver.findElement(By.xpath("//table[@id='sortableTable']//tbody//tr[2]//td[2]")).getText());

        driver.findElement(By.xpath("//table[@id='sortableTable']//th[text()='Name']")).click();

        System.out.println("Contents of the 2nd row and 2nd column of the table after sorting : " + driver.findElement(By.xpath("//table[@id='sortableTable']//tbody//tr[2]//td[2]")).getText());

        System.out.println("Footer text : " + driver.findElement(By.xpath("//table[@id='sortableTable']//tfoot//tr")).getText());

        driver.close();
    }
}
