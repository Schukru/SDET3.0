package _SUKRU.GUN_11;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class Odev extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://testsheepnz.github.io/BasicCalculator.html");

        for (int i = 0; i < 5; i++) {

            int random1 = (int) (Math.random() * 100 + 1);
            String rndm1 = String.valueOf(random1);
            WebElement number1 = driver.findElement(By.cssSelector("#number1Field"));
            number1.sendKeys(rndm1);

            int random2 = (int) (Math.random() * 100 + 1);
            String rndm2 = String.valueOf(random2);
            WebElement number2 = driver.findElement(By.cssSelector("#number2Field"));
            number2.sendKeys(rndm2);

            WebElement islem = driver.findElement(By.cssSelector("#selectOperationDropdown"));
            Select islemMenu = new Select(islem);

            for (int j = 0; j < islemMenu.getOptions().size(); j++) {
                Bekle(1);
                islemMenu.selectByIndex(j);
                Bekle(1);

                WebElement calculate = driver.findElement(By.cssSelector("#calculateButton"));
                calculate.click();

                wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#numberAnswerField")));

                WebElement sonuc = driver.findElement(By.cssSelector("#numberAnswerField"));
                String actualResult = sonuc.getAttribute("value");
                String expectedResult = "";

                switch (j) {
                    case 0: expectedResult = String.valueOf(random1 + random2); break;
                    case 1: expectedResult = String.valueOf(random1 - random2); break;
                    case 2: expectedResult = String.valueOf(random1 * random2); break;
                    case 3: expectedResult = String.valueOf((double) random1 / random2); break;
                    case 4: expectedResult = rndm1 + rndm2; break;
                }

//                System.out.println(" String.valueOf((double) random1 / random2); = " +  String.valueOf((double) random1 / random2));
//                System.out.println(" String.valueOf((double) (random1 / random2)); = " + String.valueOf((double) (random1 / random2)));
//                System.out.println("  random1 / random2); = " + random1 / random2);

                Assert.assertEquals(expectedResult, actualResult);

                WebElement temizle= driver.findElement(By.id("clearButton"));
                temizle.click();

            }

            number1.clear();
            number2.clear();
        }
    }
}
