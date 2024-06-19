package automation_test.samsung.com;

import automation_test.BaseClass;
import org.testng.annotations.Test;
import page_objects.NavigationBar;

public class ShopAllMonitors extends BaseClass {
    @Test
    public void  ShopAllMonitors (){
        new NavigationBar(driver)
                .mouseHoverToShoptext()
                .navigateToShopAAlMonitors()
                .validateShopAllOfersIsLoaded("Monitors, Memory & Storage");
        new NavigationBar(driver)
                .clickOnSearchBar()
                .type27OLEDG6G60SDQHDGamingMonitor("27 OLED G6 G60SD QHD Gaming Monitor")
                .clickonsearchbar()
                .validateShopMonitorIsLoaded("All");
    }
}
