package Steps;


import Pages.CheckboxTestPage;

import static com.codeborne.selenide.Condition.*;

public class CheckboxTestSteps {
    CheckboxTestPage checkboxTestPage = new CheckboxTestPage();
    public void clickOnCheckbox() {
        checkboxTestPage.isSelectedCheckbox.click();
    }

    public void validateText(String text) {
        checkboxTestPage.successText.shouldHave(exactText(text));
    }

    public void validateTextNegative(String text) {
        checkboxTestPage.successText.shouldNotHave(exactText(text));
    }

    public void validateTextIsVisible() {
        checkboxTestPage.successText.should(appear);
    }
}
