import domain.Navigate;
import domain.pageObjects.imtech.CartPage;
import domain.pageObjects.imtech.controllers.AddToCartForm;
import domain.pageObjects.imtech.controllers.Catalogue;
import engine.utils.TestListener;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({TestListener.class})
@Epic("Imtech tests")
@Feature("Cart tests")
public class ImtechCartTests extends UiTestRunner {

    @Test
    public void AllowsToAddProductToCart(){
        Catalogue catalogue = Navigate.navigateToImtechBasePage()
                .goToComputersPage()
                .goToComputerAccessoriesCatalogue();

        String productName = catalogue.getProductTitle();

        AddToCartForm form = catalogue.clickAddToCartProduct(productName);

        String productInCartName = form.getProductInCartTitle();

        Assert.assertEquals(productName, productInCartName, "Product should ba added to Cart");
    }

    @Test
    public void ValidateAddingProductToCartByTitleAndPrice(){
        Catalogue catalogue = Navigate.navigateToImtechBasePage()
                .goToComputersPage()
                .goToComputerAccessoriesCatalogue();

        String productName = catalogue.getProductTitle();
        String productPrice = catalogue.getProductPrice();

        AddToCartForm form = catalogue.clickAddToCartProduct(productName);

        String productInCartName = form.getProductInCartTitle();
        String productInCartPrice = form.getProductInCartPrice();

        Assert.assertEquals(productName, productInCartName, "Product name should ba equal as expected");
        Assert.assertEquals(productPrice, productInCartPrice, "Product price should be equal as expected");
    }

    @Test
    public void AddedToCartProductShouldBeExistInCartPage(){
        Catalogue catalogue = Navigate.navigateToImtechBasePage()
                .goToComputersPage()
                .goToComputerAccessoriesCatalogue();

        String productName = catalogue.getProductTitle();
        String productPrice = catalogue.getProductPrice();

        AddToCartForm form = catalogue.clickAddToCartProduct(productName);

        String productInCartName = form.getProductInCartTitle();
        String productInCartPrice = form.getProductInCartPrice();

        CartPage cartPage = form.continuePurchases()
                .goToCartPage();

        String productInCartPageName = cartPage.getProductTitle();
        String productInCartPagePrice = cartPage.getProductPrice();

        Assert.assertEquals(productName.toUpperCase(), productInCartName.toUpperCase(),
                "Product name should ba equal as expected");
        Assert.assertEquals(productPrice.toUpperCase(), productInCartPrice.toUpperCase(),
                "Product price should be equal as expected");
        Assert.assertEquals(productName.toUpperCase(), productInCartPageName.toUpperCase(),
                "Product name should be equal as expected in Cart Page");
        Assert.assertEquals(productPrice.toUpperCase(), productInCartPagePrice.toUpperCase(),
                "Product price should be equal as expected in Cart Page");
    }
}
