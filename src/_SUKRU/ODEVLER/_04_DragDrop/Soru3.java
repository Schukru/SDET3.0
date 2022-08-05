package _SUKRU.ODEVLER._04_DragDrop;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Soru3 extends BaseStaticDriver {

    public static void main(String[] args) {

//        Ödev 3: http://dhtmlgoodies.com/scripts/drag-drop-nodes-quiz/drag-drop-nodes-quiz.html
//        buradaki bütün şehirleri bütün ülkere doğru şekilde topluca dağıtınız.

        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-nodes-quiz/drag-drop-nodes-quiz.html");

        Actions aksiyonlar = new Actions(driver);
        Action aksiyon;

        List<WebElement> kutular = driver.findElements(By.cssSelector("[id^='box']"));
        Boolean[] kutuDolu = new Boolean[7];

        for (int j=0; j<7; j++) {
            kutuDolu[j] = false;
        }

        int sehirNo=1;
        int boxSizeFirst=0;
        int boxSizeLast=0;

        do {

            WebElement sehir = driver.findElement(By.id("node" + (String.valueOf(sehirNo))));

            for (int kutuNo=1; kutuNo<8; kutuNo++) {

                if (kutuDolu[kutuNo - 1] == false) {

                    Bekle(2);

                    aksiyon = aksiyonlar.clickAndHold(sehir).build();
                    aksiyon.perform();

                    Bekle(2);

                    boxSizeFirst = (driver.findElements(By.cssSelector("#box" + (String.valueOf(kutuNo)) + ">li"))).size();

                    Bekle(2);
                    aksiyon = aksiyonlar.moveToElement(kutular.get(kutuNo-1)).release(kutular.get(kutuNo-1)).build();
                    aksiyon.perform();

                    Bekle(2);
                    boxSizeLast = (driver.findElements(By.cssSelector("#box" + (String.valueOf(kutuNo )) + ">li"))).size();

                    if (boxSizeLast > boxSizeFirst) {

                        if ((sehir.getCssValue("background-color").toString()).equalsIgnoreCase("rgba(0, 128, 0, 1)")) {
                            sehirNo++;
                            break;
                        } else continue;

                    } else {
                        kutuDolu[kutuNo - 1] = true;
                        continue;
                    }
                }
            }

        } while (sehirNo <= 21);

        BekleKapat();

    }
}
