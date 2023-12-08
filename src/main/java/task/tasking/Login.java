package task.tasking;

import Helpers.helper.ScreenShotHelper;
import actions.Click;
import actions.Enter;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import ui.FormAuthenticationPage;
import ui.HomePage;

public class Login {

    public static void as(WebDriver driver, String username, String password){
        Click.on(driver, HomePage.formAuthentication);
        Enter.text(driver,FormAuthenticationPage.username,username);
        Enter.text(driver,FormAuthenticationPage.password,password);
        Click.on(driver,FormAuthenticationPage.login);
        ScreenShotHelper.takeScreenShotAndAdToHTMLReport(driver, Status.INFO,"results");

    }
}
