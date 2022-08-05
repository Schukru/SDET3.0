package _SUKRU.ODEVLER._04_DragDrop;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

public class Kontrol extends BaseStaticDriver {

    public static void main(String[] args) {

//        Ödev 2 : http://dhtmlgoodies.com/scripts/drag-drop-nodes/drag-drop-nodes.html
//        buradaki bütün öğrencileri bütün kutucukları doldurana kadar atınız.

        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-nodes-quiz/drag-drop-nodes-quiz.html");

        Actions aksiyonlar = new Actions(driver);

        List<WebElement> ilkGrup = driver.findElements(By.cssSelector("[id^='node']"));
        List<WebElement> kutular = driver.findElements(By.cssSelector("[id^='box']"));

        for (WebElement s: ilkGrup) {
            System.out.println(" grup 1 : " + s.getText());
        }
        System.out.println();
        for (WebElement k: kutular){
            System.out.println(" kutular : " + k.getText());
        }
        System.out.println();
        Action aksiyon;

//        aksiyon = aksiyonlar.clickAndHold(ilkGrup.get(0)).build();
//        aksiyon.perform();

        aksiyon = aksiyonlar.clickAndHold(ilkGrup.get(0)).moveToElement(kutular.get(0)).release(kutular.get(0)).build();
        aksiyon.perform();

        Bekle(3);
        ilkGrup = driver.findElements(By.cssSelector("[id^='node']"));
        kutular = driver.findElements(By.cssSelector("[id^='box']"));

        System.out.println();

        for (WebElement s: ilkGrup) {
            System.out.println(" grup 1 : " + s.getText());
        }
        System.out.println();
        for (WebElement k: kutular){
            System.out.println(" kutular : " + k.getText());
        }

        Bekle(5);
//        BekleKapat();

    }
}