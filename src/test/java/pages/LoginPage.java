package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver webDriver;




    private By buttonLogIn=By.xpath("//*[@id=\"content\"]/div/div/div[1]/div/div[2]/button[2]");
    private By newHTML=By.xpath("//iframe[@class='webAuthContainer__iframe']");
    private By buttonLogGoogle=By.xpath("//*[@id=\"app\"]/div/div/div/div/div[1]/div[2]/button");
    private By frameGmail=By.className("webAuthContainer__iframe");
    private By inputTextEmail=By.id("identifierId");
    private By buttonSiguiente=By.xpath("//*[@id=\"identifierNext\"]/div/button");
    private By inputTextPassword=By.name("password");
    private By buttonPassword=By.xpath("//*[@id=\"passwordNext\"]/div/button");


    private By checkBoxSize=By.xpath("//*[@id=\"x-refine__group_1__0\"]/ul/li[4]/div/a/div/span/input");



    private By checkBoxTermsOfServ=By.id("cgv");


    public LoginPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }
    public void sendCheckBoxSize(){
        webDriver.findElement(checkBoxSize).click();

    }
    public void sendEmail(String email){
        webDriver.findElement(inputTextEmail).sendKeys(email);
    }
    public void sendPassword(String pass){
        webDriver.findElement(inputTextPassword).sendKeys(pass);
    }

    public By getButtonLogIn(){
        return buttonLogGoogle;
    }
    public By getNewHTML(){
        return newHTML;
    }

    public ProfilePage clickLogIn() throws InterruptedException {
        webDriver.findElement(buttonLogIn).click();
        Thread.sleep(1000);
        return new ProfilePage(webDriver);
    }
    public ProfilePage clickSiguiente() throws InterruptedException {
        webDriver.findElement(buttonSiguiente).click();
        Thread.sleep(1000);
        return new ProfilePage(webDriver);
    }
    public ProfilePage clickPasword() throws InterruptedException {
        webDriver.findElement(buttonPassword).click();
        Thread.sleep(1000);
        return new ProfilePage(webDriver);
    }


    public LoginPage clickLogInGoogle() throws InterruptedException {

        webDriver.switchTo().frame(webDriver.findElement(frameGmail));

       // webDriver.switchTo().defaultContent();
        Thread.sleep(3000);

        webDriver.findElement(buttonLogGoogle).click();

        return new LoginPage(webDriver);

    }



}
