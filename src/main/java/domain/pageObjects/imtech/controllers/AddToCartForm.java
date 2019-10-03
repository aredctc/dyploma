package domain.pageObjects.imtech.controllers;

import engine.Locatable;
import engine.enums.SearchBy;

import static engine.Driver.click;
import static engine.Driver.getText;

public class AddToCartForm {

    private final Locatable productInCartTitle =
            new Locatable(SearchBy.XPATH, "(//h2[@class = 'title_product'])[1]",
                    "Product in cart title");

    private final Locatable productInCartPrice =
            new Locatable(SearchBy.XPATH, "(//span[@class='totalPrice'])[1]", "Product in cart price");

    private final Locatable continueButton =
            new Locatable(SearchBy.ID, "my_closeButton",
                    "Continue purchases button");

    public String getProductInCartTitle(){
        return getText(productInCartTitle);
    }

    public String getProductInCartPrice(){
        return getText(productInCartPrice);
    }

    public Catalogue continuePurchases(){
        click(continueButton, null, true);

        return new Catalogue();
    }
}
