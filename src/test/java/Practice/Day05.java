package Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Day05 {

    static WebDriver driver;
    @BeforeClass

    public static void setup(){



        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }


   // @Before
   // public void SetUp2(){





    @Test
    public void test1(){
        driver.get("http://www.teknosa.com");
        WebElement  teknosa = driver.findElement(By.id("search-input"));
        teknosa.sendKeys("oppo" + Keys.ENTER);



    }

    /*
    https://www.teknosa.com adresine gidin
    arama cubuguna oppo yazin
    sonuc sayisini yazdir
    ilk urune tikla
    sepetime git
    consol da siparis ozeti webelementinin textini yazdir
    alisverisi tamamla
    son olarak teknosaya hosgeldin webelementinin textini yazdir
     */

}

