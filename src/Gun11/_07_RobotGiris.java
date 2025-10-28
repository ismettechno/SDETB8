package Gun11;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

public class _07_RobotGiris extends BaseDriver {

    @Test
    public void Test1() throws AWTException {
        driver.get("https://www.selenium.dev/");
        MyFunc.Bekle(2);

        //Klavyeden ctrl+tab a basarak yeni bir sekme açıp, başka sayfa çağıralım.
        // Bunu bu sefer ROBOT class la yapalım
        Robot rbt=new Robot();

        //ctrl basıyorum sonra T ye basıp, sonra T yi ve CTRL tuşlarını bırakıyorum
        //Yeni pencere açalım
        rbt.keyPress(KeyEvent.VK_CONTROL);// klavye CTRL tuşuna bas  // KeyEvent.VK_META); Mac lerde CTRL
        rbt.keyPress(KeyEvent.VK_T);  // T tuşu
        rbt.keyRelease(KeyEvent.VK_T);
        rbt.keyRelease(KeyEvent.VK_CONTROL);
        MyFunc.Bekle(2);

        // yeni açılmış TAB(window) a geçelim
        Set<String> idler=driver.getWindowHandles();
        Iterator gosterge=idler.iterator();
        gosterge.next(); // şu anda 1.window (ID)u gösteriyor
        String ikinciID= gosterge.next().toString(); // 2.id yi gösteriyor

        driver.switchTo().window(ikinciID);
        driver.get("https://www.facebook.com/");


       BekleKapat();
    }
}
