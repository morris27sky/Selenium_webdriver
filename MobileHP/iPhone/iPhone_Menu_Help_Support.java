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


public class iPhone_Menu_Help_Support {
    public static void main(String[] args) throws Exception {
        
    	
    	IPhoneDriver driver = new IPhoneDriver("http://192.168.0.39:3001/hub/");
    	

  
    	driver.get("http://orangeworld.co.uk/");
    	System.out.println(driver.getCurrentUrl());
    	
    	WebElement MenuTab = driver.findElementByXPath(Constants.MenuTab);
    	MenuTab.isDisplayed();
    	MenuTab.click();
    	Thread.sleep(3000);
    
   
    		//Menu Content Sports
    	WebElement MenuContent_Help_Support = driver.findElementByXPath(Constants.MenuContent_Help_Support);
    	MenuContent_Help_Support.isDisplayed();
    	MenuContent_Help_Support.click();
    	WebElement MenuContent_Help_Support_BreadCrumb = driver.findElementByXPath(Constants.MenuContent_Help_Support_BreadCrumb);
    	MenuContent_Help_Support_BreadCrumb.isDisplayed();
    	System.out.println(MenuContent_Help_Support_BreadCrumb.getTagName());
    	System.out.println("BreadCrumb name is: "+MenuContent_Help_Support_BreadCrumb.getText());
    	/*WebElement Help_Support_Homepage = driver.findElementByXPath(Constants.Help_Support_Homepage);
    	Help_Support_Homepage.isDisplayed();
    	Help_Support_Homepage.click();
    	System.out.println(driver.getCurrentUrl());*/
    	
        
        driver.quit();
    }
}