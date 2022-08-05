package _SUKRU.GUN_10;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.openqa.selenium.By.id;

public class Soru1 extends BaseStaticDriver {

    public static void main(String[] args) {

        /*
Bu siteye gidiniz.  http://demo.seleniumeasy.com/ajax-form-submit-demo.html
        Name giriniz.
        Comment giriniz.
        Submit'e tıklayınız.
        Form submited Successfully! yazısı görüntülenmelidir.
        assert ile kontrol ediniz
 */

        driver.get("http://demo.seleniumeasy.com/ajax-form-submit-demo.html");

        WebElement isim= driver.findElement(By.cssSelector(".form-control[type='text']"));
        isim.sendKeys("Şükrü");

        WebElement yorum= driver.findElement(By.cssSelector("#description.form-control"));
        yorum.sendKeys("comment");

        WebElement dugme= driver.findElement(By.cssSelector("input[type='button']"));
        dugme.click();

        WebElement yazi= driver.findElement(By.cssSelector("div[id='submit-control']"));

        wait.until(ExpectedConditions.textToBe(By.id("submit-control"), "Form submited Successfully!"));

        Assert.assertEquals("Form submited Successfully!",yazi.getText());

        BekleKapat();
    }


}
