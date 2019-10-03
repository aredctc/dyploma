package domain.pageObjects.ztShop;

import engine.Locatable;
import engine.enums.SearchBy;

import static engine.Driver.*;

public class BasePage {

    private final Locatable logo =
            new Locatable(SearchBy.CLASSNAME, "logoImage", "Main logo");

    private final Locatable categoryButton =
            new Locatable(SearchBy.XPATH, "(//a[contains(text(), '%s')])[1]", "Category button");

    private final Locatable featuredItemsLabel =
            new Locatable(SearchBy.XPATH, "//h2[contains(text(),'Featured')]", "Featured items label");

    public boolean isFeaturedItemsLabelDisplayedPage(){
        return isElementDisplayed(featuredItemsLabel);
    }

    public AppliancesPage goToAppliancesCategoryPage(){
        click(categoryButton.modify("Appliances"), null, true);

        return new AppliancesPage();
    }

    public LaptopsPage goToLaptopsCategoryPage(){
        click(categoryButton.modify("Laptops"), null, true);

        return new LaptopsPage();
    }

    public SmartphonesPage goToSmartphonesCategoryPage(){
        click(categoryButton.modify("Smartphones"), null, true);

        return new SmartphonesPage();
    }

    public TvPage goToTvCategoryPage(){
        click(categoryButton.modify("TV"), null, true);

        return new TvPage();
    }

    public AccessoriesPage goToAccessoriesCategoryPage(){
        click(categoryButton.modify("Accessories"), null, true);

        return new AccessoriesPage();
    }

    public ConsolesPage goToConsolesCategoryPage(){
        click(categoryButton.modify("Consoles"), null, true);

        return new ConsolesPage();
    }
}
