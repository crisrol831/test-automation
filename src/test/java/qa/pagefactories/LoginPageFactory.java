package qa.pagefactories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFactory {
    @FindBy(id = "username")
    public WebElement username = null;
    
    @FindBy(id = "password")
    public WebElement password = null;
    
    @FindBy(id = "login")
    public WebElement loginButton = null;


    public LoginPageFactory(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}