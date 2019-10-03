package domain.pageObjects.imtech;

import domain.pageObjects.imtech.controllers.Catalogue;
import domain.pageObjects.imtech.controllers.TopMenu;
import engine.Locatable;
import engine.enums.SearchBy;

import static engine.Driver.click;
import static engine.Driver.isElementDisplayed;

public class ComputersPage extends TopMenu {

    private final Locatable computersPageBaseLabel =
            new Locatable(SearchBy.XPATH, "//h1[contains(text(), 'Компьютерная')]",
                    "Computers page base label");

    private final Locatable computerAccessorisesLink =
            new Locatable(SearchBy.XPATH, "(//a[contains(text(), 'Комплектующие')])[2]",
                    "Computer accessories link");

    public boolean isBaseComputersPageLabelDisplayed(){
        return isElementDisplayed(computersPageBaseLabel);
    }

    public Catalogue goToComputerAccessoriesCatalogue(){
        click(computerAccessorisesLink, null, true);

        return new Catalogue();
    }
}
