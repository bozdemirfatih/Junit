package Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Day08 {
    WebDriver driver;




    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
    }

    @Test
    public void teknosaTest() throws InterruptedException {
        driver.get("https://www.internethaber.com");
        String teknosaHandle = driver.getWindowHandle();
        driver.findElement(By.xpath("//p[@class='fc-button-label'][1]")).click();
       // WebElement iframeElement = driver.findElement(By.xpath("//div[@class='BildirtChromeModal-content']"));
        //driver.switchTo().frame(iframeElement);


        WebElement iframeElementi= driver.findElement(By.id("BildirtEvet"));
        iframeElementi.click();
        driver.switchTo().defaultContent();



        WebElement clikck = driver.findElement(By.xpath("//a[@title='İnternet Haber Facebook']"));
        clikck.click();
        Thread.sleep(5000);


    }

    @After
    public void teardown(){
       // driver.close();

    }
}
