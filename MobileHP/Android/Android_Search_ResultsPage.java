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
import org.openqa.selenium.NoSuchElementException;


import java.io.File;
import java.lang.Thread;
import java.util.Date;

public class Android_Search_ResultsPage {
    public static void main(String[] args) throws Exception {
       	AndroidDriver driver = new AndroidDriver();
    
  
    	driver.get("http://orangeworld.co.uk/");
    	System.out.println(driver.getCurrentUrl());
  	
    	//click search
    	WebElement searchBar = driver.findElement(By.name("q"));
    						   
    	// search for the word 'test'
    	searchBar.sendKeys("t");
    	searchBar.sendKeys("e");
    	searchBar.sendKeys("st");
    	
    	//Now submit the form
    	searchBar.submit();

    	// Check the title of the page
        System.out.println("Page title is: " + driver.getTitle());  	
        Thread.sleep(3000);
        
        //user is now on the search page
        WebElement inNews = driver.findElementByXPath(Constants.inNews);
        
    	//After in news has been expanded, the user should see the following elements
        WebElement dropDownlink1 = driver.findElementByXPath(Constants.dropDownlink1);
        try {
        	WebElement dropDownlink2 = driver.findElementByXPath(Constants.dropDownlink2);
            WebElement dropDownlink3 = driver.findElementByXPath(Constants.dropDownlink3);
            WebElement MoreResults = driver.findElementByXPath(Constants.MoreResults);
	    } catch (NoSuchElementException ex) { 
	        /* do nothing, link is not present, assert is passed */
	    }
        
        //search header form is still visible on the results page
        WebElement searchHeaderForm = driver.findElementByXPath("//DIV[4]/FORM/DIV/DIV/DIV[1]");
        
        
        //search footer form is still visible on the results page
        WebElement searchFooterForm = driver.findElementByXPath("//DIV[27]/DIV[3]/FORM/DIV/DIV]");
        
    	Date newDate = new java.util.Date();
		String testName = "Android_ScreenShotSave";
		 try
	        {
	        //String Test = "/Users/chrismorris/Documents/MHP_screenshit/searchResultsPage.png";
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