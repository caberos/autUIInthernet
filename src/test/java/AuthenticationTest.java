import actions.ContainText;
import actions.WaitUntilElement;
import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import task.tasking.Login;
import ui.FormAuthenticationPage;

public class AuthenticationTest extends BaseTest {

    @Test
    public void authentication(){
        Login.as(webDriver,"tomsmith","SuperSecretPassword!");
        Assert.assertTrue(WaitUntilElement.isVisible(webDriver, FormAuthenticationPage.logged));
        Assert.assertTrue(WaitUntilElement.isVisible(webDriver, FormAuthenticationPage.logoutBtn));
        Assert.assertTrue(ContainText.contain(webDriver, FormAuthenticationPage.textSecure,"Secure Area"));
    }
    @Test
    public void authenticationFal(){
        Login.as(webDriver,"test","SuperSecretPassword!");
        Assert.assertTrue(WaitUntilElement.isVisible(webDriver, FormAuthenticationPage.username));
        Assert.assertTrue(WaitUntilElement.isVisible(webDriver, FormAuthenticationPage.password));
        Assert.assertTrue(ContainText.contain(webDriver,
                FormAuthenticationPage.errorLogin,"Your username is invalid!\n" +
                        "×"));
    }
}
