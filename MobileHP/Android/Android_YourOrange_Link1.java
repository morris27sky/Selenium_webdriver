package tests.MobileHP.Android;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.iphone.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.android.AndroidDriver;

import java.io.File;
import java.lang.Thread;
import java.util.Date;

public class Android_YourOrange_Link1 {
    public static void main(String[] args) throws Exception {
        
    	
    	AndroidDriver driver = new AndroidDriver();
    	

  
    	driver.get("http://orangeworld.co.uk/");
    	System.out.println(driver.getCurrentUrl());
    	
    	WebElement YourOrangeTab = driver.findElementByXPath(Constants.YourOrangeTab);
    	YourOrangeTab.isDisplayed();
    	YourOrangeTab.click();
    	Thread.sleep(3000);
    
   
    		//Your Orange Tab Link1
    	WebElement M3Link1Element = driver.findElementByXPath(Constants.m3Link1);
    	M3Link1Element.isDisplayed();
    	M3Link1Element.click();
    	System.out.println("Current url:"+driver.getCurrentUrl());
    	
    	Date newDate = new java.util.Date();
		String testName = "Android_ScreenShotSave";
		 try
	        {
	        //String Test = "/Users/chrismorris/Documents/MHP_screenshit/Apps_TV_Music_Link1.png";
	        driver.getScreenshotAs(OutputType.FILE);

	        Thread.sleep(10000);
	        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        // Now you can do whatever you need to do with it, for example copy somewhere
	        Thread.sleep(14000);
	        FileUtils.copyFile(scrFile, new File("/Users/chrismorris/Documents/MHP_screenshots/"+newDate+"_"+testName+".png"));

	        }

	        catch(Exception e){
	            e.printStackTrace();
	        }
	        Thread.sleep(10000);
	      //  Search.click();
	      
        
        driver.quit();
    }
}