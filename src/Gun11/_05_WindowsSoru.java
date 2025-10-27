package Gun11;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class _05_WindowsSoru extends BaseDriver {

    /*
    Senaryo:
    https://www.selenium.dev/ adresindeki ayrı tab da açılan linklere tıklatınız.
    Açılan bütün yeni tablardaki sayfaların title ve url lerini yazdırınız.
    Daha sonra Anasayfa harici diğer tüm sayfaları kapatınız.
    */

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

        Set<String> windowsIdler=driver.getWindowHandles();
        for(String id: windowsIdler)
        {
            driver.switchTo().window(id); // sıradaki id li taba a geçtim
            System.out.println(driver.getCurrentUrl()+" - "+ driver.getTitle());
        }


        for(String id: windowsIdler)
        {
            if (id.equals(anasayfaWindowID)) continue; // benden sonrasını pas geç
            // yani sonraki adımdan devam et.

            driver.switchTo().window(id); // sıradaki id li taba a geçtim
            driver.close(); // bulunduğum pencereyi kapat
        }


        BekleKapat();
    }
}
