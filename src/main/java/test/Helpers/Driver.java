package test.Helpers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;


public class Driver {
    private static WebDriver driver;

    private static ChromeOptions getChromeOptions(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--ignore-certificates-errors");
        return options;
    }

    public static void startChromeDriver(String targetUrl,String driverPath) {
        System.out.println("Starting Web chrome");
        System.setProperty("webdriver.chrome.driver", driverPath);
        if (driver == null) {
            ChromeOptions options = getChromeOptions();
            driver = new ChromeDriver(ChromeDriverService.createDefaultService(), options);
            driver.get(targetUrl);
        }

    }

    public static void closeDriver(){
        driver.quit();
    }

    public static  WebDriver getDriver (){
        return driver;
    }

}
