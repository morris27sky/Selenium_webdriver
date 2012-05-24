package tests.Hompepage;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import tests.Melt.verification.New.Configuration;

public class ContentExplorer_NavigatePane_Functionality {

	FirefoxDriver driver = new FirefoxDriver();
	
	@Test
	public void testCE_Navigation_Pane_Functionality() throws InterruptedException
	
	{
		driver.get(Configuration.web_url_live);
		//Latest
		driver.findElementById(Configuration.paneLatest);
		System.out.println("Latest current class is : "+driver.findElementByXPath(Configuration.paneLatest_Current).isDisplayed());
		assertTrue(driver.findElementByXPath(Configuration.paneLatest_Current).isDisplayed());
		//news
		WebElement paneNews = driver.findElementById(Configuration.paneNews);
		paneNews.click();
		System.out.println("News current class is : "+driver.findElementByXPath(Configuration.panenews_Current).isDisplayed());
		assertTrue(driver.findElementByXPath(Configuration.panenews_Current).isDisplayed());
		//weather
		WebElement paneWeather = driver.findElementById(Configuration.paneWeather);
		paneWeather.click();
		System.out.println("Weather current class is : "+driver.findElementByXPath(Configuration.paneweather_Current).isDisplayed());
		assertTrue(driver.findElementByXPath(Configuration.paneweather_Current).isDisplayed());
		//Sport
		WebElement paneSport = driver.findElementById(Configuration.paneSport);
		paneSport.click();
		System.out.println("Sport current class: "+driver.findElementByXPath(Configuration.panesport_Current).isDisplayed());
		assertTrue(driver.findElementByXPath(Configuration.panesport_Current).isDisplayed());
		//*******************this tabs are no longer used by the homepage*****************************
		//Celebrity and Style
		/*WebElement paneCelebrityandStyle = driver.findElementById(Configuration.paneCelebrityandStyle);
		paneCelebrityandStyle.click();
		System.out.println("Celebrity Current class is : "+ driver.findElementByXPath(Configuration.paneCelebrityandStyle_Current).isDisplayed());
		assertTrue(driver.findElementByXPath(Configuration.paneCelebrityandStyle_Current).isDisplayed());
		//TV
		WebElement paneTV = driver.findElementById(Configuration.paneTV);
		paneTV.click();
		System.out.println("TV Current class is : "+ driver.findElementByXPath(Configuration.paneTV_Current).isDisplayed());
		assertTrue(driver.findElementByXPath(Configuration.paneTV_Current).isDisplayed());*/
		//Orange Wednesdays
		WebElement paneOrangeWednesdays = driver.findElementById(Configuration.paneOrangeWednesdays);
		paneOrangeWednesdays.click();
		System.out.println("Orange Wednesdays Current class is : "+ driver.findElementByXPath(Configuration.filmfinder).isDisplayed());
		assertTrue(driver.findElementByXPath(Configuration.filmfinder).isDisplayed());
		
		Thread.sleep(3000);
		
		driver.quit();
	}
}