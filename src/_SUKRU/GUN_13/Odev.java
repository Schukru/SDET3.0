package _SUKRU.GUN_13;

import Utils.BaseStaticDriver;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

public class Odev extends BaseStaticDriver {
    public static void main(String[] args) throws AWTException {

        driver.get("https://www.google.com/");
        String anasayfaID=driver.getWindowHandle();

        Robot rbt = new Robot();

        for (int i=0; i<2; i++) {

            rbt.keyPress(KeyEvent.VK_CONTROL);
            rbt.keyPress(KeyEvent.VK_T);

            rbt.keyRelease(KeyEvent.VK_CONTROL);
            rbt.keyRelease(KeyEvent.VK_T);
        }
Bekle(4);
        Set<String> pencereId = driver.getWindowHandles();
        Iterator gosterge=pencereId.iterator();

        for(int i=0; i<3; i++) {
        }

        String indexNo = gosterge.next().toString();
        System.out.println(indexNo);
        driver.switchTo().window(indexNo);
        //anasayfaID.contains(driver.getWindowHandle());

        Bekle(3);
        indexNo = gosterge.next().toString();
        System.out.println(indexNo);
        driver.switchTo().window(indexNo);
        driver.navigate().to("https://www.facebook.com/");

        Bekle(3);
        indexNo = gosterge.next().toString();
        System.out.println(indexNo);
        driver.switchTo().window(indexNo);
        driver.navigate().to("https://www.twitter.com/");

Bekle(3);


//        i=0;
//        for (String id: pencereId) {
//            i++;
//            driver.switchTo().window(id);
//            if (i==1) driver.close();
//            if (i==2) driver.close();
//            Bekle(2);
//        }

        //BekleKapat();
    }
}
