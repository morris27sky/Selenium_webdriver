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

public class ContentExplorer_Feeds {

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
       Thread.sleep(3000);
       
       WebElement Segment1 = driver.findElement(By.xpath(Configuration.MobileSegment));
       Segment1.click();
       Thread.sleep(3000);
       
       WebElement ContentExplorer = driver.findElement(By.xpath(Configuration.ContentExplorer));
       ContentExplorer.click();
       Thread.sleep(3000);
   
       WebElement insert = driver.findElement(By.xpath(Configuration.InsertPackage));
       insert.click();
       Thread.sleep(8000);
       
       WebElement CreateNewPackage = driver.findElement(By.xpath(Configuration.CreateNewPackage));
       CreateNewPackage.click();
       Thread.sleep(6000);
       
       WebElement EditPackage = driver.findElement(By.xpath(Configuration.NewPackage));
       EditPackage.click();
       Thread.sleep(6000);
       
       WebElement renamePane6 = driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[2]/input"));
       renamePane6.clear();
       renamePane6.sendKeys("Content explorer package 1");
       Thread.sleep(100);
       
       WebElement renamePaneTitle6 = driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[3]/input"));
       renamePaneTitle6.sendKeys("Content explorer package 1");
       Thread.sleep(100);
       
       WebElement save = driver.findElement(By.xpath(Configuration.Save));
       save.click();
       Thread.sleep(1000);
       
       WebElement Link1 = driver.findElement(By.id(Configuration.InsertMedia)); 

       Select selectList1 = new Select(Link1);
       //select link
       selectList1.selectByValue(Configuration.FeedVideoMostRecent);
       Thread.sleep(6000);

       WebElement AddLink = driver.findElement(By.xpath(Configuration.Add));
       AddLink.click();
       Thread.sleep(6000);
       
       WebElement Link2 = driver.findElement(By.xpath(Configuration.InsertFeed)); 
       Select selectList2 = new Select(Link2);
       selectList2.selectByValue(Configuration.CelebrityRoundup);

       WebElement HowMany = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input"));
       HowMany.sendKeys("1");
       Thread.sleep(2000);
              
       WebElement Link = driver.findElement(By.id(Configuration.InsertMedia)); 

       Select selectList_1 = new Select(Link);
       //select link
       selectList_1.selectByValue(Configuration.Link);
       Thread.sleep(6000);

       WebElement AddLink_1 = driver.findElement(By.xpath(Configuration.Add));
       AddLink_1.click();
       Thread.sleep(6000);
       
       WebElement URL = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input"));
       URL.sendKeys("http://www.google.co.uk");
     
       WebElement Text = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input"));
       Text.sendKeys("Celebs");
       
       WebElement saveItem1 = driver.findElement(By.xpath(Configuration.Save));
       saveItem1.click();
       Thread.sleep(3000);
       
   }
}
       


