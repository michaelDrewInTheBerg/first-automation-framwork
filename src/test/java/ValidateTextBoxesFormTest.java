import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidateTextBoxesFormTest extends Hooks{

    @Test
    public void validateTextBoxesFormTest() throws InterruptedException {

        homePage.clickElements();

        genericPage.clickTextBoxMenuOption();

        genericPage.completeTextBoxForm("TestingUser", "testemail@test.com", "Address for testing 67", "Address for testing 67");

        genericPage.clickSubmitButton();

        Thread.sleep(5000);

        Assert.assertEquals(genericPage.getResultedName(),"Name:TestingUser");

    }
}
