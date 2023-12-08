package task.validations;

import actions.WaitUntilElement;
import org.openqa.selenium.WebDriver;
import ui.AddRemovePage;

public class IsDelete {
    public static boolean visible(WebDriver driver){
        return WaitUntilElement.isVisible(driver, AddRemovePage.remove);
    }
}
