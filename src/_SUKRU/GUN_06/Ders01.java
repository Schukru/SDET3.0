package _SUKRU.GUN_06;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Ders01 extends BaseStaticDriver {

    public static void main(String[] args) {

//        +  -> bitişik kardeş -> following-sibling
//        ~  -> bütün kardeşlerde arama - following
//
//                >  -> çocuklar  /
//                space -> bütün çocuklar //
//
//        1- https://www.saucedemo.com/  sitesini açın
//        2- login işlemini yapınız.
//        3- Sauce Labs Backpack  a tıklatın ve sepete ekletin.
//        4- Sonra geri dönün
//        5- Sauce Labs Bolt T-Shirt  a tıklatın ve sepete ekleyin.
//        6- sepete tıklatın
//        7- CheckOut a tıklatın
//        8- kullanıcı bilgilerini doldurup Continue ya tıklatın
//        9- Burada her bir eşyanın ücretlerinin toplamının aşağıdaki
//        Item total e eşit olup olmadığını if/Assert ile test ediniz.

        driver.get("https://www.saucedemo.com/");

//        WebElement vUser= driver.findElement(By.xpath("//div[@id='login_credentials']/h4//following::text()[1]"));
//        WebElement vPass= driver.findElement(By.xpath("//div[@class='login_password']"));
//
        WebElement log= driver.findElement(By.xpath("//input[@id='user-name']"));
        WebElement pass= driver.findElement(By.xpath("//input[@id='password']"));

        log.sendKeys("standard_user");
        pass.sendKeys("secret_sauce");

        WebElement submit= driver.findElement(By.xpath("//input[@id='login-button']"));
        submit.click();

        WebElement BackPack= driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
        BackPack.click();









//
//        interviewlarda kaç çeşit xpath vardır şeklinde soru gelebilir.
//
//        Relative Xpath denir.

      //*[@id='login-button']
//        1- // başlıyor.
//                2- Elemanı direk bulur, baştan itibaren diğer elemanlara bağlı kalmaz.
//
//                Absolute Xpath deniyor.
//           /html/body/div[2]/div/div/div/form/input
//        1- / başlıyor.
//        2- En baştan HTML den başlyarak bir yol bulur.Araya başka eleman girdiğind eyol kaybolur.
//        Bu yüzden kullanışsızdır.
//                YENİ
//                [19:44]
//        XPath'in herhangi bir yerindeki tek bir eğik çizgi '/',
//        öğeyi hemen ana öğesinin içinde aramak anlamına gelir.
//        Çift eğik çizgi '//', ana öğenin içindeki herhangi
//        bir alt öğeyi veya herhangi bir torun öğeyi aramayı belirtir.
//
///  = >

    // = space

//        XPath: //div/a
//        CSS: div > a
//
//        XPath: //div//a
//        CSS: div a
//
//        XPath: //div[@id='example']
//        CSS: #example
//
//        XPATH: //input[@id='username']/following-sibling::input[1]
//        CSS: #username + input
//
//        XPATH: //input[@name='username']
//        CSS: input[name='username']
//
//        XPATH: //input[@name='login'and @type='submit']
//        CSS: input[name='login'][type='submit']
//
//
//        CSS: #recordlist li:nth-of-type(4)
//        CSS: #recordlist li:nth-child(4)
//        CSS: #recordlist *:nth-child(4)
//
//
//        xpath:
////fieldset[contains(@id,'4586')]
////fieldset[starts-with(@id,'u_ly6_4')]
////fieldset[ends-with(@id,'4')] .. çalışmadı....
//
//
//        CSS: a[id^='id_prefix_']
//        CSS: a[id$='_id_sufix']
//        CSS: a[id*='id_pattern']
//
//
//
//        Xpath=//*[@type='submit' OR @name='btnReset']
//                Xpath=//input[@type='submit' and @name='btnLogin']
//                        Xpath=//label[starts-with(@id,'message')]





    }
}
