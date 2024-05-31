package automation_test.selenium_grid;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.URL;

public class Selenium_Grid_Edge1 {
    private static final Logger LOGGER= LogManager.getLogger(Selenium_Grid_Edge1.class);
    WebDriver driver;
    URL gridUrl;
    @Test
    public void executeInAwsDocker(){
        ChromeOptions chromeOptions=new ChromeOptions();
        try{
            gridUrl = new URL("http://13.58.229.161:4444/wd/hub");
        }catch (Exception e){
            LOGGER.error(e.getMessage());

        }

        chromeOptions.addArguments("------remote-allow-origins=*");
        driver=new RemoteWebDriver(gridUrl,chromeOptions);
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();
        LOGGER.info(driver.getTitle());
        driver.quit();

    }


}
