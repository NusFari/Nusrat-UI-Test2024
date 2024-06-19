package page_objects;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShopAllOfers extends NavigationBar{

    private final By Featured=By.xpath("//div[2]/a[contains(text(),'Featur')]");

    private static final Logger LOGGER= LogManager.getLogger(ShopAllOfers.class);

    public   ShopAllOfers  (WebDriver driver) {
        super(driver);
    }


    public ShopAllOfers validateShopAllOfersIsLoaded(String expectedResults) {
        LOGGER.debug("validating actualResults is :"+expectedResults);
        ActOn.wait(driver,Featured).waitForElementToBeVisible();
        //String actualResults = ActOn.element(driver, All).getTextValue();
        return this;

        //Assert.assertEquals(actualResults, expectedResults, "Estimated total is failed to match");
    }

}

