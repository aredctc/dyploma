package domain.pageObjects.ztShop;

import engine.Locatable;
import engine.enums.SearchBy;

import static engine.Driver.isElementDisplayed;

public class SmartphonesPage {

    private final Locatable baseSmartphonesLabel =
            new Locatable(SearchBy.XPATH, "//p[contains(text(),'Smartphones')]", "Base Smartphones page label");

    public boolean isSmartphonesCategoryPageBaseElementDisplayed() {
        return isElementDisplayed(baseSmartphonesLabel);
    }
}
