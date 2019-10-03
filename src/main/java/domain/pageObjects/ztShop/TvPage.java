package domain.pageObjects.ztShop;

import engine.Locatable;
import engine.enums.SearchBy;

import static engine.Driver.isElementDisplayed;

public class TvPage {

    private final Locatable baseTvLabel =
            new Locatable(SearchBy.XPATH, "//p[contains(text(),'TV')]", "Base TV page label");

    public boolean isTVCategoryPageBaseElementDisplayed() {
        return isElementDisplayed(baseTvLabel);
    }
}
