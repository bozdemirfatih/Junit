package Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Day05 {

     WebDriver driver;
    @Before

    public void setup(){



        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

    }


   // @Before
   // public void SetUp2(){





    @Test
    public void test1(){

            driver.get("https://www.google.com");
            driver.findElement(By.id("L2AGLb")).click();
            WebElement aramaButonu = driver.findElement(By.xpath("//input[@class='gLFyf']"));
            aramaButonu.sendKeys("Oppo" + Keys.ENTER);

            WebElement cikanSonuc = driver.findElement(By.id("result-stats"));
            System.out.println(cikanSonuc.getText());
            String sonucSayisi=cikanSonuc.getText();

            driver.get("https://www.amazon.de");
            driver.findElement(By.id("sp-cc-accept")).click();

          WebElement aramaButonu2 = driver.findElement(By.id("twotabsearchtextbox"));
          aramaButonu2.click();
        aramaButonu2.sendKeys("oppo" + Keys.ENTER);




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

