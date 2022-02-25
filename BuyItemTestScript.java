import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.awt.*;
import java.sql.SQLOutput;

public class BuyItemTestScript {
    WebDriver driver;
    @Test(priority = 1)
    void OpenBrowser() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");
        Thread.sleep(2000);
    }
    @Test(priority = 2)
        void selectComputer() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/a")).click();
        Thread.sleep(2000);
        }
    @Test(priority = 3)
        void selectDesktop() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div[1]/div[2]/ul/li[1]/ul/li[1]/a")).click();
        Thread.sleep(2000);
        }
    @Test(priority = 4)
        void selectItem() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[3]/div/div[2]/h2/a")).click();
        Thread.sleep(2000);
        }
        @Test(priority = 5)
        void addItem() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-button-3\"]")).click();
        Thread.sleep(2000);
        }
       @Test(priority = 6)
        void shoppingCart() throws InterruptedException {
        driver.findElement(By.className("cart-label")).click();
        Thread.sleep(20000);
        }
//        @Test(priority = 7)
//        void changeQuantity() throws InterruptedException {
//        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div/form/div[1]/table/tbody/tr/td[5]/input")).sendKeys("2");
//        Thread.sleep(2000);
//        }
//        @Test(priority = 8)
//        void TermsAndCondition() throws InterruptedException {
//        driver.findElement(By.id("termsofservice")).click();
//        Thread.sleep(20000);
//        }
//        @Test(priority = 9)
//        void checkout() throws InterruptedException {
//        driver.findElement(By.id("checkout")).click();
//        Thread.sleep(2000);
//        }


    }

