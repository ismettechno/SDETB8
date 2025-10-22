package Gun09;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _05_ExplicitWait extends BaseDriver {

    @Test
    public void Test1()
    {
        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");


        WebElement btn=driver.findElement(By.xpath("//button[@onclick='timedText()']"));
        btn.click();

        WebDriverWait beklemeSuresi=new WebDriverWait(driver, Duration.ofSeconds(20));
        //web i bekletme süresi

        beklemeSuresi.until(ExpectedConditions.textToBe(By.id("demo"), "WebDriver"));
        // demo isimli elemntin içeriği WebDriver olana kadar bekle

        WebElement msj=driver.findElement(By.xpath("//*[text()='WebDriver']"));
        System.out.println("msj.getText() = " + msj.getText());

        // WebDriver yazmasını istiyorum

        BekleKapat();


    }

}
