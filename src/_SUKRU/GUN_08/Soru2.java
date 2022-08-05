package _SUKRU.GUN_08;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Soru2 extends BaseStaticDriver {

    public static void main(String[] args) {

        driver.get("https://www.etsy.com/");

        List<WebElement> cookiesAccept=driver.findElements(By.cssSelector("[data-gdpr-single-choice-accept='true']"));
        if (cookiesAccept.size() > 0)
            cookiesAccept.get(0).click();

        Actions aksiyonlar=new Actions(driver);

        WebElement J_1=driver.findElement(By.id("catnav-primary-link-10855"));
        Action aksiyon = aksiyonlar
                .moveToElement(J_1)
                .build();
        aksiyon.perform();

        Bekle(2);
        WebElement J_2=driver.findElement(By.id("side-nav-category-link-10873"));
        aksiyon = aksiyonlar
                .moveToElement(J_2)
                .build();
        aksiyon.perform();

        Bekle(2);
        WebElement J_3=driver.findElement(By.id("catnav-l3-10881"));
        aksiyonlar.moveToElement(J_3).build().perform();              //  bir üstteki kodların  kısaltılmış hali

        J_3.click();
        Assert.assertTrue(driver.getCurrentUrl().contains("bib"));

        BekleKapat();
    }
}
