package examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Activity9_2 {

    public static void main(String[] args){
        WebDriver driver = new FirefoxDriver();

        driver.get("https://training-support.net/selenium/selects");

        WebElement selectedValue = driver.findElement(By.id("multi-value"));

        WebElement multiSelectElem = driver.findElement(By.xpath("//select[@id='multi-select']"));

        Select selectBox = new Select(multiSelectElem);

        if(selectBox.isMultiple()){
            selectBox.selectByVisibleText("Javascript");
            System.out.println(selectedValue.getText());

            selectBox.selectByValue("node");
            System.out.println(selectedValue.getText());

            for(int i=4;i<=6;i++){
                selectBox.selectByIndex(i);
            }
            System.out.println(selectedValue.getText());

            selectBox.deselectByValue("node");
            System.out.println(selectedValue.getText());

            selectBox.selectByIndex(7);
            System.out.println(selectedValue.getText());

            System.out.println("The first selected option : " + selectBox.getFirstSelectedOption().getText());

            for(WebElement selectedOption:selectBox.getAllSelectedOptions()){
                System.out.println("Selected option : " + selectedOption.getText());
            }

            selectBox.deselectAll();
            System.out.println(selectedValue.getText());
        }

        driver.close();
    }
}
