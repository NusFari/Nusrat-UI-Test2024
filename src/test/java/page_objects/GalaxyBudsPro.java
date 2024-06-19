package page_objects;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GalaxyBudsPro extends NavigationBar {

    private static final Logger LOGGER = LogManager.getLogger(GalaxyBudsPro.class);
    private final By GalaxyBudstext=By.xpath("//h3[contains(text(),'Galaxy Buds2 Pro, Bora')]");

    public GalaxyBudsPro(WebDriver driver) {
        super(driver);
    }

    public GalaxyBudsPro watForPageToLoad(String expectedResults) {
        LOGGER.debug("validating actual results is:" + expectedResults);
        ActOn.wait(driver,GalaxyBudstext).waitForElementToBeVisible();
        //String actualResults=ActOn.element(driver,GalaxyS4text).getTextValue();
        //Assert.assertEquals(actualResults,expectedResults,"Expected results is failed to match");
        return this;

    }

}