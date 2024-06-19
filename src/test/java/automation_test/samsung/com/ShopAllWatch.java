package automation_test.samsung.com;

import automation_test.BaseClass;
import org.testng.annotations.Test;
import page_objects.NavigationBar;

public class ShopAllWatch extends BaseClass {
    @Test

    public void shopAllWatch() {
        new NavigationBar(driver)
                .mouseHoverToShoplink()
                .navigateToShopAllWatches()
                .validateShopAllOfersIsLoaded("Watches & Audio");
        new NavigationBar(driver)
                .clickonserachItem()
                .typeGalaxyWatch5Pro("Galaxy Watch5 Pro")
                .searches()
                .validateShopWatch5ProIsLoaded("ALL");
    }
}
