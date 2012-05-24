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


public class Android_Menu_Sports {
    public static void main(String[] args) throws Exception {
        
    	
    	AndroidDriver driver = new AndroidDriver();
    	

  
    	driver.get("http://orangeworld.co.uk/");
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
    	System.out.println(MenuContent_Sports_BreadCrumb.getTagName());
    	System.out.println("BreadCrumb name is: "+MenuContent_Sports_BreadCrumb.getText());
    	WebElement Sports_Homepage = driver.findElementByXPath(Constants.Sports_Homepage);
    	Sports_Homepage.isDisplayed();
    	Sports_Homepage.click();
    	System.out.println(driver.getCurrentUrl());
    	
        
        driver.quit();
    }
}