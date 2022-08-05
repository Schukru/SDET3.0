package _SUKRU.GUN_13;

import Utils.BaseStaticDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Soru2 extends BaseStaticDriver {
    public static void main(String[] args) throws IOException {

        driver.get("https://opensource-demo.orangehrmlive.com/");

        WebElement isim=driver.findElement(By.id("txtUsername"));
        isim.sendKeys("Şükrü");

        WebElement passw=driver.findElement(By.id("txtPassword"));
        passw.sendKeys("mmmmmmm");

        WebElement btnLogin=driver.findElement(By.id("btnLogin"));
        btnLogin.click();

        List<WebElement> spanMessage=driver.findElements(By.id("spanMessage"));
        if (spanMessage.size()>0){  // login olamayınca hata mesajı elementi id("spanMessage") sayısı 1 olacak
            // hata vereceği için ekran görüntüsü alalım
            System.out.println("Login olamadı. Hata mesajı gözüktü.");

            TakesScreenshot ts = (TakesScreenshot) driver;
            File hafizadakiHali=ts.getScreenshotAs(OutputType.FILE);

            // ToDo : resim görüntülerini zaman ayarlı isim vererek kayıt yapılmasını sağla
            FileUtils.copyFile(hafizadakiHali,new File("ekranGoruntuleri/" + tarihSaatDamgasi() + ".png"));

        }

    }
}
