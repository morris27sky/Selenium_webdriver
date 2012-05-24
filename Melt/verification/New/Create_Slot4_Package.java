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
//import junit.framework.TestCase;

import tests.Melt.verification.New.Configuration;

public class Create_Slot4_Package {

   public static void main(String[] args) throws Exception {

	   
	   
	   //CASE CAN BE IGNORED
       FirefoxProfile ffProfile = new FirefoxProfile();
       ffProfile.setPreference("network.http.phishy-userpass-length", 255);
       WebDriver driver = new FirefoxDriver(ffProfile);
       driver.get("https://OrangeDigital:Or1971ngE@melt.adm.preprod.thundercontrol.com");

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

       //RUN CLEAR STATE END
       
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
       Thread.sleep(100);
       
       WebElement renameSlot1Title = driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[3]/input"));
       renameSlot1Title.sendKeys("Slot 1");
       Thread.sleep(100);
       
       WebElement saveSlot1 = driver.findElement(By.xpath(Configuration.Save));
       saveSlot1.click();
       Thread.sleep(1000);
       
       WebElement publishSlot1 = driver.findElement(By.xpath(Configuration.Publish));
       publishSlot1.click();
       Thread.sleep(1000);
       
       WebElement publishAllSlot1 = driver.findElement(By.xpath(Configuration.PublishAll));
       publishAllSlot1.click();
       Thread.sleep(1000);

       driver.findElement(By.linkText("TestPane")).click();
       Thread.sleep(1000);
       
       //insert slot2
       WebElement insertSlot2 = driver.findElement(By.xpath(Configuration.InsertPackageBottom));
       insertSlot2.click();
       Thread.sleep(10000);
  
       WebElement CreateSlot2 = driver.findElement(By.xpath(Configuration.CreateNewPackageBottom));
       CreateSlot2.click();
       Thread.sleep(8000);
       
       WebElement EditSlot2 = driver.findElement(By.xpath(Configuration.NewPackage));
       EditSlot2.click();
       Thread.sleep(8000);
       
       WebElement renameSlot2Name = driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[2]/input"));
       renameSlot2Name.clear();
       renameSlot2Name.sendKeys("Slot 2");
       Thread.sleep(1000);
       
       WebElement renameSlot2Title = driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[3]/input"));
       renameSlot2Title.sendKeys("Slot 2");
       Thread.sleep(1000);
       
       WebElement saveSlot2 = driver.findElement(By.xpath(Configuration.Save));
       saveSlot2.click();
       Thread.sleep(1000);
       
       WebElement publishSlot2 = driver.findElement(By.xpath(Configuration.Publish));
       publishSlot2.click();
       Thread.sleep(1000);
       
       WebElement publishAllSlot2 = driver.findElement(By.xpath(Configuration.PublishAll));
       publishAllSlot2.click();
       Thread.sleep(1000);
       
       driver.findElement(By.linkText("TestPane")).click();
       Thread.sleep(1000);
     
       //insert slot3
       WebElement insertSlot3 = driver.findElement(By.xpath(Configuration.InsertPackageBottom));
       insertSlot3.click();
       Thread.sleep(10000);
  
       WebElement CreateSlot3 = driver.findElement(By.xpath(Configuration.CreateNewPackageBottom));
       CreateSlot3.click();
       Thread.sleep(8000);
       
       WebElement EditSlot3 = driver.findElement(By.xpath(Configuration.NewPackage));
       EditSlot3.click();
       Thread.sleep(8000);
       
       WebElement renameSlot3Name = driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[2]/input"));
       renameSlot3Name.clear();
       renameSlot3Name.sendKeys("Slot 3");
       Thread.sleep(1000);
       
       WebElement renameSlot3Title = driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[3]/input"));
       renameSlot3Title.sendKeys("Slot 3");
       Thread.sleep(1000);
       
       WebElement saveSlot3 = driver.findElement(By.xpath(Configuration.Save));
       saveSlot3.click();
       Thread.sleep(1000);
       
       WebElement publishSlot3 = driver.findElement(By.xpath(Configuration.Publish));
       publishSlot3.click();
       Thread.sleep(1000);
       
       WebElement publishAllSlot3 = driver.findElement(By.xpath(Configuration.PublishAll));
       publishAllSlot3.click();
       Thread.sleep(1000);
       
       driver.findElement(By.linkText("TestPane")).click();
       Thread.sleep(1000);
       
     //insert slot4
       WebElement insertSlot4 = driver.findElement(By.xpath(Configuration.InsertPackageBottom));
       insertSlot4.click();
       Thread.sleep(10000);
  
       WebElement CreateSlot4 = driver.findElement(By.xpath(Configuration.CreateNewPackageBottom));
       CreateSlot4.click();
       Thread.sleep(8000);
       
       WebElement EditSlot4 = driver.findElement(By.xpath(Configuration.NewPackage));
       EditSlot4.click();
       Thread.sleep(8000);
       
       WebElement renameSlot4Name = driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[2]/input"));
       renameSlot4Name.clear();
       renameSlot4Name.sendKeys("Slot 4");
       Thread.sleep(1000);
       
       WebElement renameSlot4Title = driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[3]/input"));
       renameSlot4Title.sendKeys("Slot 4");
       Thread.sleep(1000);
       
       WebElement saveSlot4 = driver.findElement(By.xpath(Configuration.Save));
       saveSlot4.click();
       Thread.sleep(1000);
       
       WebElement publishSlot4 = driver.findElement(By.xpath(Configuration.Publish));
       publishSlot4.click();
       Thread.sleep(1000);
       
       WebElement publishAllSlot4 = driver.findElement(By.xpath(Configuration.PublishAll));
       publishAllSlot4.click();
       Thread.sleep(1000);
       
       driver.quit();
 //end create slot 4 test
       
   }
}