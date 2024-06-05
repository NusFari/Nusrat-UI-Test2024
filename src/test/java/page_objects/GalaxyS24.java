package page_objects;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class GalaxyS24 extends NavigationBar {
    Actions actions;
    private final By GalaxyS4text=By.xpath("//h1[contains(text(),'Galaxy')]");
    private final By ClickOnnoTradeIn=By.xpath("//div[@id='card-label']/bold");
    private final By ClickOnNoCoverage=By.xpath("//div[1]/div[@id='atom_option']");
    private final By ClickOnContinueButton=By.xpath("//button[contains(text(),'Contin')][@id='continue_btn']");
    //private final By UnlockedText = By.xpath("//div[3]/span[@data-testid='atom_label']");


    private static final Logger LOGGER=LogManager.getLogger(GalaxyS24.class);

    public GalaxyS24(WebDriver driver) {
        super(driver);
    }

    public GalaxyS24 watForPageToLoad(String expectedResults) {
        LOGGER.debug("validating actual results is:"+expectedResults);
        ActOn.wait(driver,GalaxyS4text).waitForElementToBeVisible();
        //String actualResults=ActOn.element(driver,GalaxyS4text).getTextValue();
        //Assert.assertEquals(actualResults,expectedResults,"Expected results is failed to match");
        return this;


    }

    public GalaxyS24 clickOnNoTradeButton() {
        WebElement noElement=driver.findElement(ClickOnnoTradeIn);
        actions=new Actions(driver);
        actions.moveToElement(noElement).click().build().perform();
        LOGGER.debug("click on the no trade in button");
        ActOn.element(driver,ClickOnnoTradeIn).click();
        return this;
    }

    public GalaxyS24 clickOnNoCoverageButton() {

        WebElement noCoverage=driver.findElement(ClickOnNoCoverage);
        actions=new Actions(driver);
        actions.moveToElement(noCoverage).click().build().perform();
        LOGGER.debug("click on the no coverage button");
        ActOn.element(driver,ClickOnNoCoverage).click();
        return this;

    }

    public GalaxyS24Unlocked clickOnContinueButton() {
        LOGGER.debug("Clicking on the Continue Button");
        ActOn.element(driver,ClickOnContinueButton).click();
        return new GalaxyS24Unlocked(driver);
    }




    }

