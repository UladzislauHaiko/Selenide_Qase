package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.clickable;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class ProjectsTests extends BaseTest {

    @Test
    public void createNewProjectTest() {
        projectsPage.createNewProject("projectVlad", "1234", "descriptionVlad");
        Assert.assertTrue(projectsPage.createNewSuiteButtonIsDisplayed());
    }
}
