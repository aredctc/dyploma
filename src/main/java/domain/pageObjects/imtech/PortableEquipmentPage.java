package domain.pageObjects.imtech;

import domain.pageObjects.imtech.controllers.TopMenu;
import engine.Locatable;
import engine.enums.SearchBy;

import static engine.Driver.isElementDisplayed;

public class PortableEquipmentPage extends TopMenu {

    private final Locatable portableEquipmentPageBaseLabel =
            new Locatable(SearchBy.XPATH, "//h1[contains(text(), 'Портативная')]",
                    "Portable equipment page base label");

    public boolean isBasePortbaleEquipmentPageLabelDisplayed(){
        return isElementDisplayed(portableEquipmentPageBaseLabel);
    }
}
