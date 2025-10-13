package Gun02;

import Utility.MyFuc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_OpeningWebsite {
    public static void main(String[] args) throws InterruptedException {
        WebDriver tarayici=new ChromeDriver();

        tarayici.get("https://www.google.com/");

        MyFuc.Bekle(3);
        tarayici.quit();
    }
}
