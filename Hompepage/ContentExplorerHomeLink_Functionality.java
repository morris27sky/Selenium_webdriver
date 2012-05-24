package tests.Hompepage;

import static org.junit.Assert.assertFalse;

import org.junit.Test;

import org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import tests.Melt.verification.New.Configuration;


public class ContentExplorerHomeLink_Functionality {

	@Test
	public void testCE_Home_Functionality()
	{
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.orange.co.uk/");
		
		
	WebElement homeLinkLatest = driver.findElementById(Configuration.homeLinkLatest);
	assertFalse(homeLinkLatest.isDisplayed());
	//news
	WebElement paneNews = driver.findElementById(Configuration.paneNews);
	paneNews.click();

	
	//weather
	WebElement paneWeather = driver.findElementById(Configuration.paneWeather);
	paneWeather.click();
	
	//Sport
	WebElement paneSport = driver.findElementById(Configuration.paneSport);
	paneSport.click();
	
	//*******************this tabs are no longer used by the homepage*****************************

	/*Celebrity and Style
	WebElement paneCelebrityandStyle = driver.findElementById(Configuration.paneCelebrityandStyle);
	paneCelebrityandStyle.click();
	
	
	//TV
	WebElement paneTV = driver.findElementById(Configuration.paneTV);
	paneTV.click();*/
	
	//Orange Wednesdays
	WebElement paneOrangeWednesdays = driver.findElementById(Configuration.paneOrangeWednesdays);
	paneOrangeWednesdays.click();
		
	driver.quit();
	
	}
}
