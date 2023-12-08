package task.validations;

import actions.WaitUntilElement;
import org.openqa.selenium.WebDriver;
import ui.AddRemovePage;
import ui.CheckPage;

public class IsCheck {

    public static boolean checkOne(WebDriver driver){
        return driver.findElement(CheckPage.checkBtnOne).isSelected();
    }
    public static boolean checkTwo(WebDriver driver){
        return driver.findElement(CheckPage.checkBtnTwo).isSelected();
    }
}
