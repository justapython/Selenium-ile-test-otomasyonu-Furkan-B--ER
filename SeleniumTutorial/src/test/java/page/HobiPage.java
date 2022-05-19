package page;

import methods.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

public class HobiPage extends Methods {

    Methods methods;

    WebDriver driver;



    public HobiPage(){methods = new Methods();}

    public void randomSelector(){

        methods.click(By.id("product-584966"));
        methods.waitBySeconds(3);
        methods.click(By.cssSelector(".add-to-cart.btn-orange.btn-ripple"));
        methods.waitBySeconds(3);


    }

    public void deleteFavorites(){

        methods.click(By.cssSelector(".menu.top.my-list"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("//*[@id=\"header-top\"]/div/div[2]/ul/li[1]/div/ul/li/div/ul/li[1]/a"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("//*[@id=\"product-542991\"]/div[2]/div[2]/a[2]"));
        methods.waitBySeconds(2);
        methods.click(By.id("cart-items"));
        methods.waitBySeconds(1);
        methods.click(By.id("js-cart"));
        methods.waitBySeconds(1);
        //driver.findElement(By.xpath("//input[@value='1']")).clear();
        //driver.findElement(By.xpath("//input[@value='1']")).sendKeys("3");
        //methods.waitBySeconds(3);
        methods.click(By.cssSelector(".button.red"));
        methods.waitBySeconds(3);

    }

    public void addAdress(){
        methods.sendKeys(By.id("address-firstname-companyname"),"zamanım yetmedi");
        methods.waitBySeconds(2);
        methods.sendKeys(By.id("address-lastname-title"),":(((((((((");
        waitBySeconds(4);

    }

    public void logoutAccount(){
        methods.click(By.cssSelector(".checkout-logo"));
        methods.waitBySeconds(3);
        methods.click(By.cssSelector(".menu.top.login"));
        methods.waitBySeconds(2);
    }


}
