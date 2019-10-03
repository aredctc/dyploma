package domain.pageObjects.ztShop;

import engine.Locatable;
import engine.enums.SearchBy;

import static engine.Driver.*;

public class AppliancesPage {

    private final Locatable baseApplianceLabel =
            new Locatable(SearchBy.XPATH, "//p[contains(text(),'Appliances')]", "Base Appliance page label");

    public boolean isApplianceCategoryPageBaseElementDisplayed(){
        return isElementDisplayed(baseApplianceLabel);
    }

}
