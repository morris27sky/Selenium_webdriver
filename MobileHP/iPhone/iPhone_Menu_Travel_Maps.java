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


public class iPhone_Menu_Travel_Maps {
    public static void main(String[] args) throws Exception {
        
    	
    	IPhoneDriver driver = new IPhoneDriver("http://192.168.0.25:3001/hub/");
    	

  
    	driver.get("http://orangeworld.co.uk/");
    	System.out.println(driver.getCurrentUrl());
    	
    	WebElement MenuTab = driver.findElementByXPath(Constants.MenuTab);
    	MenuTab.isDisplayed();
    	MenuTab.click();
    	Thread.sleep(3000);
    
   
    		//Menu Content Travel and Maps
    	WebElement MenuContent_Travel_Maps = driver.findElementByXPath(Constants.MenuContent_Travel_Maps);
    	MenuContent_Travel_Maps.isDisplayed();
    	MenuContent_Travel_Maps.click();
    	WebElement MenuContent_Travel_Maps_BreadCrumb = driver.findElementByXPath(Constants.MenuContent_Travel_Maps_BreadCrumb);
    	MenuContent_Travel_Maps_BreadCrumb.isDisplayed();
    	System.out.println(MenuContent_Travel_Maps_BreadCrumb.getTagName());
    	System.out.println("BreadCrumb name is: "+MenuContent_Travel_Maps_BreadCrumb.getText());
    	WebElement Live_Train_Times_Homepage  = driver.findElementByXPath(Constants.Live_Train_Times_Homepage);
    	Live_Train_Times_Homepage.isDisplayed();
    	Live_Train_Times_Homepage.click();
    	System.out.println(driver.getCurrentUrl());
    	
        
        driver.quit();
    }
}