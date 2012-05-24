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

public class Android_YourRelationship_Text {
    public static void main(String[] args) throws Exception {
        
    	
    	AndroidDriver driver = new AndroidDriver();
    
  
    	driver.get("http://homepage-mobile.lbr.dev02.0itch.com/");
    	System.out.println(driver.getCurrentUrl());
    	
    	//grey scroll area is visible
    	WebElement scrollarea = driver.findElementByXPath(Constants.ScrollArea);
    	scrollarea.isDisplayed();
    
    	//Scroll header text1
    	WebElement ScrollText1 = driver.findElementByXPath(Constants.ScrollText1);
    	ScrollText1.isDisplayed();

    	//Scroll header text2
    	WebElement ScrollText2 = driver.findElementByXPath(Constants.ScrollText2);
    	ScrollText2.isDisplayed();
    	System.out.println("Current url:"+driver.getCurrentUrl());
	  
        Thread.sleep(10000);

       
    	Date newDate = new java.util.Date();
		String testName = "Android_ScreenShotSave";
		 try
	        {
	        //String Test = "/Users/chrismorris/Documents/MHP_screenshit/YourRelationship/YourRelationshipImages.png";
	        driver.getScreenshotAs(OutputType.FILE);

	        Thread.sleep(10000);
	        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        // Now you can do whatever you need to do with it, for example copy somewhere
	        Thread.sleep(14000);
	        FileUtils.copyFile(scrFile, new File("/Users/chrismorris/Documents/MHP_screenshots/YourRelationship/"+newDate+"_"+testName+".png"));

	        

    }
		 
		 
	        catch(Exception e){
	            e.printStackTrace();
	        }
	        Thread.sleep(10000);
	       
        driver.quit();
    }
}