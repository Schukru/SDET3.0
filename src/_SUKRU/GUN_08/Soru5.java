package _SUKRU.GUN_08;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru5 extends BaseStaticDriver {

    public static void main(String[] args) {

        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");

        WebElement ClickMe3= driver.findElement(By.cssSelector("[onclick='myPromptFunction()']"));
        ClickMe3.click();

        System.out.println("ClickMe3 = " + driver.switchTo().alert().getText()); // ekranda görünen yazıyı alıyoruz
        Bekle(3);

        driver.switchTo().alert().sendKeys("Şükrü");
        Bekle(2);

        driver.switchTo().alert().accept();
        Bekle(2);

        WebElement SukruMU= driver.findElement(By.id("prompt-demo"));

        Assert.assertTrue(SukruMU.getText().contains("Şükrü"));
        BekleKapat();

    }
}
