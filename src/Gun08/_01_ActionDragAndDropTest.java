package Gun08;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class _01_ActionDragAndDropTest extends BaseDriver {

    @Test
    public void test1() {
        driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
        MyFunc.Bekle(2);

        WebElement sourceElement= driver.findElement(By.id("draggable"));
        WebElement targetElement= driver.findElement(By.id("droppable"));

        Actions aksiyonDriver=new Actions(driver);

        //1.Yöntem
        //aksiyonDriver.clickAndHold(sourceElement).build().perform(); // taşınacak olanı eline al
        //aksiyonDriver.moveToElement(targetElement).release().build().perform(); // üzerine götür ve burak

        //2.Yöntem
        aksiyonDriver.dragAndDrop(sourceElement,targetElement).build().perform();

        BekleKapat();
    }

}
