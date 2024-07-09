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
        $(byText("testProject")).shouldBe(clickable);
        $(byText("testProject")).click();
        $(byText("Test Runs")).click();
        $(byText("Start new test run")).click();
        $x("//*[@class='KF8Qfm']/following-sibling::div//p").setValue("test");
        $x("//div[@class='qAfY3T']/button").scrollIntoView(true).shouldBe(visible).click();
        $x("//div[@class='ktuLwl']/ui-reset/label").shouldBe(visible).click();
        $x("//span[@class='B9YsTi' and text()='Done']").shouldBe(visible).click();
        $("[type='submit']").shouldBe(visible).click();
        $x("//span[@class='TKsrzo' and text()=' Complete']").shouldBe(visible);
        Assert.assertTrue($x("//span[@class='TKsrzo' and text()=' Complete']").isDisplayed());
    }
}