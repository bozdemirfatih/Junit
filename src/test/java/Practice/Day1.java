
package Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Day1 {

    WebDriver driver;
    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));



    }


    /*
    beforeclass ile dreiveri olusturun ve las icinda static yapin
    maximixexe edin ve 10 sn bekletin
    https://www.google.com git
    The lord of the rings yazip cikan sonuc sayisini yazdirin
    arama kutusuna brave heart yyazdirin cikan sonuc sayisini yazdirin
    harry potter yazin cikan sonuc sayisini yazdirin
     */
        @After
        public void teardown(){
           // driver.close();

        }

    @Test
    public void googletest(){
            driver.get("https://www.google.com");
            driver.findElement(By.id("L2AGLb")).click();
        WebElement aramaButonu = driver.findElement(By.xpath("//input[@class='gLFyf']"));
        aramaButonu.sendKeys("The Lord Of The Rings" + Keys.ENTER);

        WebElement cikanSonuc = driver.findElement(By.id("result-stats"));
        System.out.println(cikanSonuc.getText());
        String sonucSayisi=cikanSonuc.getText();
       // System.out.println(sonucSayisi);
        //About 229.000.000 results (0,61 seconds)
        /*sonucSayisi=sonucSayisi.substring(
                (sonucSayisi.indexOf ("results")-1),
                (sonucSayisi.indexOf("About")+6)*/



        //System.out.println(sonucSayisi);


    }





}