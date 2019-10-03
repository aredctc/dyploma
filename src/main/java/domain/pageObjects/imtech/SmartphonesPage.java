package domain.pageObjects.imtech;

import domain.pageObjects.imtech.controllers.TopMenu;
import engine.Locatable;
import engine.enums.SearchBy;

import static engine.Driver.isElementDisplayed;

public class SmartphonesPage extends TopMenu {

    private final Locatable smartphonesPageBaseLabel =
            new Locatable(SearchBy.XPATH, "//h1[contains(text(), 'Телефоны')]",
                    "Smartphones page base label");

    public boolean isBaseSmartphonesPageLabelDisplayed(){
        return isElementDisplayed(smartphonesPageBaseLabel);
    }
}
