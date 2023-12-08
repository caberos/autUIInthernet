package task.tasking;

import Helpers.helper.ScreenShotHelper;
import actions.Click;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import ui.AddRemovePage;
import ui.HomePage;

public class AddElement {

    public static void as(WebDriver driver){
        Click.on(driver, HomePage.addRemove);
        Click.on(driver, AddRemovePage.add);
        ScreenShotHelper.takeScreenShotAndAdToHTMLReport(driver, Status.INFO,"results");
    }
}
