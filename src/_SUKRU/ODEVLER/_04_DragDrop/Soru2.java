package _SUKRU.ODEVLER._04_DragDrop;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Soru2 extends BaseStaticDriver {

    public static void main(String[] args) {

//        Ödev 2 : http://dhtmlgoodies.com/scripts/drag-drop-nodes/drag-drop-nodes.html
//        buradaki bütün öğrencileri bütün kutucukları doldurana kadar atınız.

        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-nodes/drag-drop-nodes.html");

        Actions aksiyonlar = new Actions(driver);

        List<WebElement> ilkGrup;
        List<WebElement> kutular = driver.findElements(By.cssSelector("[id^='box']"));

        Action aksiyon;

        int i=0;
        int k=0;
        int boxSizeFirst=0;
        int boxSizeLast=0;

        do {

            boxSizeFirst = (driver.findElements(By.cssSelector("#box" + (String.valueOf(k+1)) + ">li"))).size();
            ilkGrup = driver.findElements(By.cssSelector("#allItems>[id^='node']"));
            aksiyon = aksiyonlar.clickAndHold(ilkGrup.get(0)).moveToElement(kutular.get(k)).release(kutular.get(k)).build();

            aksiyon.perform();

            boxSizeLast = (driver.findElements(By.cssSelector("#box" + (String.valueOf(k+1)) + ">li"))).size();

            i++;

            if (boxSizeFirst == boxSizeLast) {
               k++;
            }

            Bekle(1);
            ilkGrup = driver.findElements(By.cssSelector("#allItems>[id^='node']"));

        } while (driver.findElements(By.cssSelector("#allItems>[id^='node']")).size() >0 );

        BekleKapat();

    }
}