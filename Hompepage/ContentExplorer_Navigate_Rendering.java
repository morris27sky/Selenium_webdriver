package tests.Hompepage;

import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import tests.Melt.verification.New.Configuration;

public class ContentExplorer_Navigate_Rendering {
	
	@Test
	public void testCE_Navigation_Render()
	{
		FirefoxDriver driver = new FirefoxDriver();
		//driver.get("http://www.orange.co.uk/");
		driver.get("http://homepage.lbr.preprod.thundercontrol.com");
	WebElement panesNavigationBar = driver.findElementById(Configuration.panesNavigationBar);
	panesNavigationBar.isDisplayed();
	
	//Latest
	WebElement paneLatest = driver.findElementById(Configuration.paneLatest);
	paneLatest.isDisplayed();
	System.out.print("Verifying  - ["+paneLatest.getText()+"]- pane name: ");
	System.out.println(paneLatest.getText().contains("latest"));
	//News
	WebElement paneNews = driver.findElementById(Configuration.paneNews);
	paneNews.isDisplayed();
	System.out.print("Verifying  - ["+paneNews.getText()+"]- pane name: ");
	System.out.println(paneNews.getText().contains("news"));
	//Celebrity and Style
	//WebElement paneCelebrityandStyle = driver.findElementById(Configuration.paneCelebrityandStyle);
	//paneCelebrityandStyle.isDisplayed();
	//System.out.print("Verifying  - ["+paneCelebrityandStyle.getText()+"]- pane name: ");
	//System.out.println(paneCelebrityandStyle.getText().contains("celebs & style"));
	//Orange Wednesday
	WebElement paneOrangeWednesdays = driver.findElementById(Configuration.paneOrangeWednesdays);
	paneOrangeWednesdays.isDisplayed();
	System.out.print("Verifying  - ["+paneOrangeWednesdays.getText()+"]- pane name: ");
	System.out.println(paneOrangeWednesdays.getText().contains("Orange Wednesdays & film"));
	//Weather
	WebElement paneWeather = driver.findElementById(Configuration.paneWeather);
	paneWeather.isDisplayed();
	System.out.print("Verifying  - ["+paneWeather.getText()+"]- pane name: ");
	System.out.println(paneWeather.getText().contains("weather"));
	//Sport
	WebElement paneSport = driver.findElementById(Configuration.paneSport);
	paneSport.isDisplayed();
	System.out.print("Verifying  - ["+paneSport.getText()+"]- pane name: ");
	System.out.println(paneSport.getText().contains("sport"));
	//TV
	/*WebElement paneTV = driver.findElementById(Configuration.paneTV);
	paneTV.isDisplayed();
	System.out.print("Verifying  - ["+paneTV.getText()+"]- pane name: ");
	System.out.println(paneTV.getText().contains("TV"));*/
	
	
	driver.quit();
	
	}
		
}