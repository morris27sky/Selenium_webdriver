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


public class iPhone_Menu_News {
    public static void main(String[] args) throws Exception {
        
    	
    	IPhoneDriver driver = new IPhoneDriver("http://192.168.0.39:3001/hub/");
    	

  
    	driver.get("http://orangeworld.co.uk/");
    	System.out.println(driver.getCurrentUrl());
    	
    	WebElement MenuTab = driver.findElementByXPath(Constants.MenuTab);
    	MenuTab.isDisplayed();
    	MenuTab.click();
    	Thread.sleep(3000);
    		// Menu Content news
    	WebElement MenuContent_News = driver.findElementByXPath(Constants.MenuContent_News);
    	MenuContent_News.isDisplayed();
    	MenuContent_News.click();
    	WebElement MenuContent_News_BreadCrumb = driver.findElementByXPath(Constants.MenuContent_News_BreadCrumb);
    	MenuContent_News_BreadCrumb.isDisplayed();
    	System.out.println("Bread Name is "+ MenuContent_News_BreadCrumb.getText());
    
    	WebElement News_and_Weather_homepage = driver.findElementByXPath(Constants.News_and_Weather_Homepage);
    	News_and_Weather_homepage.isDisplayed();
    	News_and_Weather_homepage.click();
    	
    	System.out.println("Test pass");
    
        driver.quit();
    }
}