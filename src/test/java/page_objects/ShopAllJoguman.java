package page_objects;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShopAllJoguman extends NavigationBar{
    private final By All=By.id("ALL");

    private static final Logger LOGGER= LogManager.getLogger(ShopAllJoguman.class);

    public ShopAllJoguman(WebDriver driver) {
        super(driver);
    }


    public ShopAllJoguman validateAllPageIsLoaded(String expectedResults) {
        LOGGER.debug("validating actualResults is :"+expectedResults);
        ActOn.wait(driver,All).waitForElementToBeVisible();
        //String actualResults = ActOn.element(driver, All).getTextValue();
        return this;

        //Assert.assertEquals(actualResults, expectedResults, "Estimated total is failed to match");
    }

}

