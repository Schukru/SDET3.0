package _SUKRU.GUN_05;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Ders01 extends BaseStaticDriver {

    public static void main(String[] args) {

//        1- https://formsmarts.com/form/yu?mode=h5 sitesini açın
//        2- Business i çekleyin.
//        3- discover XYZ ye tıklatın ve online Advertising i seçin
//        4- Every day i seçin
//        5- Good u seçin
//        6- using XYZ yi tıklatın ve 3.seçeneği seçin


        driver.get("https://formsmarts.com/form/yu?mode=h5");

        WebElement el1= driver.findElement(By.id("u_1fG_4586_0"));
        el1.click();

//        WebElement el2=driver.findElement(By.ByTagName("label")





    }
}
