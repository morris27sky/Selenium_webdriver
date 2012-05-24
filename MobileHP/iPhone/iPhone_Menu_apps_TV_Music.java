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


public class iPhone_Menu_apps_TV_Music {
    public static void main(String[] args) throws Exception {
        
    	
     	IPhoneDriver driver = new IPhoneDriver("http://192.168.0.39:3001/hub/");
    	

  
    	driver.get("http://orangeworld.co.uk/");
    	System.out.println(driver.getCurrentUrl());
    	
    	WebElement MenuTab = driver.findElementByXPath(Constants.MenuTab);
    	MenuTab.isDisplayed();
    	MenuTab.click();
    	Thread.sleep(3000);
    
   
    		//Menu Content Sports
    	WebElement Menu_apps_TV_Music = driver.findElementByXPath(Constants.Menu_apps_TV_Music);
    	Menu_apps_TV_Music.isDisplayed();
    	Menu_apps_TV_Music.click();
    	
    	WebElement MenuContent_apps_TV_Music_BreadCrumb = driver.findElementByXPath(Constants.MenuContent_apps_TV_Music_BreadCrumb);
    	MenuContent_apps_TV_Music_BreadCrumb.isDisplayed();
    	
    	System.out.println("BreadCrumb name is: "+MenuContent_apps_TV_Music_BreadCrumb.getText());
    	
    	WebElement apps_Homepage = driver.findElementByXPath(Constants.apps_Homepage);
    	apps_Homepage.isDisplayed();
    	apps_Homepage.click();
    	System.out.println(driver.getCurrentUrl());
    	
        
        driver.quit();
    }
}