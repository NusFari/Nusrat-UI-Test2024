package page_objects;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MusicFrame extends NavigationBar {
    private static final Logger LOGGER = LogManager.getLogger(GalaxyS24.class);
    private final By MusicFrameText = By.xpath("//div[1]/h3[contains(text(),'Music Frame / Dolby Atmos')]");

    public MusicFrame(WebDriver driver) {
        super(driver);
    }

    public MusicFrame watForPageToLoad(String expectedResults) {
        LOGGER.debug("validating actual results is:" + expectedResults);
        ActOn.wait(driver, MusicFrameText).waitForElementToBeVisible();
        //String actualResults=ActOn.element(driver,GalaxyS4text).getTextValue();
        //Assert.assertEquals(actualResults,expectedResults,"Expected results is failed to match");
        return this;


    }
}
