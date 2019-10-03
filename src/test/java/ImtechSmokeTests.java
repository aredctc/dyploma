import domain.Navigate;
import engine.utils.TestListener;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({TestListener.class})
@Epic("Imtech tests")
@Feature("Smoke tests")
public class ImtechSmokeTests extends UiTestRunner {

    @Test(description = "Test to validate is base Imtech page loaded")
    public void isBasePageLoaded(){
        boolean isBasePageLoaded =
                Navigate.navigateToImtechBasePage()
                .isPromoDisplayed();

        Assert.assertTrue(isBasePageLoaded, "Base imtech page should be loaded");
    }

    @Test(description = "Test to validate is Appliances Imtech page loaded")
    public void isAppliancesPageLoaded(){
        boolean isAppliancesPageLoaded =
                Navigate.navigateToImtechBasePage()
                .goToAppliancesPage()
                .isBaseApplincePageLabelDisplayed();

        Assert.assertTrue(isAppliancesPageLoaded, "Base appliances page element should be displayed");
    }

    @Test(description = "Test to validate is Computers Imtech page loaded")
    public void isComputersPageLoaded(){
        boolean isComputersPageLoaded =
                Navigate.navigateToImtechBasePage()
                .goToComputersPage()
                .isBaseComputersPageLabelDisplayed();

        Assert.assertTrue(isComputersPageLoaded, "Base computers page element should be displayed");
    }

    @Test(description = "Test to validate is Network Equipment Imtech page loaded")
    public void isNetworkEquipmentPageLoaded(){
        boolean isNetworkEquipmentPageLoaded =
                Navigate.navigateToImtechBasePage()
                .goToComputersPage()
                .isBaseComputersPageLabelDisplayed();

        Assert.assertTrue(isNetworkEquipmentPageLoaded,
                "Base network equipment page element should be displayed");
    }

    @Test(description = "Test to validate is Office Equipment Imtech page loaded")
    public void isOfficeEquipmentPageLoaded(){
        boolean isOfficeEquipmentPageLoaded =
                Navigate.navigateToImtechBasePage()
                .goToOfficeEquipmentPage()
                .isBaseOfficeEquipmentPageLabelDisplayed();

        Assert.assertTrue(isOfficeEquipmentPageLoaded, "Base office equipment page element should be displayed");
    }

    @Test(description = "Test to validate is Portable Equipment Imtech page loaded")
    public void isPortableEquipmentPageLoaded(){
        boolean isPortableEquipmentPageLoaded =
                Navigate.navigateToImtechBasePage()
                .goToPortableEquipmentPage()
                .isBasePortbaleEquipmentPageLabelDisplayed();

        Assert.assertTrue(isPortableEquipmentPageLoaded,
                "Base portable equipment page element should be displayed");
    }

    @Test(description = "Test to validate is Servers Equipment page loaded")
    public void isServersEquipmentPageLoaded(){
        boolean isServersEquipmentPageLoaded =
                Navigate.navigateToImtechBasePage()
                .goToServersEquipmentPage()
                .isBaseServersEquipmentPageLabelDisplayed();

        Assert.assertTrue(isServersEquipmentPageLoaded,
                "Base servers equipment page element should be displayed");
    }

    @Test(description = "Test to validate is Smartphones Imtech page loaded")
    public void isSmarpthonesPageLoaded(){
        boolean isSmartphonesPageLoaded =
                Navigate.navigateToImtechBasePage()
                .goToSmartphonesPage()
                .isBaseSmartphonesPageLabelDisplayed();

        Assert.assertTrue(isSmartphonesPageLoaded,
                "Smartphones base page element should be displayed");
    }

    @Test(description = "Test to validate is TV Imtech page loaded")
    public void isTvPageLoaded(){
        boolean isTvPageLoaded =
                Navigate.navigateToImtechBasePage()
                .goToTvPage()
                .isBaseTvPageLabelDisplayed();

        Assert.assertTrue(isTvPageLoaded, "Base tv page element should be displayed");
    }
}
