package domain.pageObjects.imtech;

import domain.pageObjects.imtech.controllers.TopMenu;
import engine.Locatable;
import engine.enums.SearchBy;

import static engine.Driver.getText;

public class CartPage extends TopMenu {

    private final Locatable productTitle =
            new Locatable(SearchBy.CSSSELECTOR, ".onesteporder-products-name a",
                    "Product in cart title");

    private final Locatable productPrice =
            new Locatable(SearchBy.ID, "shpcrtca", "Product in cart price");

    public String getProductTitle(){
        return getText(productTitle);
    }

    public String getProductPrice(){
        return getText(productPrice);
    }
}
