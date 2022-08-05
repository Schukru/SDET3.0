package _SUKRU.ODEVLER.Cuma;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.List;

public class Scenario_2 extends BaseStaticDriver {
    public static void main(String[] args) throws AWTException {

//        SCENARIO 2:
//        -Navigate to "https://shopdemo.e-junkie.com/" website
//                -Click on 'Add to Cart' for 'Demo eBook'
//                -Click on 'Add Promo Code' button and enter "123456789"
//                -Click on 'Apply'
//                -Validate "Invalid promo code" message is displayed!

        driver.get("https://shopdemo.e-junkie.com/");

        WebElement demoEbookAddtoCard = driver.findElement(By.xpath("//*[@id='products']/div[1]/div/div[1]/a/div/div[2]/button"));
        demoEbookAddtoCard.click();

        driver.switchTo().frame(5);

        WebElement buttonAdd = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[class$='Show-Promo-Code-Button']")));
        buttonAdd.click();

        WebElement promoCode= driver.findElement(By.cssSelector("input[class='Promo-Code-Value']"));
        promoCode.sendKeys("123456789");

        Robot rbt=new Robot();
        rbt.keyPress(KeyEvent.VK_TAB);
        rbt.keyRelease(KeyEvent.VK_TAB);

        List<WebElement> hataMesaj = driver.findElements(By.xpath("//span[contains(text(),'Invalid promo code')]"));
        Assert.assertTrue(hataMesaj.size()>0);

        BekleKapat();

        }
}
