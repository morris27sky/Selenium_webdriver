package tests.Hompepage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

//import tests.Melt.verification.New.Configuration;

public class mega_menu_test {
 
  public static void main(String[] args) throws InterruptedException, IOException {

  FirefoxProfile ffProfile = new FirefoxProfile();
  ffProfile.setPreference("network.http.phishy-userpass-length", 255);
  WebDriver driver = new FirefoxDriver(ffProfile);
  driver.get("http://homepage.lbr.preprod.thundercontrol.com");
 
      for(int x=1; x<10; x++) {
         
      
          String xpath;
          if(x==9){
              xpath="//li[@class='nav-item nav-last-item']/div";
          }else{
              xpath="//li[@class='nav-item']["+x+"]/div";
          }
          WebElement mega_links=driver.findElement(By.xpath(xpath));
          List<WebElement> leftLinks = mega_links.findElements(By.tagName("a"));
          ArrayList<String> list_link = new ArrayList<String>();
          for(int i=0 ; i<leftLinks.size(); i++){
              list_link.add(leftLinks.get(i).getAttribute("href"));
          }
         
          for(int i =0;i<list_link.size();i++)
          {       
              System.out.println(list_link.get(i));
              driver.get(list_link.get(i));
              System.out.println(driver.getTitle());
              ///Your screen shot path should go here
              driver.navigate().back();
              Thread.sleep(1500L);
         
         
      }
         
  }
      driver.quit();
}
 
}