package Gun03;

import Utility.MyFuc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _05_FindElementVeFindElements {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");

        // WebElement element= driver.findElement(By.className("hatalilocator"));
        // no such element: element bulunamadı

        List<WebElement> elements= driver.findElements(By.className("hatalilocator"));
        // findElements locator hatalı ise hata vermez boş list gönderir
        System.out.println(elements.size());
        if (elements.size()>0)
            System.out.println("element var ise işlemleri yapılır");

        // tek element olduğu halde, bazen çıkan bazen çıkmayan elementler için,
        // yine findelementS kullanılır, size ına bakılarak işlem yapılır veya devam edilir
        // böylece hata almadan işleme devam edilebilir
        MyFuc.Bekle(3);
        driver.quit();
    }
}
