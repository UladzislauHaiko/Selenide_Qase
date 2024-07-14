package pages;

import static com.codeborne.selenide.Condition.clickable;
import static com.codeborne.selenide.Selenide.$x;

public class TestRunPage {
    protected final static String completeButton = "//span[@class='TKsrzo' and text()=' Complete']";

    public boolean completeButtonIsDisplayed() {
        $x(completeButton).shouldBe(clickable);
        return $x(completeButton).isDisplayed();
    }
}
