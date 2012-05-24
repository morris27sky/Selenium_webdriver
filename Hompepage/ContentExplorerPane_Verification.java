package tests.Hompepage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import tests.Melt.verification.New.Configuration;

public class ContentExplorerPane_Verification {
	
	FirefoxDriver driver = new FirefoxDriver();

	@Test
	public void testCE_Panes_Slots() 
	{
			driver.get(Configuration.web_url_live);	
		
		driver.findElement(By.xpath(Configuration.pane1Slot1));
		
		List<WebElement> Links = driver.findElements(By
			    .xpath("//*[@id='ce-nav']/ul/li"));  
		int i=1;
		for(WebElement list : Links)
		  {
		
			
		   String Panename = list.getText();
		   System.out.println(i+" Name of the pane: "+Panename);
		   
		   i++;
		 //  System.out.println(i);
		  } 
		i--;
		int numberofpanes  = i;
	System.out.println("Total number of panes "+numberofpanes);
	
	
	
	for(int j=1;j<=numberofpanes;j++) {System.out.println("********* verifying pane:"+j+"***************");
	
	
	driver.findElement(By.xpath("//*[@id='ce-nav']/ul/li["+j+"]"));
	
	int k;
	for(k=1;k<=5;k++) {driver.findElement(By.xpath("//*[@id='ce-nav']/ul/li["+k+"]"));System.out.print("Verifying Slot "+k);System.out.println();}
	
	
	}
		
	driver.quit();
			
		
		}
		
}