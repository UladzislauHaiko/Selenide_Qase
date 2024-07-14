package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;


public class LoginTests extends BaseTest {
    @Test
    public void positiveLoginTest() {
        loginPage.login(USERNAME, PASSWORD);
        Assert.assertTrue(projectsPage.createNewProjectButtonIsDisplayed());
    }
}