package selenidePageObject;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SearchResultsPage {
    public ElementsCollection getResults() {
        return $$(".react-results--main .wLL07_0Xnd1QZpzpfR4W");
    }
    public SelenideElement getResult(int index) {
        return $("#r1-" + index);
    }
}
