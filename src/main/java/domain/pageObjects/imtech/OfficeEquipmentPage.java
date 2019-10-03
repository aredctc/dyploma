package domain.pageObjects.imtech;

import domain.pageObjects.imtech.controllers.TopMenu;
import engine.Locatable;
import engine.enums.SearchBy;

import static engine.Driver.isElementDisplayed;

public class OfficeEquipmentPage extends TopMenu {

    private final Locatable officeEquipmentPageBaseLabel =
            new Locatable(SearchBy.XPATH, "//h1[contains(text(), 'Офисная')]",
                    "Office equipment page base label");

    public boolean isBaseOfficeEquipmentPageLabelDisplayed(){
        return isElementDisplayed(officeEquipmentPageBaseLabel);
    }
}
