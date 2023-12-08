package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUntilElement {

    public static boolean isPreset(WebDriver driver, By locator){
        try {
            WebDriverWait wait = new WebDriverWait(driver,5000);
            wait.until(ExpectedConditions.presenceOfElementLocated(locator));
            return true;
        }catch (Exception e)
        {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean isVisible(WebDriver driver, By locator){
        try {
            WebDriverWait wait = new WebDriverWait(driver,5000);
            wait.until(ExpectedConditions.visibilityOf(driver.findElement(locator)));
            return true;
        }catch (Exception e)
        {
            e.printStackTrace();
            return false;
        }
    }
}
