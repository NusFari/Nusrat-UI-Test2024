package automation_test.samsung.com;

import automation_test.BaseClass;
import org.testng.annotations.Test;
import page_objects.NavigationBar;

public class ShopJoguman extends BaseClass {
    @Test

    public void ShopJoguman() {

        new NavigationBar(driver)
                .clickOnSearchIcon()
                .typeJogumanInteractiveCardforGalaxyS24Ultra("Joguman Interactive Card for Galaxy S24 Ultra")
                .clickingOnSearch()
                .navigateToJogumanCardGalaxy();
        new NavigationBar(driver)
                .navigateTOCheckoutForJoguman();






    }
}
