import base.BaseTest;
import org.testng.Assert;
import task.tasking.AddElement;
import org.testng.annotations.Test;
import task.tasking.RemoveElement;
import task.validations.IsDelete;

public class AddRemoteTest extends BaseTest {

    @Test
    public void addElementTest() {
        AddElement.as(webDriver);
        Assert.assertTrue(IsDelete.visible(webDriver));
    }

    @Test
    public void removeElementTest(){
        RemoveElement.as(webDriver);
        Assert.assertFalse(IsDelete.visible(webDriver));
    }
}
