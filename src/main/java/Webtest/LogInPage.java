package Webtest;

import org.openqa.selenium.By;

public class LogInPage extends Utils {
    private By _email = By.className("email");
    private By _password = By.className("password");
    private By _logInButton = By.xpath(");
    private By _logOutButton = By.className(");
    private By _logInMessage = By.xpath("");
    private By _emailError = By.xpath("//span[@id='Email-error']");

    public void verifyUserIsOnLogInPage()
    {
        Utils.assertWithURL("");
    }

}
