package automation_test.homedepot.com;

import command_providers.ActOn;
import io.github.bonigarcia.wdm.WebDriverManager;
import nusrat_utilities.ScreenCapture;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class homedepot {
    WebDriver driver;

    @BeforeMethod
    public void browserInitialization() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        ActOn.browser(driver).openBrowser("https://www.homedepot.com/");

    }
    @Test

    public void verifyHomePageTitle() {
        String expectedTitle = "The Home Depot";
        String actualTitle =  ActOn.browser(driver).captureTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "the title is failed to match");
    }

    @AfterMethod
    public void browserCleanup(ITestResult result){
        if (result.getStatus()==ITestResult.FAILURE){
            ScreenCapture.getScreenShot(driver);
        }
       ActOn.browser(driver).closeBrowser();
  }

  }
