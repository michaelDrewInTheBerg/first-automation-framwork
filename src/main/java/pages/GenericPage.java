package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class GenericPage {

    //Locaters
    @FindBy(className="main-header")
    private WebElement elementsTitle;
    @FindBy(xpath="//div[@class='element-list collapse show']/ul/li")
    private List<WebElement> subElementsMenuOptionsList;
    @FindBy(id="userName")
    private WebElement userNameInputField;
    @FindBy(id="userEmail")
    private WebElement userEmailInputField;
    @FindBy(id="currentAddress")
    private WebElement currentAddressInput;
    @FindBy(id="permanentAddress")
    private WebElement permanentAddressInput;
    @FindBy(id="submit")
    private WebElement submitButton;
    @FindBy(id="name")
    private WebElement resultedName;

    public GenericPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    //Methods

    public String getElementsTitleText() {
        return elementsTitle.getText();
    }

    public void clickTextBoxMenuOption(){
        subElementsMenuOptionsList.get(0).click();
    }

    public void completeTextBoxForm(String userName, String email, String currentAddress, String permanentAddress){
        userNameInputField.sendKeys(userName);
        userEmailInputField.sendKeys(email);
        currentAddressInput.sendKeys(currentAddress);
        permanentAddressInput.sendKeys(permanentAddress);
    }

    public void clickSubmitButton(){
        submitButton.click();
    }

    public String getResultedName(){
        return resultedName.getText();
    }

}
