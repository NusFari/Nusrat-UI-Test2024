package page_objects;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShopAllMusicFrame extends NavigationBar{
    private final By All=By.id("ALL");

    //private final By SaveUp = By.xpath("//h1[contains(text(),'Save up to ')]");
    private static final Logger LOGGER=LogManager.getLogger(ShopAllMusicFrame.class);

    public ShopAllMusicFrame(WebDriver driver) {
        super(driver);
    }


    public ShopAllMusicFrame validateShopAllPageIsLoaded(String expectedResults) {
        LOGGER.debug("validating actualResults is :"+expectedResults);
        ActOn.wait(driver,All).waitForElementToBeVisible();
        //String actualResults = ActOn.element(driver, All).getTextValue();
        return this;

        //Assert.assertEquals(actualResults, expectedResults, "Estimated total is failed to match");
    }

}

