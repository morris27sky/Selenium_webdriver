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


public class Android_Menu_apps_TV_Music {
    public static void main(String[] args) throws Exception {
        
    	
    	AndroidDriver driver = new AndroidDriver();
    	

  
    	driver.get("http://homepage-mobile.lbr.dev01.0itch.com/?beta=1");
    	System.out.println(driver.getCurrentUrl());
    	
    	WebElement MenuTab = driver.findElementByXPath(Constants.MenuTab);
    	MenuTab.isDisplayed();
    	MenuTab.click();
    	Thread.sleep(3000);
    
   
    		//Menu Content Sports
    	WebElement FourthMenuLink = driver.findElementByXPath(Constants.FourthMenuLink);
    	FourthMenuLink.isDisplayed();
    	FourthMenuLink.click();
    	
    	WebElement MenuBreadCrumb = driver.findElementByXPath(Constants.MenuBreadCrumb);
    	MenuBreadCrumb.isDisplayed();
    	
    	System.out.println("BreadCrumb name is: "+MenuBreadCrumb.getText());
    	
    	WebElement apps_Homepage = driver.findElementByXPath(Constants.apps_Homepage);
    	apps_Homepage.isDisplayed();
    	apps_Homepage.click();
    	System.out.println("Current url:"+driver.getCurrentUrl());
    	System.out.println("Driver Capabilities:"+ driver.getCapabilities());
    	System.out.println("Orientation:"+driver.getOrientation());
    	
    	Date newDate = new java.util.Date();
		String testName = "Android_ScreenShotSave";
		 try
	        {
	        //String Test = "/Users/shivaraju/Desktop/test.png";
	        driver.getScreenshotAs(OutputType.FILE);

	        Thread.sleep(10000);
	        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        // Now you can do whatever you need to do with it, for example copy somewhere
	        Thread.sleep(14000);
	        FileUtils.copyFile(scrFile, new File("/Users/shivaraju/Desktop/Testing/MobileTests_Screenshots/"+newDate+"_"+testName+".png"));

	        }

	        catch(Exception e){
	            e.printStackTrace();
	        }
	        Thread.sleep(10000);
	      //  Search.click();
	      
        
        driver.quit();
    }
}