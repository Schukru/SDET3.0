package _SUKRU.GUN_04;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;

public class _02_yeni extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://form.jotform.com/221934510376353");

        WebElement element=driver.findElement(By.className("form-submit-button"));
        System.out.println(element.getText());

        WebElement element2=driver.findElement(By.className("form-sub-label"));
        System.out.println(element2.getText()); // FındElement birden fazla eleman var ise ilkini getirir

        // findElements fonksiyonu geriye liste döndürüyor
        List<WebElement> liste = driver.findElements(By.className("form-sub-label"));
        System.out.println(liste.size());
        for(WebElement e: liste)
            System.out.println("e.getText() = " + e.getText());

        BekleKapat();


    }
}
