package selenidePageObjectWithAssertions;

import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class GoogleTest {
    @Test
    public void userCanSearch() {
        open("https://duckduckgo.com");
        new GooglePage().searchFor("tango argentino");

        SearchResultsPage results = new SearchResultsPage();
        results.checkResultsSizeIsAtLeast(1);
        results.checkResultHasTest(0, "Tango argentyńskie - Wikipedia, wolna encyklopedia");
    }
}
