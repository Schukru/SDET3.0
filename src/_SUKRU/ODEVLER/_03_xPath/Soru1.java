package _SUKRU.ODEVLER._03_xPath;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru1 extends BaseStaticDriver {

    public static void main(String[] args) {

        //        Buradaki ödevler de elemanların LOCATOR larını bulurken,
//        elemanın kendisindeki id veya name i kullanmadan (diğerlerindekini kullanabilirsiz bu eleman uşalmak için)
//        ve sadece CSS Selector ile bularak çözünüz.
//  1-
//    1) Bu siteye gidin. ->  http://demoqa.com/text-box
//    2) Full Name kısmına "Automation" girin.
//    3) Email kısmına "Testing@gmail.com" girin.
//    4) Current Address kısmına "Testing Current Address" girin.
//    5) Permanent Address kısmına "Testing Permanent Address" girin.
//    6) Submit butonuna tıklayınız.
//    7) Full Name'in, "Automation"ı içinde bulundurduğunu doğrulayın.
//    8) Email'in, "Testing"ı içinde bulundurduğunu doğrulayın.

        driver.get("http://demoqa.com/text-box");

        WebElement fName= driver.findElement(By.xpath("//*[@id='userName']"));
        fName.sendKeys("Automation");

        WebElement eMail= driver.findElement(By.xpath("//*[@id='userEmail']"));
        eMail.sendKeys("Testing@gmail.com");

        WebElement cAddress= driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
        cAddress.sendKeys("Testing Current Address");

        WebElement pAddress= driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
        pAddress.sendKeys("Testing Permanent Address");

        WebElement dugme=driver.findElement(By.xpath("//button[@id='submit']"));
        dugme.click();

        String Girilen1 = fName.getAttribute("value");
        String Girilen2 = eMail.getAttribute("value");

        if (Girilen1.contains("Automation"))
            System.out.println("Full Name alanı 'Automation' içeriyor.");
        else System.out.println("Full Name alanı 'Automation' içermiyor.");

        if (Girilen2.contains("Testing"))
            System.out.println("Email alanı 'Testing' içeriyor.");
        else System.out.println("Email alanı 'Testing' içermiyor.");

        BekleKapat();

    }

}