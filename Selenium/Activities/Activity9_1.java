package examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Activity9_1 {

    public static void main(String[] args){
        WebDriver driver = new FirefoxDriver();

        driver.get("https://training-support.net/selenium/selects");

        WebElement dropdownElem = driver.findElement(By.xpath("//select[@id='single-select']"));

        Select dropdown = new Select(dropdownElem);

        dropdown.selectByVisibleText("Option 2");

        dropdown.selectByIndex(3);

        dropdown.selectByValue("4");

        List<WebElement> options = dropdown.getOptions();

        for(WebElement option:options){
            System.out.println("Option : " + option.getText());
        }

        driver.close();
    }
}
