package Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Day03 {
    static WebDriver driver;

    @BeforeClass
    public static void setup3(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


    }
    @Before
    public void setup(){
        driver.get("https://www.google.com");
    }

    @Test
    public void test1(){

        driver.findElement(By.id("L2AGLb")).click();
        WebElement aramaButonu = driver.findElement(By.xpath("//input[@class='gLFyf']"));
        aramaButonu.sendKeys("The Lord Of The Rings" + Keys.ENTER);

        WebElement cikanSonuc = driver.findElement(By.id("result-stats"));
        System.out.println("THE LOrd " + cikanSonuc.getText());
        String sonucSayisi=cikanSonuc.getText();

    }
    @Test
    public void test2(){


        WebElement aramaButonu = driver.findElement(By.xpath("//input[@class='gLFyf']"));
        aramaButonu.sendKeys("Brave  Heart " + Keys.ENTER);

        WebElement cikanSonuc = driver.findElement(By.id("result-stats"));
        System.out.println("Brave "+ cikanSonuc.getText());
        String sonucSayisi=cikanSonuc.getText();


    }



    @Test
    public void test3(){

        WebElement aramaButonu = driver.findElement(By.xpath("//input[@class='gLFyf']"));
        aramaButonu.sendKeys("Harry Potter" + Keys.ENTER);

        WebElement cikanSonuc = driver.findElement(By.id("result-stats"));
        System.out.println("Harry " + cikanSonuc.getText());
        String sonucSayisi=cikanSonuc.getText();




    }
    @After
    public void afterTest(){



    }

    @AfterClass
    public static void setup4(){


    }


}
