package Gun12;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class _02_EkranKaydet extends BaseDriver {

    @Test
    public void Test1() throws IOException {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        MyFunc.Bekle(2);

//        WebElement username=driver.findElement(By.name("username"));
//        username.sendKeys("ismet");

        driver.findElement(By.name("username")).sendKeys("ismet");
        driver.findElement(By.name("password")).sendKeys("ismet");
        driver.findElement(By.cssSelector("button[type='submit']")).click();

        List<WebElement> errorMsg=driver.findElements(By.xpath("//*[text()='Invalid credentials']"));
        if (errorMsg.size()>0) // hata mesajı çıkmıştır
        {
            System.out.println("Hata oldu, ekran görüntüsünü alıyoruz");
            //ekran kaydını al

            TakesScreenshot ts=(TakesScreenshot) driver;
            File hafizadaDosyaHalinde=ts.getScreenshotAs(OutputType.FILE); // hafızaya alındı, Dosya Tipinde

            // yani hafızadaki resim bilgisini, gerçek fiziksel bir dosyaya yazan metoda ihtyiacım var.
            // bu JAVA nın kendi içinde yok, bunun için yaz<ılmış kütüphaneye projeye eklememiz lazım.
            FileUtils.copyFile(hafizadaDosyaHalinde, new File("ekranGoruntuleri/screenshot.jpg"));

        }


        BekleKapat();
    }

}
