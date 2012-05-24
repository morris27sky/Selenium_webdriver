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


public class iPhone_Menu_Entertainment {
    public static void main(String[] args) throws Exception {
        
    	
      	IPhoneDriver driver = new IPhoneDriver("http://192.168.0.39:3001/hub/");
    	

  
    	driver.get("http://orangeworld.co.uk/");
    	System.out.println(driver.getCurrentUrl());
    	
    	WebElement MenuTab = driver.findElementByXPath(Constants.MenuTab);
    	MenuTab.isDisplayed();
    	MenuTab.click();
    	Thread.sleep(3000);
    		// Menu Content Entertainment
    	WebElement MenuContent_Entertainment = driver.findElementByXPath(Constants.MenuContent_Entertainment);
    	MenuContent_Entertainment.isDisplayed();
    	MenuContent_Entertainment.click();
    	
    	WebElement MenuContent_Entertainment_BreadCrumb = driver.findElementByXPath(Constants.MenuContent_Entertainment_BreadCrumb);
    	MenuContent_Entertainment_BreadCrumb.isDisplayed();
    	System.out.println("BreadCrumb Name is "+ MenuContent_Entertainment_BreadCrumb.getText());
    
    	WebElement Entertainment_Homepage = driver.findElementByXPath(Constants.Entertainment_Homepage);
    	Entertainment_Homepage.isDisplayed();
    	Entertainment_Homepage.click();
    	System.out.println(driver.getCurrentUrl());
    	
    	System.out.println("Test pass");
    
        driver.quit();
    }
}