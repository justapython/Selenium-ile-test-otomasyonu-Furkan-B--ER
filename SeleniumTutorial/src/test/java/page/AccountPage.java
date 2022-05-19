package page;

import methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;

public class AccountPage {

    Methods methods;

    Logger logger = LogManager.getLogger(AccountPage.class);

    public AccountPage(){
        methods = new Methods();
    }

        public void AccountPageCheck(){
            methods.waitBySeconds(1);
            Assert.assertTrue("Login olunamadi", methods.isElementVisible(By.cssSelector(".menu-top-button.platinum-message")));
        }

}
