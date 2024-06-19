package automation_test.samsung.com;

import automation_test.BaseClass;
import org.testng.annotations.Test;
import page_objects.NavigationBar;

public class TabletsComputing extends BaseClass {
    @Test

    public void TabletsComputing() {
      new NavigationBar(driver)
              .mouseHoverToShopWord()
              .navigateToShopTablets()
              .validateShopallTabletsIsLoaded("Tablest & Watches");
      new NavigationBar(driver)
              .clickonserachItem()
              .typeGalaxyBudsFE("Galaxy Buds FE")
              .serachingclick()
              .validateBudsFEPageIsLoaded("ALL");
    }
}
