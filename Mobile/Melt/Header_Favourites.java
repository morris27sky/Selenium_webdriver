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

public class Header_Favourites {

   public static void main(String[] args) throws Exception {

       FirefoxProfile ffProfile = new FirefoxProfile();
       ffProfile.setPreference("network.http.phishy-userpass-length", 255);
       WebDriver driver = new FirefoxDriver(ffProfile);
       driver.get(Configuration.baseurl);
       Thread.sleep(3000);

       WebElement ExpandMobileTree = driver.findElement(By.xpath(Configuration.ExpandMobile));
       ExpandMobileTree.click();
       Thread.sleep(3000);
       
       WebElement ExpandSegmentTree = driver.findElement(By.xpath(Configuration.ExpandSegment));
       ExpandSegmentTree.click();
       Thread.sleep(6000);
       
       WebElement Segment1 = driver.findElement(By.xpath(Configuration.MobileSegment));
       Segment1.click();
       Thread.sleep(6000);
       
       WebElement Header = driver.findElement(By.xpath(Configuration.Header));
       Header.click();
       Thread.sleep(6000);
       
       WebElement Favourites = driver.findElement(By.xpath(Configuration.Favourites));
       Favourites.click();
       Thread.sleep(6000);
       
       WebElement ContentTypeHint_1 = driver.findElement(By.xpath(Configuration.ContentTypeHint)); 

       Select selectBoxControlledSearch = new Select(ContentTypeHint_1);

       selectBoxControlledSearch.selectByValue(Configuration.Favourites_hint);
       Thread.sleep(6000);
       
       WebElement saveHeader = driver.findElement(By.xpath(Configuration.Save));
       saveHeader.click();
       Thread.sleep(3000);

       WebElement insert = driver.findElement(By.xpath(Configuration.InsertPackage));
       insert.click();
       Thread.sleep(8000);
       
       WebElement CreateNewPackage = driver.findElement(By.xpath(Configuration.CreateNewPackage));
       CreateNewPackage.click();
       Thread.sleep(6000);
       
       WebElement EditPackage = driver.findElement(By.xpath(Configuration.NewPackage));
       EditPackage.click();
       Thread.sleep(6000);
       
       WebElement renamePane = driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[2]/input"));
       renamePane.clear();
       renamePane.sendKeys("Best of the web container");
       Thread.sleep(100);
       
       WebElement renamePaneTitle = driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[3]/input"));
       renamePaneTitle.sendKeys("Best of the web container");
       Thread.sleep(100);
       
       WebElement save = driver.findElement(By.xpath(Configuration.Save));
       save.click();
       Thread.sleep(1000);
       
       WebElement Link1 = driver.findElement(By.id(Configuration.InsertMedia)); 

       Select selectList1 = new Select(Link1);
       //select link
       selectList1.selectByValue(Configuration.Link);
       
       WebElement AddLink = driver.findElement(By.xpath(Configuration.Add));
       AddLink.click();
       Thread.sleep(6000);

       WebElement urlText1 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input"));
       urlText1.sendKeys("http://m.direct.gov.uk/");
       WebElement LinkText1 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input"));
       LinkText1.sendKeys("Direct Gov");
       WebElement reportingEnable1 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[8]/input"));
       reportingEnable1.click();
       WebElement reportingCampaign1 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[9]/input"));
       reportingCampaign1.sendKeys("favourites");
       WebElement reportingID1 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[10]/input"));
       reportingID1.sendKeys("header");
       WebElement AddLink1 = driver.findElement(By.xpath(Configuration.Add));
       AddLink1.click();
       Thread.sleep(3000);
     
       WebElement urlText2 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input"));
       urlText2.sendKeys("http://m.tfl.gov.uk/");
       WebElement LinkText2 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input"));
       LinkText2.sendKeys("Transport for London");
       WebElement reportingEnable2 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[8]/input"));
       reportingEnable2.click();
       WebElement reportingCampaign2 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[9]/input"));
       reportingCampaign2.sendKeys("favourites");
       WebElement reportingID2 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[10]/input"));
       reportingID2.sendKeys("header");
       WebElement AddLink2 = driver.findElement(By.xpath(Configuration.Add));
       AddLink2.click();
       Thread.sleep(3000);
       
       WebElement urlText3 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input"));
       urlText3.sendKeys("http://your.orange.co.uk");
       WebElement LinkText3 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input"));
       LinkText3.sendKeys("your orange");
       WebElement reportingEnable3 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[8]/input"));
       reportingEnable3.click();
       WebElement reportingCampaign3 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[9]/input"));
       reportingCampaign3.sendKeys("favourites");
       WebElement reportingID3 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[10]/input"));
       reportingID3.sendKeys("header");
       WebElement AddLink3 = driver.findElement(By.xpath(Configuration.Add));
       AddLink3.click();
       Thread.sleep(3000);
       
       WebElement urlText4 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input"));
       urlText4.sendKeys("http://shop.orange.co.uk");
       WebElement LinkText4 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input"));
       LinkText4.sendKeys("Orange shop");
       WebElement reportingEnable4 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[8]/input"));
       reportingEnable4.click();
       WebElement reportingCampaign4 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[9]/input"));
       reportingCampaign4.sendKeys("favourites");
       WebElement reportingID4 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[10]/input"));
       reportingID4.sendKeys("header");
       WebElement AddLink4 = driver.findElement(By.xpath(Configuration.Add));
       AddLink4.click();
       Thread.sleep(3000);
       
       WebElement urlText5 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input"));
       urlText5.sendKeys("http://filmtogo.orange.co.uk");
       WebElement LinkText5 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input"));
       LinkText5.sendKeys("Film to go");
       WebElement reportingEnable5 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[8]/input"));
       reportingEnable5.click();
       WebElement reportingCampaign5 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[9]/input"));
       reportingCampaign5.sendKeys("favourites");
       WebElement reportingID5 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[10]/input"));
       reportingID5.sendKeys("header");
       WebElement AddLink5 = driver.findElement(By.xpath(Configuration.Add));
       AddLink5.click();
       Thread.sleep(3000);
       
       WebElement urlText6 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input"));
       urlText6.sendKeys("http://orangeworld.co.uk/p/film/home");
       WebElement LinkText6 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input"));
       LinkText6.sendKeys("Orange wednesday");
       WebElement reportingEnable6 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[8]/input"));
       reportingEnable6.click();
       WebElement reportingCampaign6 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[9]/input"));
       reportingCampaign6.sendKeys("favourites");
       WebElement reportingID6 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[10]/input"));
       reportingID6.sendKeys("header");
       WebElement AddLink6 = driver.findElement(By.xpath(Configuration.Add));
       AddLink6.click();
       Thread.sleep(3000);
       
       WebElement urlText7 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input"));
       urlText7.sendKeys("http://full.link.orangeworld.co.uk/10149/orangecml/svs?srvc=of&appid=ol_hp_nl");
       WebElement LinkText7 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input"));
       LinkText7.sendKeys("Local search");
       WebElement reportingEnable7 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[8]/input"));
       reportingEnable7.click();
       WebElement reportingCampaign7 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[9]/input"));
       reportingCampaign7.sendKeys("favourites");
       WebElement reportingID7 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[10]/input"));
       reportingID7.sendKeys("header");
       WebElement AddLink7 = driver.findElement(By.xpath(Configuration.Add));
       AddLink7.click();
       Thread.sleep(3000);
       
       WebElement urlText8 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input"));
       urlText8.sendKeys("http://full.link.orangeworld.co.uk/10259/orangecml/svs?srvc=trains");
       WebElement LinkText8 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input"));
       LinkText8.sendKeys("Live train times");
       WebElement reportingEnable8 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[8]/input"));
       reportingEnable8.click();
       WebElement reportingCampaign8 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[9]/input"));
       reportingCampaign8.sendKeys("favourites");
       WebElement reportingID8 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[10]/input"));
       reportingID8.sendKeys("header");
       WebElement AddLink8 = driver.findElement(By.xpath(Configuration.Add));
       AddLink8.click();
       Thread.sleep(3000);
       
       WebElement urlText9 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input"));
       urlText9.sendKeys("http://orangeworld.co.uk/p/celebrity/celebrities/");
       WebElement LinkText9 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input"));
       LinkText9.sendKeys("Celebrity gossip");
       WebElement reportingEnable9 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[8]/input"));
       reportingEnable9.click();
       WebElement reportingCampaign9 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[9]/input"));
       reportingCampaign9.sendKeys("favourites");
       WebElement reportingID9 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[10]/input"));
       reportingID9.sendKeys("header");
       WebElement AddLink9 = driver.findElement(By.xpath(Configuration.Add));
       AddLink9.click();
       Thread.sleep(3000);
       
       WebElement urlText10 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input"));
       urlText10.sendKeys("http://orangeworld.co.uk/p/entertainment/home/");
       WebElement LinkText10 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input"));
       LinkText10.sendKeys("Entertainment homepage");
       WebElement reportingEnable10 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[8]/input"));
       reportingEnable10.click();
       WebElement reportingCampaign10 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[9]/input"));
       reportingCampaign10.sendKeys("favourites");
       WebElement reportingID10 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[10]/input"));
       reportingID10.sendKeys("header");
       WebElement AddLink10 = driver.findElement(By.xpath(Configuration.Add));
       AddLink10.click();
       Thread.sleep(3000);
       
       WebElement urlText11 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input"));
       urlText11.sendKeys("http://orangeworld.co.uk/p/cricket/home");
       WebElement LinkText11 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input"));
       LinkText11.sendKeys("Cricket homepage");
       WebElement reportingEnable11 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[8]/input"));
       reportingEnable11.click();
       WebElement reportingCampaign11 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[9]/input"));
       reportingCampaign11.sendKeys("favourites");
       WebElement reportingID11 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[10]/input"));
       reportingID11.sendKeys("header");
       WebElement AddLink11 = driver.findElement(By.xpath(Configuration.Add));
       AddLink11.click();
       Thread.sleep(3000);
       
       WebElement urlText12 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input"));
       urlText12.sendKeys("http://orangeworld.co.uk/p/sport/livescores/");
       WebElement LinkText12 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input"));
       LinkText12.sendKeys("Sport: Live scores");
       WebElement reportingEnable12 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[8]/input"));
       reportingEnable12.click();
       WebElement reportingCampaign12 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[9]/input"));
       reportingCampaign12.sendKeys("favourites");
       WebElement reportingID12 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[10]/input"));
       reportingID12.sendKeys("header");
       WebElement AddLink12 = driver.findElement(By.xpath(Configuration.Add));
       AddLink12.click();
       Thread.sleep(3000);
       
       WebElement urlText13 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input"));
       urlText13.sendKeys("http://orangeworld.co.uk/p/newsandweather/home");
       WebElement LinkText13 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input"));
       LinkText13.sendKeys("News and weather homepage");
       WebElement reportingEnable13 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[8]/input"));
       reportingEnable13.click();
       WebElement reportingCampaign13 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[9]/input"));
       reportingCampaign13.sendKeys("favourites");
       WebElement reportingID13 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[10]/input"));
       reportingID13.sendKeys("header");
       WebElement AddLink13 = driver.findElement(By.xpath(Configuration.Add));
       AddLink13.click();
       Thread.sleep(3000);
       
       
       WebElement urlText14 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input"));
       urlText14.sendKeys("http://orangeworld.co.uk/articleindex/0/?package=general headline&provider=Sky News");
       WebElement LinkText14 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input"));
       LinkText14.sendKeys("Sky News headlines");
       WebElement reportingEnable14 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[8]/input"));
       reportingEnable14.click();
       WebElement reportingCampaign14 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[9]/input"));
       reportingCampaign14.sendKeys("favourites");
       WebElement reportingID14 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[10]/input"));
       reportingID14.sendKeys("header");
       
       
       WebElement saveLinks = driver.findElement(By.xpath(Configuration.Save));
       saveLinks.click();
       Thread.sleep(1000);
       
       
       WebElement FavouriteslastVisited = driver.findElement(By.xpath(Configuration.HL_Favourites_LV));
       FavouriteslastVisited.click();
       Thread.sleep(3000);

       WebElement Link = driver.findElement(By.id(Configuration.InsertMedia)); 

       Select selectList = new Select(Link);
       //select link
       selectList.selectByValue(Configuration.Link);
       
       WebElement AddNewLink = driver.findElement(By.xpath(Configuration.Add));
       AddNewLink.click();
       Thread.sleep(6000);

       WebElement urlText = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input"));
       urlText.sendKeys("http://orangeworld.co.uk/youraccount/manage.wml");
       WebElement YourSubscriptionLink = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input"));
       YourSubscriptionLink.sendKeys("Your Subscription");
       WebElement reportingEnable15 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[8]/input"));
       reportingEnable15.click();
       WebElement reportingCampaign15 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[9]/input"));
       reportingCampaign15.sendKeys("favourites");
       WebElement reportingID15 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[10]/input"));
       reportingID15.sendKeys("header");
       
       WebElement saveLink = driver.findElement(By.xpath(Configuration.Save));
       saveLink.click();         
       
}

}