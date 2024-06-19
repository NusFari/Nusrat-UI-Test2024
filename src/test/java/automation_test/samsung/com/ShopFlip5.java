package automation_test.samsung.com;

import automation_test.BaseClass;
import org.testng.annotations.Test;
import page_objects.NavigationBar;

public class ShopFlip5 extends BaseClass {
    @Test

    public void ShopAccessories() {

        new NavigationBar(driver)
                .clickOnSearchIcon()
                .typeArtistRicardoCavoloInteractiveCardforGalaxyZFlip5("Artist Ricardo Cavolo Interactive Card for Galaxy Z Flip5")
                .clickingOnSearchBar()
                .validateFlipAllPageIsLoaded("Artist Ricardo Cavolo Interactive Card for Galaxy Z Flip5");
        new NavigationBar(driver)
                .clicksearch()
                .typeGalaxyTabS9Series("Galaxy Tab S9 Series")
                .serachingclicking()
                .validateShopGalaxyTabIsLoaded("Galaxy Tab S9 Series");





    }
}
