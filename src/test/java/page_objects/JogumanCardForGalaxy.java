package page_objects;

import automation_test.BaseClass;
import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JogumanCardForGalaxy extends NavigationBar {
    private final By JogumanCardForGalaxytext = By.xpath("//div[1]/h1[contains(text(),'Joguman Interactive Card')]");

    private static final Logger LOGGER = LogManager.getLogger(JogumanCardForGalaxy.class);

    public JogumanCardForGalaxy(WebDriver driver) {
        super(driver);
    }

    public JogumanCardForGalaxy watForPageToLoad(String expectedResults) {
        LOGGER.debug("validating actual results is:" + expectedResults);
        ActOn.wait(driver,JogumanCardForGalaxytext).waitForElementToBeVisible();
        //String actualResults=ActOn.element(driver,GalaxyS4text).getTextValue();
        //Assert.assertEquals(actualResults,expectedResults,"Expected results is failed to match");
        return this;

    }
}