package domain.pageObjects.imtech;

import domain.pageObjects.imtech.controllers.TopMenu;
import engine.Locatable;
import engine.enums.SearchBy;

import static engine.Driver.isElementDisplayed;

public class ServersEquipmentPage extends TopMenu {

    private final Locatable serversEquipmentPageBaseLabel =
            new Locatable(SearchBy.XPATH, "//h1[contains(text(), 'Серверное')]",
                    "Servers equipment page base label");

    public boolean isBaseServersEquipmentPageLabelDisplayed(){
        return isElementDisplayed(serversEquipmentPageBaseLabel);
    }
}
