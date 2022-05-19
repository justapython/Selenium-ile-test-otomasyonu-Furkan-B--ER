package page;

import methods.Methods;
import org.junit.Assert;
import org.openqa.selenium.By;

public class FavoritePage {

    Methods methods;


    public FavoritePage(){methods = new Methods();}

        public void favoriteProductCheck(){

            methods.click(By.xpath("//*[@id=\"swal2-title\"]/a"));
            methods.waitBySeconds(2);
            Assert.assertTrue("urun eklenemedi",methods.isElementVisible(By.id("product-495679")));
            Assert.assertTrue("urun eklenemedi",methods.isElementVisible(By.id("product-542991")));
            Assert.assertTrue("urun eklenemedi",methods.isElementVisible(By.id("product-495680")));
            Assert.assertTrue("urun eklenemedi",methods.isElementVisible(By.id("product-495684")));
            methods.waitBySeconds(2);
            methods.click(By.cssSelector(".logo-icon"));
            methods.waitBySeconds(3);
            methods.click(By.cssSelector(".lvl1catalog"));
            methods.waitBySeconds(2);
            methods.click(By.xpath("//*[@id=\"landing-point\"]/div[4]/a[2]/img"));
            methods.waitBySeconds(2);
            methods.click(By.xpath("//*[@id=\"content\"]/div/div/div[1]/div/div[1]/select/option[6]"));
            methods.waitBySeconds(2);
            methods.click(By.xpath("/html/body/div[1]/div[4]/div[1]/ul/li[1]/div[2]/ul/li[3]"));
            methods.waitBySeconds(3);
            methods.click(By.xpath("/html/body/div[1]/div[4]/div[1]/ul/li[1]/div[2]/ul/li[3]/div/div[1]/div/ul[2]/li[14]/a"));
            methods.waitBySeconds(3);



        }



}
