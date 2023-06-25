import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.GenericPage;
import pages.HomePage;

public class Hooks {

    HomePage homePage;
    GenericPage genericPage;

    private WebDriver driver;


    @BeforeMethod
    public void setup(){
        String webDriverLocation = "src/main/resources/chromedriver/chromedriver.exe";

        System.setProperty("webdriver.chrome.driver", webDriverLocation);

                //the following 2 line of code are only valid for v111 of chrome browser and driver
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
        //

        driver = new ChromeDriver(option);

        homePage = new HomePage(driver);
        genericPage = new GenericPage(driver);

        driver.manage().window().maximize();

        driver.get("https://demoqa.com/");
    }

    @AfterMethod
    public void cleanUp(){
        System.out.println("Closing ChromeDriver");

        driver.quit();
    }


}
