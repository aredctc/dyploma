import domain.Navigate;
import engine.utils.TestListener;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({TestListener.class})
@Epic("ZtShop tests")
@Feature("Smoke tests")
public class ZtuShopSmokeTests extends UiTestRunner {

    @Test
    public final void isBasePageLoaded(){
        boolean isBasePageLoaded = Navigate
                .navigateToZtuShopBasePage()
                .isFeaturedItemsLabelDisplayedPage();

        Assert.assertTrue(isBasePageLoaded,
                "Featured items considered as basic element on page should be displayed");
    }

    @Test
    public final void isAppliancesCategoryPageLoaded(){
        boolean isApplianceCategoryPageLoaded = Navigate
                .navigateToZtuShopBasePage()
                .goToAppliancesCategoryPage()
                .isApplianceCategoryPageBaseElementDisplayed();

        Assert.assertTrue(isApplianceCategoryPageLoaded,
                "Appliance label considered as basic element on page should be displayed");
    }

    @Test
    public final void isLaptopsCategoryPageLoaded(){
        boolean isLaptopsCategoryPageLoaded = Navigate
                .navigateToZtuShopBasePage()
                .goToLaptopsCategoryPage()
                .isLaptopsCategoryPageBaseElementDisplayed();

        Assert.assertTrue(isLaptopsCategoryPageLoaded,
                "Laptops label considered as basic element on page should be displayed");
    }

    @Test
    public final void isSmartphonesCategoryPageLoaded(){
        boolean isSmartphonesCategoryPageLoaded = Navigate
                .navigateToZtuShopBasePage()
                .goToSmartphonesCategoryPage()
                .isSmartphonesCategoryPageBaseElementDisplayed();

        Assert.assertTrue(isSmartphonesCategoryPageLoaded,
                "Smartphones label considered as basic element on page should be displayed");
    }

    @Test
    public final void isTvCategoryPageLoaded(){
        boolean isTvCategoryPageLoaded = Navigate
                .navigateToZtuShopBasePage()
                .goToTvCategoryPage()
                .isTVCategoryPageBaseElementDisplayed();

        Assert.assertTrue(isTvCategoryPageLoaded,
                "Tv label considered as basic element on page should be displayed");
    }

    @Test
    public final void isAccessoriesCategoryPageLoaded(){
        boolean isAccessoriesCategoryPageLoaded = Navigate
                .navigateToZtuShopBasePage()
                .goToAccessoriesCategoryPage()
                .isAccessoriesCategoryPageBaseElementDisplayed();

        Assert.assertTrue(isAccessoriesCategoryPageLoaded,
                "Accessories label considered as basic element on page should be displayed");
    }

    @Test
    public final void isConsolesCategoryPageLoaded(){
        boolean isConsolesCategoryPageLoaded = Navigate
                .navigateToZtuShopBasePage()
                .goToConsolesCategoryPage()
                .isConsolesCategoryPageBaseElementDisplayed();

        Assert.assertTrue(isConsolesCategoryPageLoaded,
                "Consoles label considered as basic element on page should be displayed");
    }
}
