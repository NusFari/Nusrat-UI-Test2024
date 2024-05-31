package automation_test.selenium_grid;

import nusrat_utilities.DriverFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Selenium_Grid_Firefox1 {
    private static final Logger LOGGER= LogManager.getLogger(Selenium_Grid_Firefox1.class);
    @Test
    public void executeInAwsDocker(){
        WebDriver driver= DriverFactory.getInstance().getDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        LOGGER.info(driver.getTitle());
        driver.quit();

    }


}

