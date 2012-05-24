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

public class MoreFromOrange {

   public static void main(String[] args) throws Exception {

       FirefoxProfile ffProfile = new FirefoxProfile();
       ffProfile.setPreference("network.http.phishy-userpass-length", 255);
       WebDriver driver = new FirefoxDriver(ffProfile);
       driver.get((Configuration.baseurl_roaming));

       Thread.sleep(5000);

       WebElement ExpandMobileTree = driver.findElement(By.xpath("//div[@id='container']/div[2]/ul/li[3]/p/a"));
       ExpandMobileTree.click();
       Thread.sleep(5000);
       
       WebElement ExpandSegmentTree = driver.findElement(By.xpath(Configuration.ExpandSegment));
       ExpandSegmentTree.click();
       Thread.sleep(5000);
       
       WebElement Segment1 = driver.findElement(By.xpath(Configuration.MobileSegment));
       Segment1.click();
       Thread.sleep(5000);
       
       WebElement MoreFromOrange = driver.findElement(By.xpath(Configuration.MoreFromOrange));
       MoreFromOrange.click();
       Thread.sleep(5000);
   
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
       renamePane6.sendKeys("More from orange package 1");
       Thread.sleep(1000);
       
       WebElement renamePaneTitle6 = driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[3]/input"));
       renamePaneTitle6.sendKeys("More from orange package 1");
       Thread.sleep(1                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 , 000);
       
       WebElement save = driver.findElement(By.xpath(Configuration.Save));
       save.click();
       Thread.sleep(7000);
       
       WebElement Link1 = driver.findElement(By.id(Configuration.InsertMedia)); 

       Select selectList1 = new Select(Link1);
       //select link
       selectList1.selectByValue(Configuration.LinkWithImage);
       
       WebElement AddLink = driver.findElement(By.xpath(Configuration.Add));
       AddLink.click();
       Thread.sleep(6000);

       WebElement urlText1 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input"));
       urlText1.sendKeys("http://www.google.co.uk");
       
       WebElement Title = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[5]/input"));
       Title.sendKeys("Orange Cash");
       Thread.sleep(6000);

       WebElement textarea1 = driver.findElement(By.xpath("(//*[@class='mceEditor defaultSkin'])[1]//iframe"));
       String id = textarea1.getAttribute("id");
       final WebDriver frame = driver.switchTo().frame(id);  
       final WebElement editorBody = frame.findElement(By.xpath("//*"));  
       editorBody.sendKeys("Load, shop, get rewarded. Card that rewards for");  
       driver.switchTo().defaultContent();
       
       WebElement browse = driver.findElement(By.xpath("//input[@value='Browse...']"));
       browse.click();
       Thread.sleep(6000);
       
       WebElement searchInpute = driver.findElement(By.xpath("//*[@id='searchInput']"));       
       searchInpute.sendKeys("twitter");
       Thread.sleep(8000);

       WebElement checkbox = driver.findElement(By.xpath(Configuration.CheckBox));
       checkbox.click();
       Thread.sleep(7000);
       
       WebElement OK = driver.findElement(By.xpath(Configuration.OK));
       OK.click();
       Thread.sleep(7000);
       
       WebElement saveItem1 = driver.findElement(By.xpath(Configuration.Save));
       saveItem1.click();
       Thread.sleep(7000);
       
       /////////////////////////////////////////////////LINK2//////////////////////////////////////////////////////
       
       
       WebElement Link2 = driver.findElement(By.id(Configuration.InsertMedia)); 

       Select selectList2 = new Select(Link2);
       //select link
       selectList2.selectByValue(Configuration.LinkWithImage);
       
       WebElement AddLink2 = driver.findElement(By.xpath(Configuration.Add));
       AddLink2.click();
       Thread.sleep(6000);

       WebElement urlText2 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input"));
       urlText2.sendKeys("http://www.google.co.uk");
       
       WebElement Title2 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[5]/input"));
       Title2.sendKeys("Jump for joy");
       Thread.sleep(6000);

       WebElement textarea2 = driver.findElement(By.xpath("(//*[@class='mceEditor defaultSkin'])[1]//iframe"));
       String id2 = textarea2.getAttribute("id");
       final WebDriver frame2 = driver.switchTo().frame(id2);  
       final WebElement editorBody2 = frame2.findElement(By.xpath("//*"));  
       editorBody2.sendKeys("no cards, no cash. just tap your phone and you've paid.");  
       driver.switchTo().defaultContent();
       
       WebElement browse2 = driver.findElement(By.xpath("//input[@value='Browse...']"));
       browse2.click();
       Thread.sleep(6000);
       
       WebElement searchInpute2 = driver.findElement(By.xpath("//*[@id='searchInput']"));       
       searchInpute2.sendKeys("twitter");
       Thread.sleep(8000);

       WebElement checkbox2 = driver.findElement(By.xpath(Configuration.CheckBox));
       checkbox2.click();
       Thread.sleep(7000);
       
       WebElement OK2 = driver.findElement(By.xpath(Configuration.OK));
       OK2.click();
       Thread.sleep(7000);
       
       WebElement saveItem2 = driver.findElement(By.xpath(Configuration.Save));
       saveItem2.click();
       Thread.sleep(7000);
       
       /////////////////////////////////////////////////LINK3//////////////////////////////////////////////////////
       
       
       WebElement Link3 = driver.findElement(By.id(Configuration.InsertMedia)); 

       Select selectList3 = new Select(Link3);
       //select link
       selectList3.selectByValue(Configuration.LinkWithImage);
       
       WebElement AddLink3 = driver.findElement(By.xpath(Configuration.Add));
       AddLink3.click();
       Thread.sleep(6000);

       WebElement urlText3 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input"));
       urlText3.sendKeys("http://www.google.co.uk");
       
       WebElement Title3 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[5]/input"));
       Title3.sendKeys("Jump for joy");
       Thread.sleep(6000);

       WebElement textarea3 = driver.findElement(By.xpath("(//*[@class='mceEditor defaultSkin'])[1]//iframe"));
       String id3 = textarea3.getAttribute("id");
       final WebDriver frame3 = driver.switchTo().frame(id3);  
       final WebElement editorBody3 = frame3.findElement(By.xpath("//*"));  
       editorBody3.sendKeys("no cards, no cash. just tap your phone and you've paid.");  
       driver.switchTo().defaultContent();
       
       WebElement browse3 = driver.findElement(By.xpath("//input[@value='Browse...']"));
       browse3.click();
       Thread.sleep(6000);
       
       WebElement searchInpute3 = driver.findElement(By.xpath("//*[@id='searchInput']"));       
       searchInpute3.sendKeys("twitter");
       Thread.sleep(8000);

       WebElement checkbox3 = driver.findElement(By.xpath(Configuration.CheckBox));
       checkbox3.click();
       Thread.sleep(7000);
       
       WebElement OK3 = driver.findElement(By.xpath(Configuration.OK));
       OK3.click();
       Thread.sleep(7000);
       
       WebElement saveItem3 = driver.findElement(By.xpath(Configuration.Save));
       saveItem3.click();
       Thread.sleep(7000);
       
       /////////////////////////////////////////////////LINK4//////////////////////////////////////////////////////
       
       
       WebElement Link4 = driver.findElement(By.id(Configuration.InsertMedia)); 

       Select selectList4 = new Select(Link4);
       //select link
       selectList4.selectByValue(Configuration.LinkWithImage);
       
       WebElement AddLink4 = driver.findElement(By.xpath(Configuration.Add));
       AddLink4.click();
       Thread.sleep(6000);

       WebElement urlText4 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input"));
       urlText4.sendKeys("http://www.google.co.uk");
       
       WebElement Title4 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[5]/input"));
       Title4.sendKeys("Jump for joy");
       Thread.sleep(6000);

       WebElement textarea4 = driver.findElement(By.xpath("(//*[@class='mceEditor defaultSkin'])[1]//iframe"));
       String id4 = textarea4.getAttribute("id");
       final WebDriver frame4 = driver.switchTo().frame(id4);  
       final WebElement editorBody4 = frame4.findElement(By.xpath("//*"));  
       editorBody4.sendKeys("no cards, no cash. just tap your phone and you've paid.");  
       driver.switchTo().defaultContent();
       
       WebElement browse4 = driver.findElement(By.xpath("//input[@value='Browse...']"));
       browse4.click();
       Thread.sleep(6000);
       
       WebElement searchInpute4 = driver.findElement(By.xpath("//*[@id='searchInput']"));       
       searchInpute4.sendKeys("twitter");
       Thread.sleep(8000);

       WebElement checkbox4 = driver.findElement(By.xpath(Configuration.CheckBox));
       checkbox4.click();
       Thread.sleep(7000);
       
       WebElement OK4 = driver.findElement(By.xpath(Configuration.OK));
       OK4.click();
       Thread.sleep(7000);
       
       WebElement saveItem4 = driver.findElement(By.xpath(Configuration.Save));
       saveItem4.click();
       Thread.sleep(7000);
       
       /////////////////////////////////////////////////LINK5//////////////////////////////////////////////////////
       
       
       WebElement Link5 = driver.findElement(By.id(Configuration.InsertMedia)); 

       Select selectList5 = new Select(Link5);
       //select link
       selectList5.selectByValue(Configuration.LinkWithImage);
       
       WebElement AddLink5 = driver.findElement(By.xpath(Configuration.Add));
       AddLink5.click();
       Thread.sleep(6000);

       WebElement urlText5 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input"));
       urlText5.sendKeys("http://www.google.co.uk");
       
       WebElement Title5 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[5]/input"));
       Title5.sendKeys("Jump for joy");
       Thread.sleep(6000);

       WebElement textarea5 = driver.findElement(By.xpath("(//*[@class='mceEditor defaultSkin'])[1]//iframe"));
       String id5 = textarea5.getAttribute("id");
       final WebDriver frame5 = driver.switchTo().frame(id5);  
       final WebElement editorBody5 = frame5.findElement(By.xpath("//*"));  
       editorBody5.sendKeys("no cards, no cash. just tap your phone and you've paid.");  
       driver.switchTo().defaultContent();
       
       WebElement browse5 = driver.findElement(By.xpath("//input[@value='Browse...']"));
       browse5.click();
       Thread.sleep(6000);
       
       WebElement searchInpute5 = driver.findElement(By.xpath("//*[@id='searchInput']"));       
       searchInpute5.sendKeys("twitter");
       Thread.sleep(8000);

       WebElement checkbox5 = driver.findElement(By.xpath(Configuration.CheckBox));
       checkbox5.click();
       Thread.sleep(7000);
       
       WebElement OK5 = driver.findElement(By.xpath(Configuration.OK));
       OK5.click();
       Thread.sleep(7000);
       
       WebElement saveItem5 = driver.findElement(By.xpath(Configuration.Save));
       saveItem5.click();
       Thread.sleep(7000);
       
       /////////////////////////////////////////////////LINK6//////////////////////////////////////////////////////
       
       
       WebElement Link6 = driver.findElement(By.id(Configuration.InsertMedia)); 

       Select selectList6 = new Select(Link6);
       //select link
       selectList6.selectByValue(Configuration.LinkWithImage);
       
       WebElement AddLink6 = driver.findElement(By.xpath(Configuration.Add));
       AddLink6.click();
       Thread.sleep(6000);

       WebElement urlText6 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input"));
       urlText6.sendKeys("http://www.google.co.uk");
       
       WebElement Title6 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[5]/input"));
       Title6.sendKeys("Jump for joy");
       Thread.sleep(6000);

       WebElement textarea6 = driver.findElement(By.xpath("(//*[@class='mceEditor defaultSkin'])[1]//iframe"));
       String id6 = textarea6.getAttribute("id");
       final WebDriver frame6 = driver.switchTo().frame(id6);  
       final WebElement editorBody6 = frame6.findElement(By.xpath("//*"));  
       editorBody6.sendKeys("no cards, no cash. just tap your phone and you've paid.");  
       driver.switchTo().defaultContent();
       
       WebElement browse6 = driver.findElement(By.xpath("//input[@value='Browse...']"));
       browse6.click();
       Thread.sleep(6000);
       
       WebElement searchInpute6 = driver.findElement(By.xpath("//*[@id='searchInput']"));       
       searchInpute6.sendKeys("twitter");
       Thread.sleep(8000);

       WebElement checkbox6 = driver.findElement(By.xpath(Configuration.CheckBox));
       checkbox6.click();
       Thread.sleep(7000);
       
       WebElement OK6 = driver.findElement(By.xpath(Configuration.OK));
       OK6.click();
       Thread.sleep(7000);
       
       WebElement saveItem6 = driver.findElement(By.xpath(Configuration.Save));
       saveItem6.click();
       Thread.sleep(7000);
}

}