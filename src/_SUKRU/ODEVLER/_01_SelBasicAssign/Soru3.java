package _SUKRU.ODEVLER._01_SelBasicAssign;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class Soru3 extends BaseStaticDriver {

    public static void main(String[] args) {

//    3-  1) Bu siteye gidin. -> https://www.snapdeal.com/
//        2) "teddy bear" aratın ve  Search butonuna tıklayın.
//        3) Bu yazının göründüğünü doğrulayınız. -> (We've got 297 results for 'teddy bear')
//        Not: Bu yazıdaki sayı değişiklik gösterebilir. Önemli olan cümle kalıbı.

        driver.get("https://www.snapdeal.com/");

        WebElement el1=driver.findElement(By.id("inputValEnter"));
        el1.sendKeys("teddy bear");

        WebElement el2=driver.findElement(By.className("searchformButton"));

        Bekle(3);
        el2.click();

        WebElement el3=driver.findElement(By.id("searchMessageContainer"));
        String sonuc=el3.getText();

        System.out.println("sonuc = " + sonuc);

        if (sonuc.substring(0,9).equalsIgnoreCase("We've got") &
            sonuc.substring(sonuc.length()-24,sonuc.length()).equalsIgnoreCase("results for 'teddy bear'"))

            System.out.println("Test-3 passed");
        else System.out.println("Test-3 didn't passed");

        BekleKapat();

    }
}
