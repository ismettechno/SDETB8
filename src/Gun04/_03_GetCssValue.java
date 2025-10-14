package Gun04;

import Utility.MyFuc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _03_GetCssValue {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");

        WebElement element=driver.findElement(By.id("sublabel_8_first"));

        // Şekillendiren özellikleri, renk, fontu, background yani class ın içindekiler
        System.out.println("element.getCssValue(color) = " + element.getCssValue("color"));
        System.out.println("element.getCssValue(font-size) = " + element.getCssValue("font-size"));
        System.out.println("element.getCssValue(font-family) = " + element.getCssValue("font-family"));
        System.out.println("element.getCssValue(min-height) = " + element.getCssValue("min-height"));

        MyFuc.Bekle(5);
        driver.quit();


    }
}
