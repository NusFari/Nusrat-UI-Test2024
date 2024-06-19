package page_objects;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Accessories extends NavigationBar{
    private final By Accessories=By.id("Accessories");

    private static final Logger LOGGER= LogManager.getLogger(Accessories.class);

    public Accessories(WebDriver driver) {
        super(driver);
    }


    public page_objects.Accessories validateFlipAllPageIsLoaded(String expectedResults) {
        LOGGER.debug("validating actualResults is :"+expectedResults);
        ActOn.wait(driver,Accessories).waitForElementToBeVisible();
        //String actualResults = ActOn.element(driver, All).getTextValue();
        return this;

        //Assert.assertEquals(actualResults, expectedResults, "Estimated total is failed to match");
    }

}



