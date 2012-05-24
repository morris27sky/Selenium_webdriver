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

public class ContentExplorer {

	public static void main(String[] args) throws Exception {

		FirefoxProfile ffProfile = new FirefoxProfile();
		ffProfile.setPreference("network.http.phishy-userpass-length", 255);
		WebDriver driver = new FirefoxDriver(ffProfile);
	       driver.get(Configuration.baseurl);
		Thread.sleep(7000);

		WebElement ExpandMobileTree = driver.findElement(By
				.xpath(Configuration.ExpandMobile));
		ExpandMobileTree.click();
		Thread.sleep(7000);

		WebElement ExpandSegmentTree = driver.findElement(By
				.xpath(Configuration.ExpandSegment));
		ExpandSegmentTree.click();
		Thread.sleep(7000);

		WebElement Segment1 = driver.findElement(By
				.xpath(Configuration.MobileSegment));
		Segment1.click();
		Thread.sleep(7000);

		WebElement ContentExplorer = driver.findElement(By
				.xpath(Configuration.ContentExplorer));
		ContentExplorer.click();
		Thread.sleep(7000);

		WebElement insert = driver.findElement(By
				.xpath(Configuration.InsertPackage));
		insert.click();
		Thread.sleep(8000);

		WebElement CreateNewPackage = driver.findElement(By
				.xpath(Configuration.CreateNewPackage));
		CreateNewPackage.click();
		Thread.sleep(6000);

		WebElement EditPackage = driver.findElement(By
				.xpath(Configuration.NewPackage));
		EditPackage.click();
		Thread.sleep(6000);

		WebElement renamePane6 = driver.findElement(By
				.xpath("//div[@id='contents']/form/ul/li[2]/input"));
		renamePane6.clear();
		renamePane6.sendKeys("Content explorer package 2");
		Thread.sleep(7000);

		WebElement renamePaneTitle6 = driver.findElement(By
				.xpath("//div[@id='contents']/form/ul/li[3]/input"));
		renamePaneTitle6.sendKeys("Content explorer package 2");
		Thread.sleep(7000);

		WebElement save = driver.findElement(By.xpath(Configuration.Save));
		save.click();
		Thread.sleep(7000);

		WebElement Link1 = driver.findElement(By.id(Configuration.InsertMedia));

		Select selectList1 = new Select(Link1);
		// select link
		selectList1.selectByValue(Configuration.LinkWithImage);

		WebElement AddLink = driver.findElement(By.xpath(Configuration.Add));
		AddLink.click();
		Thread.sleep(6000);

		WebElement urlText4 = driver.findElement(By
				.xpath("//div[@class='editFormContainer']//li[3]/input"));
		urlText4.sendKeys("http://www.google.co.uk");

		WebElement Title = driver.findElement(By
				.xpath("//div[@class='editFormContainer']//li[5]/input"));
		Title.sendKeys("Tv");
		Thread.sleep(6000);

		WebElement textarea1 = driver.findElement(By
				.xpath("(//*[@class='mceEditor defaultSkin'][1]//iframe"));
		String id = textarea1.getAttribute("id");
		final WebDriver frame = driver.switchTo().frame(id);
		final WebElement editorBody = frame.findElement(By.xpath("//*"));
		editorBody.sendKeys("Take a sneak peak at todays tv show in");
		driver.switchTo().defaultContent();

		WebElement browse = driver.findElement(By
				.xpath("//input[@value='Browse...']"));
		browse.click();
		Thread.sleep(6000);

		WebElement searchInpute = driver.findElement(By
				.xpath("//*[@id='searchInput']"));
		searchInpute.sendKeys("320manchester");
		Thread.sleep(8000);

		WebElement checkbox = driver.findElement(By
				.xpath(Configuration.CheckBox));
		checkbox.click();
		Thread.sleep(7000);

		WebElement OK = driver.findElement(By.xpath(Configuration.OK));
		OK.click();
		Thread.sleep(7000);

		WebElement saveItem1 = driver.findElement(By.xpath(Configuration.Save));
		saveItem1.click();
		Thread.sleep(7000);

		WebElement Link2 = driver.findElement(By.id(Configuration.InsertMedia));

		Select selectList2 = new Select(Link2);
		// select link
		selectList2.selectByValue(Configuration.Link);

		WebElement AddLink1 = driver.findElement(By.xpath(Configuration.Add));
		AddLink1.click();
		Thread.sleep(6000);

		WebElement urlText5 = driver.findElement(By
				.xpath("//div[@class='editFormContainer']//li[3]/input"));
		urlText5.sendKeys("http://www.google.co.uk");

		WebElement Title1 = driver.findElement(By
				.xpath("//div[@class='editFormContainer']//li[4]/input"));
		Title1.sendKeys("Test1");

		WebElement saveItem2 = driver.findElement(By.xpath(Configuration.Save));
		saveItem2.click();
		Thread.sleep(7000);

		WebElement FirstLink = driver.findElement(By
				.id(Configuration.InsertMedia));

		Select selectList13 = new Select(FirstLink);
		// select link
		selectList13.selectByValue(Configuration.Link);

		WebElement AddLink8 = driver.findElement(By.xpath(Configuration.Add));
		AddLink8.click();
		Thread.sleep(6000);

		WebElement urlText6 = driver.findElement(By
				.xpath("//div[@class='editFormContainer']//li[3]/input"));
		urlText6.sendKeys("http://www.google.co.uk");

		WebElement Title2 = driver.findElement(By
				.xpath("//div[@class='editFormContainer']//li[4]/input"));
		Title2.sendKeys("Test2");

		WebElement saveItem3 = driver.findElement(By.xpath(Configuration.Save));
		saveItem3.click();
		Thread.sleep(7000);

		// /////////////////////////////////////////PACKAGE
		// 3//////////////////////////////////////

		WebElement ContentExplorerTree = driver.findElement(By
				.xpath(Configuration.ContentExplorer));
		ContentExplorerTree.click();
		Thread.sleep(7000);

		WebElement insert1 = driver.findElement(By
				.xpath(Configuration.InsertPackage));
		insert1.click();
		Thread.sleep(8000);

		WebElement CreateNewPackage1 = driver.findElement(By
				.xpath(Configuration.CreateNewPackage));
		CreateNewPackage1.click();
		Thread.sleep(6000);

		WebElement EditPackage1 = driver.findElement(By
				.xpath(Configuration.NewPackage));
		EditPackage1.click();
		Thread.sleep(6000);

		WebElement renamePackage1 = driver.findElement(By
				.xpath("//div[@id='contents']/form/ul/li[2]/input"));
		renamePackage1.clear();
		renamePackage1.sendKeys("Content explorer package 3");
		Thread.sleep(7000);

		WebElement renamePackage2 = driver.findElement(By
				.xpath("//div[@id='contents']/form/ul/li[3]/input"));
		renamePackage2.sendKeys("Content explorer package 3");
		Thread.sleep(7000);

		WebElement save2 = driver.findElement(By.xpath(Configuration.Save));
		save2.click();
		Thread.sleep(7000);

		WebElement Link3 = driver.findElement(By.id(Configuration.InsertMedia));

		Select selectList8 = new Select(Link3);
		// select link
		selectList8.selectByValue(Configuration.FeedVideoMostRecent);
		Thread.sleep(6000);

		WebElement AddLink2 = driver.findElement(By.xpath(Configuration.Add));
		AddLink2.click();
		Thread.sleep(6000);

		WebElement Link4 = driver.findElement(By
				.xpath(Configuration.InsertFeed));
		Select selectList3 = new Select(Link4);
		selectList3.selectByValue(Configuration.CelebrityRoundup);

		WebElement HowMany = driver.findElement(By
				.xpath("//div[@class='editFormContainer']//li[4]/input"));
		HowMany.sendKeys("1");
		Thread.sleep(7000);

		WebElement Link = driver.findElement(By.id(Configuration.InsertMedia));

		Select selectList_1 = new Select(Link);
		// select link
		selectList_1.selectByValue(Configuration.Link);
		Thread.sleep(6000);

		WebElement AddLink_1 = driver.findElement(By.xpath(Configuration.Add));
		AddLink_1.click();
		Thread.sleep(6000);

		WebElement URL = driver.findElement(By
				.xpath("//div[@class='editFormContainer']//li[3]/input"));
		URL.sendKeys("http://www.google.co.uk");

		WebElement Text = driver.findElement(By
				.xpath("//div[@class='editFormContainer']//li[4]/input"));
		Text.sendKeys("Celebs");

		WebElement saveItem7 = driver.findElement(By.xpath(Configuration.Save));
		saveItem7.click();
		Thread.sleep(7000);

		// /////////////////////////////////////////PACKAGE
		// 4//////////////////////////////////////

		WebElement ContentExplorerTree1 = driver.findElement(By
				.xpath(Configuration.ContentExplorer));
		ContentExplorerTree1.click();
		Thread.sleep(7000);

		WebElement insert2 = driver.findElement(By
				.xpath(Configuration.InsertPackage));
		insert2.click();
		Thread.sleep(8000);

		WebElement CreateNewPackage2 = driver.findElement(By
				.xpath(Configuration.CreateNewPackage));
		CreateNewPackage2.click();
		Thread.sleep(6000);

		WebElement EditPackage2 = driver.findElement(By
				.xpath(Configuration.NewPackage));
		EditPackage2.click();
		Thread.sleep(6000);

		WebElement renamePackage3 = driver.findElement(By
				.xpath("//div[@id='contents']/form/ul/li[2]/input"));
		renamePackage3.clear();
		renamePackage3.sendKeys("Content explorer package 4");
		Thread.sleep(7000);

		WebElement renamePackage4 = driver.findElement(By
				.xpath("//div[@id='contents']/form/ul/li[3]/input"));
		renamePackage4.sendKeys("Content explorer package 4");
		Thread.sleep(7000);

		WebElement save3 = driver.findElement(By.xpath(Configuration.Save));
		save3.click();
		Thread.sleep(7000);

		WebElement Link5 = driver.findElement(By.id(Configuration.InsertMedia));

		Select selectListeight = new Select(Link5);
		// select link
		selectListeight.selectByValue(Configuration.LatestFeed);
		Thread.sleep(6000);

		WebElement AddLink3 = driver.findElement(By.xpath(Configuration.Add));
		AddLink3.click();
		Thread.sleep(6000);

		WebElement Link6 = driver.findElement(By
				.xpath(Configuration.InsertFeed));
		Select selectList4 = new Select(Link6);
		selectList4.selectByValue(Configuration.News);

		WebElement HowMany1 = driver.findElement(By
				.xpath("//div[@class='editFormContainer']//li[5]/input"));
		HowMany1.sendKeys("1");
		Thread.sleep(7000);

		WebElement Link7 = driver.findElement(By.id(Configuration.InsertMedia));

		Select selectList_2 = new Select(Link7);
		// select link
		selectList_2.selectByValue(Configuration.Link);
		Thread.sleep(6000);

		WebElement AddLink_2 = driver.findElement(By.xpath(Configuration.Add));
		AddLink_2.click();
		Thread.sleep(6000);

		WebElement URL1 = driver.findElement(By
				.xpath("//div[@class='editFormContainer']//li[3]/input"));
		URL1.sendKeys("http://www.google.co.uk");

		WebElement Text1 = driver.findElement(By
				.xpath("//div[@class='editFormContainer']//li[4]/input"));
		Text1.sendKeys("News");

		WebElement saveItem4 = driver.findElement(By.xpath(Configuration.Save));
		saveItem4.click();
		Thread.sleep(7000);

		// /////////////////////////////////////////PACKAGE
		// 5//////////////////////////////////////

		WebElement ContentExplorerTree2 = driver.findElement(By
				.xpath(Configuration.ContentExplorer));
		ContentExplorerTree2.click();
		Thread.sleep(7000);

		WebElement insert3 = driver.findElement(By
				.xpath(Configuration.InsertPackage));
		insert3.click();
		Thread.sleep(8000);

		WebElement CreateNewPackage3 = driver.findElement(By
				.xpath(Configuration.CreateNewPackage));
		CreateNewPackage3.click();
		Thread.sleep(6000);

		WebElement EditPackage3 = driver.findElement(By
				.xpath(Configuration.NewPackage));
		EditPackage3.click();
		Thread.sleep(6000);

		WebElement renamePackage6 = driver.findElement(By
				.xpath("//div[@id='contents']/form/ul/li[2]/input"));
		renamePackage6.clear();
		renamePackage6.sendKeys("Content explorer package 5");
		Thread.sleep(7000);

		WebElement renamePackage5 = driver.findElement(By
				.xpath("//div[@id='contents']/form/ul/li[3]/input"));
		renamePackage5.sendKeys("Content explorer package 5");
		Thread.sleep(7000);

		WebElement save4 = driver.findElement(By.xpath(Configuration.Save));
		save4.click();
		Thread.sleep(7000);

		WebElement Link_1 = driver
				.findElement(By.id(Configuration.InsertMedia));

		Select selectList_8 = new Select(Link_1);
		// select link
		selectList_8.selectByValue(Configuration.LatestFeed);
		Thread.sleep(6000);

		WebElement AddLink_3 = driver.findElement(By.xpath(Configuration.Add));
		AddLink_3.click();
		Thread.sleep(6000);

		WebElement Link_6 = driver.findElement(By
				.xpath(Configuration.InsertFeed));
		Select selectList_4 = new Select(Link_6);
		selectList_4.selectByValue(Configuration.Sports);

		WebElement HowMany_1 = driver.findElement(By
				.xpath("//div[@class='editFormContainer']//li[5]/input"));
		HowMany_1.sendKeys("1");
		Thread.sleep(7000);

		WebElement Link_7 = driver
				.findElement(By.id(Configuration.InsertMedia));

		Select selectList_3 = new Select(Link_7);
		// select link
		selectList_3.selectByValue(Configuration.Link);
		Thread.sleep(6000);

		WebElement AddLink4 = driver.findElement(By.xpath(Configuration.Add));
		AddLink4.click();
		Thread.sleep(6000);

		WebElement URL2 = driver.findElement(By
				.xpath("//div[@class='editFormContainer']//li[3]/input"));
		URL2.sendKeys("http://www.google.co.uk");

		WebElement Text2 = driver.findElement(By
				.xpath("//div[@class='editFormContainer']//li[4]/input"));
		Text2.sendKeys("Sports");

		WebElement saveItem5 = driver.findElement(By.xpath(Configuration.Save));
		saveItem5.click();
		Thread.sleep(7000);

		// /////////////////////////////////////////PACKAGE
		// 6//////////////////////////////////////

		WebElement ContentExplorerTree3 = driver.findElement(By
				.xpath(Configuration.ContentExplorer));
		ContentExplorerTree3.click();
		Thread.sleep(7000);

		WebElement insert4 = driver.findElement(By
				.xpath(Configuration.InsertPackage));
		insert4.click();
		Thread.sleep(8000);

		WebElement CreateNewPackage4 = driver.findElement(By
				.xpath(Configuration.CreateNewPackage));
		CreateNewPackage4.click();
		Thread.sleep(6000);

		WebElement EditPackage4 = driver.findElement(By
				.xpath(Configuration.NewPackage));
		EditPackage4.click();
		Thread.sleep(6000);

		WebElement renamePackage7 = driver.findElement(By
				.xpath("//div[@id='contents']/form/ul/li[2]/input"));
		renamePackage7.clear();
		renamePackage7.sendKeys("Content explorer package 6");
		Thread.sleep(7000);

		WebElement renamePackage_7 = driver.findElement(By
				.xpath("//div[@id='contents']/form/ul/li[3]/input"));
		renamePackage_7.sendKeys("Content explorer package 6");
		Thread.sleep(7000);

		WebElement save5 = driver.findElement(By.xpath(Configuration.Save));
		save5.click();
		Thread.sleep(7000);

		WebElement Link_2 = driver
				.findElement(By.id(Configuration.InsertMedia));

		Select selectList9 = new Select(Link_2);
		// select link
		selectList9.selectByValue(Configuration.LatestFeed);
		Thread.sleep(6000);

		WebElement AddLink_4 = driver.findElement(By.xpath(Configuration.Add));
		AddLink_4.click();
		Thread.sleep(6000);

		WebElement Link_8 = driver.findElement(By
				.xpath(Configuration.InsertFeed));
		Select selectList_5 = new Select(Link_8);
		selectList_5.selectByValue(Configuration.sports_racing);

		WebElement HowMany3 = driver.findElement(By
				.xpath("//div[@class='editFormContainer']//li[5]/input"));
		HowMany3.sendKeys("1");
		Thread.sleep(7000);

		WebElement Link8 = driver.findElement(By.id(Configuration.InsertMedia));

		Select selectList5 = new Select(Link8);
		// select link
		selectList5.selectByValue(Configuration.Link);
		Thread.sleep(6000);

		WebElement AddLink5 = driver.findElement(By.xpath(Configuration.Add));
		AddLink5.click();
		Thread.sleep(6000);

		WebElement URL3 = driver.findElement(By
				.xpath("//div[@class='editFormContainer']//li[3]/input"));
		URL3.sendKeys("http://www.google.co.uk");

		WebElement Text3 = driver.findElement(By
				.xpath("//div[@class='editFormContainer']//li[4]/input"));
		Text3.sendKeys("Film");

		WebElement saveItem6 = driver.findElement(By.xpath(Configuration.Save));
		saveItem6.click();
		Thread.sleep(7000);

		// /////////////////////////////////////////PACKAGE
		// 7//////////////////////////////////////

		WebElement ContentExplorerTree4 = driver.findElement(By
				.xpath(Configuration.ContentExplorer));
		ContentExplorerTree4.click();
		Thread.sleep(7000);

		WebElement insert5 = driver.findElement(By
				.xpath(Configuration.InsertPackage));
		insert5.click();
		Thread.sleep(8000);

		WebElement CreateNewPackage5 = driver.findElement(By
				.xpath(Configuration.CreateNewPackage));
		CreateNewPackage5.click();
		Thread.sleep(6000);

		WebElement EditPackage5 = driver.findElement(By
				.xpath(Configuration.NewPackage));
		EditPackage5.click();
		Thread.sleep(6000);

		WebElement renamePackage8 = driver.findElement(By
				.xpath("//div[@id='contents']/form/ul/li[2]/input"));
		renamePackage8.clear();
		renamePackage8.sendKeys("Content explorer package 7");
		Thread.sleep(7000);

		WebElement renamePackage9 = driver.findElement(By
				.xpath("//div[@id='contents']/form/ul/li[3]/input"));
		renamePackage9.sendKeys("Content explorer package 7");
		Thread.sleep(7000);

		WebElement save6 = driver.findElement(By.xpath(Configuration.Save));
		save6.click();
		Thread.sleep(7000);

		WebElement Link_3 = driver
				.findElement(By.id(Configuration.InsertMedia));

		Select selectList10 = new Select(Link_3);
		// select link
		selectList10.selectByValue(Configuration.LatestFeed);
		Thread.sleep(6000);

		WebElement AddLink_5 = driver.findElement(By.xpath(Configuration.Add));
		AddLink_5.click();
		Thread.sleep(6000);

		WebElement Link_9 = driver.findElement(By
				.xpath(Configuration.InsertFeed));
		Select selectList_6 = new Select(Link_9);
		selectList_6.selectByValue(Configuration.sports_snooker);

		WebElement HowMany4 = driver.findElement(By
				.xpath("//div[@class='editFormContainer']//li[5]/input"));
		HowMany4.sendKeys("1");
		Thread.sleep(7000);

		WebElement Link9 = driver.findElement(By.id(Configuration.InsertMedia));

		Select selectList6 = new Select(Link9);
		// select link
		selectList6.selectByValue(Configuration.Link);
		Thread.sleep(6000);

		WebElement AddLink6 = driver.findElement(By.xpath(Configuration.Add));
		AddLink6.click();
		Thread.sleep(6000);

		WebElement URL4 = driver.findElement(By
				.xpath("//div[@class='editFormContainer']//li[3]/input"));
		URL4.sendKeys("http://www.google.co.uk");

		WebElement Text4 = driver.findElement(By
				.xpath("//div[@class='editFormContainer']//li[4]/input"));
		Text4.sendKeys("Film");

		WebElement saveItem10 = driver
				.findElement(By.xpath(Configuration.Save));
		saveItem10.click();
		Thread.sleep(7000);

		// /////////////////////////////////////////PACKAGE
		// 8//////////////////////////////////////

		WebElement ContentExplorerTree5 = driver.findElement(By
				.xpath(Configuration.ContentExplorer));
		ContentExplorerTree5.click();
		Thread.sleep(7000);

		WebElement insert6 = driver.findElement(By
				.xpath(Configuration.InsertPackage));
		insert6.click();
		Thread.sleep(8000);

		WebElement CreateNewPackage6 = driver.findElement(By
				.xpath(Configuration.CreateNewPackage));
		CreateNewPackage6.click();
		Thread.sleep(6000);

		WebElement EditPackage7 = driver.findElement(By
				.xpath(Configuration.NewPackage));
		EditPackage7.click();
		Thread.sleep(6000);

		WebElement renamePackage_9 = driver.findElement(By
				.xpath("//div[@id='contents']/form/ul/li[2]/input"));
		renamePackage_9.clear();
		renamePackage_9.sendKeys("Content explorer package 8");
		Thread.sleep(7000);

		WebElement renamePackage10 = driver.findElement(By
				.xpath("//div[@id='contents']/form/ul/li[3]/input"));
		renamePackage10.sendKeys("Content explorer package 8");
		Thread.sleep(7000);

		WebElement save7 = driver.findElement(By.xpath(Configuration.Save));
		save7.click();
		Thread.sleep(7000);

		WebElement Link_4 = driver
				.findElement(By.id(Configuration.InsertMedia));

		Select selectList11 = new Select(Link_4);
		// select link
		selectList11.selectByValue(Configuration.FeedArticleHeadlinePackage);
		Thread.sleep(6000);

		WebElement AddLink_6 = driver.findElement(By.xpath(Configuration.Add));
		AddLink_6.click();
		Thread.sleep(6000);

		WebElement HeadlinePackage = driver.findElement(By
				.xpath("//div[@class='editFormContainer']//li[3]/input"));
		HeadlinePackage.sendKeys("general headline");
		Thread.sleep(2000);

		WebElement HowMany5 = driver.findElement(By
				.xpath("//div[@class='editFormContainer']//li[4]/input"));
		HowMany5.sendKeys("1");
		Thread.sleep(7000);

		WebElement Link10 = driver
				.findElement(By.id(Configuration.InsertMedia));

		Select selectList7 = new Select(Link10);
		// select link
		selectList7.selectByValue(Configuration.Link);
		Thread.sleep(6000);

		WebElement AddLink7 = driver.findElement(By.xpath(Configuration.Add));
		AddLink7.click();
		Thread.sleep(6000);

		WebElement URL5 = driver.findElement(By
				.xpath("//div[@class='editFormContainer']//li[3]/input"));
		URL5.sendKeys("http://www.google.co.uk");

		WebElement Text5 = driver.findElement(By
				.xpath("//div[@class='editFormContainer']//li[4]/input"));
		Text5.sendKeys("Headlines");

		WebElement saveItem8 = driver.findElement(By.xpath(Configuration.Save));
		saveItem8.click();
		Thread.sleep(7000);

		// /////////////////////////////////////////PACKAGE
		// 9//////////////////////////////////////

		WebElement ContentExplorerTree6 = driver.findElement(By
				.xpath(Configuration.ContentExplorer));
		ContentExplorerTree6.click();
		Thread.sleep(7000);

		WebElement insert7 = driver.findElement(By
				.xpath(Configuration.InsertPackage));
		insert7.click();
		Thread.sleep(8000);

		WebElement CreateNewPackage7 = driver.findElement(By
				.xpath(Configuration.CreateNewPackage));
		CreateNewPackage7.click();
		Thread.sleep(6000);

		WebElement EditPackage8 = driver.findElement(By
				.xpath(Configuration.NewPackage));
		EditPackage8.click();
		Thread.sleep(6000);

		WebElement renamePackage_10 = driver.findElement(By
				.xpath("//div[@id='contents']/form/ul/li[2]/input"));
		renamePackage_10.clear();
		renamePackage_10.sendKeys("Content explorer package 9");
		Thread.sleep(7000);

		WebElement renamePackage11 = driver.findElement(By
				.xpath("//div[@id='contents']/form/ul/li[3]/input"));
		renamePackage11.sendKeys("Content explorer package 9");
		Thread.sleep(7000);

		WebElement save8 = driver.findElement(By.xpath(Configuration.Save));
		save8.click();
		Thread.sleep(7000);

		WebElement Link_5 = driver
				.findElement(By.id(Configuration.InsertMedia));

		Select selectList12 = new Select(Link_5);
		// select link
		selectList12.selectByValue(Configuration.FeedArticleHeadlinePackage);
		Thread.sleep(6000);

		WebElement AddLink_7 = driver.findElement(By.xpath(Configuration.Add));
		AddLink_7.click();
		Thread.sleep(6000);

		WebElement HeadlinePackage1 = driver.findElement(By
				.xpath("//div[@class='editFormContainer']//li[3]/input"));
		HeadlinePackage1.sendKeys("general headline");
		Thread.sleep(2000);

		WebElement HowMany6 = driver.findElement(By
				.xpath("//div[@class='editFormContainer']//li[4]/input"));
		HowMany6.sendKeys("1");
		Thread.sleep(2000);

		WebElement Link11 = driver
				.findElement(By.id(Configuration.InsertMedia));

		Select selectList14 = new Select(Link11);
		// select link
		selectList14.selectByValue(Configuration.Link);
		Thread.sleep(6000);

		WebElement AddLink15 = driver.findElement(By.xpath(Configuration.Add));
		AddLink15.click();
		Thread.sleep(6000);

		WebElement URL6 = driver.findElement(By
				.xpath("//div[@class='editFormContainer']//li[3]/input"));
		URL6.sendKeys("http://www.google.co.uk");

		WebElement Text6 = driver.findElement(By
				.xpath("//div[@class='editFormContainer']//li[4]/input"));
		Text6.sendKeys("Social");

		WebElement saveItem9 = driver.findElement(By.xpath(Configuration.Save));
		saveItem9.click();
		Thread.sleep(7000);

		driver.findElement(By.xpath(Configuration.Publish));
	    driver.findElement(By.xpath(Configuration.PublishAll));
	    
	}
}