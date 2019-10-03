package domain.pageObjects.rozetka;

import engine.Locatable;
import engine.enums.SearchBy;

import static engine.Driver.isElementDisplayed;

public class LaptopsAndComputersPage {

    private final Locatable baseLaptopsAndComputerPageLabel =
            new Locatable(SearchBy.CSSSELECTOR, ".h3,pab-h3",
                    "Base Laptops and computers page label");

    public boolean islaptopsAndComputersPageDisplayed(){
        return isElementDisplayed(baseLaptopsAndComputerPageLabel);
    }
}
