package _SUKRU.GUN_13;

import Utils.BaseStaticDriver;
import org.openqa.selenium.Dimension;


public class Soru3 extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://www.youtube.com/");

        driver.manage().window().maximize();
        Bekle(4);

        Dimension dim = new Dimension(516,600);
        driver.manage().window().setSize(dim);

        BekleKapat();

    }
}
