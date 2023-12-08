package task.tasking;

import Helpers.helper.ScreenShotHelper;
import actions.Click;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import ui.AddRemovePage;
import ui.HomePage;

public class RemoveElement {
    public static void as(WebDriver driver){
        Click.on(driver, HomePage.addRemove);
        Click.on(driver, AddRemovePage.add);
        Click.on(driver, AddRemovePage.remove);
        ScreenShotHelper.takeScreenShotAndAdToHTMLReport(driver, Status.INFO,"results");
    }
}
