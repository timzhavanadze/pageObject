package Steps;

import Data.DashboardData;
import Pages.DashboardPage;
import com.codeborne.selenide.Condition;


public class DashboardSteps {
    DashboardPage dashboardPage = new DashboardPage();
    DashboardData dashboardData = new DashboardData();
    public DashboardSteps validateWelcomeTextIsVisible(){
        dashboardPage.welcomeMessage.shouldBe(Condition.visible);
        return this;
    }

    public DashboardSteps validateWelcomeTextValue(String text){
        dashboardPage.welcomeMessage.shouldHave(Condition.text(text));
         return this;
    }
}
