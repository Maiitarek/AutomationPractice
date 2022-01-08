package Pages;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class createNewUser extends createNewUserObjects {

    public void reachURL() {
        System.setProperty("webdriver.chrome.driver","./Tools\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("http://automationpractice.com/index.php");
    }

    public void passNewUserData() throws InterruptedException {

        driver.findElement(By.xpath(SignInBtn)).click();
        driver.findElement(By.xpath(email)).sendKeys("reemmohey@ggmail.com");
        driver.findElement(By.xpath(submitCreate)).click();
        new WebDriverWait(driver, 3).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(title)));
        driver.findElement(By.xpath(title)).click();
        driver.findElement(By.xpath(firstName)).sendKeys("Reem");
        driver.findElement(By.xpath(lastName)).sendKeys("Mohey");
        driver.findElement(By.xpath(passwd)).sendKeys("reem123");
        driver.findElement(By.xpath(address)).sendKeys("Rehab City");
        driver.findElement(By.xpath(city)).sendKeys("Cairo");
        Select State = new Select(driver.findElement(By.xpath(state)));
        State.selectByVisibleText("California");
        driver.findElement(By.xpath(postcode)).sendKeys("11841");
        Select Country = new Select(driver.findElement(By.xpath(country)));
        Country.selectByVisibleText("United States");
        driver.findElement(By.xpath(mobile)).sendKeys("01152592588");
        driver.findElement(By.xpath(aliasAddress)).sendKeys("New Cairo");
        driver.findElement(By.xpath(register)).click();
        Assert.assertEquals(true, driver.findElement(By.xpath(signOutBtn)).isDisplayed());
        driver.findElement(By.xpath(signOutBtn)).click();

    }

}
