package Practice;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.TestBase;

public class Day10 extends TestBase {


    @Test
            public void Test1(){
        String URL="http://automationpractice.com/index.php";
        driver.get(URL);
        driver.findElement(By.linkText("Sign in")).click();
        driver.findElement(By.cssSelector("[name='email_create']")).sendKeys("369@test.com");
        driver.findElement(By.xpath("//button[@name=\"SubmitCreate\"]")).click();
        driver.findElement(By.xpath("//input[@id=\"id_gender1\"]")).click();
        driver.findElement(By.name("customer_firstname")).sendKeys("Fato");
        driver.findElement(By.name("customer_lastname")).sendKeys("Nuro");
        driver.findElement(By.id("passwd")).sendKeys("kikiri");
        driver.findElement(By.id("firstname")).sendKeys("Fato");
        driver.findElement(By.id("lastname")).sendKeys("Nuro");
        driver.findElement(By.id("company")).sendKeys("Vera");
        driver.findElement(By.id("address1")).sendKeys("birkoylununevi");
        driver.findElement(By.id("city")).sendKeys("birsehir");
        WebElement statedropdown=driver.findElement(By.name("id_state"));
        Select oSelect=new Select(statedropdown);
        oSelect.selectByValue("4");
        driver.findElement(By.name("postcode")).sendKeys("27300");
        WebElement countrydropDown=driver.findElement(By.name("id_country"));
        Select oSelectC=new Select(countrydropDown);
        oSelectC.selectByVisibleText("United States");
        driver.findElement(By.id("phone_mobile")).sendKeys("234567890");
        driver.findElement(By.xpath("//input[@name=\"alias\"]")).clear();
        driver.findElement(By.xpath("//input[@name=\"alias\"]")).sendKeys("Office");
        driver.findElement(By.name("submitAccount")).click();
        String userText=driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).getText();
        if(userText.contains("Vsoft")) {
            System.out.println("User Verified,Test case Passed");
        }
        else {
            System.out.println("User Verification Failed,Test case Failed");
        }








    }


}
