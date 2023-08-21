package classicPageObject;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class GoogleTest {
    private WebDriver driver;
    protected WebDriverWait wait;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://duckduckgo.com");

        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void userCanSearch() {
        driver.get("https://www.duckduckgo.com");
        GooglePage page = PageFactory.initElements(driver, GooglePage.class);
        SearchResultsPage results = page.searchFor("tango argentino");
        assertThat(results.getResults().get(0).getText(), containsString("Tango argentyńskie - Wikipedia, wolna encyklopedia"));

    }
}
