package test;

import driver.BaseTest;
import org.junit.Test;
import page.LoginPage;
import page.ProductPage;

public class ProductTest extends BaseTest {

    @Test
    public void productTest(){
        ProductPage productPage = new ProductPage();
        productPage.scrollAndSelect();
    }

    @Test
    public void getAttributeTest(){
        ProductPage productPage = new ProductPage();
        productPage.attributeTest();
    }

    @Test
    public void getTextTest(){
        LoginPage loginPage = new LoginPage();
        ProductPage productPage = new ProductPage();

        loginPage.login();
        productPage.textControlTest();
    }

    @Test
    public void valueTest(){
        ProductPage productPage = new ProductPage();
        productPage.valueControlTest();
    }


}
