package tests;

import com.codeborne.selenide.Configuration;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ProjectsPage;
import pages.TestCasePage;
import pages.TestRunPage;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class BaseTest {
    protected LoginPage loginPage;
    protected ProjectsPage projectsPage;
    protected TestCasePage testCasePage;
    protected TestRunPage testRunPage;
    protected static final String USERNAME = "haikoqase@mailinator.com";
    protected static final String PASSWORD = "Password12345'";

    @BeforeClass
    public void setup() {
        Configuration.baseUrl = "https://qase.io/";
        Configuration.timeout = 5000;
        Configuration.savePageSource = false;
        Configuration.webdriverLogsEnabled = true;
        Configuration.reportsFolder = "target/build";
        Configuration.downloadsFolder = "target/build";
        Configuration.browserSize = "1920x1080";

        loginPage = new LoginPage();
        projectsPage = new ProjectsPage();
        testCasePage = new TestCasePage();
        testRunPage = new TestRunPage();

        loginPage.openPage();
    }
}
