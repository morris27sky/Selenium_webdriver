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


public class Android_Header_Search {
    public static void main(String[] args) throws Exception {
        
    	
    	AndroidDriver driver = new AndroidDriver();
    	//IPhoneDriver driver = new IPhoneDriver("http://192.168.0.39:3001/hub/");

  
    	driver.get("http://orangeworld.co.uk/");
    	System.out.println(driver.getCurrentUrl());
    	
    	WebElement Search = driver.findElementByXPath(Constants.SearchTab);
    	//Search.click();
    	WebElement Searchbox = driver.findElementByXPath(Constants.SearchBox);
    	Searchbox.isDisplayed();
    	WebElement SearchBoxTextArea = driver.findElementByXPath(Constants.SearchBoxTextArea);
    	SearchBoxTextArea.isDisplayed();
    	System.out.println(driver.getCapabilities());
    	System.out.println(driver.getOrientation());
        
      
      // Check the title of the page
        System.out.println("Page title is: " + driver.getTitle());
        
      //screenshot
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
		        Search.click();
		      
        
        
        driver.quit();
    }
}