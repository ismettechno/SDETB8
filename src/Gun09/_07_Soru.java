package Gun09;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class _07_Soru extends BaseDriver {

    @Test
    public void Test1() {
        driver.get("https://letcode.in/waits");

        WebElement buton = driver.findElement(By.id("accept"));
        buton.click();

        //bana öyle bir bekletme lazım ki web sayfasından hebri olacak ve gerekitiği kadar bekleyecek

        bekle.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();

        BekleKapat();
    }

}
