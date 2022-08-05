package _SUKRU.ODEVLER.Cuma;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class Scenario_3 extends BaseStaticDriver {
    public static void main(String[] args) {

//        SCENARIO 3:
//        -Navigate to "https://shopdemo.e-junkie.com/" website
//                -Click on 'Add to Cart' for 'Demo eBook'
//                -Click on 'Pay using Debit Card'
//                -Click on 'Pay' button without filling any information
//                -Validate "Invalid Email - Invalid Email - Invalid Billing Name" message is displayed!

        driver.get("https://shopdemo.e-junkie.com/");

        WebElement AddtoCart = driver.findElement(By.cssSelector("button[onclick*='1595015']"));
        AddtoCart.click();

        driver.switchTo().frame(5);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='Payment-Options']/button[3]")));
        WebElement debitCard = driver.findElement(By.xpath("//div[@class='Payment-Options']/button[3]"));
        debitCard.click();

        WebElement pay = driver.findElement(By.cssSelector("button[class='Pay-Button']"));
        pay.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Invalid Email')]")));

        List<WebElement> hataMesaj = driver.findElements(By.xpath("//span[contains(text(),'Invalid Email')]"));
        Assert.assertTrue(hataMesaj.size()>0);

        BekleKapat();
    }
}
