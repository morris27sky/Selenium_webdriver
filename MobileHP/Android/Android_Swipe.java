package tests.MobileHP.Android;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.internal.BaseAction;
import org.openqa.selenium.interactions.internal.TouchAction;
import org.openqa.selenium.interactions.touch.FlickAction;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.android.AndroidDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.interactions.touch.FlickAction;

import java.io.File;
import java.lang.Thread;
import java.util.Date;
import java.util.List;

public class Android_Swipe {
    public static void main(String[] args) throws Exception {
        
    	//http://google-opensource.blogspot.com/2011/10/test-your-mobile-web-apps-with.html
    	  
    	AndroidDriver driver = new AndroidDriver();
    	
    	driver.get("http://homepage-mobile.lbr.dev01.0itch.com/?beta=1");
    	System.out.println(driver.getCurrentUrl());
    	
    	System.out.println("Current url:"+driver.getCurrentUrl());
        //Thread.sleep(100);
        
    	TouchActions Action_flick = new TouchActions(driver);
    	
    	//your relationship
    	WebElement YourRelationshipSwipe1 = driver.findElement(By.xpath("//div[@id='rel-scroll']/ul/li[2]/div/a/img"));
    	//System.out.println(swipe2.getTagName());  
    	Action_flick.flick(YourRelationshipSwipe1, -100, 0, FlickAction.SPEED_NORMAL);
    	Action_flick.build().perform();
    	Thread.sleep(1000);
    	
    	//content explorer
     	WebElement ContentExplorerSwipe1 = driver.findElement(By.xpath("//*[@id='exp-scroll']/div/article[4]/a"));
     	Action_flick.flick(ContentExplorerSwipe1, -50, 0, FlickAction.SPEED_NORMAL);
    	Thread.sleep(100);
    	Action_flick.build().perform();
    	Thread.sleep(1000);

    	//premium content
     	WebElement PremiumSwipe1 = driver.findElement(By.xpath("//*[@id='prem-scroll']/div/article[4]/a/span"));
     	Action_flick.flick(PremiumSwipe1, -50, 0, FlickAction.SPEED_NORMAL);
    	Thread.sleep(100);
    	Action_flick.build().perform();
    	Thread.sleep(1000);

    	//more from orange
     	WebElement MoreSwipe1 = driver.findElement(By.xpath("//*[@id='more-scroll']/div/article[4]/a"));
     	Action_flick.flick(MoreSwipe1, -50, 0, FlickAction.SPEED_NORMAL);
    	Thread.sleep(100);
    	Action_flick.build().perform();
    	Thread.sleep(1000);

    	//trending search
     	WebElement TrendingSwipe1 = driver.findElement(By.xpath("//*[@id='bookmarks-scroll']/ul/li[4]"));
     	Action_flick.flick(TrendingSwipe1, -50, 0, FlickAction.SPEED_NORMAL);
    	Thread.sleep(100);
    	Action_flick.build().perform();
    	
    }
}