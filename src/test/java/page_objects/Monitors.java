package page_objects;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Monitors extends NavigationBar {


        private final By AlMonitors= By.xpath("//div[1]/img[@alt='Monitors, Memory & Storage']");

        private static final Logger LOGGER = LogManager.getLogger(Monitors.class);

        public Monitors(WebDriver driver) {
            super(driver);
        }


        public Monitors validateShopAllOfersIsLoaded(String expectedResults) {
            LOGGER.debug("validating actualResults is :" + expectedResults);
            ActOn.wait(driver,AlMonitors).waitForElementToBeVisible();
            //String actualResults = ActOn.element(driver, All).getTextValue();
            return this;

            //Assert.assertEquals(actualResults, expectedResults, "Estimated total is failed to match");
        }
    }


