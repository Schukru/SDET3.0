package _SUKRU.GUN_12;

import Utils.BaseStaticDriver;
import com.sun.xml.internal.messaging.saaj.soap.ver1_1.Body1_1Impl;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class Odev extends BaseStaticDriver{
    public static void main(String[] args) {

//        1- https://www.youtube.com/ adresine gidiniz
//        2- "Selenium" kelimesi ile video aratınız.
//        3- Listelenen sonuçlarda 80 videoaya kadar lsiteyi uzatınız.
//        4- Son videonun title ını yazdırınız.

    driver.get("https://www.youtube.com/");

        WebElement aramaYaz= driver.findElement(By.cssSelector("div[id='search-input']>[id='search']"));
        aramaYaz.sendKeys("Selenium");

        WebElement aramaYap= driver.findElement(By.cssSelector("button[id='search-icon-legacy']"));
        aramaYap.click();

            Bekle(3);

        List<WebElement> videoListesi2=driver.findElements(By.cssSelector("a[id='thumbnail']"));
        System.out.println(videoListesi2.size());


//        ytd-video-renderer[bigger-thumbs-style='DEFAULT']
//        ytd-playlist-renderer[bigger-thumbs-style='DEFAULT']

//        List<WebElement> videoListesi1=driver.findElements(By.cssSelector("a[id='video-title']"));
//        System.out.println(videoListesi1.size());

//        List<WebElement> videoListesi2=driver.findElements(By.cssSelector("span[id='video-title']"));
//        System.out.println(videoListesi2.size());

//        List<WebElement> yeniListe= listeleriBirlestir(videoListesi1,videoListesi2);

        int i=1;
//        for (WebElement s: videoListesi1){
//            System.out.println(i + " - " + s.getAttribute("title"));
//            System.out.println(i++ + " href= " + s.getAttribute("href"));
//        }

        for (WebElement k: videoListesi2){
            System.out.println(i + " - " + k.getAttribute("title"));   //  1 ve 5 inci elemanlar
            System.out.println(i++ + " href= " + k.getAttribute("href"));
        }

//        JavascriptExecutor js=(JavascriptExecutor) driver;
//        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
//
//        int Boy1=0;
//        int Boy2=0;
//
//        do {
////            js.executeScript("window.scrollBy(0,200)");
//            js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
//            js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
//            Bekle(1);
//
//            videoListesi1=driver.findElements(By.cssSelector("a[id='video-title']"));
//            System.out.println("1- " + videoListesi1.size());
//
//            videoListesi2=driver.findElements(By.cssSelector("span[id='video-title']"));
//            System.out.println("2- " +videoListesi2.size());
//
//            //            wait.until(ExpectedConditions.visibilityOfAllElements(By.cssSelector("a[id='video-title']")));
//            Boy1=videoListesi1.size();
//            Boy2=videoListesi2.size();
//
//            System.out.println(Boy1+Boy2);
//
//        } while(Boy1 + Boy2 < 80);
//
//        System.out.println(Boy1+Boy2);
//
//Bekle(3);
//
//        videoListesi1=driver.findElements(By.cssSelector("a[id='video-title']"));
//        System.out.println("1- " + videoListesi1.size());
//
//        videoListesi2=driver.findElements(By.cssSelector("span[id='video-title']"));
//        System.out.println("2- " +videoListesi2.size());
//
//        //            wait.until(ExpectedConditions.visibilityOfAllElements(By.cssSelector("a[id='video-title']")));
//        Boy1=videoListesi1.size();
//        Boy2=videoListesi2.size();
//


    //BekleKapat();




//    }
//    public List<WebElement> listeleriBirlestir(List<WebElement> list1, List<WebElement> list2){
//
//        List<WebElement> yeniListe;
//
//        for (int i=0; i<Boy1+Boy2-1; i++){
//            yeniListe.add(list1.get(i));
//            yeniListe.add(list2.get(i));
//
//
//            for ()
//        }
//
    }
}



