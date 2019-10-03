package domain.pageObjects.rozetka;

import engine.Locatable;
import engine.enums.SearchBy;

import static engine.Driver.isElementDisplayed;

public class SmartphonesAndTvPage {

    private final Locatable baseSmartphonesAndTvPageLabel =
            new Locatable(SearchBy.CSSSELECTOR, ".h3,pab-h3",
                    "Base Smartphones and TV page label");

    public boolean isSmartphonesAndTvPageDisplayed(){
        return isElementDisplayed(baseSmartphonesAndTvPageLabel);
    }
}
