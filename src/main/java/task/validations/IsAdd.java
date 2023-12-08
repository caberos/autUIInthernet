package task.validations;

import actions.WaitUntilElement;
import org.openqa.selenium.WebDriver;
import ui.AddRemovePage;

public class IsAdd {
    public static boolean visible(WebDriver driver){
        return WaitUntilElement.isVisible(driver, AddRemovePage.add);
    }
}
