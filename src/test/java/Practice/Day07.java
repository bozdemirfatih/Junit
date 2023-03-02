package Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Day07 {


    WebDriver driver;

    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
    }

    @Test
    //  ● Bir class olusturun: IframeTest
    //   ● https://the-internet.herokuapp.com/iframe adresine gidin.
    //   ● Bir metod olusturun: iframeTest
    //      ○ “An IFrame containing….” textinin erisilebilir oldugunu test edin
    //      ve  konsolda    yazdirin.
    //      ○ Text Box’a “Merhaba Dunya!” yazin.
    //      ○ TextBox’in altinda bulunan “Elemental Selenium”
    //      linkini textinin gorunur oldugunu dogrulayin ve  konsolda yazdirin.

    public void iframetest() throws InterruptedException {

        driver.get("https://www.Ebay.com");
        String ilkSayfaHandleDegeri = driver.getWindowHandle();
        String expectedicerik = "eBay";
        String actualTitle = driver.getTitle();
        Assert.assertTrue(actualTitle.contains(expectedicerik));


        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://facebook.com");
         expectedicerik = "Facebook";
        actualTitle = driver.getTitle();
        Assert.assertTrue(actualTitle.contains(expectedicerik));


        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://google.com");
        expectedicerik = "Google";
        actualTitle = driver.getTitle();
        Assert.assertTrue(actualTitle.contains(expectedicerik));


        //  Assert.assertTrue(actualTitle.contains(expectedicerik));

        driver.switchTo().window(ilkSayfaHandleDegeri);
        expectedicerik = "eBay";
        actualTitle=driver.getTitle();
        Assert.assertTrue(actualTitle.contains(expectedicerik));
        Thread.sleep(5000);






    }
    @After
    public void teardown(){
        driver.quit();

    }
}
