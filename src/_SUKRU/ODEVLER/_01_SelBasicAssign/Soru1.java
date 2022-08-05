package _SUKRU.ODEVLER._01_SelBasicAssign;

import Utils.BaseStaticDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Soru1 extends BaseStaticDriver {

//    1) Bu siteye gidin. ->  http://demoqa.com/text-box

//    2) Full Name kısmına "Automation" girin.
//    3) Email kısmına "Testing@gmail.com" girin.
//    4) Current Address kısmına "Testing Current Address" girin.
//    5) Permanent Address kısmına "Testing Permanent Address" girin.

//    6) Submit butonuna tıklayınız.
//    7) Full Name'in, "Automation"ı içinde bulundurduğunu doğrulayın.
//    8) Email'in, "Testing"ı içinde bulundurduğunu doğrulayın.

    public static void main(String[] args) {

        driver.get("http://demoqa.com/text-box");

        WebElement element1=driver.findElement(By.id("userName"));
        element1.sendKeys("Automation");

        WebElement element2=driver.findElement(By.id("userEmail"));
        element2.sendKeys("Testing@gmail.com");

        WebElement element3=driver.findElement(By.id("currentAddress"));
        element3.sendKeys("Testing Current Address");

        WebElement element4=driver.findElement(By.id("permanentAddress"));
        element4.sendKeys("Testing Permanent Address");

        WebElement element5=driver.findElement(By.id("submit"));
        element5.click();

        String Girilen1 = element1.getAttribute("value");
        String Girilen2 = element2.getAttribute("value");

        if (Girilen1.contains("Automation"))
            System.out.println("Full Name alanı 'Automation' içeriyor.");
        else System.out.println("Full Name alanı 'Automation' içermiyor.");

        if (Girilen2.contains("Testing"))
            System.out.println("Email alanı /'Testing/' içeriyor.");
        else System.out.println("Email alanı /'Testing/' içermiyor.");

        BekleKapat();

    }

}
