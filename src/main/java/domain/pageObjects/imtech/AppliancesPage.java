package domain.pageObjects.imtech;

import domain.pageObjects.imtech.controllers.TopMenu;
import engine.Locatable;
import engine.enums.SearchBy;

import static engine.Driver.isElementDisplayed;

public class AppliancesPage extends TopMenu {

    private final Locatable appliancesPageBaseLabel =
            new Locatable(SearchBy.XPATH, "//h1[contains(text(), 'Бытовая')]",
                    "Appliances page base label");

    public boolean isBaseApplincePageLabelDisplayed(){
        return isElementDisplayed(appliancesPageBaseLabel);
    }
}
