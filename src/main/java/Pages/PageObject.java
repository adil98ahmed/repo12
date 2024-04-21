package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import test.Helpers.Driver;

import java.time.Duration;
public class PageObject {

    public PageObject(){
        driver = Driver.getDriver();
        wait = new WebDriverWait(driver,MAXIMUM);
    }
    public static WebDriver driver;
    private static final Duration MAXIMUM = Duration.ofSeconds(60) ;
    public  WebDriverWait wait;

    public WebElement clickOn(By element){
        WebElement webElement = wait.until(ExpectedConditions.elementToBeClickable(element));
        webElement.click();
        return webElement;
    }
    public WebElement clickOnAndWaitForDisappear(By element){
        WebElement webElement = wait.until(ExpectedConditions.elementToBeClickable(element));
        webElement.click();
        wait.until(ExpectedConditions.invisibilityOf(webElement));
        return webElement;
    }
    public WebElement sendText(By element , String text){
        WebElement webElement = wait.until(ExpectedConditions.presenceOfElementLocated(element));
        webElement.clear();
        webElement.sendKeys(text);
        return webElement;
    }
    public String getText(By element){
        WebElement webElement = wait.until(ExpectedConditions.presenceOfElementLocated(element));
        return webElement.getText();
    }
//    @Before
//    public static void sa(){
//        Driver.startChromeDriver();
//    }
}
