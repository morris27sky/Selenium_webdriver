package tests.Hompepage;

import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;
import tests.Melt.verification.New.Configuration;

public class ContentExplorer_NavigateToRight_Functionality {

	FirefoxDriver driver = new FirefoxDriver();
	
	@Test
	public void testCE_Navigation_Interaction_Functionality_To_Right() throws Throwable
	
	{
		
		driver.get(Configuration.web_url_live);
				
		System.out.println("Click next to news:"+driver.findElementById(Configuration.rightToNews).isDisplayed());
		driver.findElementById(Configuration.paneNews).click();
		Thread.sleep(3000);
		System.out.println("Click next to Weather: "+driver.findElementById(Configuration.rightToWeather).isDisplayed());
		driver.findElementById(Configuration.rightToWeather).click();
		Thread.sleep(3000);
		System.out.println("Click next to Sport :"+driver.findElementById(Configuration.rightToSport).isDisplayed());
		driver.findElementById(Configuration.rightToSport).click();
		Thread.sleep(3000);
		//System.out.println("Click next to Celebrty and Style : "+driver.findElementById(Configuration.rightToCelebsandStyle).isDisplayed());
		//driver.findElementById(Configuration.rightToCelebsandStyle).click();
		//Thread.sleep(3000);
		//System.out.println("Click next to TV: "+driver.findElementById(Configuration.rightToTv).isDisplayed());
		//driver.findElementById(Configuration.rightToTv).click();
		//Thread.sleep(3000);
		System.out.println("Click next to Orange Wednesdays : "+driver.findElementById(Configuration.rightToOrangeWednesdays).isDisplayed());
		
		
		driver.quit();
	}
	
}
