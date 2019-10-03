package domain.pageObjects.rozetka;

import engine.Locatable;
import engine.enums.SearchBy;

import static engine.Driver.isElementDisplayed;

public class AppliancesPage {

    private final Locatable baseAppliancePageLabel =
            new Locatable(SearchBy.CSSSELECTOR, ".title-page",
                    "Base Appliance page label");

    public boolean isAppliancePageDisplayed(){
        return isElementDisplayed(baseAppliancePageLabel);
    }
}
