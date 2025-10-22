package Gun09;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _03_WaitsGiris extends BaseDriver {

    @Test
    public void Test1() {
        driver.get("https://letcode.in/waits");

        WebElement buton = driver.findElement(By.id("accept"));
        buton.click();

        MyFunc.Bekle(30); // java kodunu bekletiyor, ama web den haberi yok

        //bana öyle bir bekletme lazım ki web sayfasından hebri olacak ve gerekitiği kadar bekleyecek

        driver.switchTo().alert().accept();

        BekleKapat();
    }
}
