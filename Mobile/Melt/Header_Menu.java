package tests.Mobile.Melt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.ui.Select;

import tests.Melt.verification.New.Configuration;

public class Header_Menu {

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
	       
	       WebElement Menu = driver.findElement(By.xpath(Configuration.Menu));
	       Menu.click();
	       Thread.sleep(6000);
	       
	       WebElement ContentTypeHint_1 = driver.findElement(By.xpath(Configuration.ContentTypeHint)); 

	       Select selectBoxControlledSearch = new Select(ContentTypeHint_1);

	       selectBoxControlledSearch.selectByValue(Configuration.Menu_hint);
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
	       
	       WebElement renamePane6 = driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[2]/input"));
	       renamePane6.clear();
	       renamePane6.sendKeys("Touch header - Menu - sport section");
	       Thread.sleep(100);
	       
	       WebElement renamePaneTitle6 = driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[3]/input"));
	       renamePaneTitle6.sendKeys("sport");
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
	       urlText1.sendKeys("http://orangeworld.co.uk/p/cricket/home");
	       WebElement LinkText1 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input"));
	       LinkText1.sendKeys("cricket");
	       WebElement reportingEnable1 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[8]/input"));
	       reportingEnable1.click();
	       WebElement reportingCampaign1 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[9]/input"));
	       reportingCampaign1.sendKeys("menu");
	       WebElement reportingID1 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[10]/input"));
	       reportingID1.sendKeys("header");
	       WebElement AddLink1 = driver.findElement(By.xpath(Configuration.Add));
	       AddLink1.click();
	       Thread.sleep(3000);
	     
	       WebElement urlText2 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input"));
	       urlText2.sendKeys("http://orangeworld.co.uk/p/sportheadlines/home");
	       WebElement LinkText2 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input"));
	       LinkText2.sendKeys("sport headlines");
	       WebElement reportingEnable2 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[8]/input"));
	       reportingEnable2.click();
	       WebElement reportingCampaign2 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[9]/input"));
	       reportingCampaign2.sendKeys("menu");
	       WebElement reportingID2 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[10]/input"));
	       reportingID2.sendKeys("header");
	       WebElement AddLink2 = driver.findElement(By.xpath(Configuration.Add));
	       AddLink2.click();
	       Thread.sleep(3000);
	       
	       WebElement urlText3 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input"));
	       urlText3.sendKeys("http://orangeworld.co.uk/p/sport/livescores");
	       WebElement LinkText3 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input"));
	       LinkText3.sendKeys("live scores");
	       WebElement reportingEnable3 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[8]/input"));
	       reportingEnable3.click();
	       WebElement reportingCampaign3 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[9]/input"));
	       reportingCampaign3.sendKeys("menu");
	       WebElement reportingID3 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[10]/input"));
	       reportingID3.sendKeys("header");
	       WebElement AddLink3 = driver.findElement(By.xpath(Configuration.Add));
	       AddLink3.click();
	       Thread.sleep(3000);
	       
	       WebElement urlText4 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input"));
	       urlText4.sendKeys("http://orangeworld.co.uk/p/football/home");
	       WebElement LinkText4 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input"));
	       LinkText4.sendKeys("football homepage");
	       WebElement reportingEnable4 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[8]/input"));
	       reportingEnable4.click();
	       WebElement reportingCampaign4 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[9]/input"));
	       reportingCampaign4.sendKeys("menu");
	       WebElement reportingID4 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[10]/input"));
	       reportingID4.sendKeys("header");
	       WebElement AddLink4 = driver.findElement(By.xpath(Configuration.Add));
	       AddLink4.click();
	       Thread.sleep(3000);
	       
	       WebElement urlText5 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input"));
	       urlText5.sendKeys("http://orangeworld.co.uk/p/sport/home");
	       WebElement LinkText5 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input"));
	       LinkText5.sendKeys("sports homepage");
	       WebElement reportingEnable5 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[8]/input"));
	       reportingEnable5.click();
	       WebElement reportingCampaign5 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[9]/input"));
	       reportingCampaign5.sendKeys("menu");
	       WebElement reportingID5 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[10]/input"));
	       reportingID5.sendKeys("header");
	       WebElement AddLink5 = driver.findElement(By.xpath(Configuration.Add));
	       AddLink5.click();
	       Thread.sleep(3000);

	       WebElement saveSportsLinks = driver.findElement(By.xpath(Configuration.Save));
	       saveSportsLinks.click();
	       Thread.sleep(1000);
	       
	       WebElement BackToMenu = driver.findElement(By.xpath(Configuration.HL_Favourites_LV));
	       BackToMenu.click();
	       Thread.sleep(3000);
	       
	       WebElement Menu1 = driver.findElement(By.xpath(Configuration.Menu));
	       Menu1.click();
	       Thread.sleep(6000);
	       
	       WebElement insert1 = driver.findElement(By.xpath(Configuration.InsertPackage));
	       insert1.click();
	       Thread.sleep(8000);
	       
	       WebElement CreateNewPackage1 = driver.findElement(By.xpath(Configuration.CreateNewPackage));
	       CreateNewPackage1.click();
	       Thread.sleep(6000);
	       
	       WebElement EditPackage1 = driver.findElement(By.xpath(Configuration.NewPackage));
	       EditPackage1.click();
	       Thread.sleep(6000);
	       
	       WebElement renamePane1 = driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[2]/input"));
	       renamePane1.clear();
	       renamePane1.sendKeys("Touch header - Menu - news and weather section");
	       Thread.sleep(100);
	       
	       WebElement renamePaneTitle1 = driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[3]/input"));
	       renamePaneTitle1.sendKeys("news & weather");
	       Thread.sleep(100);
	       
	       WebElement saveNews = driver.findElement(By.xpath(Configuration.Save));
	       saveNews.click();
	       Thread.sleep(1000);

	       WebElement urlText6 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input"));
	       urlText6.sendKeys("http://orangeworld.co.uk/p/gambling/lotto_cashgames");
	       WebElement LinkText6 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input"));
	       LinkText6.sendKeys("lottery results");
	       WebElement reportingEnable6 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[8]/input"));
	       reportingEnable6.click();
	       WebElement reportingCampaign6 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[9]/input"));
	       reportingCampaign6.sendKeys("menu");
	       WebElement reportingID6 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[10]/input"));
	       reportingID6.sendKeys("header");
	       WebElement AddLink6 = driver.findElement(By.xpath(Configuration.Add));
	       AddLink6.click();
	       Thread.sleep(3000);       
	       
	       WebElement urlText7 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input"));
	       urlText7.sendKeys("http://orangeworld.co.uk/p/newsandweather/weather");
	       WebElement LinkText7 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input"));
	       LinkText7.sendKeys("weather forecast");
	       WebElement reportingEnable7 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[8]/input"));
	       reportingEnable7.click();
	       WebElement reportingCampaign7 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[9]/input"));
	       reportingCampaign7.sendKeys("menu");
	       WebElement reportingID7 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[10]/input"));
	       reportingID7.sendKeys("header");
	       WebElement AddLink7 = driver.findElement(By.xpath(Configuration.Add));
	       AddLink7.click();
	       Thread.sleep(3000);

	       WebElement urlText8 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input"));
	       urlText8.sendKeys("http://orangeworld.co.uk/articleindex/0/?package=general headline&provider=Sky News");
	       WebElement LinkText8 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input"));
	       LinkText8.sendKeys("Sky News headlines");
	       WebElement reportingEnable8 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[8]/input"));
	       reportingEnable8.click();
	       WebElement reportingCampaign8 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[9]/input"));
	       reportingCampaign8.sendKeys("menu");
	       WebElement reportingID8 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[10]/input"));
	       reportingID8.sendKeys("header");
	       WebElement AddLink8 = driver.findElement(By.xpath(Configuration.Add));
	       AddLink8.click();
	       Thread.sleep(3000);
       
	       WebElement urlText9 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input"));
	       urlText9.sendKeys("http://orangeworld.co.uk/p/newsandweather/home");
	       WebElement LinkText9 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input"));
	       LinkText9.sendKeys("news & weather homepage");
	       WebElement reportingEnable9 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[8]/input"));
	       reportingEnable9.click();
	       WebElement reportingCampaign9 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[9]/input"));
	       reportingCampaign9.sendKeys("menu");
	       WebElement reportingID9 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[10]/input"));
	       reportingID9.sendKeys("header");
	       WebElement AddLink9 = driver.findElement(By.xpath(Configuration.Add));
	       AddLink9.click();
	       Thread.sleep(3000);
	       
	       WebElement save2 = driver.findElement(By.xpath(Configuration.Save));
	       save2.click();
	       Thread.sleep(1000);
}
	   }