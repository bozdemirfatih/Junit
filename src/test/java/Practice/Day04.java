package Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.time.Duration;

public class Day04 {
    /*
        www.bestbuy.com a git
        sayfa basliginin best icerdigini test
        ayrica relative locator kullan

        logo test bes buy logosunun görüntülenip gorüntülenmedigini test et
        mexicolinktest linkin görüntülenip görüntülenmedigini test et

     */
    static WebDriver driver;

    @BeforeClass
    public static void setUp(){

            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


    }
    @AfterClass
    public static void tearDown(){


    }
    @Before
    public void SetUp2(){
        driver.get("http://www.bestbuy.com");


    }
    @After
    public void Setup3(){


    }


    @Test
    public void baslikTesti(){
        // SAYFA BASLIGININ BEST ICERDIGINI DOGRULAYIN
        String title= driver.getTitle();
        boolean iceriyormu =title.contains("Best");

        Assert.assertTrue("Title Best Kelimesi icermiyor", iceriyormu);


    }
    @Test
    public void logoTesti(){
        WebElement helloHeading = driver.findElement(By.xpath("//div[@class='heading'][1]"));
        WebElement bestBuyLogo = driver.findElement(RelativeLocator.with(By.tagName("img")).above(helloHeading));

        Assert.assertTrue(bestBuyLogo.isDisplayed());



    }
    @Test
    public void linkTesti(){
        WebElement usFlag = driver.findElement(By.xpath("//img[@alt='United States'][1]"));
        WebElement mexicoFlag = driver.findElement(RelativeLocator.with(By.tagName("img")).toRightOf(usFlag));
        Assert.assertTrue(mexicoFlag.isDisplayed());

    }



}
