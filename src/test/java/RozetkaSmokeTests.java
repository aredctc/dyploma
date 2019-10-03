import domain.Navigate;
import engine.utils.TestListener;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({TestListener.class})
@Epic("Rozetka tests")
@Feature("Smoke tests")
public class RozetkaSmokeTests extends UiTestRunner {

    @Test
    public void isBasePageLoaded(){
        boolean isBasePageLoaded =
                Navigate.navigateToRozetkaBasePage()
                .isPromoDisplayed();

        Assert.assertTrue(isBasePageLoaded, "Base rozetka page should be loaded");
    }

    @Test
    public void isAppliancesPageLoaded(){
        boolean isAppliancesPageLoaded =
                Navigate.navigateToRozetkaBasePage()
                .goToAppliancesPage()
                .isAppliancePageDisplayed();

        Assert.assertTrue(isAppliancesPageLoaded, "Appliances page should be loaded");
    }

    @Test
    public void isLaptopsAndComputersPageLoaded(){
        boolean isLaptopsAndComputersPageLoaded =
                Navigate.navigateToRozetkaBasePage()
                .goToLaptopsAndComputersPage()
                .islaptopsAndComputersPageDisplayed();

        Assert.assertTrue(isLaptopsAndComputersPageLoaded, "Laptops and computers page should be loaded");
    }

    @Test
    public void isSmartphonesAndTvPageLoaded(){
        boolean isSmartphonesAndTvPageLoaded =
                Navigate.navigateToRozetkaBasePage()
                .goToSmartphonesAndTvPage()
                .isSmartphonesAndTvPageDisplayed();

        Assert.assertTrue(isSmartphonesAndTvPageLoaded, "Smartphones and TV page should be loaded");
    }
}
