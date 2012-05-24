package tests.MobileHP.iPhone;


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


public class iPhone_Menu_Sports {
    public static void main(String[] args) throws Exception {
        
    	
    	//IPhoneDriver driver = new IPhoneDriver("http://192.168.0.39:3001/hub/");
    	IPhoneDriver driver = new IPhoneDriver("http://192.168.0.25:3001/hub/");

  
    	driver.get("http://orangeworld.co.uk/");
    	driver.get("http://orangeworld.co.uk/?ua=iphone;");
    	System.out.println(driver.getCurrentUrl());
    	
    	WebElement MenuTab = driver.findElementByXPath(Constants.MenuTab);
    	MenuTab.isDisplayed();
    	MenuTab.click();
    	Thread.sleep(3000);
    
   
    		//Menu Content Sports
    	WebElement MenuContent_Sports = driver.findElementByXPath(Constants.MenuContent_Sports);
    	MenuContent_Sports.isDisplayed();
    	MenuContent_Sports.click();
    	WebElement MenuContent_Sports_BreadCrumb = driver.findElementByXPath(Constants.MenuContent_Sports_BreadCrumb);
    	MenuContent_Sports_BreadCrumb.isDisplayed();
    	//System.out.println(MenuContent_Sports_BreadCrumb.getTagName());
    	System.out.println("BreadCrumb name is: "+MenuContent_Sports_BreadCrumb.getText());
    	WebElement Sports_Homepage = driver.findElementByXPath(Constants.Sports_Homepage);
    	Sports_Homepage.isDisplayed();
    	Sports_Homepage.click();
    	System.out.println(driver.getCurrentUrl());
    	
    	System.out.println("Current url:"+driver.getCurrentUrl());
    	System.out.println("Driver Capabilities:"+ driver.getCapabilities());
    	//System.out.println("Orientation:"+driver.getOrientation());
    	
    	Date newDate = new java.util.Date();
		String testName = "iPhone_ScreenShotSave";
		 try
	        {
	        //String Test = "/Users/shivaraju/Desktop/test.png";
	        driver.getScreenshotAs(OutputType.FILE);

	        Thread.sleep(10000);
	        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        // Now you can do whatever you need to do with it, for example copy somewhere
	        Thread.sleep(14000);
	        FileUtils.copyFile(scrFile, new File("/Users/shivaraju/Desktop/Testing/MobileTests_Screenshots/"+newDate+"_"+testName+".png"));
	        //ipaddress in constatnts

	        }

	        catch(Exception e){
	            e.printStackTrace();
	        }
	        Thread.sleep(10000);
    	
        driver.quit();
    }
}