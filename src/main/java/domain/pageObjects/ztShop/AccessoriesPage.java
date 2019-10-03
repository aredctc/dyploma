package domain.pageObjects.ztShop;

import engine.Locatable;
import engine.enums.SearchBy;

import static engine.Driver.isElementDisplayed;

public class AccessoriesPage {

    private final Locatable baseAccessoriesLabel =
            new Locatable(SearchBy.XPATH, "//p[contains(text(),'Accessories')]", "Base Accessories page label");

    public boolean isAccessoriesCategoryPageBaseElementDisplayed() {
        return isElementDisplayed(baseAccessoriesLabel);
    }
}
