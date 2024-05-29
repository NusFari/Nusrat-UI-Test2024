package automation_test.samsung.com;
import automation_test.BaseClass;
import org.testng.annotations.Test;
import page_objects.NavigationBar;

public class ShopAllPhone extends BaseClass {

    @Test

    public void ShopAllPhone() {
        new NavigationBar(driver)
                .clickOnSearchIcon()
                .typeGalaxyS4("Galaxy S4")
                .clickingOnSearchButton()
                .validateShopAllPageIsLoaded("ALL");
        new NavigationBar(driver)
                .navigateToGalaxyS24()
                .watForPageToLoad("Galaxy s24 text")
                .clickOnNoTradeButton()
                .clickOnNoCoverageButton()
                .clickOnContinueButton()
                .validateGalaxyS24UnlockedIsLoaded("GalaxyS24 unlocked text");
        new NavigationBar(driver)
                .navigateToGuestCheckout()
                .clickOnCheckout()
                .validateEstimatedTotal("Estimated total");



    }
}