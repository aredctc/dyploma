package domain.pageObjects.imtech;

import domain.pageObjects.imtech.controllers.TopMenu;
import engine.Locatable;
import engine.enums.SearchBy;

import static engine.Driver.click;
import static engine.Driver.isElementDisplayed;

public class BasePage extends TopMenu {
    private final Locatable promo =
            new Locatable(SearchBy.CSSSELECTOR, ".carousel-inner",
                    "Promo container");

    private final Locatable appliancesPageLink =
            new Locatable(SearchBy.XPATH, "//a[contains(text(), 'Бытовая')]", "Appliances page link");

    private final Locatable computersPageLink =
            new Locatable(SearchBy.XPATH, "(//a[contains(text(), 'Компьютерная')])[2]",
                    "Computers page link");

    private final Locatable officeEquipmentLink =
            new Locatable(SearchBy.XPATH, "(//a[contains(text(), 'Офисная')])[2]",
                    "Office equipment link");

    private final Locatable portableEquipmentLink =
            new Locatable(SearchBy.XPATH, "(//a[contains(text(), 'Портативная')])[2]",
                    "Potable equipment link");

    private final Locatable serversEquipmentLink =
            new Locatable(SearchBy.XPATH, "(//a[contains(text(), 'Серверное')])[2]",
                    "Servers equipment link");

    private final Locatable networkEquipmentLink =
            new Locatable(SearchBy.XPATH, "(//a[contains(text(), 'Сетевое')])[2]",
                    "Network equipment link");

    private final Locatable tvLink =
            new Locatable(SearchBy.XPATH, "(//a[contains(text(), 'ТВ')])[2]", "TV link");

    private final Locatable smartPhonesLink =
            new Locatable(SearchBy.XPATH, "(//a[contains(text(), 'Телефо')])[5]",
                    "Smartphones link");

    public boolean isPromoDisplayed(){
        return isElementDisplayed(promo);
    }

    public AppliancesPage goToAppliancesPage(){
        click(appliancesPageLink, null, true);

        return new AppliancesPage();
    }

    public ComputersPage goToComputersPage(){
        click(computersPageLink, null, true);

        return new ComputersPage();
    }

    public OfficeEquipmentPage goToOfficeEquipmentPage(){
        click(officeEquipmentLink, null, true);

        return new OfficeEquipmentPage();
    }

    public PortableEquipmentPage goToPortableEquipmentPage(){
        click(portableEquipmentLink, null, true);

        return new PortableEquipmentPage();
    }

    public ServersEquipmentPage goToServersEquipmentPage(){
        click(serversEquipmentLink, null, true);

        return new ServersEquipmentPage();
    }

    public NetworkEquipmentPage goToNetworkEquipmentPage(){
        click(networkEquipmentLink, null, true);

        return new NetworkEquipmentPage();
    }

    public TvPage goToTvPage(){
        click(tvLink, null, true);

        return new TvPage();
    }

    public SmartphonesPage goToSmartphonesPage(){
        click(smartPhonesLink, null, true);

        return new SmartphonesPage();
    }
}
