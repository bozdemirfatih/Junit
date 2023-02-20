package Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Day02 {
    WebDriver driver;
    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    };

    /*
    1. Launch browser
2. Navigate to url 'http://automationexercise.com'
3. Verify that home page is visible successfully
4. Click on 'Contact Us' button
5. Verify 'GET IN TOUCH' is visible
6. Enter name, email, subject and message
7. Upload file
8. Click 'Submit' button
9. Click OK button
10. Verify success message 'Success! Your details have been submitted successfully.' is visible
11. Click 'Home' button and verify that landed to home page successfully
     */

    @Test
    public void test1(){
        driver.get("http://automationexercise.com");
        WebElement contactUs = driver.findElement(By.xpath("//a[@href='/contact_us']"));
        contactUs.click();
        //5. Verify 'GET IN TOUCH' is visible
        WebElement getintouch = driver.findElement(By.xpath("//h2[@class='title text-center'][1]"));
        if (getintouch.isDisplayed())
            System.out.println("The title is GetinTouch is displayed test PASSED");
                    else System.out.println("test NOT PASSED");

       // 6. Enter name, email, subject and message

        WebElement name = driver.findElement(By.xpath("//input[@type=\"text\"][1]"));
        name.sendKeys("Fatih");
        WebElement mail = driver.findElement(By.xpath("//input[@type=\"email\"][1]"));
        mail.sendKeys("fff@gmail.com");
        WebElement subject = driver.findElement(By.xpath("//input[@data-qa='subject']"));
        subject.sendKeys("hello world");
        WebElement message = driver.findElement(By.xpath("//textarea[@name='message']"));
        message.sendKeys("Baris ve sevgi dolu bir dunya diliyorum");

        WebElement submit = driver.findElement(By.xpath("//input[@type='submit']"));



       // WebElement choosefile = driver.findElement(By.xpath("//input[@type='file']"));







    }



}
