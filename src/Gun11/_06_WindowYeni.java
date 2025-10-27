package Gun11;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.WindowType;

public class _06_WindowYeni extends BaseDriver {

    @Test
    public void Test1() {
        driver.get("https://www.selenium.dev/");
        MyFunc.Bekle(2);

        driver.switchTo().newWindow(WindowType.TAB); // yeni BOŞ sekme açıyor ve ona geçiyor

        //şu anda yeni boş sayfadayım
        driver.get("https://www.facebook.com/");



        BekleKapat();
    }


}
