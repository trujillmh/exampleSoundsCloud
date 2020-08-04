package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.LoginPage;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    private WebDriver webDriver;
    private String CHROME_DRIVER=System.getProperty("user.dir")+"/src/test/resources/drivers/chromedriver.exe";
    protected LoginPage loginPage;
    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver",CHROME_DRIVER);
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get("https://soundcloud.com/");
        loginPage = new LoginPage(webDriver);
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }
    @AfterClass
    public void tearDown(){

        webDriver.quit();
    }

    public WebDriver getWebDriver(){

        return webDriver;
    }
}