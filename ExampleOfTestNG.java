import com.sun.xml.internal.bind.v2.runtime.unmarshaller.TagName;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.internal.JsonToWebElementConverter;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import javax.swing.text.TabableView;

public class ExampleOfTestNG {
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
    void pressClose(){
        driver.findElement(By.xpath("//*[@id=\"bar-notification\"]/div/span")).click();
    }
    @Test(priority = 7)
    void shoppingCart() throws InterruptedException {
        driver.findElement(By.className("cart-label")).click();

    }
    @Test(priority = 8)
    void updateItem(){
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div/form/div[1]/table/tbody/tr/td[5]/input")).clear();
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div/form/div[1]/table/tbody/tr/td[5]/input")).sendKeys("3");
    }

    @Test(priority = 9)
    void updateCart(){
        driver.findElement(By.id("updatecart")).click();
    }
    @Test(priority = 10)
    void TermsAndCondition() throws InterruptedException {
        driver.findElement(By.id("termsofservice")).click();
    }
    @Test(priority = 11)
    void checkingOut() throws InterruptedException {
        driver.findElement(By.id("checkout")).click();
    }
    @Test(priority = 12)
    void GuestCheckOut(){
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[1]/div[3]/button[1]")).click();
    }
    @Test(priority = 14)
    void firstName(){
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[1]/div[2]/form/div/div/div[2]/div/div/div[1]/input")).sendKeys("Urvi");
    }
    @Test(priority = 15)
    void secondName(){
        driver.findElement(By.id("BillingNewAddress_LastName")).sendKeys("Dave");
    }
    @Test(priority = 16)
    void enterEmail(){
        driver.findElement(By.id("BillingNewAddress_Email")).sendKeys("urvi0123@gmail.com");
    }
    @Test(priority = 17)
    void enterCompany(){
        driver.findElement(By.id("BillingNewAddress_Company")).sendKeys("unify");
    }
    @Test(priority = 18)
    void selectCountry(){
        WebElement country = driver.findElement(By.name("BillingNewAddress.CountryId"));
        Select select = new Select(country);
        select.selectByVisibleText("United Kingdom");
    }
    @Test(priority = 19)
    void enterCity(){
        driver.findElement(By.id("BillingNewAddress_City")).sendKeys("Wembley");
    }
    @Test(priority = 20)
    void enterAddress(){
        driver.findElement(By.id("BillingNewAddress_Address1")).sendKeys("6,AspenDrive");
    }
    @Test(priority = 21)
    void enterPostCode(){
        driver.findElement(By.id("BillingNewAddress_ZipPostalCode")).sendKeys("HA0 2KH");
    }
    @Test(priority = 22)
    void enterMobileNumber(){
        driver.findElement(By.id("BillingNewAddress_PhoneNumber")).sendKeys("1234567890");
    }
    @Test(priority = 23)
    void clickContinue(){
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[1]/div[2]/div/button[4]")).click();
    }
//    @Test(priority = 24)
//    void selectContinueShippingMethod(){
//        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[3]/div[2]/form/div[2]/button")).click();
//    }

////    @Test(priority = 26)
//    void selectCreditCard(){
//        driver.findElement(By.id("paymentmethod_1")).click();
//    }
//    @Test(priority = 27)
//    void selectContinueToPaymentMethod(){
//        driver.findElement(By.className("button-1 payment-method-next-step-button")).click();
//    }
//    @Test(priority = 28)
//    void selectCreditCardType(){
//        WebElement card = driver.findElement(By.name("CreditCardType"));
//        Select select2 = new Select(card);
//        select2.selectByVisibleText("visa");
//    }
//    @Test(priority = 29)
//    void cardHolderName(){
//        driver.findElement(By.name("CardholderName")).sendKeys("Urmi Patel");
//    }
//    @Test(priority = 30)
//    void cardNumber(){
//        driver.findElement(By.id("CardNumber")).sendKeys("1234 5678 9012 3456");
//    }
//    @Test(priority = 31)
//    void selectExpireMonth(){
//        WebElement month = driver.findElement(By.id("ExpireMonth"));
//        Select select3 = new Select(month);
//        select3.selectByVisibleText("03");
//    }
//    @Test(priority = 32)
//    void selectExpireYear(){
//        WebElement year = driver.findElement(By.id("ExpireYear"));
//        Select select4 = new Select(year);
//        select4.selectByVisibleText("2033");
//    }
//    @Test(priority = 33)
//    void cardCode(){
//        driver.findElement(By.name("CardCode")).sendKeys("2748");
//    }
//    @Test(priority = 34)
//    void selectContinueToConfirm(){
//        driver.findElement(By.xpath("//*[@id=\"payment-info-buttons-container\"]/button")).click();
//    }
    @Test(priority = 24)
    void closeBrowser(){
        driver.quit();
    }

}
