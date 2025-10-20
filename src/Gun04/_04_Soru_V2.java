package Gun04;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _04_Soru_V2 extends BaseDriver {

    public static void main(String[] args) {
        //DriverBaslat();

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


        BekleKapat();
    }
}
