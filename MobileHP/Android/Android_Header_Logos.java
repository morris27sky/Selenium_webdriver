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

public class Android_Header_Logos {
    public static void main(String[] args) throws Exception {
        
    	
    	AndroidDriver driver = new AndroidDriver();
    
  
    	driver.get("http://orangeworld.co.uk/");
    	System.out.println(driver.getCurrentUrl());
    	
    	//heade Logos
    	WebElement HeaderElement = driver.findElementByXPath(Constants.Headerlogo_Search);
    	HeaderElement.isDisplayed();
   
    	//Menu Logo
    	WebElement MenuElement = driver.findElementByXPath(Constants.Headerlogo_Menu);
    	MenuElement.isDisplayed();
 	
    	//Apps Tv Music Logo
    	WebElement AppsElement = driver.findElementByXPath(Constants.Headerlogo_Apps);
    	AppsElement.isDisplayed();
 
    	//Your Orange Logo
    	WebElement YourOrangeElement = driver.findElementByXPath(Constants.Headerlogo_YourOrange);
    	YourOrangeElement.isDisplayed();
    	
    	//Favourites Logo
    	WebElement FavouritesElement = driver.findElementByXPath(Constants.Headerlogo_Favourites);
    	FavouritesElement.isDisplayed();
     	
    	Date newDate = new java.util.Date();
		String testName = "Android_ScreenShotSave";
		 try
	        {
	        //String Test = "/Users/chrismorris/Documents/MHP_screenshit/Image1.png";
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