package tests.Mobile.Melt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.ui.Select;

import tests.Melt.verification.New.Configuration;

public class Header_Search {

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
	       
	       WebElement insert = driver.findElement(By.xpath(Configuration.InsertPackage));
	       insert.click();
	       Thread.sleep(8000);
	       
	       WebElement CreateNewPackage = driver.findElement(By.xpath(Configuration.CreateNewPackage));
	       CreateNewPackage.click();
	       Thread.sleep(6000);
	       
	       WebElement EditPackage = driver.findElement(By.xpath(Configuration.NewPackage));
	       EditPackage.click();
	       Thread.sleep(6000);
	       
	       WebElement renameSearchPaneName = driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[2]/input"));
	       renameSearchPaneName.clear();
	       renameSearchPaneName.sendKeys("search1");
	       Thread.sleep(100);
	       
	       WebElement renameSearchPaneTitle = driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[3]/input"));
	       renameSearchPaneTitle.sendKeys("search1");
	       Thread.sleep(100);
	       
	       WebElement ContentTypeHint_1 = driver.findElement(By.xpath(Configuration.ContentTypeHint)); 

	       Select selectBoxControlledSearch = new Select(ContentTypeHint_1);

	       selectBoxControlledSearch.selectByValue(Configuration.Search_hint);
	       Thread.sleep(6000);
	       
	       WebElement saveHeader = driver.findElement(By.xpath(Configuration.Save));
	       saveHeader.click();
	       Thread.sleep(3000);
	   }
}
