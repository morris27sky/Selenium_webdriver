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

public class Create_Slot1_Package {

   public static void main(String[] args) throws Exception {

       FirefoxProfile ffProfile = new FirefoxProfile();
       ffProfile.setPreference("network.http.phishy-userpass-length", 255);
       WebDriver driver = new FirefoxDriver(ffProfile);
       //driver.get(Configuration.baseurl_dev02);
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
       Thread.sleep(100);
       
       WebElement publishSlot1 = driver.findElement(By.xpath(Configuration.Publish));
       publishSlot1.click();
       Thread.sleep(100);
       
       WebElement publishAllSlot1 = driver.findElement(By.xpath(Configuration.PublishAll));
       publishAllSlot1.click();
       Thread.sleep(100);
       
       driver.quit();
 //end create slot 1 test
       
   }
}
