package pages;

import org.testng.Assert;

import static com.codeborne.selenide.Condition.clickable;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class ProjectsPage {
    protected final static String createNewProjectButton = "#createButton";
    protected final static String projectName = "#project-name";
    protected final static String projectCode = "#project-code";
    protected final static String description = "#description-area";
    protected final static String createProjectButton = "Create project";
    protected final static String createNewSuiteButton = "#create-suite-button";
    protected final static String plusCaseButton = "#create-case-button";
    protected final static String projectLink = "%s";
    protected final static String testRunTab = "Test Runs";
    protected final static String startNewTestRunButton = "Start new test run";
    protected final static String testRunDescription = "//*[@class='KF8Qfm']/following-sibling::div//p";
    protected final static String selectCasesButton = "//div[@class='qAfY3T']/button";
    protected final static String selectAllCheckbox = "//div[@class='ktuLwl']/ui-reset/label";
    protected final static String doneButton = "//span[@class='B9YsTi' and text()='Done']";
    protected final static String startARunButton = "[type='submit']";

    public void clickCreateNewProjectButton() {
        $(createNewProjectButton).click();
    }

    public void setProjectName(String name) {
        $(projectName).setValue(name);
    }

    public void setProjectCode(String code) {
        $(projectCode).setValue(code);
    }

    public void setDescription(String desc) {
        $(description).setValue(desc);
    }

    public void clickPlusCaseButton() {
        $(plusCaseButton).click();
    }

    public void clickCreateProjectButton() {
        $(byText(createProjectButton)).click();
    }

    public void projectsPageIsOpened() {
        $(createNewProjectButton).shouldBe(visible);
    }

    public void openProject(String projectName) {
        $(byText(projectName)).click();
    }

    public boolean createNewProjectButtonIsDisplayed() {
        $(createNewProjectButton).shouldBe(clickable);
        return $(createNewProjectButton).isDisplayed();
    }

    public void createNewProject(String name, String code, String desc) {
        clickCreateNewProjectButton();
        setProjectName(name);
        setProjectCode(code);
        setDescription(desc);
        clickCreateProjectButton();
    }

    public boolean createNewSuiteButtonIsDisplayed() {
        $(createNewSuiteButton).shouldBe(clickable);
        return $(createNewSuiteButton).isDisplayed();
    }

    public void clickCreateNewSuiteButton() {
        $(byText(createNewSuiteButton)).click();
    }

    public void openProjectByName(String name) {
        $(byText(String.format(projectLink, name))).shouldBe(clickable);
        $(byText(String.format(projectLink, name))).click();
    }

    public void openTestRunTab() {
        $(byText(testRunTab)).click();
    }

    public void clickStartNewTestRunButton() {
        $(byText(startNewTestRunButton)).click();
    }

    public void setRunDescription(String desc) {
        $x(testRunDescription).setValue(desc);
    }
    public void clickSelectCasesButton() {
        $x(selectCasesButton).scrollIntoView(true).shouldBe(visible).click();
    }
    public void clickSelectAllCheckbox() {
        $x(selectAllCheckbox).shouldBe(visible).click();
    }
    public void clickDoneButton() {
        $x(doneButton).shouldBe(visible).click();
    }
    public void clickStartARunButton() {
        $(startARunButton).shouldBe(visible).click();
    }
}