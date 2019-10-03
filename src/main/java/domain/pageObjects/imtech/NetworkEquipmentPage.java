package domain.pageObjects.imtech;

import domain.pageObjects.imtech.controllers.TopMenu;
import engine.Locatable;
import engine.enums.SearchBy;

import static engine.Driver.isElementDisplayed;

public class NetworkEquipmentPage extends TopMenu {

    private final Locatable networkEquipmentPageBaseLabel =
            new Locatable(SearchBy.XPATH, "//h1[contains(text(), 'Сетевое')]",
                    "Network equipment page base label");

    public boolean isBaseNetworkEqipmentPageLabelDisplayed(){
        return isElementDisplayed(networkEquipmentPageBaseLabel);
    }
}
