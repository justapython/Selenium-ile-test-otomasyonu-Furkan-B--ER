package page;

import methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;

public class LoginPage {

    Methods methods;
    public LoginPage(){
        methods = new Methods();

    }

    public void login(){

        methods.click(By.xpath("//div[@class='menu-top-button login']")); //uniq olmayanlar xpath ile alınır
        methods.waitBySeconds(2);
        methods.sendKeys(By.id("login-email"),"furkanbicer803@gmail.com");
        methods.waitBySeconds(2);
        methods.sendKeys(By.xpath("//input[@id='login-password']"),"asd.zxc.456");   //alınan locator birden fazlaysa ilkini alır her zaman
        methods.waitBySeconds(2);
        // classta uniq hale getirmek için boşlukları silip nokta koyuyoruz + basına da koyuyoruz
        methods.click(By.cssSelector(".ky-btn.ky-btn-orange.w-100.ky-login-btn"));
        methods.waitBySeconds(15);
    }



}
