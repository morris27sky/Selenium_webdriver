package tests.Mobile.Melt;

import org.openqa.selenium.By;
import org.openqa.selenium.iphone.*;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.android.AndroidDriver;
import java.lang.Thread;
import org.junit.Assert;
import org.junit.Test;
//import junit.framework.TestCase;

import tests.Melt.verification.New.Configuration;

public class Header {

   public static void main(String[] args) throws Exception {

       FirefoxProfile ffProfile = new FirefoxProfile();
       ffProfile.setPreference("network.http.phishy-userpass-length", 255);
       WebDriver driver = new FirefoxDriver(ffProfile);
       driver.get(Configuration.baseurl);
       Thread.sleep(3000);

       WebElement ExpandMobileTree = driver.findElement(By.xpath(Configuration.ExpandMobile));
       ExpandMobileTree.click();
       Thread.sleep(3000);
       
       WebElement ExpandSegmentTree = driver.findElement(By.xpath(Configuration.ExpandSegment));
       ExpandSegmentTree.click();
       Thread.sleep(6000);
       
       WebElement Segment1 = driver.findElement(By.xpath(Configuration.MobileSegment));
       Segment1.click();
       Thread.sleep(6000);
       
       WebElement Header = driver.findElement(By.xpath(Configuration.Header));
       Header.click();
       Thread.sleep(6000);
       
       WebElement Favourites = driver.findElement(By.xpath(Configuration.Favourites));
       Favourites.click();
       Thread.sleep(6000);
       
       WebElement ContentTypeHint_1 = driver.findElement(By.xpath(Configuration.ContentTypeHint)); 

       Select selectBoxControlledSearch = new Select(ContentTypeHint_1);

       selectBoxControlledSearch.selectByValue(Configuration.Favourites_hint);
       Thread.sleep(6000);
       
       WebElement saveHeader = driver.findElement(By.xpath(Configuration.Save));
       saveHeader.click();
       Thread.sleep(3000);
       //////
       WebElement insert = driver.findElement(By.xpath(Configuration.InsertPackage));
       insert.click();
       Thread.sleep(8000);
       
       WebElement CreateNewPackage = driver.findElement(By.xpath(Configuration.CreateNewPackage));
       CreateNewPackage.click();
       Thread.sleep(6000);
       
       WebElement EditPackage = driver.findElement(By.xpath(Configuration.NewPackage));
       EditPackage.click();
       Thread.sleep(6000);
       
       WebElement renamePane = driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[2]/input"));
       renamePane.clear();
       renamePane.sendKeys("Best of the web container");
       Thread.sleep(100);
       
       WebElement renamePaneTitle = driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[3]/input"));
       renamePaneTitle.sendKeys("Best of the web container");
       Thread.sleep(100);
       
       WebElement save = driver.findElement(By.xpath(Configuration.Save));
       save.click();
       Thread.sleep(1000);
       
       WebElement Link1 = driver.findElement(By.id(Configuration.InsertMedia)); 

       Select selectList1 = new Select(Link1);
       //select link
       selectList1.selectByValue(Configuration.Link);
       
       WebElement AddLink = driver.findElement(By.xpath(Configuration.Add));
       AddLink.click();
       Thread.sleep(6000);

       WebElement urlText4 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input"));
       urlText4.sendKeys("http://www.google.co.uk");
       WebElement LinkText4 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input"));
       LinkText4.sendKeys("Google");
       
       WebElement AddLink3 = driver.findElement(By.xpath(Configuration.Add));
       AddLink3.click();
       Thread.sleep(3000);
       WebElement urlText3 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input"));
       urlText3.sendKeys("http://www.m.facebook.com");
       WebElement LinkText3 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input"));
       LinkText3.sendKeys("Facebook");
       
       WebElement AddLink2 = driver.findElement(By.xpath(Configuration.Add));
       AddLink2.click();
       Thread.sleep(3000);
       WebElement urlText2 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input"));
       urlText2.sendKeys("http://www.google.co.uk");
       WebElement LinkText2 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input"));
       LinkText2.sendKeys("My space");
       
       WebElement AddLink1 = driver.findElement(By.xpath(Configuration.Add));
       AddLink1.click();
       Thread.sleep(3000);
       WebElement urlText1 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input"));
       urlText1.sendKeys("http://www.bbc.co.uk");
       WebElement LinkText1 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input"));
       LinkText1.sendKeys("bbc");
       
       WebElement savelink1Slot4 = driver.findElement(By.xpath(Configuration.Save));
       savelink1Slot4.click();
       Thread.sleep(3000);
       
       WebElement FavouriteslastVisited = driver.findElement(By.xpath(Configuration.HL_Favourites_LV));
       FavouriteslastVisited.click();
       Thread.sleep(3000);

       WebElement Link = driver.findElement(By.id(Configuration.InsertMedia)); 

       Select selectList = new Select(Link);
       //select link
       selectList.selectByValue(Configuration.Link);
       
       WebElement AddNewLink = driver.findElement(By.xpath(Configuration.Add));
       AddNewLink.click();
       Thread.sleep(6000);

       WebElement urlText = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input"));
       urlText.sendKeys("http://orangeworld.co.uk/p/youraccount/home?sid=1a834a742e44");
       WebElement YourSubscriptionLink = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input"));
       YourSubscriptionLink.sendKeys("Your Subscription");
       
       WebElement saveLink = driver.findElement(By.xpath(Configuration.Save));
       saveLink.click();         
       
       
}

}