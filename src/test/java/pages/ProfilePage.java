package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProfilePage {
    private WebDriver webDriver;

    private By textMenu=By.xpath("//*[contains(text(),'Product successfully added to your shopping cart')]"); //new By.ByXPath("Product successfully added to your shopping cart");
    private By textCreate=By.className("page-heading");
    private By textLogin=By.id("center_column");
    private By textAddCard=By.xpath("//*[contains(text(),'Product successfully added to your shopping cart')]");


//holi


    public ProfilePage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }




    public boolean isDisplayedTextCreate(){

        return webDriver.findElement(textCreate).isDisplayed();

    }
    public boolean isDisplayedTextMenu(){

        return webDriver.findElement(textMenu).isDisplayed();

    }
    public boolean isDisplayedTextLogin(){

        return webDriver.findElement(textLogin).isDisplayed();

    }

    public boolean isDisplayedTextAddToCard(){

        return webDriver.findElement(textAddCard).isDisplayed();

    }




}

