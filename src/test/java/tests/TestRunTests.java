package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.clickable;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class TestRunTests extends BaseTest {
    @Test
    public void createNewTestRun() {
        loginPage.login(USERNAME, PASSWORD);
        projectsPage.openProjectByName("testProject");
        projectsPage.openTestRunTab();
        projectsPage.clickStartNewTestRunButton();
        projectsPage.setRunDescription("test run");
        projectsPage.clickSelectCasesButton();
        projectsPage.clickSelectAllCheckbox();
        projectsPage.clickDoneButton();
        projectsPage.clickStartARunButton();
        Assert.assertTrue(testRunPage.completeButtonIsDisplayed());
    }
}