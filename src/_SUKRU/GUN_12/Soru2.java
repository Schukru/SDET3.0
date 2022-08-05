package _SUKRU.GUN_12;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class Soru2 extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://www.selenium.dev/");

        List<WebElement> linkler =driver.findElements(By.cssSelector("a[target='_blank']"));

        for (WebElement link: linkler)
        {
            if (!link.getAttribute("href").contains("mailto"))
                link.click();
        }

        Set<String> windowsIdler=driver.getWindowHandles();  // tüm sayfaların id dizisi
        String anasayfaId= driver.getWindowHandle();  // anasayfanın id no

        for(String id : windowsIdler){
            if (id.equals(anasayfaId))
                continue;     // Anasayfa ise işlem yapma
            System.out.print("id = " + id);
            driver.switchTo().window(id);

            System.out.println("       id " + "- Title =" + driver.getTitle());
        }

        Bekle(3);
        BekleKapat();

    }
}
