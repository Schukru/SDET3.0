package _SUKRU.ODEVLER._03_xPath;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru4 extends BaseStaticDriver {

    public static void main(String[] args) {

//  4-
//      Bu websitesine gidiniz.  [https://testpages.herokuapp.com/styled/index.html]
//      Calculate'e tıklayınız.
//      İlk input'a herhangi bir sayı giriniz.
//      İkinci input'a herhangi bir sayı giriniz.
//      Calculate button'una tıklayınız.
//      Sonucu alınız.
//      Sonucu yazdırınız.

        driver.get("https://testpages.herokuapp.com/styled/index.html");

        WebElement el1=driver.findElement(By.xpath("//a[@id='calculate']"));
        el1.click();

        int s1=((int)(Math.random()*100))+1;
        WebElement el2=driver.findElement(By.xpath("//form[@action]//input[1]"));
        el2.sendKeys(String.valueOf(s1));

        int s2=((int)(Math.random()*100))+1;
        WebElement el3=driver.findElement(By.xpath("//form[@action]//input[2]"));
        el3.sendKeys(String.valueOf(s2));

        WebElement el4=driver.findElement(By.xpath("//form[@action]//input[3]"));
        el4.click();

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);

        WebElement el5=driver.findElement(By.xpath("//span[@id='answer']"));
        String sonuc = el5.getText();

        System.out.println("sonuc = " + sonuc);
        System.out.println("\nTest-4 passed");

        BekleKapat();


    }
}
