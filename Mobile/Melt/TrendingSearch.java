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

public class TrendingSearch {

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
       
       WebElement Trending = driver.findElement(By.xpath(Configuration.Trending));
       Trending.click();
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
       renamePane6.sendKeys("Trending search container 1");
       Thread.sleep(1000);
       
       WebElement renamePaneTitle6 = driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[3]/input"));
       renamePaneTitle6.sendKeys("Trending search container 1");
       Thread.sleep(1                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 , 000);
       
       WebElement save = driver.findElement(By.xpath(Configuration.Save));
       save.click();
       Thread.sleep(7000);
       
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
       LinkText8.sendKeys("Link9");       
       WebElement AddLink7 = driver.findElement(By.xpath(Configuration.Add));
       AddLink7.click();
       Thread.sleep(6000);
       
       WebElement urlText7 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input"));
       urlText7.sendKeys("http://www.google.co.uk");
       WebElement LinkText7 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input"));
       LinkText7.sendKeys("Link10");
       
       WebElement AddLink6 = driver.findElement(By.xpath(Configuration.Add));
       AddLink6.click();
       Thread.sleep(5000);
       WebElement urlText6 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input"));
       urlText6.sendKeys("http://www.google.co.uk");
       WebElement LinkText6 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input"));
       LinkText6.sendKeys("Link6");
       
       WebElement AddLink5 = driver.findElement(By.xpath(Configuration.Add));
       AddLink5.click();
       Thread.sleep(5000);
       WebElement urlText5 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input"));
       urlText5.sendKeys("http://www.google.co.uk");
       WebElement LinkText5 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input"));
       LinkText5.sendKeys("Link5");
       
       WebElement AddLink4 = driver.findElement(By.xpath(Configuration.Add));
       AddLink4.click();
       Thread.sleep(5000);
       WebElement urlText4 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input"));
       urlText4.sendKeys("http://www.google.co.uk");
       WebElement LinkText4 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input"));
       LinkText4.sendKeys("Link4");
       
       WebElement AddLink3 = driver.findElement(By.xpath(Configuration.Add));
       AddLink3.click();
       Thread.sleep(5000);
       WebElement urlText3 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input"));
       urlText3.sendKeys("http://www.google.co.uk");
       WebElement LinkText3 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input"));
       LinkText3.sendKeys("Link3");
       
       WebElement AddLink2 = driver.findElement(By.xpath(Configuration.Add));
       AddLink2.click();
       Thread.sleep(5000);
       WebElement urlText2 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input"));
       urlText2.sendKeys("http://www.google.co.uk");
       WebElement LinkText2 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input"));
       LinkText2.sendKeys("Link2");
       
       WebElement AddLink1 = driver.findElement(By.xpath(Configuration.Add));
       AddLink1.click();
       Thread.sleep(5000);
       WebElement urlText1 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input"));
       urlText1.sendKeys("http://www.google.co.uk");
       WebElement LinkText1 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input"));
       LinkText1.sendKeys("Link1");     
       
       WebElement savelink1Slot4 = driver.findElement(By.xpath(Configuration.Save));
       savelink1Slot4.click();
       Thread.sleep(5000);
       
       WebElement TrendingReturn = driver.findElement(By.xpath(Configuration.Trending));
       TrendingReturn.click();
       Thread.sleep(5000);
       
       WebElement Item1 = driver.findElement(By.id(Configuration.InsertMedia)); 

       Select selectText = new Select(Item1);
       //select link
       selectText.selectByValue(Configuration.Text);
       
       WebElement AddLink8 = driver.findElement(By.xpath(Configuration.Add));
       AddLink8.click();
       Thread.sleep(6000);

       WebElement textarea1 = driver.findElement(By.xpath("(//*[@class='mceEditor defaultSkin'])[1]//iframe"));
       String id = textarea1.getAttribute("id");
       final WebDriver frame = driver.switchTo().frame(id);  
       final WebElement editorBody = frame.findElement(By.xpath("//*"));  
       editorBody.sendKeys("Trending search");  
       driver.switchTo().defaultContent();
       
       WebElement SaveText = driver.findElement(By.xpath(Configuration.Save));
       SaveText.click();
       Thread.sleep(5000);
       
}

}