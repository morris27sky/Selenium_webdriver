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
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.interactions.touch.TouchActions;
//import org.openqa.selenium.interactions.touch.FlickAction;
//import org.openqa.selenium.remote.server.handler.interactions.touch.Scroll;

import java.io.File;
import java.lang.Thread;
import java.util.Date;
import java.util.List;

public class Android_CheckAllLinks {
    public static void main(String[] args) throws Exception {
        
    	//http://google-opensource.blogspot.com/2011/10/test-your-mobile-web-apps-with.html
    	  
    	//AndroidDriver driver = new AndroidDriver();
    	FirefoxProfile ffProfile = new FirefoxProfile();
        ffProfile.setPreference("network.http.phishy-userpass-length", 255);
        WebDriver driver = new FirefoxDriver(ffProfile);
    	
    	
    	driver.get("http://homepage-mobile.lbr.dev02.0itch.com/?beta=1");
    	System.out.println(driver.getCurrentUrl());
    	
    	System.out.println("Current url:"+driver.getCurrentUrl());


           List<WebElement> allLinks = driver.findElements(By.tagName("a href"));
           for (WebElement link : allLinks) {
             boolean loaded = (Boolean) ((JavascriptExecutor) driver).executeScript("return arguments[0].complete", link);
             if (!loaded) {
             	System.out.println("Links not loaded: "+link.getAttribute("src"));
             } else {
           	  // Do nothing
             }
           }     
           driver.quit();

 }
}