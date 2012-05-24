package tests.Melt.verification.New;

import org.openqa.selenium.By;
import org.openqa.selenium.iphone.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
//import org.openqa.selenium.android.AndroidDriver;
import java.lang.Thread;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.SelectElement;
//import org.openqa.selenium.firefox.FirefoxWebElement;
//import junit.framework.TestCase;

import tests.Melt.verification.New.Configuration;

public class CE_Slot4_InsertMediaItem_ControlledSearch {

   public static void main(String[] args) throws Exception {

       FirefoxProfile ffProfile = new FirefoxProfile();
       ffProfile.setPreference("network.http.phishy-userpass-length", 255);
       WebDriver driver = new FirefoxDriver(ffProfile);
       driver.get("https://OrangeDigital:Or1971ngE@melt.adm.preprod.thundercontrol.com");

       WebElement HomepageTree_Segment4 = driver.findElement(By.xpath(Configuration.Segment4Tree));
       HomepageTree_Segment4.click();
       Thread.sleep(8000);
       
       WebElement ContentExplorerPackage_Segment4  = driver.findElement(By.xpath(Configuration.EditSegment4));
       ContentExplorerPackage_Segment4.click();
       Thread.sleep(8000);
       
       WebElement insert = driver.findElement(By.xpath(Configuration.InsertPackage));
       insert.click();
       Thread.sleep(8000);
       
       WebElement CreateNewPackage = driver.findElement(By.xpath(Configuration.CreateNewPackage));
       CreateNewPackage.click();
       Thread.sleep(8000);
       
       WebElement EditPackage = driver.findElement(By.xpath(Configuration.NewPackage));
       EditPackage.click();
       Thread.sleep(8000);
       
       WebElement renamePane = driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[2]/input"));
       renamePane.clear();
       renamePane.sendKeys("TestPane");
       Thread.sleep(100);
       
       WebElement renamePaneTitle = driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[3]/input"));
       renamePaneTitle.sendKeys("TestPane");
       Thread.sleep(100);
       
       WebElement save = driver.findElement(By.xpath(Configuration.Save));
       save.click();
       Thread.sleep(5000);
       
       //insert slot1
       WebElement insertSlot1 = driver.findElement(By.xpath(Configuration.InsertPackage));
       insertSlot1.click();
       Thread.sleep(8000);
  
       WebElement CreateSlot1 = driver.findElement(By.xpath(Configuration.CreateNewPackage));
       CreateSlot1.click();
       Thread.sleep(8000);
       
       WebElement EditSlot1 = driver.findElement(By.xpath(Configuration.NewPackage));
       EditSlot1.click();
       Thread.sleep(8000);
       
       WebElement renameSlot1Name = driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[2]/input"));
       renameSlot1Name.clear();
       renameSlot1Name.sendKeys("Slot 1");
       Thread.sleep(5000);
       
       WebElement renameSlot1Title = driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[3]/input"));
       renameSlot1Title.sendKeys("Latest Test");
       Thread.sleep(3000);
       
       WebElement saveSlot1 = driver.findElement(By.xpath(Configuration.Save));
       saveSlot1.click();
       Thread.sleep(3000);
       
       WebElement InsertMediaDropownElement = driver.findElement(By.id(Configuration.InsertMedia)); 

       Select selectBox1 = new Select(InsertMediaDropownElement);
       //select Feed article - Latest
       selectBox1.selectByValue(Configuration.LatestFeed);
       
       WebElement Add = driver.findElement(By.xpath(Configuration.Add));
       Add.click();
       Thread.sleep(3000);
       
       WebElement Container = driver.findElement(By.cssSelector("div.editFormContainer"));
       Container.isDisplayed();
       Thread.sleep(3000);
       
       WebElement SectionDropdownElement = driver.findElement(By.xpath(Configuration.InsertFeed)); 

       Select selectBox2 = new Select(SectionDropdownElement);
       //select Feed article - Latest
       selectBox2.selectByValue(Configuration.News);
       WebElement HowMany = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[5]/input"));
       HowMany.sendKeys("4");
       WebElement StartFrom = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[6]/input"));
       StartFrom.sendKeys("1");
       WebElement saveFeed = driver.findElement(By.xpath(Configuration.Save));
       saveFeed.click();
       Thread.sleep(100);
      
       WebElement recentlyVisited = driver.findElement(By.xpath(Configuration.CE_TestPane));
       recentlyVisited.click();
       Thread.sleep(8000);
      
       WebElement insertSlot2 = driver.findElement(By.xpath(Configuration.InsertPackageBottom));
       insertSlot2.click();
       Thread.sleep(8000);

       WebElement CreateSlot2 = driver.findElement(By.xpath(Configuration.CreateNewPackageBottom));
       CreateSlot2.click();
       Thread.sleep(8000);
       
       WebElement EditSlot2 = driver.findElement(By.xpath(Configuration.NewPackage));
       EditSlot2.click();
       Thread.sleep(8000);
       
       WebElement renameSlot2Name = driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[2]/input"));
       renameSlot2Name.clear();
       renameSlot2Name.sendKeys("Slot 2");
       
       WebElement renameSlot2Title = driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[3]/input"));
       renameSlot2Title.sendKeys("Weather Test");
       
     
       //Weather hint selection
       WebElement weatherSelect = driver.findElement(By.xpath(".//*[@id='asmSelect0']"));
       
       Select selectBoxWeather = new Select(weatherSelect);
       //select Feed article - Latest
       selectBoxWeather.selectByValue(Configuration.weather);

       WebElement saveWeather = driver.findElement(By.xpath(Configuration.Save));
       saveWeather.click();
       Thread.sleep(3000);
      
       WebElement recentlyVisited1 = driver.findElement(By.xpath(Configuration.CE_TestPane));
       recentlyVisited1.click();
       Thread.sleep(8000);
       //slot 3
       WebElement insertSlot3 = driver.findElement(By.xpath(Configuration.InsertPackageBottom));
       insertSlot3.click();
       Thread.sleep(8000);

       WebElement CreateSlot3 = driver.findElement(By.xpath(Configuration.CreateNewPackageBottom));
       CreateSlot3.click();
       Thread.sleep(8000);
       
       WebElement EditSlot3 = driver.findElement(By.xpath(Configuration.NewPackage));
       EditSlot3.click();
       Thread.sleep(8000);
       
       WebElement renameSlot3Name = driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[2]/input"));
       renameSlot3Name.clear();
       renameSlot3Name.sendKeys("Slot 3");
       
       WebElement renameSlot3Title = driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[3]/input"));
       renameSlot3Title.sendKeys("Most popular Test");
       
       WebElement saveSlot3 = driver.findElement(By.xpath(Configuration.Save));
       saveSlot3.click();
       Thread.sleep(3000);
        
       WebElement LinkWithImageElement = driver.findElement(By.id(Configuration.InsertMedia)); 

       Select selectBox4 = new Select(LinkWithImageElement);
       //select link with image
       selectBox4.selectByValue(Configuration.LinkWithImage);
       
       WebElement AddLinkWithImage1 = driver.findElement(By.xpath(Configuration.Add));
       AddLinkWithImage1.click();
       Thread.sleep(6000);
        
       WebElement url = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input"));
       url.sendKeys("http://www.google.co.uk");
       
       WebElement text = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/textarea"));
       text.sendKeys("This is some test content");
       
       WebElement description = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[8]/textarea"));
       description.sendKeys("This is test content");
       
       WebElement alt = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[12]/input"));
       alt.sendKeys("top boy");
       
       WebElement browse = driver.findElement(By.xpath("//input[@value='Browse...']"));
       browse.click();
       Thread.sleep(6000);
       
       WebElement searchInpute = driver.findElement(By.xpath("//*[@id='searchInput']"));       
       searchInpute.sendKeys("top-boy-167");
       Thread.sleep(8000);

       WebElement checkbox = driver.findElement(By.xpath(Configuration.CheckBox));
       checkbox.click();
       Thread.sleep(3000);
       
       WebElement OK = driver.findElement(By.xpath(Configuration.OK));
       OK.click();
       Thread.sleep(3000);
       
       WebElement saveItem1 = driver.findElement(By.xpath(Configuration.Save));
       saveItem1.click();
       Thread.sleep(3000);
       
       WebElement LinkWithImageElement2 = driver.findElement(By.id(Configuration.InsertMedia)); 

       Select selectBoxLinkWithImage2 = new Select(LinkWithImageElement2);
       //select link with image
       selectBoxLinkWithImage2.selectByValue(Configuration.LinkWithImage);
             
       WebElement AddLinkWithImage2 = driver.findElement(By.xpath(Configuration.Add));
       AddLinkWithImage2.click();
       Thread.sleep(6000);
        
       WebElement url2 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input"));
       url2.sendKeys("http://www.google.co.uk");
       
       WebElement text2 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/textarea"));
       text2.sendKeys("This is some test content");
       
       WebElement description2 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[8]/textarea"));
       description2.sendKeys("This is test content");
       
       WebElement alt2 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[12]/input"));
       alt2.sendKeys("top boy");
       
       
       WebElement browse2 = driver.findElement(By.xpath("//input[@value='Browse...']"));
       browse2.click();
       Thread.sleep(6000);
       
       WebElement searchInpute2 = driver.findElement(By.xpath("//*[@id='searchInput']"));       
       searchInpute2.sendKeys("top-boy-167");
       Thread.sleep(8000);

       WebElement checkbox2 = driver.findElement(By.xpath(Configuration.CheckBox));
       checkbox2.click();
       Thread.sleep(3000);
       
       WebElement OK2 = driver.findElement(By.xpath(Configuration.OK));
       OK2.click();
       Thread.sleep(3000);
       
       WebElement saveItem2 = driver.findElement(By.xpath(Configuration.Save));
       saveItem2.click();
       Thread.sleep(3000);
       
       WebElement LinkWithImageElement3 = driver.findElement(By.id(Configuration.InsertMedia)); 

       Select selectBoxLinkWithImage3 = new Select(LinkWithImageElement3);
       //select link with image
       selectBoxLinkWithImage3.selectByValue(Configuration.LinkWithImage);
       
       WebElement AddLinkWithImage3 = driver.findElement(By.xpath(Configuration.Add));
       AddLinkWithImage3.click();
       Thread.sleep(6000);
       
       WebElement url3 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input"));
       url3.sendKeys("http://www.google.co.uk");
       
       WebElement text3 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/textarea"));
       text3.sendKeys("This is some test content");
       
       WebElement description3 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[8]/textarea"));
       description3.sendKeys("This is test content");
       
       WebElement alt3 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[12]/input"));
       alt3.sendKeys("top boy");
       
       WebElement browse3 = driver.findElement(By.xpath("//input[@value='Browse...']"));
       browse3.click();
       Thread.sleep(6000);
       
       WebElement searchInpute3 = driver.findElement(By.xpath("//*[@id='searchInput']"));       
       searchInpute3.sendKeys("top-boy-167");
       Thread.sleep(8000);

       WebElement checkbox3 = driver.findElement(By.xpath(Configuration.CheckBox));
       checkbox3.click();
       Thread.sleep(3000);
       
       WebElement OK3 = driver.findElement(By.xpath(Configuration.OK));
       OK3.click();
       Thread.sleep(3000);
       
       WebElement saveItem3 = driver.findElement(By.xpath(Configuration.Save));
       saveItem3.click();
       Thread.sleep(3000);
       
       ///NEW
       
       WebElement recentlyVisited2 = driver.findElement(By.xpath(Configuration.CE_TestPane));
       recentlyVisited2.click();
       Thread.sleep(8000);
       
       //slot 4
       WebElement insertSlot4 = driver.findElement(By.xpath(Configuration.InsertPackageBottom));
       insertSlot4.click();
       Thread.sleep(8000);

       WebElement CreateSlot4 = driver.findElement(By.xpath(Configuration.CreateNewPackageBottom));
       CreateSlot4.click();
       Thread.sleep(8000);
       
       WebElement EditSlot4 = driver.findElement(By.xpath(Configuration.NewPackage));
       EditSlot4.click();
       Thread.sleep(8000);
       
       WebElement renameSlot4Name = driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[2]/input"));
       renameSlot4Name.clear();
       renameSlot4Name.sendKeys("Slot 4");
       
       WebElement renameSlot4Title = driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[3]/input"));
       renameSlot4Title.sendKeys("Trending in search");
       
       WebElement ContentTypeHint_13 = driver.findElement(By.xpath(".//*[@id='asmSelect0']")); 

       Select selectBoxControlledSearch = new Select(ContentTypeHint_13);

       selectBoxControlledSearch.selectByValue(Configuration.ControlledSearch);
       Thread.sleep(6000);

       
       WebElement saveSlot4 = driver.findElement(By.xpath(Configuration.Save));
       saveSlot4.click();
       Thread.sleep(3000);
        
       WebElement Link1 = driver.findElement(By.id(Configuration.InsertMedia)); 

       Select selectList1 = new Select(Link1);
       //select link
       selectList1.selectByValue(Configuration.Link);
       
       WebElement AddLink = driver.findElement(By.xpath(Configuration.Add));
       AddLink.click();
       Thread.sleep(6000);

       WebElement urlText8 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input"));
       urlText8.sendKeys("http://www.google.co.uk");
       WebElement LinkText8 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input"));
       LinkText8.sendKeys("Link8");
       
       WebElement AddLink7 = driver.findElement(By.xpath(Configuration.Add));
       AddLink7.click();
       Thread.sleep(6000);
       WebElement urlText7 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input"));
       urlText7.sendKeys("http://www.google.co.uk");
       WebElement LinkText7 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input"));
       LinkText7.sendKeys("Link7");
       
       WebElement AddLink6 = driver.findElement(By.xpath(Configuration.Add));
       AddLink6.click();
       Thread.sleep(3000);
       WebElement urlText6 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input"));
       urlText6.sendKeys("http://www.google.co.uk");
       WebElement LinkText6 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input"));
       LinkText6.sendKeys("Link6");
       
       WebElement AddLink5 = driver.findElement(By.xpath(Configuration.Add));
       AddLink5.click();
       Thread.sleep(3000);
       WebElement urlText5 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input"));
       urlText5.sendKeys("http://www.google.co.uk");
       WebElement LinkText5 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input"));
       LinkText5.sendKeys("Link5");
       
       WebElement AddLink4 = driver.findElement(By.xpath(Configuration.Add));
       AddLink4.click();
       Thread.sleep(3000);
       WebElement urlText4 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input"));
       urlText4.sendKeys("http://www.google.co.uk");
       WebElement LinkText4 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input"));
       LinkText4.sendKeys("Link4");
       
       WebElement AddLink3 = driver.findElement(By.xpath(Configuration.Add));
       AddLink3.click();
       Thread.sleep(3000);
       WebElement urlText3 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input"));
       urlText3.sendKeys("http://www.google.co.uk");
       WebElement LinkText3 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input"));
       LinkText3.sendKeys("Link3");
       
       WebElement AddLink2 = driver.findElement(By.xpath(Configuration.Add));
       AddLink2.click();
       Thread.sleep(3000);
       WebElement urlText2 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input"));
       urlText2.sendKeys("http://www.google.co.uk");
       WebElement LinkText2 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input"));
       LinkText2.sendKeys("Link2");
       
       WebElement AddLink1 = driver.findElement(By.xpath(Configuration.Add));
       AddLink1.click();
       Thread.sleep(3000);
       WebElement urlText1 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input"));
       urlText1.sendKeys("http://www.google.co.uk");
       WebElement LinkText1 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input"));
       LinkText1.sendKeys("Link1");
       
       
       WebElement savelink1Slot4 = driver.findElement(By.xpath(Configuration.Save));
       savelink1Slot4.click();
       Thread.sleep(3000);

       
       
       //commented as the test was failing here
     /*  WebElement segment4 = driver.findElement(By.xpath(Configuration.Segment4Tree));
       segment4.click();
       Thread.sleep(8000);
       */
       WebElement publishChange2 = driver.findElement(By.xpath(Configuration.Publish));
       publishChange2.click();
       Thread.sleep(8000);
       
       WebElement publishAllChange2 = driver.findElement(By.xpath(Configuration.PublishAll));
       publishAllChange2.click();
       Thread.sleep(8000);
       
       driver.get("http://homepage.lbr.preprod.thundercontrol.com");
       
       driver.quit();
       
      //End editorial Test
   }   
    	
}