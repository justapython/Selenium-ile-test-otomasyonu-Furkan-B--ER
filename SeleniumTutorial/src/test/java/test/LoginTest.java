package test;

import driver.BaseTest;
import org.junit.Test;
import page.*;

public class LoginTest extends BaseTest {

    @Test
    public void loginTest(){
        LoginPage loginPage = new LoginPage();
        AccountPage accountPage = new AccountPage();
        ProductPage productPage = new ProductPage();
        FavoritePage favoritePage = new FavoritePage();
        HobiPage hobiPage = new HobiPage();




        loginPage.login();
        accountPage.AccountPageCheck();
        productPage.scrollAndSelect();
        favoritePage.favoriteProductCheck();
        hobiPage.randomSelector();
        hobiPage.deleteFavorites();
        hobiPage.addAdress();
        hobiPage.logoutAccount();
    }






}
