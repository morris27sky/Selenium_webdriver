package tests.Mobile.Melt;

import org.openqa.selenium.By;
//import org.openqa.selenium.iphone.*;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
//import org.openqa.selenium.android.AndroidDriver;
//import org.openqa.selenium.Cookie;
import java.lang.Thread;
//import org.junit.Assert;
//import org.junit.Test;
//import junit.framework.TestCase;
//import org.openqa.selenium.htmlunit.*;
import tests.Melt.verification.New.Configuration;
//import java.util.*;

public class Ads {

   public static void main(String[] args) throws Exception {
	   
       FirefoxProfile ffProfile = new FirefoxProfile();
       ffProfile.setPreference("network.http.phishy-userpass-length", 255);
       WebDriver driver = new FirefoxDriver(ffProfile);
       
       driver.manage().deleteAllCookies();
       
       driver.get((Configuration.baseurl_roaming));

       Thread.sleep(5000);

       WebElement ExpandMobileTree = driver.findElement(By.xpath(Configuration.ExpandMobile));
       ExpandMobileTree.click();
       Thread.sleep(5000);
       
       WebElement ExpandSegmentTree = driver.findElement(By.xpath(Configuration.ExpandSegment));
       ExpandSegmentTree.click();
       Thread.sleep(5000);
       
       WebElement Segment1 = driver.findElement(By.xpath(Configuration.MobileSegment));
       Segment1.click();
       Thread.sleep(5000);
       
       WebElement Ads = driver.findElement(By.xpath(Configuration.Ads));
       Ads.click();
       Thread.sleep(5000);
   
       WebElement insertTopAd = driver.findElement(By.xpath(Configuration.InsertPackage));
       insertTopAd.click();
       Thread.sleep(8000);
       
       WebElement CreateNewPackageTopAd = driver.findElement(By.xpath(Configuration.CreateNewPackage));
       CreateNewPackageTopAd.click();
       Thread.sleep(6000);
       
       WebElement EditPackageTopAd = driver.findElement(By.xpath(Configuration.NewPackage));
       EditPackageTopAd.click();
       Thread.sleep(6000);
       
       WebElement renameTopAd = driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[2]/input"));
       renameTopAd.clear();
       renameTopAd.sendKeys("Bottom Ad");
       Thread.sleep(1000);
       
       WebElement renameTopAdTitle = driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[3]/input"));
       renameTopAdTitle.sendKeys("Bottom Ad");
       Thread.sleep(1                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 , 000);
       
       WebElement saveTopAd = driver.findElement(By.xpath(Configuration.Save));
       saveTopAd.click();
       Thread.sleep(7000);
       
       WebElement AdsReturn = driver.findElement(By.xpath(Configuration.Ads));
       AdsReturn.click();
       Thread.sleep(5000);
       
       WebElement insertBottomAd = driver.findElement(By.xpath(Configuration.InsertPackage));
       insertBottomAd.click();
       Thread.sleep(8000);
       
       WebElement CreateNewPackageBottomAd = driver.findElement(By.xpath(Configuration.CreateNewPackage));
       CreateNewPackageBottomAd.click();
       Thread.sleep(6000);
       
       WebElement EditPackageBottomAd = driver.findElement(By.xpath(Configuration.NewPackage));
       EditPackageBottomAd.click();
       Thread.sleep(6000);
       
       WebElement renameBottomAd = driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[2]/input"));
       renameBottomAd.clear();
       renameBottomAd.sendKeys("Top Ad");
       Thread.sleep(1000);
       
       WebElement renameBottomAdTitle = driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[3]/input"));
       renameBottomAdTitle.sendKeys("Top Ad");
       Thread.sleep(1                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 , 000);
       
       WebElement saveBottomAd = driver.findElement(By.xpath(Configuration.Save));
       saveBottomAd.click();
       Thread.sleep(7000);
       
       WebElement Link1 = driver.findElement(By.id(Configuration.InsertMedia)); 

       Select selectAdvert = new Select(Link1);
       //select link
       selectAdvert.selectByValue(Configuration.Advert);
       
       WebElement AddLink = driver.findElement(By.xpath(Configuration.Add));
       AddLink.click();
       Thread.sleep(6000);

       WebElement Adinfuse = driver.findElement(By.xpath(Configuration.InsertAdvertiser)); 
       Select selectAdvertiser = new Select(Adinfuse);
       selectAdvertiser.selectByValue(Configuration.Adinfuse);
       Thread.sleep(5000);

       WebElement Tag = driver.findElement(By.xpath(Configuration.InsertTag)); 
       Select selectTagTop = new Select(Tag);
       selectTagTop.selectByValue(Configuration.HomeTouchScreenTop);
       
       WebElement saveTopAd1 = driver.findElement(By.xpath(Configuration.Save));
       saveTopAd1.click();
       Thread.sleep(7000);

       /////////////////////////////////////////////BOTTOM/////////////////////////////////////////////////////   
       
       
       WebElement AdClick = driver.findElement(By.xpath(Configuration.Ads));
       AdClick.click();
       Thread.sleep(5000);
       
       WebElement BottomAdClick = driver.findElement(By.xpath(Configuration.BottomAd));
       BottomAdClick.click();
       Thread.sleep(5000);
       
       WebElement Link2 = driver.findElement(By.id(Configuration.InsertMedia)); 

       Select selectAdvert2 = new Select(Link2);
       //select link
       selectAdvert2.selectByValue(Configuration.Advert);
       
       WebElement Add1 = driver.findElement(By.xpath(Configuration.Add));
       Add1.click();
       Thread.sleep(6000);

       WebElement AdinfuseAdrouter = driver.findElement(By.xpath(Configuration.InsertAdvertiser)); 
       Select selectAdvertiser1 = new Select(AdinfuseAdrouter);
       selectAdvertiser1.selectByValue(Configuration.AdinfuseAdrouter);
       Thread.sleep(5000);
       
       WebElement Tag2 = driver.findElement(By.xpath(Configuration.InsertTag)); 
       Select selectTagBottom = new Select(Tag2);
       selectTagBottom.selectByValue(Configuration.CelebritiesBottom);
       
       WebElement saveBottomAd1 = driver.findElement(By.xpath(Configuration.Save));
       saveBottomAd1.click();
       Thread.sleep(7000);
       
}

}