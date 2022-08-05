package _SUKRU.ODEVLER._04_DragDrop;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import java.util.List;

public class Soru1 extends BaseStaticDriver {

    public static void main(String[] args) {

        //  Ödev 1 : http://dhtmlgoodies.com/scripts/drag-drop-quiz/drag-drop-quiz-d2.html
        //  buradaki ülke ve şehirleri findElements ile topluca bularak bir döngü ile bütün şehirleri doğru ülkere dağıtınız.

        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-quiz/drag-drop-quiz-d2.html");

        Actions aksiyonlar = new Actions(driver);

        List<WebElement> ulkeler = driver.findElements(By.cssSelector("#questionDiv>[id^='q']"));
        List<WebElement> sehirler = driver.findElements(By.cssSelector("#answerDiv>[id^='a']"));

        Action aksiyon;

        for (WebElement s: sehirler){

            int u=0;
            while (ulkeler.size() > u) {

                aksiyon = aksiyonlar.clickAndHold(s).build();
                aksiyon.perform();

                aksiyon = aksiyonlar.clickAndHold(ulkeler.get(u)).moveToElement(ulkeler.get(u)).release().build();
                aksiyon.perform();

                if ((s.getCssValue("background-color").toString()).equalsIgnoreCase("rgba(0, 128, 0, 1)")) {
                    ulkeler.remove(u);
                    u=0;
                    break;
                }
                else u++;
            }
        }

        BekleKapat();

    }
}