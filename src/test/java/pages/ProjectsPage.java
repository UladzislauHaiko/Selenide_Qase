package pages;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class ProjectsPage {
    protected final static String createNewProjectButton = "#createButton";
    protected final static String projectName = "#project-name";
    protected final static String projectCode = "#project-code";
    protected final static String description = "#description-area";
    protected final static String createProjectButton = "Create project";
    protected final static String createNewSuiteButton = "Create new suite";
    protected final static String plusCaseButton = "#create-case-button";

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
        $(byText("testProject")).shouldBe(visible);
    }

    public void openProject(String projectName) {
        $(byText(projectName)).click();
    }



    public void createNewProject(String name, String code, String desc) {
        clickCreateNewProjectButton();
        setProjectName(name);
        setProjectCode(code);
        setDescription(desc);
        clickCreateProjectButton();
    }
    public void clickCreateNewSuiteButton() {
        $(byText(createNewSuiteButton)).click();
    }
}