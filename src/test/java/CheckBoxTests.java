import com.codeborne.selenide.SelenideElement;
import Data.CheckboxTestData;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Steps.CheckboxTestSteps;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;


public class CheckBoxTests extends Configs {
    CheckboxTestSteps checkboxTestSteps = new CheckboxTestSteps();
    CheckboxTestData checkboxTestData = new CheckboxTestData();

    //with POM
    @Test
    public void validateText() {
        open("https://www.lambdatest.com/selenium-playground/checkbox-demo");
        checkboxTestSteps.clickOnCheckbox();
        checkboxTestSteps.validateTextIsVisible();
        checkboxTestSteps.validateText(checkboxTestData.message);
    }

    //without POM
    @Test
    public void validateText1() {
        open("https://www.lambdatest.com/selenium-playground/checkbox-demo");
        $("#isAgeSelected").click();
        SelenideElement successText = $("#txtAge");
        successText.should(appear);
        successText.shouldHave(exactText("Success - Check box is checked"));
    }

}