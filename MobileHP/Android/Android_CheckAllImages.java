package tests.MobileHP.Android;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.android.AndroidDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.JavascriptExecutor;

import tests.Melt.verification.New.Configuration;
//import org.openqa.selenium.interactions.touch.TouchActions;
//import org.openqa.selenium.interactions.touch.FlickAction;
//import org.openqa.selenium.remote.server.handler.interactions.touch.Scroll;

import java.io.File;
import java.lang.Thread;
import java.util.Date;
import java.util.List;

public class Android_CheckAllImages {
    public static void main(String[] args) throws Exception {
        
    	//http://google-opensource.blogspot.com/2011/10/test-your-mobile-web-apps-with.html
    	  
    	//AndroidDriver driver = new AndroidDriver();
    	FirefoxProfile ffProfile = new FirefoxProfile();
		ffProfile.setPreference("network.http.phishy-userpass-length", 255);
		WebDriver driver = new FirefoxDriver(ffProfile);
    	driver.get(Configuration.baseurl_site);
    	System.out.println(driver.getCurrentUrl());
    	
    	System.out.println("Current url:"+driver.getCurrentUrl());


           List<WebElement> allImages = driver.findElements(By.tagName("img"));
           for (WebElement image : allImages) {
             boolean loaded = (Boolean) ((JavascriptExecutor) driver).executeScript("return arguments[0].complete", image);
             if (!loaded) {
             	System.out.println("Image not loaded: "+image.getAttribute("src"));
             } else {
           	  // Do nothing
             }
       	
   	        }
   	        Thread.sleep(10000);
   	       
           driver.quit();

 }
}

/*Date newDate = new java.util.Date();
	String testName = "Android_ScreenShotSave";
	 try
       {
       //String Test = "/Users/chrismorris/Documents/MHP_screenshit/MoreFromOrange/MoreFromOrangeImages.png";
       //driver.getScreenshotAs(OutputType.FILE);

       Thread.sleep(10000);
       File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
       // Now you can do whatever you need to do with it, for example copy somewhere
       Thread.sleep(14000);
       FileUtils.copyFile(scrFile, new File("/Users/chrismorris/Documents/MHP_screenshots/MoreFromOrange/"+newDate+"_"+testName+".png"));
   
   }

       catch(Exception e){
           e.printStackTrace();*/
