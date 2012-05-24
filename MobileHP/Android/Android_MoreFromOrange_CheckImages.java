package tests.MobileHP.Android;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.internal.BaseAction;
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

public class Android_MoreFromOrange_CheckImages {
    public static void main(String[] args) throws Exception {
        
    	
    	AndroidDriver driver = new AndroidDriver();
    
  
    	driver.get("http://homepage-mobile.lbr.dev02.0itch.com/");
    	System.out.println(driver.getCurrentUrl());
    	
    	//image 1
    	WebElement image1 = driver.findElementByXPath(Constants.Image1);
    	image1.isDisplayed();
    	//image 2
    	WebElement image2 = driver.findElementByXPath(Constants.Image2);
    	image2.isDisplayed();    	
    	//image 3
    	WebElement image3 = driver.findElementByXPath(Constants.Image3);
    	image3.isDisplayed();
    	
    	System.out.println("Current url:"+driver.getCurrentUrl());
        Thread.sleep(10000);

    	
    	Date newDate = new java.util.Date();
		String testName = "Android_ScreenShotSave";
		 try
	        {
	        //String Test = "/Users/chrismorris/Documents/MHP_screenshit/MoreFromOrange/MoreFromOrangeImages.png";
	        driver.getScreenshotAs(OutputType.FILE);

	        Thread.sleep(10000);
	        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        // Now you can do whatever you need to do with it, for example copy somewhere
	        Thread.sleep(14000);
	        FileUtils.copyFile(scrFile, new File("/Users/chrismorris/Documents/MHP_screenshots/MoreFromOrange/"+newDate+"_"+testName+".png"));
	    
	    }

	        catch(Exception e){
	            e.printStackTrace();
	        }
	        Thread.sleep(10000);
	        
        driver.quit();
    }
}