package _SUKRU.GUN_12;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class Soru4 extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://triplebyte.com/");

        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1500)");


        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

        WebElement element= driver.findElement(By.linkText(("Take a quiz")));

        js.executeScript("arguments[0].scrollIntoView()", element);  // elemente kadar scroll yapacak

    }
}
