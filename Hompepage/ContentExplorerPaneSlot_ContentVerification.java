package tests.Hompepage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import tests.Melt.verification.New.Configuration;

public class ContentExplorerPaneSlot_ContentVerification {
	
	FirefoxDriver driver = new FirefoxDriver();
	
	@Test
	public void testCE_Panes_Slots() 
	{
			driver.get(Configuration.web_url_live);	

			int k=1;
		 
			List<WebElement> NumberOfPanes = driver.findElements(By.xpath("//*[@id='ce-nav']/ul/li"));
			for (WebElement pane : NumberOfPanes) {
				driver.findElement(By.xpath("//*[@id='ce-nav']/ul/li["+k+"]"));
				k++;
			   System.out.println(k);
			}
			k--;
			
			for(int j=1;j<=k;j++)
			{
	
	System.out.println("Verifying pane: "+j);
	driver.findElement(By.xpath("//*[@id='ce-nav']/ul/li["+j+"]")).isDisplayed();
	System.out.println("Verifying header class: "+j);
	driver.findElement(By.xpath("//*[@id='ce-panes']/li["+j+"]/div/div[1]/div/div[@class='header']")).isDisplayed();
	System.out.println("Verifying Header title: "+j);
	driver.findElement(By.xpath("//*[@id='ce-panes']/li["+j+"]/div/div[1]/div/div[1]/h2")).isDisplayed();
	System.out.println("Verifying Content: "+j);
	driver.findElement(By.xpath("//*[@id='ce-panes']/li["+j+"]/div/div[1]/div/div[@class='content']")).isDisplayed();
	System.out.println("Verifying hover link : "+j);
	driver.findElement(By.xpath("//*[@id='ce-panes']/li["+j+"]/div/div[1]/div/div[@class='content']/div[@class='featured-article hover-article']")).isDisplayed();
	System.out.println("Verifying hover : "+j);
	driver.findElement(By.xpath("//*[@id='ce-panes']/li["+j+"]/div/div[1]/div/div[@class='content']/div[@class='featured-article hover-article']/a")).isDisplayed();
	
	System.out.println("Verifying Caption: "+j);
	driver.findElement(By.xpath("//*[@id='ce-panes']/li["+j+"]/div/div[1]/div/div[2]/div[1]/div")).isDisplayed();
	
	System.out.println("Verifying Caption summary link: "+j);
	driver.findElement(By.xpath("//*[@id='ce-panes']/li["+j+"]/div/div[1]/div/div[@class='content']//p[@class='summary']/a")).isDisplayed();
	
	
	if(j<=2|j>4)
	{
	System.out.println("verifying image");
	driver.findElement(By.xpath("//*[@id='ce_pane"+j+"_slot1_imagelink1']/img")).isDisplayed();
	}
	else if(j==3) 
	{System.out.println("verifying weather pane image ");
	driver.findElement(By.xpath("//*[@id='ce_pane3_slot1_weather_imagelink']/img")).isDisplayed();}
	
	else
	{System.out.println("none");}
	
	if(j<3|j==4|j==6) 
	{ 
	System.out.println("Verifying Slot2 in pane"+j);
	driver.findElement(By.xpath("//*[@id='ce-panes']/li["+j+"]/div/div[2]/div[@class='article']")).isDisplayed();
	}

		if(j==3) 
	{
	System.out.println("Verifying  weather pane"+j);
	driver.findElement(By.id("weather")).isDisplayed();
	driver.findElement(By.id("todays-weather")).isDisplayed();
	driver.findElement(By.id("tomorrows-weather")).isDisplayed();
	
	}
	
		/*if(j==5) 
		{
		System.out.println("Verifying Galleries"+j);
		driver.findElement(By.id("ce_pane5_slot2_imagelink1")).isDisplayed();
		}*/
		
		
		if(j==7) 
		{
		System.out.println("Verifying  Find a film"+j);
		driver.findElement(By.id("film-finder")).isDisplayed();
		}

		
	
	System.out.println("verifying most popular of slot "+j);
	driver.findElement(By.xpath("//*[@id='ce-panes']/li["+j+"]/div/div[3]/div/div[@class='content']")).isDisplayed();
	driver.findElement(By.xpath("//*[@id='ce_pane"+j+"_slot3_imagelink1']/img")).isDisplayed();
	driver.findElement(By.xpath("//*[@id='ce_pane"+j+"_slot3_imagelink2']/img")).isDisplayed();
	driver.findElement(By.xpath("//*[@id='ce_pane"+j+"_slot3_imagelink3']/img")).isDisplayed();

	System.out.println("verifying Slot four: "+j);
	driver.findElement(By.xpath("//*[@id='ce-panes']/li["+j+"]/div/div[@class='ce-slot slot-4']/div")).isDisplayed();
	

			}
	
	driver.quit();
	
				}
		
		}