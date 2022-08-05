package _SUKRU.ODEVLER._01_SelBasicAssign;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru5 extends BaseStaticDriver {

    public static void main(String[] args) {

//    5-  Bu websitesine gidiniz.  [https://testpages.herokuapp.com/styled/index.html]
//        Fake Alerts' tıklayınız.
//        Show Alert Box'a tıklayınız.
//        Ok'a tıklayınız.
//        Alert kapanmalıdır.

        driver.get("https://testpages.herokuapp.com/styled/index.html");

        WebElement el1= driver.findElement(By.id("fakealerttest"));
        el1.click();

        WebElement el2= driver.findElement(By.id("fakealert"));

        Bekle(1);
        el2.click();

        WebElement el3= driver.findElement(By.id("dialog-ok"));
        Bekle(1);
        el3.click();

        BekleKapat();

    }
}
