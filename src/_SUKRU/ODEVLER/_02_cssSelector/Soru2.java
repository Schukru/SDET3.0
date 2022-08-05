package _SUKRU.ODEVLER._02_cssSelector;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru2 extends BaseStaticDriver {

    public static void main(String[] args) {

//  2-
//      1) Bu siteye gidin. -> https://demo.applitools.com/
//      2) Username kısmına "ttechno@gmail.com" girin.
//      3) Password kısmına "techno123." girin.
//      4) "Sign in" buttonunan tıklayınız.
//      5) "Your nearest branch closes in: 30m 5s" yazısının göründüğünü doğrulayınız.

        driver.get("https://demo.applitools.com/");

        WebElement el1=driver.findElement(By.cssSelector(".form-group>.form-control[type='text']"));
        el1.sendKeys("ttechno@gmail.com");

        WebElement el2=driver.findElement(By.cssSelector(".form-group>.form-control[type='password']"));
        el2.sendKeys("techno123.");

        WebElement el3=driver.findElement(By.cssSelector(".buttons-w>a"));
        el3.click();

        WebElement el4=driver.findElement(By.cssSelector(".element-actions~H6"));

        if (el4.getText().contains("Your nearest branch closes in: 30m 5s"))
            System.out.println("Test 2 passed");
        else System.out.println("Test 2 not passed");

        BekleKapat();


    }
}
