package page_objects;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShopMonitor extends NavigationBar{

private final By All=By.xpath("//a[contains(@class,'srp-tab-bar__link')][@data-di-id='di-id-a91a0a2e-68dfc691']");

    private static final Logger LOGGER= LogManager.getLogger(ShopMonitor.class);

    public ShopMonitor(WebDriver driver) {
        super(driver);
    }


    public ShopMonitor validateShopMonitorIsLoaded(String expectedResults) {
        LOGGER.debug("validating actualResults is :"+expectedResults);
        ActOn.wait(driver,All).waitForElementToBeVisible();
        //String actualResults = ActOn.element(driver, All).getTextValue();
        return this;

        //Assert.assertEquals(actualResults, expectedResults, "Estimated total is failed to match");
    }

}
