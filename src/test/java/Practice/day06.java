package Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class day06 {

    static WebDriver driver;

    @BeforeClass
    public static void setUp(){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


    }
    @Test
    /*
    Launch browser
2. Navigate to url 'http://automationexercise.com'
3. Click on 'Products' button
4. Verify user is navigated to ALL PRODUCTS page successfully
5. Click on 'View Product' button
6. Verify 'Write Your Review' is visible
7. Enter name, email and review
8. Click 'Submit' button

     */
    public void test01(){
        driver.get("http://automationexercise.com");
        WebElement products = driver.findElement(By.xpath("//a[@href='/products']"));



        driver.findElement(By.xpath("//span[@dir='auto'][1]")).click();

        System.out.println(driver.getCurrentUrl());


    }

}
