package _SUKRU.GUN_11;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Soru1 extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://chercher.tech/practice/frames");

        driver.switchTo().frame(0);   //    "frame1"

        WebElement input = driver.findElement(By.cssSelector("b[id='topic']~input"));
        input.sendKeys("Türkiye");

        driver.switchTo().parentFrame();

        driver.switchTo().frame(1);   //    "frame2"

        WebElement acilirmenu = driver.findElement(By.id("animals"));
        acilirmenu.click();

        Actions aksiyonlar=new Actions(driver);
        Action aksiyon = aksiyonlar.sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).build();
        aksiyon.perform();







        BekleKapat();

    }
}
