package Gun04;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _04_Soru {
    // Senaryo:
    // 1-  https://form.jotform.com/221934510376353  sayfasınız açınız
    // 2-  isim kutucuğuna adınızı yazdırınız
    // 3-  soyad kutucuğuna soyadınız yazdırınız
    // 4-  Submit butona tıklatınız (click)
    // 5-  "Thank You" yazısını görünüyor ise "TEST PASSED" yazdırınız
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");

        WebElement isimKutusu=driver.findElement(By.id("first_8"));
        isimKutusu.sendKeys("İsmet");

        WebElement soyadKutusu=driver.findElement(By.id("last_8"));
        soyadKutusu.sendKeys("Temur");

        WebElement submitButton=driver.findElement(By.id("input_2"));
        submitButton.click();

        WebElement tesekkurYazisi=driver.findElement(By.className("thankyou-main-text"));
        System.out.println(tesekkurYazisi.getText());

        if (tesekkurYazisi.getText().contains("Thank"))
            System.out.println("TEST PASSED");
        else
            System.out.println("Failed!");


        MyFunc.Bekle(5);
        driver.quit();
    }

}
