package page_objects;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Tablets extends NavigationBar{
    private final By TabletsComputing = By.xpath("//div[1]/img[@alt='Tablets & Computing']");

    private static final Logger LOGGER = LogManager.getLogger(Tablets.class);

    public Tablets(WebDriver driver) {
        super(driver);
    }


    public Tablets validateShopallTabletsIsLoaded(String expectedResults) {
        LOGGER.debug("validating actualResults is :" + expectedResults);
        ActOn.wait(driver,TabletsComputing).waitForElementToBeVisible();
        //String actualResults = ActOn.element(driver, All).getTextValue();
        return this;

        //Assert.assertEquals(actualResults, expectedResults, "Estimated total is failed to match");
    }
}

