package _SUKRU.GUN_08;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru3 extends BaseStaticDriver {

    public static void main(String[] args) {

        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");

        WebElement ClickMe= driver.findElement(By.cssSelector("[class='btn btn-default'"));
        ClickMe.click();

        Bekle(2);
        driver.switchTo().alert().accept();
        Bekle(2);

        BekleKapat();

    }
}
