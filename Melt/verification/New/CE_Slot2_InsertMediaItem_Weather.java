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

public class CE_Slot2_InsertMediaItem_Weather {

   public static void main(String[] args) throws Exception {

       FirefoxProfile ffProfile = new FirefoxProfile();
       ffProfile.setPreference("network.http.phishy-userpass-length", 255);
       WebDriver driver = new FirefoxDriver(ffProfile);
       driver.get("https://OrangeDigital:Or1971ngE@melt.adm.preprod.thundercontrol.com");
       
       /*
       WebElement HomepageTree_Segment4 = driver.findElement(By.xpath(Configuration.Segment4Tree));
       HomepageTree_Segment4.click();
       Thread.sleep(8000);
       
       //RUN CLEAR STATE START
       
       WebElement LastVisited_CE  = driver.findElement(By.xpath(Configuration.LastVisitedPackage));
       LastVisited_CE.isDisplayed();
       LastVisited_CE.click();
       Thread.sleep(8000);
  
       //remove test pane
       WebElement Remove = driver.findElement(By.xpath(Configuration.Remove));
       Remove.isDisplayed();
       Remove.click();
       Thread.sleep(1000);  
       driver.switchTo().alert().accept();
       Thread.sleep(8000);
       
       //Save & publish deleted change
       WebElement SaveChange1  = driver.findElement(By.xpath(Configuration.Save));
       SaveChange1.click();
       Thread.sleep(8000);
       
       WebElement publishChange1 = driver.findElement(By.xpath(Configuration.Publish));
       publishChange1.click();
       Thread.sleep(8000);
       
       WebElement publishAllChange1 = driver.findElement(By.xpath(Configuration.PublishAll));
       publishAllChange1.click();
       Thread.sleep(8000);

       //RUN CLEAR STATE END*/
       
       WebElement HomepageTree_Segment4Click = driver.findElement(By.xpath(Configuration.Segment4Tree));
       HomepageTree_Segment4Click.click();
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
       Thread.sleep(8000);
       
       WebElement publish = driver.findElement(By.xpath(Configuration.Publish));
       publish.click();
       Thread.sleep(8000);
       
       WebElement publishAll = driver.findElement(By.xpath(Configuration.PublishAll));
       publishAll.click();
       Thread.sleep(8000);
       
       WebElement back = driver.findElement(By.xpath(Configuration.Back));
       back.click();
       Thread.sleep(8000);
       
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
       Thread.sleep(3000);
       
       WebElement renameSlot1Title = driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[3]/input"));
       renameSlot1Title.sendKeys("Latest Test");
       Thread.sleep(3000);
       
       WebElement saveSlot1 = driver.findElement(By.xpath(Configuration.Save));
       saveSlot1.click();
       Thread.sleep(3000);
       
       WebElement publishSlot1 = driver.findElement(By.xpath(Configuration.Publish));
       publishSlot1.click();
       Thread.sleep(3000);
       
       WebElement publishAllSlot1 = driver.findElement(By.xpath(Configuration.PublishAll));
       publishAllSlot1.click();
       Thread.sleep(3000);

       WebElement back1 = driver.findElement(By.xpath(Configuration.Back));
       back1.click();
       Thread.sleep(8000);
       
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
       
       WebElement publishSlot1Feed = driver.findElement(By.xpath(Configuration.Publish));
       publishSlot1Feed.click();
       Thread.sleep(1000);
       
       WebElement publishAllSlot1Feed = driver.findElement(By.xpath(Configuration.PublishAll));
       publishAllSlot1Feed.click();
       Thread.sleep(1000);
       
       WebElement back2 = driver.findElement(By.xpath(Configuration.Back));
       back2.click();
       Thread.sleep(3000);
       
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
       
       ///Weather hint selection
       WebElement weatherSelect = driver.findElement(By.xpath(".//*[@id='asmSelect0']"));
       
       Select selectBoxWeather = new Select(weatherSelect);
       //select Feed article - Latest
       selectBoxWeather.selectByValue(Configuration.weather);

       WebElement saveWeather = driver.findElement(By.xpath(Configuration.Save));
       saveWeather.click();
       Thread.sleep(3000);
       
       WebElement publishWeather = driver.findElement(By.xpath(Configuration.Publish));
       publishWeather.click();
       Thread.sleep(3000);
       
       WebElement publishAllWeather = driver.findElement(By.xpath(Configuration.PublishAll));
       publishAllWeather.click();
       Thread.sleep(3000);
       
       driver.quit();
      //End weather Test
   }   
    	
}