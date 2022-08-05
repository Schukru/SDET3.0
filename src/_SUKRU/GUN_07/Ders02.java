package _SUKRU.GUN_07;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Ders02 extends BaseStaticDriver {

    public static void main(String[] args) {

        driver.get("https:facebook.com/");

        WebElement basla = driver.findElement(By.xpath("//div[@class='_6ltg']//a[@role='button']"));
        basla.click();

        WebElement isim= driver.findElement(By.cssSelector("input[type='text'][class^='inputtext _'][name='firstname']"));
        isim.sendKeys("Şükrü");

        WebElement soyisim= driver.findElement(By.cssSelector("input[type='text'][class^='inputtext _'][name='lastname']"));
        soyisim.sendKeys("Kılıç");


//        WebElement eposta= driver.findElement(By.cssSelector("input[type='text'][class^='inputtext _'][name='reg_email__']"));
//        eposta.sendKeys("kilicsukru@hotmail.com");

        WebElement eposta2= driver.findElement(By.cssSelector("input[type='text'][class^='inputtext _'][name='reg_email_confirmation__']"));
//        eposta2.sendKeys("kilicsukru@hotmail.com");
        Assert.assertFalse(eposta2.isDisplayed());



    }
}