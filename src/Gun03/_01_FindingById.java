package Gun03;

import Utility.MyFuc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_FindingById {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");

        // locatorlar : id=first_8   id=last_8
        // elementi bul, işlemi, yaptır, sonucu kontrol et

        WebElement isimKutusu = driver.findElement(By.id("first_8")); // first_8 id ile elemanı bul
        isimKutusu.sendKeys("İsmet");   // sendkeys: yazı gönder

        MyFuc.Bekle(2);
        WebElement soyisimKutusu = driver.findElement(By.id("last_8")); // last_8 id ile elemanı bul
        soyisimKutusu.sendKeys("Temur");   // sendkeys: yazı gönder

        MyFuc.Bekle(5);
        driver.quit(); // açılmış tarayıcıyı kapat, yani hafızadan sil
    }
}
