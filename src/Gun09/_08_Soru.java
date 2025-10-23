package Gun09;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class _08_Soru extends BaseDriver {

//    Senaryo
//    1- https://testsheepnz.github.io/BasicCalculator.html sitesine gidiniz.
//    2- random 100 e kadar 2 sayı üretiniz.
//    3- Sayıları hesap makinesinin sadece Add(toplama) için çalıştırınız.
//    4- Sonuçları Assert ile kontrol ediniz.
//    5- Yukarıdaki işlemi 5 kez tekrar ettiriniz.

    @Test
    public void Test1()
    {
        driver.get("https://testsheepnz.github.io/BasicCalculator.html");
        MyFunc.Bekle(2);

        for(int i=0;i<5;i++) {

            int sayi1 = MyFunc.RandomSayiVer(100);
            int sayi2 = MyFunc.RandomSayiVer(100);

            int beklenenSonuc = sayi1 + sayi2;

            WebElement txtBox1 = driver.findElement(By.id("number1Field"));
            WebElement txtBox2 = driver.findElement(By.id("number2Field"));
            WebElement btnCalculate = driver.findElement(By.id("calculateButton"));
            WebElement answerField = driver.findElement(By.id("numberAnswerField"));
            WebElement clearButton = driver.findElement(By.id("clearButton"));

            txtBox1.sendKeys(String.valueOf(sayi1));
            txtBox2.sendKeys(String.valueOf(sayi2));
            btnCalculate.click();

            bekle.until(ExpectedConditions.visibilityOf(answerField));

            int olusanToplam = Integer.parseInt(answerField.getAttribute("value")); //oluşan değer value attribute da
            Assert.assertTrue("Toplam hatalı", beklenenSonuc == olusanToplam);

            txtBox1.clear();
            txtBox2.clear();
            clearButton.click();
        }

        BekleKapat();
    }


}
