package page_objects;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShopAllSmartBook extends NavigationBar{

private final By ShopAll=By.id("ALL");

    private static final Logger LOGGER= LogManager.getLogger(ShopAllSmartBook.class);

    public  ShopAllSmartBook  (WebDriver driver) {
        super(driver);
    }


    public ShopAllSmartBook  validateAllSmartBookIsLoaded(String expectedResults) {
        LOGGER.debug("validating actualResults is :"+expectedResults);
        ActOn.wait(driver,ShopAll).waitForElementToBeVisible();
        //String actualResults = ActOn.element(driver, All).getTextValue();
        return this;

        //Assert.assertEquals(actualResults, expectedResults, "Estimated total is failed to match");
    }

}
