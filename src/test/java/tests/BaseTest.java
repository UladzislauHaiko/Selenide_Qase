package tests;

import com.codeborne.selenide.Configuration;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ProjectsPage;
import pages.TestCasePage;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class BaseTest {
    protected LoginPage loginPage;
    protected ProjectsPage projectsPage;
    protected TestCasePage testCasePage;

    @BeforeClass
    public void setup() {
        Configuration.baseUrl = "https://qase.io/";
        Configuration.timeout = 5000;
        Configuration.savePageSource = false;
        Configuration.webdriverLogsEnabled = true;
        Configuration.reportsFolder = "target/build";

        loginPage = new LoginPage();
        projectsPage = new ProjectsPage();
        testCasePage = new TestCasePage();

        loginPage.openPage();
        getWebDriver().manage().window().maximize();
        loginPage.login("haikoqase@mailinator.com", "Password12345'");
    }
}
