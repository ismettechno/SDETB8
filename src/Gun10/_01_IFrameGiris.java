package Gun10;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_IFrameGiris extends BaseDriver {

    @Test
    public void Test1() {
        driver.get("https://demo.automationtesting.in/Frames.html");

        // driver.switchTo().frame(0);  // index ile geçmek sırasına göre geçilebilir
        driver.switchTo().frame("singleframe"); // id vena name yazılarak geçilebilir

        //WebElement iframe1=driver.findElement(By.id("singleframe"));
        //driver.switchTo().frame(iframe1); // webElement olarak da geçilebilir
        //index > webelement> name > id    geçiş hız farkı

        WebElement text=driver.findElement(By.xpath("//input[@type='text']"));
        text.sendKeys("merhaba");
        // şu aşamada ben singleframe in gösterdiği sayfadayım
        // şu anda sadece bu sayfadaki locator lara erişebilirim
        // Ana sayfadaki veya diğer sayaflardaki lere erişmek için önce ana sayfa geçiş yapmama lazım

        // ya bir adım geri gel diyeceğiz. ya da direk ana sayfaya git diyebiliyoruz
        //driver.switchTo().parentFrame(); // bir geri gel   : burada ana sayfaya dönmüş olursun
        driver.switchTo().defaultContent(); // direk ana sayafa gider.

        BekleKapat();
    }

}
