package domain;

import engine.Driver;

public class Navigate {
    private final static String ztuShopUrl = "http://localhost:8080/shop/";

    private final static String rozetkaShopUrl = "https://rozetka.com.ua/ua/";

    private final static String imtechUrl = "http://imtech.com.ua/";

    public static domain.pageObjects.ztShop.BasePage navigateToZtuShopBasePage(){
        Driver.load(ztuShopUrl);

        return new domain.pageObjects.ztShop.BasePage();
    }

    public static domain.pageObjects.rozetka.BasePage navigateToRozetkaBasePage(){
        Driver.load(rozetkaShopUrl);

        return new domain.pageObjects.rozetka.BasePage();
    }

    public static domain.pageObjects.imtech.BasePage navigateToImtechBasePage(){
        Driver.load(imtechUrl);

        return new domain.pageObjects.imtech.BasePage();
    }
}
