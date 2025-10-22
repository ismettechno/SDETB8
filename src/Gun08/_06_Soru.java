package Gun08;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class _06_Soru extends BaseDriver {

//        Test Senaryosu
//        1- https://www.facebook.com/  sayfasına gidiniz
//        2- CreateNewAccount a tıklatınız.
//        3- Açılan yeni pencerede isim, soyisim ve emaili giriniz.
//        4- Doğum tarihinizi Select sınıfı ile seçiniz

    @Test
    public void test1() {
        driver.get("https://www.facebook.com/");
        MyFunc.Bekle(2);

        List<WebElement> cookiesAccept=driver.findElements(By.xpath("(//span[text()='Allow all cookies'])[2]"));
        if (cookiesAccept.size() > 0) //eğer elemanı bulabilmiş ise
            cookiesAccept.get(0).click();

        WebElement createAccount=driver.findElement(By.cssSelector("[data-testid='open-registration-form-button']"));
        createAccount.click();
        MyFunc.Bekle(2);

        List<WebElement> cookiesAccept2=driver.findElements(By.xpath("(//span[text()='Allow all cookies'])[2]"));
        if (cookiesAccept2.size() > 0) //eğer elemanı bulabilmiş ise
            cookiesAccept2.get(0).click();

        WebElement firstname=driver.findElement(By.name("firstname"));
        firstname.sendKeys("İsmet");

        WebElement lastname=driver.findElement(By.name("lastname"));
        lastname.sendKeys("Temur");
        MyFunc.Bekle(2);

        WebElement webDay=driver.findElement(By.id("day"));
        WebElement webMonth=driver.findElement(By.id("month"));
        WebElement webYear=driver.findElement(By.id("year"));

        Select day=new Select(webDay);
        Select month=new Select(webMonth);
        Select year=new Select(webYear);

        day.selectByValue("21");  // 21.02.1980
        month.selectByValue("2");
        year.selectByValue("1980");

        BekleKapat();
    }


}
