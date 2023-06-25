package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    //Locaters
    @FindBy(xpath="//div[@class='category-cards']/div[1]")
    private WebElement elementsMenuOption;

    public HomePage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    //Methods

    public void clickElements() {
        elementsMenuOption.click();
    }

}
