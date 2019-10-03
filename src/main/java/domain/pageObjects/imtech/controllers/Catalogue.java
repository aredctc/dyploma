package domain.pageObjects.imtech.controllers;

import domain.pageObjects.imtech.CartPage;
import engine.Locatable;
import engine.enums.SearchBy;

import static engine.Driver.click;
import static engine.Driver.getText;
import static engine.Driver.isElementDisplayed;

public class Catalogue extends TopMenu {

    private final Locatable titleProductLabel =
            new Locatable(SearchBy.XPATH, "(//h2[@class = 'title_product'])[1]", "Title product label");

    private final Locatable productPriceLabel =
            new Locatable(SearchBy.XPATH, "(//span[@class='totalPrice'])[1]", "Product price label");

    private final Locatable addToCartByTitleButton =
            new Locatable(SearchBy.XPATH, "((//form[@class = 'product_brief_block'])[1]//h2[contains(text(), " +
                    "'%s')]//following::input)[1]", "Add to cart by title button");

    private final Locatable baseCatalogueContainer =
            new Locatable(SearchBy.CSSSELECTOR, ".product_brief_block", "Base catalogue container");

    public String getProductTitle() {
        return getText(titleProductLabel);
    }

    public String getProductPrice(){
        return getText(productPriceLabel);
    }

    public AddToCartForm clickAddToCartProduct(String productName){
        click(addToCartByTitleButton.modify(productName), null, true);

        return new AddToCartForm();
    }

    public boolean isCatalogueBaseElementDisplayed(){
        return isElementDisplayed(baseCatalogueContainer);
    }

    public CartPage goToCartPage(){
        click(cartPageLink, null, true);

        return new CartPage();
    }
}
