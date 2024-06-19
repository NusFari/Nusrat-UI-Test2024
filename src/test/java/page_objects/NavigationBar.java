package page_objects;

import automation_test.samsung.com.ShopFlip5;
import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationBar {
    private final By ClickOnSearchIcon = By.xpath("//div[6]/div[1][@class='nv00-gnb__utility search']//*[name()='svg']");
    private final By EnterGalaxyS4 = By.id("gnb-search-keyword");
    private final By ClickOnSearchButton = By.xpath("//button[3][@class='gnb-search__input-btn--search'][@an-ca='search']");
    //private final By ClickOnSearch = By.xpath("//div[6]/div[1][@class='nv00-gnb__utility search']//*[name()='svg']");
    private final By EnterArtistRicardoCavoloInteractiveCardforGalaxyZFlip5 = By.id("gnb-search-keyword");
    private final By ClickOnSearchBar = By.xpath("//button[3][@class='gnb-search__input-btn--search'][@an-ca='search']");
    private final By GalaxyS24 = By.linkText("Galaxy S24");
    private final By ClickOnSkipAddIcon = By.xpath("//button[@class='AddOn_footerButton__P3F96'or @data-testid='footerButton']");
    //private final By clickOnArtistRicardoCavolo = By.linkText("Artist Ricardo Cavolo Interactive Card for Galaxy S24 Ultra");
    private final By EnterJogumanInteractiveCardforGalaxyS24Ultra = By.id("gnb-search-keyword");
    private final By clickOnAddToCart = By.xpath(" //div[2]/a[1] [contains(text(),'ADD TO')]");
    private final By JogumanS24Ultra = By.linkText("Joguman Interactive Card for Galaxy S24 Ultra");
    private final By EnterSmartBookCoverforGalaxyTabS9UltraBlack = By.id("gnb-search-keyword");
    private final By ClickOnSearch = By.xpath("//button[3][@class='gnb-search__input-btn--search'][@an-ca='search']");
    private final By clickOnSmartBook = By.linkText("Smart Book Cover for Galaxy Tab S9 Ultra, Black");
    private final By EnterMusicFrameDolbyAtmosSmartSpeaker = By.id("gnb-search-keyword");
    private final By clickOnMusicFrame = By.linkText("Music Frame / Dolby Atmos / Smart Speaker");
    private final By clickOnAddCart = By.xpath("//div[2]/div[contains(text(),'Add to ca')]");
    private final By shopLink = By.xpath("//li[1]/button[contains(text(),'Sho')]");
    //private final By BuyNow = By.xpath("//a[contains(@class,'cards-container-card__text-block__btn--btn-updt')][@data-di-id='di-id-d2a5ef0b-44b4f4b']");
    private final By Shop = By.xpath("//button[contains(text(),'Shop')]");
    private final By watch = By.xpath("//li[5]/a[contains(text(),'Watches & Au')]");
    private final By MonitorMemory = By.xpath("//li[7]/a[contains(text(),'Monitor, Memory')]");
    private final By Ente27OLEDG6G60SDQHDGamingMonitor = By.xpath("//div/input[contains(@class,'input sl-search-input')][@aria-label='search Samsung.com']");
    private final By EnterGalaxyWatch6Watch6Classic = By.xpath("//div/input[contains(@class,'input sl-search-input')][@aria-label='search Samsung.com']);");
    private final By EnterGalaxyWatch5Pro=By.xpath("//div/input[contains(@class,'input sl-search-input')][@aria-label='search Samsung.com']");
    private final By allOffers = By.linkText("All Offers");
    private final By EnterGalaxyBuds2ProBora = By.id("gnb-search-keyword");
    private final By galaxyBuds2ProBora = By.linkText("Galaxy Buds2 Pro");
    private final By Shopword = By.xpath("//button[contains(text(),'Shop')]");
    private final By EnterGalaxyBudsFE=By.xpath("//div/input[contains(@class,'input sl-search-input')][@aria-label='search Samsung.com']");

    private final By tablets = By.xpath("//li[6]/a[contains(text(),'Tablets & Computi')]");
    private final By searchBar = By.xpath("//button[@class='nv00-gnb__utility-btn gnb__search-btn-js']/*[name()='svg']");
    private final By EnterGalaxyTabS9Series=By.xpath("//div/input[contains(@class,'input sl-search-input')][@aria-label='search Samsung.com']");

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

    public NavigationBar typeGalaxyS24(String name) {
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
        ActOn.element(driver, GalaxyS24).click();
        return new GalaxyS24(driver);
    }
    public GalaxyS24Unlocked navigateToGuestCheckout() {
        LOGGER.debug("clicking on skip add icon");
        ActOn.element(driver, ClickOnSkipAddIcon).click();
        return new GalaxyS24Unlocked(driver);

    }
    public NavigationBar typeArtistRicardoCavoloInteractiveCardforGalaxyZFlip5(String name) {
        LOGGER.debug("Typing Artist Ricardo Cavolo Interactive Card for Galaxy Z Flip5:" + name);
        ActOn.element(driver, EnterArtistRicardoCavoloInteractiveCardforGalaxyZFlip5).setValue(name);
        return this;


    }
    public Accessories clickingOnSearchBar() {
        LOGGER.debug("waiting for page to load");
        ActOn.element(driver, ClickOnSearchBar).click();
        return new Accessories(driver);
    }
    public NavigationBar typeJogumanInteractiveCardforGalaxyS24Ultra(String name) {
        LOGGER.debug("Joguman Interactive Card for Galaxy S24 Ultra:" + name);
        ActOn.element(driver, EnterJogumanInteractiveCardforGalaxyS24Ultra).setValue(name);
        return this;
    }
    public ShopAllJoguman clickingOnSearch() {
        LOGGER.debug("waiting for page to load");
        ActOn.element(driver, ClickOnSearchBar).click();
        return new ShopAllJoguman(driver);
    }
    public JogumanCardForGalaxy navigateToJogumanCardGalaxy() {
        LOGGER.debug("clicking on the Joguman s24 ultra");
        ActOn.element(driver, JogumanS24Ultra).click();
        return new JogumanCardForGalaxy(driver);
    }
    public JogumanCardForGalaxy navigateTOCheckoutForJoguman() {
        LOGGER.debug("clicking on add to cart icon");
        ActOn.element(driver, clickOnAddToCart).click();
        return new JogumanCardForGalaxy(driver);
    }
    public NavigationBar typSmartBookCoverForGalaxyTabS9UltraBlack(String name) {
        LOGGER.debug("Typing Book Cover for Galaxy Tab S9 Ultra Black:" + name);
        ActOn.element(driver, EnterSmartBookCoverforGalaxyTabS9UltraBlack).setValue(name);
        return this;
    }
    public ShopAllSmartBook clickingOnSearchOption() {
        LOGGER.debug("waiting for page to load");
        ActOn.element(driver, ClickOnSearch).click();
        return new ShopAllSmartBook(driver);
    }
    public SmartBookCover navigateToShopSmartBook() {
        LOGGER.debug("clicking on Smart Book Cover for Galaxy Tab S9 Ultra, Black");
        ActOn.element(driver, clickOnSmartBook).click();
        return new SmartBookCover(driver);
    }

    public CheckOutForSmartBook navigateTOCheckoutForSmartBook() {
        LOGGER.debug("clicking on add to cart icon");
        ActOn.element(driver, clickOnAddToCart).click();
        return new CheckOutForSmartBook(driver);
    }
    public NavigationBar typeMusicFrameDolbyAtmosSmartSpeaker(String name) {
        LOGGER.debug("Typing Music FrameDolby Atmos Smart Speaker:" + name);
        ActOn.element(driver, EnterMusicFrameDolbyAtmosSmartSpeaker).setValue(name);
        return this;
    }

    public ShopAllMusicFrame clickonsearch() {
        LOGGER.debug("waiting for page to load");
        ActOn.element(driver, ClickOnSearch).click();
        return new ShopAllMusicFrame(driver);

    }

    public MusicFrame navigateToShopMusicFrame() {
        LOGGER.debug("clicking on Music Frame / Dolby Atmos / Smart Speaker");
        ActOn.element(driver, clickOnMusicFrame).click();
        return new MusicFrame(driver);
    }

    public CartForMusicFrame navigateTOCartForMusicFrame() {
        LOGGER.debug("clicking on add to cart icon");
        ActOn.element(driver, clickOnAddCart).click();
        return new CartForMusicFrame(driver);


    }
    public NavigationBar mouseHoverToShop() {
        LOGGER.debug("Mouse Hover to the Shop Link");
        ActOn.element(driver, shopLink).mouseHover();
        return this;
    }

    public ShopAllOfers navigateToShopAllOfers() {
        LOGGER.debug("Clicking on the All Offers Link from the Navigation Bar");
        ActOn.element(driver, allOffers).click();
        return new ShopAllOfers(driver);
    }

    public NavigationBar typeGalaxyBuds2ProBora(String name) {
        LOGGER.debug("typing Galaxy Buds2 Pro Bora:" + name);
        ActOn.element(driver, EnterGalaxyBuds2ProBora).setValue(name);
        return this;

    }
    public GalaxyBuds search() {
        LOGGER.debug("waiting for page to load");
        ActOn.element(driver, ClickOnSearch).click();
        return new GalaxyBuds(driver);

    }
    public GalaxyBudsPro navigateTOGalaxyBudsPro() {
        LOGGER.debug("clicking on add to cart icon");
        ActOn.element(driver, galaxyBuds2ProBora).click();
        return new GalaxyBudsPro(driver);

    }
    public NavigationBar mouseHoverToShoplink() {
        LOGGER.debug("Mouse Hover to the Shop Link");
        ActOn.element(driver, Shop).mouseHover();
        return this;
    }
    public ShopAllWatches navigateToShopAllWatches() {
        LOGGER.debug("Clicking on the All Offers Link from the Navigation Bar");
        ActOn.element(driver, watch).click();
        return new ShopAllWatches(driver);
    }
    public NavigationBar mouseHoverToShopWord() {
        LOGGER.debug("Mouse Hover to the Shop Link");
        ActOn.element(driver, Shopword).mouseHover();
        return this;

    }

    public Tablets navigateToShopTablets() {
        LOGGER.debug("Clicking on the Tablets & Computing Link from the Navigation Bar");
        ActOn.element(driver, tablets).click();
        return new Tablets(driver);

    }

    public NavigationBar mouseHoverToShoptext() {
        LOGGER.debug("Mouse Hover to the Shop text");
        ActOn.element(driver, Shopword).mouseHover();
        return this;
    }

    public Monitors navigateToShopAAlMonitors() {
        LOGGER.debug("Clicking on the Tablets & Computing Link from the Navigation Bar");
        ActOn.element(driver, MonitorMemory).click();
        return new Monitors(driver);
    }

    public NavigationBar clickOnSearchBar() {
        LOGGER.debug("wait for page to load");
        ActOn.element(driver, searchBar).click();
        return this;
    }

    public NavigationBar type27OLEDG6G60SDQHDGamingMonitor(String name) {
        LOGGER.debug("typing Galaxy Buds2 Pro Bora:" + name);
        ActOn.element(driver, Ente27OLEDG6G60SDQHDGamingMonitor).setValue(name);
        return this;
    }

    public ShopMonitor clickonsearchbar() {
        LOGGER.debug("waiting for page to load");
        ActOn.element(driver,ClickOnSearch).click();
        return new ShopMonitor(driver);


    }
    public NavigationBar clicksearch() {
        LOGGER.debug("wait for page to load");
        ActOn.element(driver, searchBar).click();
        return this;
    }
    public NavigationBar typeGalaxyWatch6Watch6Classic(String name) {
        LOGGER.debug("Galaxy Watch6 | Watch6 Classic:" + name);
        ActOn.element(driver,EnterGalaxyWatch6Watch6Classic).setValue(name);
        return this;
    }

    public GalaxyWatch searching() {
        LOGGER.debug("waiting for page to load");
        ActOn.element(driver, ClickOnSearch).click();
        return new GalaxyWatch(driver);
    }
    public NavigationBar clickonserachItem() {
        LOGGER.debug("wait for page to load");
        ActOn.element(driver,searchBar).click();
        return this;
    }
    public NavigationBar typeGalaxyWatch5Pro(String name) {
        LOGGER.debug("Galaxy Watch5 Pro:" + name);
        ActOn.element(driver,EnterGalaxyWatch5Pro).setValue(name);
        return this;
    }

    public ShopAllWatch5Pro searches() {
        LOGGER.debug("waiting for page to load");
        ActOn.element(driver,ClickOnSearch).click();
        return new ShopAllWatch5Pro(driver);
    }
    public NavigationBar typeGalaxyTabS9Series(String name) {
        LOGGER.debug("Galaxy Tab S9 Series:" + name);
        ActOn.element(driver, EnterGalaxyTabS9Series).setValue(name);
        return this;
    }
    public ShopGalaxyTab serachingclicking() {
        LOGGER.debug("waiting for page to load");
        ActOn.element(driver,ClickOnSearch).click();
        return new ShopGalaxyTab(driver);
    }

    public NavigationBar typeGalaxyBudsFE(String name) {
        LOGGER.debug("Galaxy budsFE:" + name);
        ActOn.element(driver,EnterGalaxyBudsFE).setValue(name);
        return this;
    }
    public BudsFE serachingclick() {
        LOGGER.debug("waiting for page to load");
        ActOn.element(driver,ClickOnSearch).click();
        return new BudsFE(driver);
    }

}


























