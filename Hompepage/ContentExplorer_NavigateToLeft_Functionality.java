package tests.Hompepage;

import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import tests.Melt.verification.New.Configuration;

public class ContentExplorer_NavigateToLeft_Functionality {

FirefoxDriver driver = new FirefoxDriver();
	
	// Thread.sleep :)

	@Test
	public void testCE_Navigation_Interaction_Functionality_To_Left() throws Throwable
	
	{
		
		
		driver.get(Configuration.web_url_live);
		
		driver.findElementById(Configuration.paneOrangeWednesdays).click();
		Thread.sleep(3000);
		
	//	System.out.println("Click previous to Orange Wednesdays : "+driver.findElementById(Configuration.leftToTV).isDisplayed());
		//assertTrue(driver.findElementById(Configuration.leftToTV).isDisplayed());
		
		//driver.findElementById(Configuration.paneTV).click();
		//Thread.sleep(3000);
		//assertTrue(driver.findElementById(Configuration.leftToCelebrity).isDisplayed());
		
		//driver.findElementById(Configuration.paneCelebrityandStyle).click();
		Thread.sleep(3000);
		assertTrue(driver.findElementById(Configuration.leftToSport).isDisplayed());
		
		driver.findElementById(Configuration.paneSport).click();
		Thread.sleep(3000);
		assertTrue(driver.findElementById(Configuration.leftToWeather).isDisplayed());
		
		driver.findElementById(Configuration.paneWeather).click();
		Thread.sleep(3000);
		assertTrue(driver.findElementById(Configuration.leftTonews).isDisplayed());
		
		driver.findElementById(Configuration.paneNews).click();
		Thread.sleep(3000);
		assertTrue(driver.findElementById(Configuration.leftTolatest).isDisplayed());
		
		driver.quit();
	}
	
}