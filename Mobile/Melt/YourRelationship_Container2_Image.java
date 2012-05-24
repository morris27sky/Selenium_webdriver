package tests.Mobile.Melt;

import org.openqa.selenium.By;
import org.openqa.selenium.iphone.*;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.JavascriptExecutor;
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

public class YourRelationship_Container2_Image {

   public static void main(String[] args) throws Exception {

       FirefoxProfile ffProfile = new FirefoxProfile();
       ffProfile.setPreference("network.http.phishy-userpass-length", 255);
       WebDriver driver = new FirefoxDriver(ffProfile);
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
       
       WebElement YourRelationshipPackage = driver.findElement(By.xpath(Configuration.YourRelationship));
       YourRelationshipPackage.click();
       Thread.sleep(7000);
   
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
       renamePane6.sendKeys("container 2");
       Thread.sleep(5000);
       
       WebElement renamePaneTitle6 = driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[3]/input"));
       renamePaneTitle6.sendKeys("container 2");
       Thread.sleep(5000);
       
       WebElement save = driver.findElement(By.xpath(Configuration.Save));
       save.click();
       Thread.sleep(5000);

       WebElement Link = driver.findElement(By.id(Configuration.InsertMedia)); 

       Select selectList_1 = new Select(Link);
       //select link
       selectList_1.selectByValue(Configuration.LinkWithImage);

       WebElement AddLink_1 = driver.findElement(By.xpath(Configuration.Add));
       AddLink_1.click();
       Thread.sleep(6000);
       
       WebElement urlText4 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input"));
       urlText4.sendKeys("http://www.google.co.uk");
       
       WebElement textarea1 = driver.findElement(By.xpath("(//*[@class='mceEditor defaultSkin'])[1]//iframe"));
       String id = textarea1.getAttribute("id");
       final WebDriver frame = driver.switchTo().frame(id);  
       final WebElement editorBody = frame.findElement(By.xpath("//*"));  
       editorBody.sendKeys("Image 1");  
       driver.switchTo().defaultContent();
       
       WebElement browse = driver.findElement(By.xpath("//input[@value='Browse...']"));
       browse.click();
       Thread.sleep(6000);
       
       WebElement searchInpute = driver.findElement(By.xpath("//*[@id='searchInput']"));       
       searchInpute.sendKeys("twitter");
       Thread.sleep(8000);

       WebElement checkbox = driver.findElement(By.xpath(Configuration.CheckBox));
       checkbox.click();
       Thread.sleep(5000);
       
       WebElement OK = driver.findElement(By.xpath(Configuration.OK));
       OK.click();
       Thread.sleep(5000);
       
       WebElement saveItem1 = driver.findElement(By.xpath(Configuration.Save));
       saveItem1.click();
       Thread.sleep(5000);
   
       
       WebElement Link1 = driver.findElement(By.id(Configuration.InsertMedia)); 

       Select selectList_2 = new Select(Link1);
       //select link
       selectList_2.selectByValue(Configuration.LinkWithImage);

       WebElement AddLink_2 = driver.findElement(By.xpath(Configuration.Add));
       AddLink_2.click();
       Thread.sleep(6000);
       
       WebElement urlText1 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input"));
       urlText1.sendKeys("http://www.google.co.uk");
       
       WebElement textarea2 = driver.findElement(By.xpath("(//*[@class='mceEditor defaultSkin'])[1]//iframe"));
       String id2 = textarea2.getAttribute("id");
       final WebDriver frame1 = driver.switchTo().frame(id2);  
       final WebElement editorBody1 = frame1.findElement(By.xpath("//*"));  
       editorBody1.sendKeys("Image 2");  
       driver.switchTo().defaultContent();
       
       WebElement browse1 = driver.findElement(By.xpath("//input[@value='Browse...']"));
       browse1.click();
       Thread.sleep(6000);
       
       WebElement searchInpute1 = driver.findElement(By.xpath("//*[@id='searchInput']"));       
       searchInpute1.sendKeys("twitter");
       Thread.sleep(8000);

       WebElement checkbox1 = driver.findElement(By.xpath(Configuration.CheckBox));
       checkbox1.click();
       Thread.sleep(5000);
       
       WebElement OK1 = driver.findElement(By.xpath(Configuration.OK));
       OK1.click();
       Thread.sleep(5000);
       
       WebElement saveItem2 = driver.findElement(By.xpath(Configuration.Save));
       saveItem2.click();
       Thread.sleep(5000);
   }

}