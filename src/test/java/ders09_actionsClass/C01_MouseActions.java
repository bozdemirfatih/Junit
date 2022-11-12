package ders09_actionsClass;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

import javax.swing.*;

public class C01_MouseActions extends TestBase {

@Test
    public void test01() throws InterruptedException {
    driver.get("https://www.amazon.com");

    // Account&List menusunden "create a list" linkini tiklayin
    //driver.findElement(By.xpath("//span[text()='Create a List']")).click(); olmadi cunku
    //mousein oraya gidip durmasi lazimdi

    // sayfanin en altindaki USD butonuna basin
    // driver.findElement(By.xpath("//*[text()='USD - U.S. Dollar']")).click();
    // Thread.sleep(5000);

    /*
          Bir test gerceklestirilirken mouse veya klavye ile ekstra islemler yapmak gerekebilir
          Ornegin create a list linkini tiklayabilmek icin
          Account&List menusunun uzerinde beklemek gerekir
          Driver genellikle (web developer'larin kullandiklari argumanlara gore degisebilir)
          gorebildigi web elementleri kullanabilir
          Selenium mouse ve klavye ile yapabilecegimiz tum fonksiyonlari
          driver ile gerceklestirebilmek icin
          Actions class'ini olusturmustur.
         */

    Actions acctions= new Actions(driver);

    WebElement accountListElementi= driver.findElement(By.xpath("//*[text()='Account & Lists']"));
    acctions.moveToElement(accountListElementi).perform();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//span[text()='Create a List']")).click();
    Thread.sleep(3000);
}

}
