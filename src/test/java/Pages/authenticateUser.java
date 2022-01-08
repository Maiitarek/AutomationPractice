package Pages;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;


public class authenticateUser extends authenticateUserObjects{

    public void reachURL() {
        System.setProperty("webdriver.chrome.driver","./Tools\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("http://automationpractice.com/index.php");
    }

    public void passUserData() throws InterruptedException {
        driver.findElement(By.xpath(signInBtn)).click();
        driver.findElement(By.xpath(email)).sendKeys("reemmohey@ggmail.com");
        driver.findElement(By.xpath(passwd)).sendKeys("reem123");
        driver.findElement(By.xpath(submitLogin)).click();
        Assert.assertEquals(true, driver.findElement(By.xpath(signOutBtn)).isDisplayed());
        //driver.findElement(By.xpath(signOutBtn)).click();
    }

    public void selectBlouses() {
        WebElement element= driver.findElement(By.xpath("//a[@title='Women']"));
        new Actions(driver).moveToElement(element).build().perform();
        new WebDriverWait(driver, 3).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(blouses)));
        driver.findElement(By.xpath(blouses)).click();
        Assert.assertEquals(true, driver.findElement(By.xpath(imgDisplayed)).isDisplayed());
    }

    public void selectProduct(){
        driver.findElement(By.xpath(imgDisplayed)).click();
        Assert.assertEquals(true, driver.findElement(By.xpath(addToCartBtn)).isDisplayed());
    }

    public void proceedToCheckout(){
        driver.findElement(By.xpath(addToCartBtn)).click();
        new WebDriverWait(driver, 3).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(proceedToCheckout)));
        driver.findElement(By.xpath(proceedToCheckout)).click();
        driver.findElement(By.xpath(continueCheckout)).click();
        driver.findElement(By.xpath(submitCheckout)).click();
        driver.findElement(By.xpath(agreeToTerms)).click();
        driver.findElement(By.xpath(checkout)).click();
        Assert.assertEquals(true, driver.findElement(By.xpath(bankwire)).isDisplayed());
    }

    public void selectPayment(){
        driver.findElement(By.xpath(bankwire)).click();
        driver.findElement(By.xpath(confirmOrder)).click();
        Assert.assertEquals(true, driver.findElement(By.xpath(backToOrders)).isDisplayed());
    }

    public void validateOrder(){
        driver.findElement(By.xpath(myAccount)).click();
        driver.findElement(By.xpath(orderHistory)).click();
        Assert.assertEquals(true, driver.findElement(By.xpath(invoice)).isDisplayed());
    }

}
