package page_objects;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationBar {
    private final By ClickOnSearchIcon = By.xpath("//div[6]/div[1][@class='nv00-gnb__utility search']//*[name()='svg']");
    private final By EnterGalaxyS4 = By.id("gnb-search-keyword");
    private final By ClickOnSearchButton = By.xpath("//button[3][@class='gnb-search__input-btn--search'][@an-ca='search']");
    private final By GalaxyS4 = By.linkText("Galaxy S24");
    private final By ClickOnSkipAddIcon = By.xpath("//button[@class='AddOn_footerButton__P3F96'or @data-testid='footerButton']");
    private final By ClickOnCheckOut = By.xpath("//button[@ecom-data-link_id='checkout'][@data-di-id='di-id-ea5fbeb8-58925942']");


    private static final Logger LOGGER = LogManager.getLogger(NavigationBar.class);
    public WebDriver driver;

    public NavigationBar(WebDriver driver) {
        this.driver = driver;
    }

    public NavigationBar clickOnSearchIcon() {
        LOGGER.debug("wait for page to load");
        ActOn.element(driver, ClickOnSearchIcon).click();
        return this;

    }
    public NavigationBar typeGalaxyS4(String name) {
        LOGGER.debug("Typing Galaxy S4:" + name);
        ActOn.element(driver, EnterGalaxyS4).setValue(name);
        return this;


    }
    public ShopAllPhone clickingOnSearchButton() {
        LOGGER.debug("waiting for page to load");
        ActOn.element(driver, ClickOnSearchButton).click();
        return new ShopAllPhone(driver);

    }
    public GalaxyS24 navigateToGalaxyS24() {
        LOGGER.debug("clicking on the galaxy s24 phone");
        ActOn.element(driver, GalaxyS4).click();
        return new GalaxyS24(driver);
    }

    public GalaxyS24Unlocked navigateToGuestCheckout() {
        LOGGER.debug("clicking on skip add icon");
        ActOn.element(driver, ClickOnSkipAddIcon).click();
        return new GalaxyS24Unlocked(driver);


    }
    public GuestCheckout clickOnCheckout() {
        LOGGER.debug("clicking on skip add icon");
        ActOn.element(driver, ClickOnCheckOut).click();
        return new GuestCheckout(driver);
    }
}





