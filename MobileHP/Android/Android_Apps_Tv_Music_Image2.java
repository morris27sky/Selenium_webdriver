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

public class Android_Apps_Tv_Music_Image2 {
    public static void main(String[] args) throws Exception {
        
    	
    	AndroidDriver driver = new AndroidDriver();
    
  
    	driver.get("http://orangeworld.co.uk/");
    	System.out.println(driver.getCurrentUrl());
    	
    	WebElement MenuTabElement = driver.findElementByXPath(Constants.AppsTvMusicTab);
    	MenuTabElement.isDisplayed();
    	MenuTabElement.click();
    	Thread.sleep(3000);
    	
    		//Image 2
    	WebElement Image2Element = driver.findElementByXPath(Constants.m4Image2);
    	Image2Element.isDisplayed();
    	Image2Element.click();
    	System.out.println("Current url:"+driver.getCurrentUrl());
	  
    	
    	Date newDate = new java.util.Date();
		String testName = "Android_ScreenShotSave";
		 try
	        {
	        //String Test = "/Users/chrismorris/Documents/MHP_screenshit/Image2.png";
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
	        
        driver.quit();
    }
}