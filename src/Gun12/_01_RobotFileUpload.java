package Gun12;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class _01_RobotFileUpload extends BaseDriver {

    @Test
    public void Test1() throws AWTException {
        driver.get("https://letcode.in/file");
        MyFunc.Bekle(2);


        Robot rbt = new Robot();

        //6 kere TAB a bas bırak
        for (int i = 0; i < 6; i++) {
            rbt.keyPress(KeyEvent.VK_TAB);
            rbt.keyRelease(KeyEvent.VK_TAB);
        }

        // sonra ENTER
        rbt.keyPress(KeyEvent.VK_ENTER);
        rbt.keyRelease(KeyEvent.VK_ENTER);
        MyFunc.Bekle(2);

        //hafızaya kopyalanmış hale getirmem lazım, dosyanın yolunu
        StringSelection dosyaYolu= new StringSelection("C:\\Users\\TechnoStudy\\Desktop\\test.txt"); //seçme
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(dosyaYolu, null);  // ctrl+c
         // ctrl+C, panoya gitti, panoya kopyalandı

        //sonra ctrl+v ile yapıştırıcam açılan pencereye
        rbt.keyPress(KeyEvent.VK_CONTROL);
        rbt.keyPress(KeyEvent.VK_V);
        rbt.keyRelease(KeyEvent.VK_V);
        rbt.keyRelease(KeyEvent.VK_CONTROL);

        rbt.keyPress(KeyEvent.VK_ENTER);
        rbt.keyRelease(KeyEvent.VK_ENTER);
        MyFunc.Bekle(2);

        WebElement dosyaSecildiMesaji=driver.findElement(By.cssSelector("div[class='file']+p"));

        Assert.assertTrue("Dosya seçilemedi", dosyaSecildiMesaji.getText().contains("test.txt"));


        BekleKapat();
    }

}
