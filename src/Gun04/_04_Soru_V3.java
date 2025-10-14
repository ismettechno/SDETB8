package Gun04;

import Utility.BaseDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.junit.Test;

public class _04_Soru_V3 extends BaseDriver {

    @Test
    public void Test1()
    {
        driver.get("https://form.jotform.com/221934510376353");

        WebElement isimKutusu=driver.findElement(By.id("first_8"));
        isimKutusu.sendKeys("İsmet");

        WebElement soyadKutusu=driver.findElement(By.id("last_8"));
        soyadKutusu.sendKeys("Temur");

        WebElement submitButton=driver.findElement(By.id("input_2"));
        submitButton.click();

        WebElement tesekkurYazisi=driver.findElement(By.className("thankyou-main-text"));
        System.out.println(tesekkurYazisi.getText());

        Assert.assertTrue("Aranılan mesaj bulunamadı", tesekkurYazisi.getText().contains("Thank"));
        //Ben true bekliyorum, değilse göster, yoksa test passed

        BekleKapat();
    }
}
