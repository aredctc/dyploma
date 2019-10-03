package domain.pageObjects.ztShop;

import engine.Locatable;
import engine.enums.SearchBy;

import static engine.Driver.isElementDisplayed;

public class ConsolesPage {

    private final Locatable baseConsolesLabel =
            new Locatable(SearchBy.XPATH, "//p[contains(text(),'Consoles')]", "Base Consoles page label");

    public boolean isConsolesCategoryPageBaseElementDisplayed() {
        return isElementDisplayed(baseConsolesLabel);
    }
}
