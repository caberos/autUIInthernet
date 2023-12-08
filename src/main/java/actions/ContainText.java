package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContainText {
    public static boolean contain(WebDriver driver, By locator, String text){
        return text.equals(driver.findElement(locator).getText());
    }
}
