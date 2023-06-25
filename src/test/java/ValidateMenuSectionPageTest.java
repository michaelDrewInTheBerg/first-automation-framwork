import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidateMenuSectionPageTest extends Hooks{

    @Test
    public void browserCheckTest() throws InterruptedException {

        homePage.clickElements();

        Assert.assertEquals(genericPage.getElementsTitleText(), "Elements");

        Thread.sleep(5000);

    }
}
