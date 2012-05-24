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

public class PremiumContent {

   public static void main(String[] args) throws Exception {

       FirefoxProfile ffProfile = new FirefoxProfile();
       ffProfile.setPreference("network.http.phishy-userpass-length", 255);
       WebDriver driver = new FirefoxDriver(ffProfile);
       driver.get(Configuration.baseurl_dev02);
       Thread.sleep(9000);

       driver.findElement(By.xpath(Configuration.ExpandMobile)).click();
       Thread.sleep(9000);
       
       driver.findElement(By.xpath(Configuration.ExpandSegment)).click();
       Thread.sleep(9000);
       
       driver.findElement(By.xpath(Configuration.MobileSegment)).click();
       Thread.sleep(9000);
       
       driver.findElement(By.xpath(Configuration.PremiumContent)).click();
       Thread.sleep(9000);
   
       driver.findElement(By.xpath(Configuration.InsertPackage)).click();
       Thread.sleep(8000);
       
       driver.findElement(By.xpath(Configuration.CreateNewPackage)).click();
       Thread.sleep(9000);
       
       driver.findElement(By.xpath(Configuration.NewPackage)).click();
       Thread.sleep(9000);
       
       driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[2]/input")).clear();
       driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[2]/input")).sendKeys("Premium content package 3 test");
       Thread.sleep(9000);
       
       driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[3]/input")).clear();
       driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[3]/input")).sendKeys("Premium content package 3 test");
       Thread.sleep(9000);
       
       WebElement Link1 = driver.findElement(By.id(Configuration.InsertMedia)); 

       Select selectList1 = new Select(Link1);
       //select link
       selectList1.selectByValue(Configuration.LinkWithImage);
       
       driver.findElement(By.xpath(Configuration.Add)).click();
       Thread.sleep(9000);

       driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input")).sendKeys("http://www.google.co.uk");
       Thread.sleep(9000);

       WebElement textarea1 = driver.findElement(By.xpath("//*[@class='mceEditor defaultSkin'][1]//iframe"));
       String id = textarea1.getAttribute("id");
       final WebDriver frame = driver.switchTo().frame(id);  
       final WebElement editorBody = frame.findElement(By.xpath("//*"));  
       editorBody.sendKeys("Take a sneak peak at todays tv show in");  
       driver.switchTo().defaultContent();
       
       driver.findElement(By.xpath("//input[@value='Browse...']")).click();
       Thread.sleep(9000);
       
       driver.findElement(By.xpath("//*[@id='searchInput']")).sendKeys("twitter");
       Thread.sleep(8000);

       driver.findElement(By.xpath(Configuration.CheckBox)).click();
       Thread.sleep(9000);
       
       driver.findElement(By.xpath(Configuration.OK)).click();
       Thread.sleep(9000);
       
       driver.findElement(By.xpath(Configuration.Save)).click();
       Thread.sleep(9000);
       
       WebElement Link2 = driver.findElement(By.id(Configuration.InsertMedia)); 

       Select selectList2 = new Select(Link2);
       //select link
       selectList2.selectByValue(Configuration.Link);
       
       WebElement AddLink1 = driver.findElement(By.xpath(Configuration.Add));
       AddLink1.click();
       Thread.sleep(9000);
       
       driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input")).sendKeys("http://www.google.co.uk");
       
       driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input")).sendKeys("Test1");
       
       driver.findElement(By.xpath(Configuration.Save)).click();
       Thread.sleep(9000);
       
       WebElement FirstLink = driver.findElement(By.id(Configuration.InsertMedia)); 

       Select selectList13 = new Select(FirstLink);
       //select link
       selectList13.selectByValue(Configuration.Link);
       
       driver.findElement(By.xpath(Configuration.Add)).click();
       Thread.sleep(9000);
       
       driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input")).sendKeys("http://www.google.co.uk");
       
       driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input")).sendKeys("Test2");
       
       driver.findElement(By.xpath(Configuration.Save)).click();
       Thread.sleep(9000);    
       
       ///////////////////////////////////////////PACKAGE 3//////////////////////////////////////
       
       driver.findElement(By.xpath(Configuration.PremiumContent)).click();
       Thread.sleep(9000);
       
       driver.findElement(By.xpath(Configuration.InsertPackage)).click();
       Thread.sleep(8000);
       
       driver.findElement(By.xpath(Configuration.CreateNewPackage)).click();
       Thread.sleep(9000);
       
       driver.findElement(By.xpath(Configuration.NewPackage)).click();
       Thread.sleep(9000);
       
       driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[2]/input")).clear();
       driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[2]/input")).sendKeys("Premium content package 3");
       Thread.sleep(9000);
       
       driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[3]/input")).sendKeys("Premium content package 3");
       Thread.sleep(9000);   
       
       WebElement Link3 = driver.findElement(By.id(Configuration.InsertMedia)); 

       Select selectList8 = new Select(Link3);
       //select link
       selectList8.selectByValue(Configuration.FeedVideoMostRecent);
       Thread.sleep(9000);

       driver.findElement(By.xpath(Configuration.Add)).click();
       Thread.sleep(9000);
       
       WebElement Link4 = driver.findElement(By.xpath(Configuration.InsertFeed)); 
       Select selectList3 = new Select(Link4);
       selectList3.selectByValue(Configuration.CelebrityRoundup);

       driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input")).sendKeys("1");
       Thread.sleep(9000);
              
       WebElement Link = driver.findElement(By.id(Configuration.InsertMedia)); 

       Select selectList_1 = new Select(Link);
       //select link
       selectList_1.selectByValue(Configuration.Link);
       Thread.sleep(9000);

       driver.findElement(By.xpath(Configuration.Add)).click();
       Thread.sleep(9000);
       
       driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input")).sendKeys("http://www.google.co.uk");
     
       driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input")).sendKeys("Celebs");
       
       driver.findElement(By.xpath(Configuration.Save)).click();
       Thread.sleep(9000);
       
       WebElement PremiumLink3 = driver.findElement(By.id(Configuration.InsertMedia)); 

       Select selectPremiumList3 = new Select(PremiumLink3);
       //select link
       selectPremiumList3.selectByValue(Configuration.Link);
       
       driver.findElement(By.xpath(Configuration.Add)).click();
       Thread.sleep(9000);
       
       driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input")).sendKeys("http://www.google.co.uk");
       
       driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input")).sendKeys("Link3");
       
       driver.findElement(By.xpath(Configuration.Save)).click();
       Thread.sleep(9000);
       
       ///////////////////////////////////////////PACKAGE 4//////////////////////////////////////
       
       driver.findElement(By.xpath(Configuration.PremiumContent)).click();
       Thread.sleep(9000);
       
       driver.findElement(By.xpath(Configuration.InsertPackage)).click();
       Thread.sleep(8000);
       
       driver.findElement(By.xpath(Configuration.CreateNewPackage)).click();
       Thread.sleep(9000);
       
       driver.findElement(By.xpath(Configuration.NewPackage)).click();
       Thread.sleep(9000);
       
       driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[2]/input")).clear();
       driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[2]/input")).sendKeys("Premium content package 4");
       Thread.sleep(9000);
       
       driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[3]/input")).sendKeys("Premium content package 4");
       Thread.sleep(9000);   
       
       WebElement Link5 = driver.findElement(By.id(Configuration.InsertMedia)); 

       Select selectListeight = new Select(Link5);
       //select link
       selectListeight.selectByValue(Configuration.LatestFeed);
       Thread.sleep(9000);

       driver.findElement(By.xpath(Configuration.Add)).click();
       Thread.sleep(9000);
       
       WebElement Link6 = driver.findElement(By.xpath(Configuration.InsertFeed)); 
       Select selectList4 = new Select(Link6);
       selectList4.selectByValue(Configuration.News);

       driver.findElement(By.xpath("//div[@class='editFormContainer']//li[5]/input")).sendKeys("1");
       Thread.sleep(9000);
              
       WebElement Link7 = driver.findElement(By.id(Configuration.InsertMedia)); 

       Select selectList_2 = new Select(Link7);
       //select link
       selectList_2.selectByValue(Configuration.Link);
       Thread.sleep(9000);

       driver.findElement(By.xpath(Configuration.Add)).click();
       Thread.sleep(9000);
       
       driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input")).sendKeys("http://www.google.co.uk");
     
       driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input")).sendKeys("News");
       
       driver.findElement(By.xpath(Configuration.Save)).click();
       Thread.sleep(9000);
       
       WebElement PremiumLink4 = driver.findElement(By.id(Configuration.InsertMedia)); 

       Select selectPremiumList4 = new Select(PremiumLink4);
       //select link
       selectPremiumList4.selectByValue(Configuration.Link);
       
       driver.findElement(By.xpath(Configuration.Add)).click();
       Thread.sleep(9000);
       
       driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input")).sendKeys("http://www.google.co.uk");
       
       driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input")).sendKeys("Link4");
       
       driver.findElement(By.xpath(Configuration.Save)).click();
       Thread.sleep(9000);
       
       ///////////////////////////////////////////PACKAGE 5//////////////////////////////////////
       
       driver.findElement(By.xpath(Configuration.PremiumContent)).click();
       Thread.sleep(9000);
       
       driver.findElement(By.xpath(Configuration.InsertPackage)).click();
       Thread.sleep(8000);
       
       driver.findElement(By.xpath(Configuration.CreateNewPackage)).click();
       Thread.sleep(9000);
       
       driver.findElement(By.xpath(Configuration.NewPackage)).click();
       Thread.sleep(9000);
       
       driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[2]/input")).clear();
       driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[2]/input")).sendKeys("Premium content package 5");
       Thread.sleep(9000);
       
       driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[3]/input")).sendKeys("Premium content package 5");
       Thread.sleep(9000);
       
       driver.findElement(By.xpath(Configuration.Save)).click();
       Thread.sleep(9000);       
       
       WebElement Link_1 = driver.findElement(By.id(Configuration.InsertMedia)); 

       Select selectList_8 = new Select(Link_1);
       //select link
       selectList_8.selectByValue(Configuration.LatestFeed);
       Thread.sleep(9000);

       driver.findElement(By.xpath(Configuration.Add)).click();
       Thread.sleep(9000);
       
       WebElement Link_6 = driver.findElement(By.xpath(Configuration.InsertFeed)); 
       Select selectList_4 = new Select(Link_6);
       selectList_4.selectByValue(Configuration.Sports);

       driver.findElement(By.xpath("//div[@class='editFormContainer']//li[5]/input")).sendKeys("1");
       Thread.sleep(9000);
              
       WebElement Link_7 = driver.findElement(By.id(Configuration.InsertMedia)); 

       Select selectList_3 = new Select(Link_7);
       //select link
       selectList_3.selectByValue(Configuration.Link);
       Thread.sleep(9000);

       driver.findElement(By.xpath(Configuration.Add)).click();
       Thread.sleep(9000);
       
       driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input")).sendKeys("http://www.google.co.uk");
     
       driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input")).sendKeys("Sports");
       
       WebElement PremiumLink5 = driver.findElement(By.id(Configuration.InsertMedia)); 

       Select selectPremiumList5 = new Select(PremiumLink5);
       //select link
       selectPremiumList5.selectByValue(Configuration.Link);
       
       driver.findElement(By.xpath(Configuration.Add)).click();
       Thread.sleep(9000);
       
       driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input")).sendKeys("http://www.google.co.uk");
       
       driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input")).sendKeys("Link5");
       
       driver.findElement(By.xpath(Configuration.Save)).click();
       Thread.sleep(9000);
       
       ///////////////////////////////////////////PACKAGE 6//////////////////////////////////////
       
       driver.findElement(By.xpath(Configuration.PremiumContent)).click();
       Thread.sleep(9000);
       
       driver.findElement(By.xpath(Configuration.InsertPackage)).click();
       Thread.sleep(8000);
       
       driver.findElement(By.xpath(Configuration.CreateNewPackage)).click();
       Thread.sleep(9000);
       
       driver.findElement(By.xpath(Configuration.NewPackage)).click();
       Thread.sleep(9000);
       
       driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[2]/input")).clear();
       driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[2]/input")).sendKeys("Premium content package 6");
       Thread.sleep(9000);
       
       driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[3]/input")).sendKeys("Premium content package 6");
       Thread.sleep(9000);

       WebElement Link_2 = driver.findElement(By.id(Configuration.InsertMedia)); 

       Select selectList9 = new Select(Link_2);
       //select link
       selectList9.selectByValue(Configuration.LatestFeed);
       Thread.sleep(9000);

       driver.findElement(By.xpath(Configuration.Add)).click();
       Thread.sleep(9000);
       
       WebElement Link_8 = driver.findElement(By.xpath(Configuration.InsertFeed)); 
       Select selectList_5 = new Select(Link_8);
       selectList_5.selectByValue(Configuration.sports_racing);

       driver.findElement(By.xpath("//div[@class='editFormContainer']//li[5]/input")).sendKeys("1");
       Thread.sleep(9000);
              
       WebElement Link8 = driver.findElement(By.id(Configuration.InsertMedia)); 

       Select selectList5 = new Select(Link8);
       //select link
       selectList5.selectByValue(Configuration.Link);
       Thread.sleep(9000);

       driver.findElement(By.xpath(Configuration.Add)).click();
       Thread.sleep(9000);
       
       driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input")).sendKeys("http://www.google.co.uk");
     
       driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input")).sendKeys("Film");
       
       WebElement PremiumLink6 = driver.findElement(By.id(Configuration.InsertMedia)); 

       Select selectPremiumList6 = new Select(PremiumLink6);
       //select link
       selectPremiumList6.selectByValue(Configuration.Link);
       
       driver.findElement(By.xpath(Configuration.Add)).click();
       Thread.sleep(9000);
       
       driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input")).sendKeys("http://www.google.co.uk");
       
       driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input")).sendKeys("Link6");
       
       driver.findElement(By.xpath(Configuration.Save)).click();
       Thread.sleep(9000);

       ///////////////////////////////////////////PACKAGE 7//////////////////////////////////////
       
       driver.findElement(By.xpath(Configuration.PremiumContent)).click();
       Thread.sleep(9000);
       
       driver.findElement(By.xpath(Configuration.InsertPackage)).click();
       Thread.sleep(8000);
       
       driver.findElement(By.xpath(Configuration.CreateNewPackage)).click();
       Thread.sleep(9000);
       
       driver.findElement(By.xpath(Configuration.NewPackage)).click();
       Thread.sleep(9000);
       
       driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[2]/input")).clear();
       driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[2]/input")).sendKeys("Premium content package 7");
       Thread.sleep(9000);
       
       driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[3]/input")).sendKeys("Premium content package 7");
       Thread.sleep(9000);

       WebElement Link_3 = driver.findElement(By.id(Configuration.InsertMedia)); 

       Select selectList10 = new Select(Link_3);
       //select link
       selectList10.selectByValue(Configuration.LatestFeed);
       Thread.sleep(9000);

       driver.findElement(By.xpath(Configuration.Add)).click();
       Thread.sleep(9000);
       
       WebElement Link_9 = driver.findElement(By.xpath(Configuration.InsertFeed)); 
       Select selectList_6 = new Select(Link_9);
       selectList_6.selectByValue(Configuration.sports_snooker);

       driver.findElement(By.xpath("//div[@class='editFormContainer']//li[5]/input")).sendKeys("1");
       Thread.sleep(9000);
              
       WebElement Link9 = driver.findElement(By.id(Configuration.InsertMedia)); 

       Select selectList6 = new Select(Link9);
       //select link
       selectList6.selectByValue(Configuration.Link);
       Thread.sleep(9000);

       WebElement AddLink6 = driver.findElement(By.xpath(Configuration.Add));
       AddLink6.click();
       Thread.sleep(9000);
       
       WebElement URL4 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input"));
       URL4.sendKeys("http://www.google.co.uk");
     
       WebElement Text4 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input"));
       Text4.sendKeys("Film");
       
       //WebElement saveItem8 = driver.findElement(By.xpath(Configuration.Save));
       //saveItem8.click();
       //Thread.sleep(9000);
       
       WebElement PremiumLink7 = driver.findElement(By.id(Configuration.InsertMedia)); 

       Select selectPremiumList7 = new Select(PremiumLink7);
       //select link
       selectPremiumList7.selectByValue(Configuration.Link);
       
       WebElement AddPremiumLink7 = driver.findElement(By.xpath(Configuration.Add));
       AddPremiumLink7.click();
       Thread.sleep(9000);
       
       WebElement urlPremiumText7 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input"));
       urlPremiumText7.sendKeys("http://www.google.co.uk");
       
       WebElement TitlePremium7 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input"));
       TitlePremium7.sendKeys("Link7");
       
       WebElement savePremiumItem7 = driver.findElement(By.xpath(Configuration.Save));
       savePremiumItem7.click();
       Thread.sleep(9000);
       
       ///////////////////////////////////////////PACKAGE 8//////////////////////////////////////
       
       WebElement PremiumContentTree5 = driver.findElement(By.xpath(Configuration.PremiumContent));
       PremiumContentTree5.click();
       Thread.sleep(9000);
       
       WebElement insert6 = driver.findElement(By.xpath(Configuration.InsertPackage));
       insert6.click();
       Thread.sleep(8000);
       
       WebElement CreateNewPackage6 = driver.findElement(By.xpath(Configuration.CreateNewPackage));
       CreateNewPackage6.click();
       Thread.sleep(9000);
       
       WebElement EditPackage7 = driver.findElement(By.xpath(Configuration.NewPackage));
       EditPackage7.click();
       Thread.sleep(9000);
       
       WebElement renamePackage_9 = driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[2]/input"));
       renamePackage_9.clear();
       renamePackage_9.sendKeys("Premium content package 8");
       Thread.sleep(9000);
       
       WebElement renamePackage10 = driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[3]/input"));
       renamePackage10.sendKeys("Premium content package 8");
       Thread.sleep(9000);
       
       //WebElement save7 = driver.findElement(By.xpath(Configuration.Save));
       //save7.click();
       //Thread.sleep(9000);       
       
       WebElement Link_4 = driver.findElement(By.id(Configuration.InsertMedia)); 

       Select selectList11 = new Select(Link_4);
       //select link
       selectList11.selectByValue(Configuration.FeedArticleHeadlinePackage);
       Thread.sleep(9000);

       WebElement AddLink_6 = driver.findElement(By.xpath(Configuration.Add));
       AddLink_6.click();
       Thread.sleep(9000);

       WebElement HeadlinePackage = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input"));
       HeadlinePackage.sendKeys("general headline");
       Thread.sleep(2000);
       
       WebElement HowMany5 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input"));
       HowMany5.sendKeys("1");
       Thread.sleep(9000);
              
       WebElement Link10 = driver.findElement(By.id(Configuration.InsertMedia)); 

       Select selectList7 = new Select(Link10);
       //select link
       selectList7.selectByValue(Configuration.Link);
       Thread.sleep(9000);

       WebElement AddLink7 = driver.findElement(By.xpath(Configuration.Add));
       AddLink7.click();
       Thread.sleep(9000);
       
       WebElement URL5 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input"));
       URL5.sendKeys("http://www.google.co.uk");
     
       WebElement Text5 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input"));
       Text5.sendKeys("Headlines");
       
       //WebElement saveItem10 = driver.findElement(By.xpath(Configuration.Save));
       //saveItem10.click();
       //Thread.sleep(9000);
       
       WebElement PremiumLink8 = driver.findElement(By.id(Configuration.InsertMedia)); 

       Select selectPremiumList8 = new Select(PremiumLink8);
       //select link
       selectPremiumList8.selectByValue(Configuration.Link);
       
       WebElement AddPremiumLink8 = driver.findElement(By.xpath(Configuration.Add));
       AddPremiumLink8.click();
       Thread.sleep(9000);
       
       WebElement urlPremiumText8 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input"));
       urlPremiumText8.sendKeys("http://www.google.co.uk");
       
       WebElement TitlePremium8 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input"));
       TitlePremium8.sendKeys("Link8");
       
       WebElement savePremiumItem8 = driver.findElement(By.xpath(Configuration.Save));
       savePremiumItem8.click();
       Thread.sleep(9000);
       
       ///////////////////////////////////////////PACKAGE 9//////////////////////////////////////
       
       WebElement PremiumContentTree6 = driver.findElement(By.xpath(Configuration.PremiumContent));
       PremiumContentTree6.click();
       Thread.sleep(9000);
       
       WebElement insert7 = driver.findElement(By.xpath(Configuration.InsertPackage));
       insert7.click();
       Thread.sleep(8000);
       
       WebElement CreateNewPackage7 = driver.findElement(By.xpath(Configuration.CreateNewPackage));
       CreateNewPackage7.click();
       Thread.sleep(9000);
       
       WebElement EditPackage8 = driver.findElement(By.xpath(Configuration.NewPackage));
       EditPackage8.click();
       Thread.sleep(9000);
       
       WebElement renamePackage_10 = driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[2]/input"));
       renamePackage_10.clear();
       renamePackage_10.sendKeys("Premium content package 9");
       Thread.sleep(9000);
       
       WebElement renamePackage11 = driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[3]/input"));
       renamePackage11.sendKeys("Premium content package 9");
       Thread.sleep(9000);
       
       //WebElement save8 = driver.findElement(By.xpath(Configuration.Save));
       //save8.click();
       //Thread.sleep(9000);       
       
       WebElement Link_5 = driver.findElement(By.id(Configuration.InsertMedia)); 

       Select selectList12 = new Select(Link_5);
       //select link
       selectList12.selectByValue(Configuration.FeedArticleHeadlinePackage);
       Thread.sleep(9000);

       WebElement AddLink_7 = driver.findElement(By.xpath(Configuration.Add));
       AddLink_7.click();
       Thread.sleep(9000);

       WebElement HeadlinePackage1 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input"));
       HeadlinePackage1.sendKeys("general headline");
       Thread.sleep(2000);
       
       WebElement HowMany6 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input"));
       HowMany6.sendKeys("1");
       Thread.sleep(2000);
              
       WebElement Link11 = driver.findElement(By.id(Configuration.InsertMedia)); 

       Select selectList15 = new Select(Link11);
       //select link
       selectList15.selectByValue(Configuration.Link);
       Thread.sleep(9000);

       WebElement AddLink_8 = driver.findElement(By.xpath(Configuration.Add));
       AddLink_8.click();
       Thread.sleep(9000);
       
       WebElement URL6 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input"));
       URL6.sendKeys("http://www.google.co.uk");
     
       WebElement Text6 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input"));
       Text6.sendKeys("Social");
       
       //WebElement saveItem9 = driver.findElement(By.xpath(Configuration.Save));
       //saveItem9.click();
       //Thread.sleep(9000);
       
       WebElement PremiumLink9 = driver.findElement(By.id(Configuration.InsertMedia)); 

       Select selectPremiumList9 = new Select(PremiumLink9);
       //select link
       selectPremiumList9.selectByValue(Configuration.Link);
       
       WebElement AddPremiumLink9 = driver.findElement(By.xpath(Configuration.Add));
       AddPremiumLink9.click();
       Thread.sleep(9000);
       
       WebElement urlPremiumText9 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input"));
       urlPremiumText9.sendKeys("http://www.google.co.uk");
       
       WebElement TitlePremium9 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input"));
       TitlePremium9.sendKeys("Link9");
       
       WebElement savePremiumItem9 = driver.findElement(By.xpath(Configuration.Save));
       savePremiumItem9.click();
       Thread.sleep(9000);
 
       driver.findElement(By.xpath(Configuration.Publish));
       driver.findElement(By.xpath(Configuration.PublishAll));
 
            
   }
}