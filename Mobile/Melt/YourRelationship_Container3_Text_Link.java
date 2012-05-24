package tests.Mobile.Melt;

import org.openqa.selenium.By;
import org.openqa.selenium.iphone.*;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.JavascriptExecutor;
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

public class YourRelationship_Container3_Text_Link {

	public static void main(String[] args) throws Exception {

		FirefoxProfile ffProfile = new FirefoxProfile();
		ffProfile.setPreference("network.http.phishy-userpass-length", 255);
		WebDriver driver = new FirefoxDriver(ffProfile);
	    driver.get((Configuration.baseurl_roaming));

		Thread.sleep(5000);

		WebElement ExpandMobileTree = driver.findElement(By
				.xpath(Configuration.ExpandMobile));
		ExpandMobileTree.click();
		Thread.sleep(5000);

		WebElement ExpandSegmentTree = driver.findElement(By
				.xpath(Configuration.ExpandSegment));
		ExpandSegmentTree.click();
		Thread.sleep(5000);

		WebElement Segment1 = driver.findElement(By
				.xpath(Configuration.MobileSegment));
		Segment1.click();
		Thread.sleep(5000);

		WebElement YourRelationshipPackage = driver.findElement(By
				.xpath(Configuration.YourRelationship));
		YourRelationshipPackage.click();
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
		renamePane6.sendKeys("container 1");
		Thread.sleep(5000);

		WebElement renamePaneTitle6 = driver.findElement(By
				.xpath("//div[@id='contents']/form/ul/li[3]/input"));
		renamePaneTitle6.sendKeys("container 1");
		Thread.sleep(5000);

		WebElement save = driver.findElement(By.xpath(Configuration.Save));
		save.click();
		Thread.sleep(5000);

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

		WebElement Text1 = driver.findElement(By
				.xpath("//div[@class='editFormContainer']//li[4]/input"));
		Text1.sendKeys("Swapables");

		WebElement textarea1 = driver.findElement(By
				.xpath("(//*[@class='mceEditor defaultSkin'])[1]//iframe"));
		String id = textarea1.getAttribute("id");
		final WebDriver frame = driver.switchTo().frame(id);
		final WebElement editorBody = frame.findElement(By.xpath("//*"));
		editorBody.sendKeys("Set up Your ");
		driver.switchTo().defaultContent();

		WebElement Bold = driver.findElement(By
				.xpath("//*[@class='mceIcon mce_bold']"));
		Bold.click();
		WebElement textarea2 = driver.findElement(By
				.xpath("(//*[@class='mceEditor defaultSkin'])[1]//iframe"));
		String id2 = textarea2.getAttribute("id");
		final WebDriver frame2 = driver.switchTo().frame(id2);
		final WebElement editorBody2 = frame2.findElement(By.xpath("//*"));
		editorBody2.sendKeys("Swappables ");
		driver.switchTo().defaultContent();
		Thread.sleep(6000);

		WebElement unBold = driver.findElement(By
				.xpath("//*[@class='mceIcon mce_bold']"));
		unBold.click();
		WebElement textarea3 = driver.findElement(By
				.xpath("(//*[@class='mceEditor defaultSkin'])[1]//iframe"));
		String id3 = textarea3.getAttribute("id");
		final WebDriver frame3 = driver.switchTo().frame(id3);
		final WebElement editorBody3 = frame3.findElement(By.xpath("//*"));
		editorBody3.sendKeys("free on your panther plan");
		driver.switchTo().defaultContent();
		Thread.sleep(6000);

		WebElement save1 = driver.findElement(By.xpath(Configuration.Save));
		save1.click();
		Thread.sleep(5000);

		WebElement Text = driver.findElement(By.id(Configuration.InsertMedia));

		Select selectList_4 = new Select(Text);
		// select link
		selectList_4.selectByValue(Configuration.Text);
		Thread.sleep(6000);

		WebElement AddText = driver.findElement(By.xpath(Configuration.Add));
		AddText.click();
		Thread.sleep(6000);

		WebElement textarea4 = driver.findElement(By
				.xpath("(//*[@class='mceEditor defaultSkin'])[1]//iframe"));
		String id4 = textarea4.getAttribute("id");
		final WebDriver frame4 = driver.switchTo().frame(id4);
		final WebElement editorBody4 = frame4.findElement(By.xpath("//*"));
		editorBody4.sendKeys("hello, welcome to ");
		driver.switchTo().defaultContent();

		WebElement Bold1 = driver.findElement(By
				.xpath("//*[@class='mceIcon mce_bold']"));
		Bold1.click();

		WebElement textarea5 = driver.findElement(By
				.xpath("(//*[@class='mceEditor defaultSkin'])[1]//iframe"));
		String id5 = textarea5.getAttribute("id");
		final WebDriver frame5 = driver.switchTo().frame(id5);
		final WebElement editorBody5 = frame5.findElement(By.xpath("//*"));
		editorBody5.sendKeys("Orange");
		driver.switchTo().defaultContent();

		WebElement save2 = driver.findElement(By.xpath(Configuration.Save));
		save2.click();
		Thread.sleep(5000);

	}

}