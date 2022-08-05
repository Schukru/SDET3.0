package _SUKRU.GUN_11;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Soru2 extends BaseStaticDriver {
    public static void main(String[] args) {

/*
   1-driver.get("http://chercher.tech/practice/frames"); sayfasına gidiniz.
   2-Inputa ülke adı yazınız
   3-CheckBox ı çekleyiniz.
   4-Select in 4.elemanını seçiniz.
 */

        driver.get("http://chercher.tech/practice/frames");

        driver.switchTo().frame(0);   //    "frame1"

        WebElement input = driver.findElement(By.cssSelector("b[id='topic']~input"));
        input.sendKeys("Türkiye");

        driver.switchTo().frame(0);   //    "frame2"

        WebElement chekboks = driver.findElement(By.id("a"));
        chekboks.click();

        driver.switchTo().defaultContent();

        driver.switchTo().frame(1);   //    "frame2"

        WebElement acilirmenu = driver.findElement(By.id("animals"));
        acilirmenu.click();


        Actions aksiyonlar=new Actions(driver);
        Action aksiyon = aksiyonlar.sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).build();
        aksiyon.perform();

        aksiyon = aksiyonlar.sendKeys(Keys.ENTER).build();
        aksiyon.perform();

        wait.until(ExpectedConditions.visibilityOf(acilirmenu));

        BekleKapat();
    }
}
