package _SUKRU.GUN_09;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;


public class proje1 extends BaseStaticDriver {
    public static void main(String[] args) {


        driver.get("http://a.testaddressbook.com/sign_in");

        WebElement userName = driver.findElement(By.id("session_email"));
        userName.sendKeys("esargl147@gmail.com");

        WebElement password = driver.findElement(By.id("session_password"));
        password.sendKeys("123456");

        WebElement buton = driver.findElement(By.cssSelector("[value='Sign in']"));
        Bekle(2);
        buton.click();
        Bekle(2);
        WebElement addresses = driver.findElement(By.linkText("Addresses"));
        addresses.click();
        Bekle(2);
        WebElement newAddresses = driver.findElement(By.linkText("New Address"));
        newAddresses.click();

        WebElement firstName = driver.findElement(By.id("address_first_name"));
        firstName.sendKeys("Fernando");

        WebElement lastName = driver.findElement(By.id("address_last_name"));
        lastName.sendKeys("Torres");

        WebElement address1 = driver.findElement(By.id("address_street_address"));
        address1.sendKeys("Anfield Rd");

        WebElement address2 = driver.findElement(By.id("address_secondary_address"));
        address2.sendKeys("Anfield");

        WebElement city = driver.findElement(By.id("address_city"));
        city.sendKeys("Liverpool");

        WebElement element = driver.findElement(By.id("address_state"));
        Actions aksiyonlar = new Actions(driver);
        Action aksiyon = aksiyonlar
                .moveToElement(element)
                .click()
                .sendKeys("F")
                .build();
        aksiyon.perform();

        aksiyon = aksiyonlar.sendKeys(Keys.ENTER).build();
        aksiyon.perform();

        WebElement zipCode = driver.findElement(By.id("address_zip_code"));
        zipCode.sendKeys("L4 0TH");

        Bekle(2);
        driver.findElement(By.id("address_country_us")).click();

        WebElement birthDay = driver.findElement(By.id("address_birthday"));
        birthDay.sendKeys("20.03.1984");

        driver.findElement(By.id("address_age")).sendKeys("36");
        driver.findElement(By.id("address_website")).sendKeys("https://www.google.com/");
        driver.findElement(By.id("address_phone")).sendKeys("8625747878");
        driver.findElement(By.id("address_interest_climb")).click();
        driver.findElement(By.id("address_interest_dance")).click();
        driver.findElement(By.id("address_note")).sendKeys("Never Back Down !");
        driver.findElement(By.cssSelector("[name='commit']")).click();

        String name = driver.findElement(By.xpath("//*[text()=' Fernando']")).getText();
        Assert.assertEquals("Fernando", name);

        String lastName1 = driver.findElement(By.xpath("//*[text()=' Torres']")).getText();
        Assert.assertEquals("Torres", lastName1);

        WebElement addresses2 = driver.findElement(By.xpath("//a[@data-test='addresses']"));
        Bekle(2);
        addresses2.click();
        Bekle(2);
        driver.findElement(By.cssSelector("body > div > table > tbody > tr:nth-child(1) > td:nth-child(6) > a")).click();

        WebElement name2 = driver.findElement(By.id("address_first_name"));
        name2.clear();
        name2.sendKeys("Peter");

        WebElement lastname3 = driver.findElement(By.id("address_last_name"));
        lastname3.clear();
        lastname3.sendKeys("Crouch");

        Bekle(2);
        driver.findElement(By.name("commit")).click();

        String name3 = driver.findElement(By.xpath("//*[text()=' Peter']")).getText();
        Assert.assertEquals("Peter", name3);

        String lastName3 = driver.findElement(By.xpath("//*[text()=' Crouch']")).getText();
        Assert.assertEquals("Crouch", lastName3);

        Bekle(2);
        driver.findElement(By.linkText("Addresses")).click();
        Bekle(2);
        driver.findElement(By.cssSelector("body > div > table > tbody > tr:nth-child(1) > td:nth-child(7) > a")).click();

        driver.switchTo().alert().accept();

        String actualResult = driver.findElement(By.xpath("//*[text()='Address was successfully destroyed.']")).getText();
        Assert.assertEquals("Address was successfully destroyed.", actualResult);

        BekleKapat();

    }
}
