import Data.DashboardData;
import Steps.DashboardSteps;
import Steps.LoginSteps;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class LoginTests extends Configs{
    LoginSteps loginSteps = new LoginSteps();
    DashboardSteps dashboardSteps = new DashboardSteps();
    DashboardData dashboardData = new DashboardData();


    @Test(description = "Login Scenario")
    public void successLogin(){
        open("https://practicetestautomation.com/practice-test-login/");
         loginSteps.setUserName()
                 .setPassword()
                 .clickSubmit();
         dashboardSteps.validateWelcomeTextIsVisible()
                 .validateWelcomeTextValue(dashboardData.welcome);
    }
}
