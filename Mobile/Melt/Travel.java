package tests.Mobile.Melt;

import org.openqa.selenium.By;
import org.openqa.selenium.iphone.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.android.AndroidDriver;
import java.lang.Thread;
import org.junit.Assert;
import org.junit.Test;
//import junit.framework.TestCase;

import tests.Melt.verification.New.Configuration;

public class Travel {

   public static void main(String[] args) throws Exception {

       FirefoxProfile ffProfile = new FirefoxProfile();
       ffProfile.setPreference("network.http.phishy-userpass-length", 255);
       WebDriver driver = new FirefoxDriver(ffProfile);
       driver.get(Configuration.baseurl);
       Thread.sleep(3000);

       WebElement ExpandMobileTree = driver.findElement(By.xpath(Configuration.ExpandMobile));
       ExpandMobileTree.click();
       Thread.sleep(3000);
       
       WebElement ExpandSegmentTree = driver.findElement(By.xpath(Configuration.ExpandSegment));
       ExpandSegmentTree.click();
       Thread.sleep(3000);
       
       WebElement Segment1 = driver.findElement(By.xpath(Configuration.MobileSegment1));
       Segment1.click();
       Thread.sleep(3000);
       
       WebElement Travel = driver.findElement(By.xpath(Configuration.Travel));
       Travel.click();
       Thread.sleep(3000);
   
       
}

}