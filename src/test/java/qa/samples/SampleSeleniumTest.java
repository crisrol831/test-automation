package qa.samples;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import qa.pages.LoginPage;

public class SampleSeleniumTest {
    WebDriver driver;

    @Before
    public void setup() throws MalformedURLException {
        ChromeOptions options = new ChromeOptions();
        // driver = new ChromeDriver(options);
        driver = new RemoteWebDriver(new URL("http://chromedriver:4444/wd/hub"), options);
        driver.get("http://web:3000/login");
    }

    @Test
    public void LoginPageTest(){
        new LoginPage(driver).login("username", "password");
    }


}
