package qa.pages;

import org.openqa.selenium.WebDriver;

import qa.pagefactories.LoginPageFactory;

public class LoginPage {
    public LoginPageFactory pageFactory;
    
    public LoginPage(WebDriver driver) {
        this.pageFactory = new LoginPageFactory(driver);
    }

    public void login(String username, String password){
        pageFactory.username.sendKeys(username);
        pageFactory.password.sendKeys(password);
        pageFactory.loginButton.click();
    }
    
}