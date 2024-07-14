package pages;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginPage {
    protected final static String loginButton = "#signin";
    protected final static String userEmail = "[placeholder='Work email']";
    protected final static String userPassword = "[placeholder='Password']";
    protected final static String signInButton = "Sign in";
    public void openPage(){
        open("");
    }
    public void login(String email, String password) {
        $(loginButton).click();
        $(userEmail).setValue(email);
        $(userPassword).setValue(password);
        $(byText(signInButton)).shouldBe(clickable).click();
    }
}
