package _SUKRU.GUN_12;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Soru1 extends BaseStaticDriver {
    public static void main(String[] args) {

    driver.get("https://www.selenium.dev/");

    List<WebElement> linkler =driver.findElements(By.cssSelector("a[target='_blank']"));

    for (WebElement link: linkler) {
        if (!link.getAttribute("href").contains("mailto"))
            link.click();
    }

    Bekle(6);
    BekleKapat();

    }
}
