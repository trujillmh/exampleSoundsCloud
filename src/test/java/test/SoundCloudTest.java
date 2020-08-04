package test;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.ProfilePage;

public class SoundCloudTest extends BaseTest {

    @Test
    public void loginSuccess() throws InterruptedException {


        WebDriver webDriver = getWebDriver();
        Actions action = new Actions(webDriver);


        loginPage.clickLogIn();

        Thread.sleep(1000);

        loginPage.clickLogInGoogle();
        Thread.sleep(3000);


        Object[] allWindows = webDriver.getWindowHandles().toArray();
        webDriver.switchTo().window(allWindows[1].toString());

        loginPage.sendEmail("trujillm");
        Thread.sleep(3000);
        loginPage.clickSiguiente();
        Thread.sleep(3000);
        loginPage.sendPassword("holaholahola");
        Thread.sleep(1000);
        loginPage.clickPasword();
        Thread.sleep(10000);




    }


}