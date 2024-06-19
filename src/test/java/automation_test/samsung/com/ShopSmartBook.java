package automation_test.samsung.com;

import automation_test.BaseClass;
import org.testng.annotations.Test;
import page_objects.CheckOutForSmartBook;
import page_objects.NavigationBar;
import page_objects.SmartBookCover;

public class ShopSmartBook extends BaseClass {
    @Test

    public void ShopSmartBook() {
        new NavigationBar(driver)
                .clickOnSearchIcon()
                .typSmartBookCoverForGalaxyTabS9UltraBlack("Smart Book Cover for Galaxy Tab S9 Ultra, Black")
                .clickingOnSearchOption()
                .validateAllSmartBookIsLoaded("All");
        new SmartBookCover(driver)
                .navigateToShopSmartBook()
                .watForPageToLoad("Smart Book Cover for Galaxy Tab S9 / TabS9FE,Black");
        new CheckOutForSmartBook(driver)
                .navigateTOCheckoutForSmartBook();








    }
}
