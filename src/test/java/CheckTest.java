import actions.WaitUntilElement;
import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import task.tasking.AddElement;
import task.tasking.Check;
import task.validations.IsCheck;
import task.validations.IsDelete;
import ui.CheckPage;
import ui.FormAuthenticationPage;

public class CheckTest extends BaseTest {

    @Test
    public void checkBtnsTest() {
        Check.asChecks(webDriver);
        Assert.assertTrue(IsCheck.checkOne(webDriver));
        Assert.assertTrue(IsCheck.checkTwo(webDriver));
    }

    @Test
    public void checkOneBtnTest() {
        Check.asCheckBtnOne(webDriver);
        Assert.assertTrue(IsCheck.checkOne(webDriver));
        Assert.assertFalse(IsCheck.checkTwo(webDriver));
    }
    @Test
    public void checkSecondBtnTest() {
        Check.asCheckBtnTwo(webDriver);
        Assert.assertFalse(IsCheck.checkOne(webDriver));
        Assert.assertTrue(IsCheck.checkTwo(webDriver));
    }
}
