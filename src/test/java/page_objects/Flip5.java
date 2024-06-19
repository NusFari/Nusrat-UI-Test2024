package page_objects;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Flip5 extends NavigationBar {
    private final By Flip5Text = By.xpath("//div[1]/h1[contains(text(),'Artist Ricardo Cavolo Interactive')]");

    private static final Logger LOGGER = LogManager.getLogger(Flip5.class);

    public Flip5(WebDriver driver) {
        super(driver);
    }

    public Flip5 watForPageToLoad(String expectedResults) {
        LOGGER.debug("validating actual results is:" + expectedResults);
        ActOn.wait(driver,Flip5Text).waitForElementToBeVisible();
        //String actualResults=ActOn.element(driver,GalaxyS4text).getTextValue();
        //Assert.assertEquals(actualResults,expectedResults,"Expected results is failed to match");
        return this;
    }
}
