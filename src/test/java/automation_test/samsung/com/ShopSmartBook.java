package automation_test.samsung.com;

import automation_test.BaseClass;
import org.testng.annotations.Test;
import page_objects.NavigationBar;

public class ShopSmartBook extends BaseClass {
    @Test

    public void ShopSmartBook() {
        new NavigationBar(driver)
                .clickOnSearchIcon()
                .typSmartBookCoverForGalaxyTabS9UltraBlack("Smart Book Cover for Galaxy Tab S9 Ultra, Black")
                         .clickingOnSearchOption()
                .validateAllSmartBookIsLoaded("All");
        new NavigationBar(driver)
                .navigateToShopSmartBook()
                .watForPageToLoad("Smart Book Cover for Galaxy Tab S9 Ultra, Black");
        new NavigationBar(driver)
                .navigateTOCheckoutForSmartBook();





    }
}
