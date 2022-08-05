package _SUKRU.GUN_13;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class Soru1 extends BaseStaticDriver {
    public static void main(String[] args) throws AWTException {

        driver.get("https://demo.guru99.com/test/upload/");

        Robot rbt=new Robot();

        for (int i=0; i<13; i++) {
            rbt.keyPress(KeyEvent.VK_TAB);
            rbt.keyRelease(KeyEvent.VK_TAB);
        }
//            Bekle(2);

        rbt.keyPress(KeyEvent.VK_ENTER);
        rbt.keyRelease(KeyEvent.VK_ENTER);

        // Stringi hafızaya-clipboard a kopyalama kodu  -  ctrl+C
        StringSelection stringSelection = new StringSelection("C:\\Users\\admin\\Desktop\\ornek.txt");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection , null);
        // Verilen stringi clipboard a kopyalıyor.

        Bekle(1);

        rbt.keyPress(KeyEvent.VK_CONTROL);
        rbt.keyPress(KeyEvent.VK_V);

        Bekle(1);
        rbt.keyRelease(KeyEvent.VK_CONTROL);
        rbt.keyRelease(KeyEvent.VK_V);

        for (int i=0; i<2; i++) {
            rbt.keyPress(KeyEvent.VK_TAB);
            rbt.keyRelease(KeyEvent.VK_TAB);
            Bekle(1);
        }

        rbt.keyPress(KeyEvent.VK_ENTER);
        rbt.keyRelease(KeyEvent.VK_ENTER);

        WebElement submitbutton= driver.findElement(By.id("submitbutton"));
        submitbutton.click();

        WebElement asser=wait.until(ExpectedConditions.visibilityOfElementLocated((By.id("res"))));
        Assert.assertTrue(asser.getText().contains("has been successfully uploaded"));

        BekleKapat();
    }
}
