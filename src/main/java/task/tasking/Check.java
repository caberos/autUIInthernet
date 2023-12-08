package task.tasking;

import Helpers.helper.ScreenShotHelper;
import actions.Click;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import ui.AddRemovePage;
import ui.CheckPage;
import ui.HomePage;

public class Check {

    public static void asChecks(WebDriver driver){
        Click.on(driver, HomePage.checkBoxes);
        Click.on(driver, CheckPage.checkBtnOne);
        ScreenShotHelper.takeScreenShotAndAdToHTMLReport(driver, Status.INFO,"results");
    }
    public static void asCheckBtnTwo(WebDriver driver){
        Click.on(driver, HomePage.checkBoxes);
        ScreenShotHelper.takeScreenShotAndAdToHTMLReport(driver, Status.INFO,"results");
    }

    public static void asCheckBtnOne(WebDriver driver){
        Click.on(driver, HomePage.checkBoxes);
        Click.on(driver, CheckPage.checkBtnOne);
        Click.on(driver, CheckPage.checkBtnTwo);
        ScreenShotHelper.takeScreenShotAndAdToHTMLReport(driver, Status.INFO,"results");
    }
}
