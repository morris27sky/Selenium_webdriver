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

public class Create_Pane_Package {

   public static void main(String[] args) throws Exception {

       FirefoxProfile ffProfile = new FirefoxProfile();
       ffProfile.setPreference("network.http.phishy-userpass-length", 255);
       WebDriver driver = new FirefoxDriver(ffProfile);
       driver.get("https://OrangeDigital:Or1971ngE@melt.adm.preprod.thundercontrol.com");
     //CASE CAN BE IGNORED
  WebElement HomepageTree_Segment4 = driver.findElement(By.xpath(Configuration.Segment4Tree));
  HomepageTree_Segment4.isDisplayed();
  HomepageTree_Segment4.click();
  Thread.sleep(8000);
  
  WebElement ContentExplorerPackage_Segment4  = driver.findElement(By.xpath(Configuration.EditSegment4));
  ContentExplorerPackage_Segment4.isDisplayed();
  ContentExplorerPackage_Segment4.click();
  Thread.sleep(8000);
  
  WebElement insert  = driver.findElement(By.xpath(Configuration.InsertPackage));
  insert.isDisplayed();
  insert.click();
  Thread.sleep(8000);
  
  WebElement CreateNewPackage  = driver.findElement(By.xpath(Configuration.CreateNewPackage));
  CreateNewPackage.isDisplayed();
  CreateNewPackage.click();
  Thread.sleep(8000);
  
  WebElement EditPackage  = driver.findElement(By.xpath(Configuration.NewPackage));
  EditPackage.isDisplayed();
  EditPackage.click();
  Thread.sleep(8000);
  
  WebElement type  = driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[2]/input"));
  type.isDisplayed();
  type.clear();
  type.sendKeys("TestPane");
  Thread.sleep(8000);
  
  WebElement save  = driver.findElement(By.xpath(Configuration.Save));
  save.isDisplayed();
  save.click();
  Thread.sleep(8000);
  
  WebElement publish  = driver.findElement(By.xpath(Configuration.Publish));
  publish.isDisplayed();
  publish.click();
  Thread.sleep(8000);
  
  WebElement publishAll  = driver.findElement(By.xpath(Configuration.PublishAll));
  publishAll.isDisplayed();
  publishAll.click();
  Thread.sleep(8000);
  
  //delete created Test Pane Package
  
  WebElement back  = driver.findElement(By.xpath(Configuration.Back));
  back.isDisplayed();
  back.click();
  Thread.sleep(8000);
  
  WebElement LastVisited_CE  = driver.findElement(By.xpath(Configuration.LastVisitedPackage));
  LastVisited_CE.isDisplayed();
  LastVisited_CE.click();
  Thread.sleep(8000);
  
  //remove test pane
  WebElement Remove  = driver.findElement(By.xpath(Configuration.Remove));
  Remove.isDisplayed();
  Remove.click();
  Thread.sleep(8000);    
  driver.switchTo().alert().accept();
  
  //Save & publish deleted change
  WebElement SaveChange1  = driver.findElement(By.xpath(Configuration.Save));
  SaveChange1.click();
  Thread.sleep(8000);
  WebElement publishChange1  = driver.findElement(By.xpath(Configuration.Publish));
  publishChange1.click();
  WebElement publishAllChange1  = driver.findElement(By.xpath(Configuration.PublishAll));
  publishAllChange1.click();
  
 //end create pane package test 
  
   }
}
