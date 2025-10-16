package Gun06;

import Utility.BaseDriver;
import Utility.MyFuc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_Soru extends BaseDriver {

// 1- https://formsmarts.com/form/yu?mode=h5 sitesini açın
// 2- Business i çekleyin.
// 3- discover XYZ ye tıklatın ve online Advertising i seçin
// 4- Every day i seçin
// 5- Good u seçin
// 6- using XYZ yi tıklatın ve 3.seçeneği seçin
// css selector
// her bir tıklatma vs işlemin arasına MyFunc.Bekle(2);
//    input[type='radio'][value='Business']
//    option[value='Online Advertising']
//    input[type='radio'][value='Every Day']
//    input[type='radio'][value='Good']
//
//    option[value='I'm using XYZ for a month or more']-> valuenin içinde tek tırnak olduğundan çalışmadı
//    select[id$='_4597']>:nth-child(4)
    @Test
    public void Test1()
    {
        driver.get("https://formsmarts.com/form/yu?mode=h5");

        WebElement business=driver.findElement(By.cssSelector("input[type='radio'][value='Business']"));
        business.click();
        MyFuc.Bekle(2);

        WebElement optionOnlineAdvertising=driver.findElement(By.cssSelector("option[value='Online Advertising']"));
        optionOnlineAdvertising.click();
        MyFuc.Bekle(2);

        WebElement everyDayRadio=driver.findElement(By.cssSelector("input[type='radio'][value='Every Day']"));
        everyDayRadio.click();
        MyFuc.Bekle(2);

        WebElement goodRadio=driver.findElement(By.cssSelector("input[type='radio'][value='Good']"));
        goodRadio.click();
        MyFuc.Bekle(2);

        WebElement dropdownHowLong=driver.findElement(By.cssSelector("select[id$='_4597']>:nth-child(4)"));
        dropdownHowLong.click();
        MyFuc.Bekle(2);

        goodRadio.click();

        BekleKapat();
    }

}
