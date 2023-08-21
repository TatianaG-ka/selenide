package selenidePageObjectWithAssertions;

import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$$;

public class SearchResultsPage {
    private final ElementsCollection results = $$(".react-results--main .wLL07_0Xnd1QZpzpfR4W");

    public void checkResultsSizeIsAtLeast(int expectedSize) {
        results.shouldHave(sizeGreaterThan(expectedSize));
    }

    public void checkResultHasTest(int index, String expectedText) {
        results.get(index).shouldHave(text(expectedText));
    }

    public ElementsCollection getResults() {
        return results;
    }
}
