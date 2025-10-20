package Gun04;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _01_FindingElements_tag {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.mediamarkt.com.tr/");
        MyFunc.Bekle(5);

        // bütün a ile başlayan web elementlerini istiyoruz
        List<WebElement> linkler=driver.findElements(By.tagName("a"));

        for(WebElement e: linkler)
            if (!e.getText().equals("")) // boşluk OLMAYANLAR(!)
              System.out.println(e.getText());

        MyFunc.Bekle(5);
        driver.quit();
    }
}
