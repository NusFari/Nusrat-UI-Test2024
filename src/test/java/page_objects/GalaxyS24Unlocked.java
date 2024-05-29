package page_objects;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class GalaxyS24Unlocked extends NavigationBar {
    private final By GalaxyS24Unlocked = By.xpath("//div[3]/span[@data-testid='atom_label']");
    private static final Logger LOGGER = LogManager.getLogger(GalaxyS24Unlocked.class);

    public GalaxyS24Unlocked(WebDriver driver) {
        super(driver);
    }
    public GalaxyS24Unlocked validateGalaxyS24UnlockedIsLoaded(String expectedResults) {
        LOGGER.debug("validating actual results is :" + expectedResults);
        ActOn.wait(driver, GalaxyS24Unlocked).waitForElementToBeVisible();
        //String actualResults = ActOn.element(driver, GalaxyS24Unlocked).getTextValue();
        //Assert.assertEquals(actualResults, expectedResults, "Expected results is failed to match");
        return this;

    }



    }


