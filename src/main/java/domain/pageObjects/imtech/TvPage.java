package domain.pageObjects.imtech;

import domain.pageObjects.imtech.controllers.TopMenu;
import engine.Locatable;
import engine.enums.SearchBy;

import static engine.Driver.isElementDisplayed;

public class TvPage extends TopMenu {

    private final Locatable tvPageBaseLabel =
            new Locatable(SearchBy.XPATH, "//h1[contains(text(), 'ТВ')]",
                    "Tv page base label");

    public boolean isBaseTvPageLabelDisplayed(){
        return isElementDisplayed(tvPageBaseLabel);
    }
}
