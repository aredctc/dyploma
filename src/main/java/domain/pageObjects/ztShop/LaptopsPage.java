package domain.pageObjects.ztShop;

import engine.Locatable;
import engine.enums.SearchBy;

import static engine.Driver.isElementDisplayed;

public class LaptopsPage {

    private final Locatable baseLaptopsLabel =
            new Locatable(SearchBy.XPATH, "//p[contains(text(),'Laptops')]", "Base Laptops page label");

    public boolean isLaptopsCategoryPageBaseElementDisplayed(){
        return isElementDisplayed(baseLaptopsLabel);
    }
}
