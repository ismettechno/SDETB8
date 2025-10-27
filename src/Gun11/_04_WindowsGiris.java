package Gun11;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class _04_WindowsGiris extends BaseDriver {
    // driver.quit();  // bütün açılmış windowları kapatır
    // driver.close(); // sadece bulunduğun window u kapatır.

    // a tag inde target="_blank"  attribute u var ise yeni pencerede(tab) da açar
    // target="_blank" değilse mesala target="_self" veya hiç bir şey yazmayabilir

    @Test
    public void Test1() {
        driver.get("https://www.selenium.dev/");
        MyFunc.Bekle(2);
        JavascriptExecutor js=(JavascriptExecutor)driver;

        String anasayfaWindowID= driver.getWindowHandle(); //bulunduğumm window un(Tab) id sini ver

        //linklere tıklatalım
        List<WebElement> linkler=driver.findElements(By.cssSelector("a[target='_blank']"));
        for(WebElement link: linkler)
            js.executeScript("arguments[0].click();", link);

        Set<String > windowIDler=driver.getWindowHandles();
        for (String id: windowIDler)
            System.out.println("id = " + id);


        BekleKapat();
    }


}
