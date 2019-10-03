package domain.pageObjects.rozetka;

import engine.Locatable;
import engine.enums.SearchBy;

import static engine.Driver.click;
import static engine.Driver.isElementDisplayed;

public class BasePage {
    private final Locatable promo =
            new Locatable(SearchBy.XPATH, "//div[@class = 'main-slider js-rz-slider']",
                    "Promo container");

    private final Locatable laptopsAndComputersLink =
            new Locatable(SearchBy.XPATH, "(//a[@class = 'menu-categories__link'])[1]",
                    "Laptops and computers link");

    private final Locatable smartphonesAndTvLink =
            new Locatable(SearchBy.XPATH, "(//a[@class = 'menu-categories__link'])[2]",
                    "Smartphones and TV link");

    private final Locatable appliancesLink =
            new Locatable(SearchBy.XPATH, "(//a[@class = 'menu-categories__link'])[3]",
                    "Appliances link");

    public boolean isPromoDisplayed(){
        return isElementDisplayed(promo);
    }

    public LaptopsAndComputersPage goToLaptopsAndComputersPage(){
        click(laptopsAndComputersLink, null, true);

        return new LaptopsAndComputersPage();
    }

    public SmartphonesAndTvPage goToSmartphonesAndTvPage(){
        click(smartphonesAndTvLink, null, true);

        return new SmartphonesAndTvPage();
    }
    public AppliancesPage goToAppliancesPage(){
        click(appliancesLink, null, true);

        return new AppliancesPage();
    }
}
