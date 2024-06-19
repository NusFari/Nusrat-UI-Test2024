package automation_test.samsung.com;

import automation_test.BaseClass;
import org.testng.annotations.Test;
import page_objects.NavigationBar;

public class ShopAllOffer extends BaseClass {
    @Test
    public void ShopAllOffer(){

        new NavigationBar(driver)
                .mouseHoverToShop()
                .navigateToShopAllOfers()
                .validateShopAllOfersIsLoaded("Featured");
        new NavigationBar(driver)
                .clicksearch()
                .typeGalaxyWatch6Watch6Classic("Galaxy Watch6  Watch6 Classic")
                .searching()
                .validateGalaxyAllPageIsLoaded("All");




    }



}
