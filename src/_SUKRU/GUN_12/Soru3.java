package _SUKRU.GUN_12;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class Soru3 extends BaseStaticDriver {
    public static void main(String[] args) {

//   1- https://www.selenium.dev/  sayfasına gidiniz
//   2- Sayfadaki bütün yeni sayfa açan linkleri tıklatınız(mailto hariç)
//   3- Açılan bütün yeni sayfaları teker teker kapatınız

    driver.get("https://www.selenium.dev/");

    List<WebElement> linkler =driver.findElements(By.cssSelector("a[target='_blank']"));

    for (WebElement link: linkler)
    {
        if (!link.getAttribute("href").contains("mailto"))
            link.click();
    }

        Set<String> windowsIdler=driver.getWindowHandles();  // tüm sayfaların id dizisi

        for (String s: windowsIdler) {
            driver.switchTo().window(s);
        }

        for (String s: windowsIdler) {
            driver.switchTo().window(s);
            driver.close();
        }


    }
}
