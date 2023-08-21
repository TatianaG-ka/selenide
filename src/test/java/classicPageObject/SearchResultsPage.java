package classicPageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchResultsPage {
    @FindBy(css = ".react-results--main .wLL07_0Xnd1QZpzpfR4W")
    List<WebElement> results;

    public List<WebElement> getResults() {
        return results;
    }
}
