package steps;

import pages.RadioPage;

public class RadioSteps {
    RadioPage radioPage = new RadioPage();
    public void chooseFemale() {
        radioPage.optionFemale.click();
    }
}
