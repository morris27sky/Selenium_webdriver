package tests.Hompepage;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import tests.Melt.verification.New.Configuration;


public class ContentExplorer_Rendering {

	//public static void main(String[] args) throws Exception {
		
	//public Urllaunch one;
	
	@Test
	
	public void testCE_Framework_Render()
	{
		FirefoxDriver driver = new FirefoxDriver();
		//driver.get("http://www.orange.co.uk");
		driver.get(Configuration.web_url_live);
		
			
		WebElement ContentExplorer = driver.findElement(By.id(Configuration.contentExplorer));
		ContentExplorer.isDisplayed();
		
		WebElement Arrows = driver.findElement(By.id(Configuration.arrows));
		Arrows.isDisplayed();
			
		WebElement nextButton = driver.findElement(By.id(Configuration.nextButton));
		nextButton.isDisplayed();

		WebElement leftButton = driver.findElement(By.id(Configuration.leftButton));
		leftButton.isDisplayed();
		
		WebElement content = driver.findElement(By.id(Configuration.content));
		content.isDisplayed();
		
		WebElement panes = driver.findElement(By.id(Configuration.panes));
		panes.isDisplayed();
		

		WebElement innerPanes = driver.findElement(By.xpath(Configuration.innerPanes));
		innerPanes.isDisplayed();

		
			System.out.println("Test finished.");
			
			driver.quit();
	}

}
