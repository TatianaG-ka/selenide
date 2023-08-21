package classicPageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverManager {
    private static WebDriver driver;

    private WebDriverManager() {
    }

    public static WebDriver getWebDriver() {

        if (driver == null) {
            System.setProperty("webdriver.chrome.driver", "C:/drivers/chromedriver.exe");
            driver = new ChromeDriver();
        }

        return driver;
    }

    public static void disposeDriver() {
        driver.close();
        driver.quit();
        driver = null;
    }
}
