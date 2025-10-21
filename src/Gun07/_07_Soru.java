package Gun07;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class _07_Soru extends BaseDriver {
    //    https://www.hepsiburada.com.tr/ sayfasına gidiniz.
    //    Moda -> Pantolon  click
    //    tıklatma işleminden sonra URL de
    //    pantolon kelimesinin geçtiğini doğrulayın.
    //    Yukarıdaki aksyonlar için Actions sınıfını kullanınız

    @Test
    public void Test1() {
        driver.get("https://www.hepsiburada.com/");
        MyFunc.Bekle(2);

//        // consent ve cookies kapatmaları
//        List<WebElement> ConsentButton=driver.findElements(By.xpath("//*[text()='Consent']"));
//        if (ConsentButton.size()>0) // Consent ekranda gözüktüyse
//            ConsentButton.get(0).click();
//
//        List<WebElement> KabulEtButton=driver.findElements(By.xpath("//*[text()='Kabul et']"));
//        if (KabulEtButton.size()>0) // KabulEtButton u ekranda gözüktüyse
//            KabulEtButton.get(0).click();

        WebElement moda=driver.findElement(By.xpath("//*[text()='Moda']"));
        new Actions(driver).moveToElement(moda).build().perform();
        MyFunc.Bekle(2);

        WebElement pantolon= driver.findElement(By.xpath("(//*[text()='Pantolon'])[2]"));
        pantolon.click();
        MyFunc.Bekle(2);

        Assert.assertTrue("Aranan kelime bulunamadı URL de",
                driver.getCurrentUrl().toLowerCase().contains("pantolon"));

        BekleKapat();
    }

}
