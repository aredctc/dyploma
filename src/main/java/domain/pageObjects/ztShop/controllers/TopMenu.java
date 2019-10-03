package domain.pageObjects.ztShop.controllers;

import engine.Driver;
import engine.Locatable;
import engine.enums.SearchBy;

public class TopMenu {
    public static Driver driver = new Driver();

    private final Locatable accountButton =
            new Locatable(SearchBy.CSSSELECTOR, "#customerAccount .click_menu", "My account button");

    private final Locatable contactUsButton =
            new Locatable(SearchBy.XPATH, "(//a[contains(text(), 'Contact us')])[1]", "Contact us button");


}
