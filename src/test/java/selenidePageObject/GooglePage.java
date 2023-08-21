package selenidePageObject;


import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class GooglePage {
    public void searchFor(String text) {
        $(By.name("q")).val(text).pressEnter();
    }

}
