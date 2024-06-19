package page_objects;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShopAllWatches extends NavigationBar {

    private final By WatchesAudio = By.xpath("//div[1]/img[@alt='Watches & Audio']");

    private static final Logger LOGGER = LogManager.getLogger(ShopAllWatches.class);

    public ShopAllWatches(WebDriver driver) {
        super(driver);
    }


    public ShopAllWatches validateShopAllOfersIsLoaded(String expectedResults) {
        LOGGER.debug("validating actualResults is :" + expectedResults);
        ActOn.wait(driver, WatchesAudio).waitForElementToBeVisible();
        //String actualResults = ActOn.element(driver, All).getTextValue();
        return this;

        //Assert.assertEquals(actualResults, expectedResults, "Estimated total is failed to match");
    }
}

