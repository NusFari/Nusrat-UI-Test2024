package automation_test.samsung.com;

import automation_test.BaseClass;
import org.testng.annotations.Test;
import page_objects.NavigationBar;

public class ShopGalaxyBuds extends BaseClass {
    @Test
    public void ShopGalaxyBudd(){

      new NavigationBar(driver)
              .clickOnSearchIcon()
              .typeGalaxyBuds2ProBora("Galaxy Buds2 Pro Bora")
              .search()
              .validateShopAllPageIsLoaded("Galaxy Buds2 Pro Bora");
      new NavigationBar(driver)
              .navigateTOGalaxyBudsPro()
              .watForPageToLoad("Galaxy Buds2 Pro, Bora Purple");

    }
}
