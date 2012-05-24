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


public class iPhone_Menu_Social {
    public static void main(String[] args) throws Exception {
        
    	
    	IPhoneDriver driver = new IPhoneDriver("http://192.168.0.39:3001/hub/");
    	

  
    	driver.get("http://orangeworld.co.uk/");
    	System.out.println(driver.getCurrentUrl());
    	
    	WebElement MenuTab = driver.findElementByXPath(Constants.MenuTab);
    	MenuTab.isDisplayed();
    	MenuTab.click();
    	Thread.sleep(3000);
    
   
    		//Menu Content Sports
    	WebElement MenuContent_Social = driver.findElementByXPath(Constants.MenuContent_Social);
    	MenuContent_Social.isDisplayed();
    	MenuContent_Social.click();
    	WebElement MenuContent_Social_BreadCrumb = driver.findElementByXPath(Constants.MenuContent_Social_BreadCrumb);
    	MenuContent_Social_BreadCrumb.isDisplayed();
    	System.out.println(MenuContent_Social_BreadCrumb.getTagName());
    	System.out.println("BreadCrumb name is: "+MenuContent_Social_BreadCrumb.getText());
    	WebElement Orange_Social_Life_Homepage = driver.findElementByXPath(Constants.Orange_Social_Life_Homepage);
    	Orange_Social_Life_Homepage.isDisplayed();
    	Orange_Social_Life_Homepage.click();
    	System.out.println(driver.getCurrentUrl());
    	
        
        driver.quit();
    }
}