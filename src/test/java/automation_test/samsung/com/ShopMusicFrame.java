package automation_test.samsung.com;

import automation_test.BaseClass;
import org.testng.annotations.Test;
import page_objects.NavigationBar;

public class ShopMusicFrame extends BaseClass {
    @Test

    public void ShopMusicFrame() {
        new NavigationBar(driver)
                .clickOnSearchIcon()
                .typeMusicFrameDolbyAtmosSmartSpeaker("Music Frame / Dolby Atmos / Smart Speaker")
                .clickonsearch()
                .validateShopAllPageIsLoaded("ALL");
        new NavigationBar(driver)
                .navigateToShopMusicFrame()
                .watForPageToLoad("Music Frame / Dolby Atmos / Smart Speaker");
        new NavigationBar(driver)
                .navigateTOCartForMusicFrame();


    }
}
