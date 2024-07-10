package pages;

import org.testng.Assert;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class TestCasePage {
    protected final static String caseTitle = "#title";
    protected final static String caseDescription = "p[data-placeholder='For example: We can authorize on page http://example.com/login']";
    protected final static String caseSeverity = "[id='0-severity']";
    protected final static String saveButton = "Save";


    public void setTitle(String title) {
        $(caseTitle).setValue(title);
    }

    public void setDescription(String description) {
        $(caseDescription).setValue(description);
    }

    public void setSeverity(String severity) {
        $(caseSeverity).setValue(severity);
    }

    public void clickSaveButton() {
        $(byText(saveButton)).click();
    }

    public boolean testCaseIsCreated() {
        $(byText("title Vlad")).shouldBe(visible);
        return $(byText("title Vlad")).isDisplayed();
    }

}
