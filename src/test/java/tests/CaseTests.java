package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.LoginPage;

import static com.codeborne.selenide.Condition.clickable;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class CaseTests extends BaseTest {

    @Test
    public void createNewCaseTest() {
        loginPage.login(USERNAME, PASSWORD);
        projectsPage.projectsPageIsOpened();
        projectsPage.openProject("testProject");
        projectsPage.clickPlusCaseButton();
        testCasePage.setTitle("title Vlad");
        testCasePage.setDescription("desc Vlad");
        testCasePage.clickSaveButton();
        Assert.assertTrue(testCasePage.testCaseIsCreated("title Vlad"));
    }
}
