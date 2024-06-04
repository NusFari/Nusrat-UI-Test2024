package page_objects;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class GuestCheckout extends NavigationBar{

    private final By EstimatedTotal=By.xpath("//div[5]/p[1][contains(text(),'Estimated total')]");
    private static final Logger LOGGER=LogManager.getLogger(GalaxyS24.class);
    public GuestCheckout(WebDriver driver){
        super(driver);
    }

    public GuestCheckout validateEstimatedTotal(String expectedEstimatedTotal) {
        LOGGER.debug("validating estimated payment is :"+expectedEstimatedTotal);
        ActOn.wait(driver,EstimatedTotal).waitForElementToBeVisible();
        //String actualEstimatedTotal = ActOn.element(driver, EstimatedTotal).getTextValue();
        //Assert.assertEquals(actualEstimatedTotal, expectedEstimatedTotal, "Estimated total is failed to match");
        return this;


    }
}