package domain.pageObjects.imtech.controllers;

import engine.Locatable;
import engine.enums.SearchBy;

public class TopMenu {
    protected final Locatable loginPageLink =
            new Locatable(SearchBy.XPATH, "//a[contains(text(), 'Войти')]", "Login page link");

    protected final Locatable registerPageLink =
            new Locatable(SearchBy.XPATH, "//a[contains(text(), 'Регистрация')]", "Register page link");

    protected final Locatable contactsPageLink =
            new Locatable(SearchBy.XPATH, "(//a[contains(text(), 'Контакты')])[1]",
                    "Contacts page link");

    protected final Locatable cartPageLink =
            new Locatable(SearchBy.CSSSELECTOR, "a.cart_img", "Cart page link");
}
