package tests.Melt.verification.New;

import net.sourceforge.htmlunit.corejs.javascript.JavaScriptException;
import org.openqa.selenium.By;
import org.openqa.selenium.iphone.*;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
//import org.openqa.selenium.android.AndroidDriver;
import java.lang.Thread;
import org.junit.Assert;
import org.junit.Test;
//import junit.framework.TestCase;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchWindowException;
import java.util.Set;
import org.openqa.selenium.browserlaunchers.locators.*;
import org.openqa.selenium.WebDriverBackedSelenium;


import tests.Melt.verification.New.Configuration;

public class Context_Switcher {

	public static void main(String[] args) throws Exception
	{

		FirefoxProfile ffProfile = new FirefoxProfile();
		ffProfile.setPreference("network.http.phishy-userpass-length", 255);
		WebDriver driver = new FirefoxDriver(ffProfile);
		//driver.get((Configuration.baseurl_dev02_roaming));
		driver.get("https://OrangeDigital:Or1971ngE@melt.adm.preprod.thundercontrol.com");
		Thread.sleep(3000);

		WebElement HomepageTree_Segment4 = driver.findElement(By.xpath(Configuration.Segment4Tree));
		HomepageTree_Segment4.isDisplayed();
		HomepageTree_Segment4.click();
		Thread.sleep(8000);
	  
		WebElement ContentExplorerPackage_Segment4  = driver.findElement(By.xpath(Configuration.EditSegment4));
		ContentExplorerPackage_Segment4.isDisplayed();
		ContentExplorerPackage_Segment4.click();
		Thread.sleep(8000);
	  
		WebElement highlights = driver.findElement(By.linkText("Highlights pane - segment 1"));
		highlights.click();
	  
		//Context switchers container
		WebElement Context_Switcher_container = driver.findElement(By.xpath("//div[@id='container']/div[2]/ul[2]/li[2]"));
		Context_Switcher_container.isDisplayed();
		WebElement Context_Switcher_dropdown = driver.findElement(By.id("context-switcher"));
		Context_Switcher_dropdown.isDisplayed();
		WebElement Context_switcher_reset = driver.findElement(By.id("context-switcher-reset"));
		Context_switcher_reset.isDisplayed();
	
		WebElement InsertMediaDropownElement = driver.findElement(By.id(Configuration.InsertMedia)); 
		Select selectBox1 = new Select(InsertMediaDropownElement);
		//select link
		selectBox1.selectByValue(Configuration.Link);
		WebElement Add = driver.findElement(By.xpath(Configuration.Add));
		Add.click();
		Thread.sleep(3000);
		//Web context area should show textarea feild
		WebElement Description_textarea = driver.findElement(By.xpath(Configuration.Link_description));
		Description_textarea.isDisplayed();
	
		Select select = new Select(Context_Switcher_dropdown);
		select.selectByValue(Configuration.Mobile);
		Thread.sleep(12000);
	  
		WebElement InsertMediaDropownElement1 = driver.findElement(By.id(Configuration.InsertMedia)); 
		Select select2 = new Select(InsertMediaDropownElement1);
		//select link
		select2.selectByValue(Configuration.Link);
		WebElement Add1 = driver.findElement(By.xpath(Configuration.Add));
		Add1.click();
		Thread.sleep(7000);
	  
		//Mobile context area should show tinyMCEeditor
		WebElement description_feild = driver.findElement(By.className("mceLayout"));
		description_feild.isDisplayed();  
  
		driver.quit();
	
	}
   
}