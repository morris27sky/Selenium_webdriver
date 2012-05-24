package tests.Melt.verification.New;
import net.sourceforge.htmlunit.corejs.javascript.JavaScriptException;
import org.openqa.selenium.By;
import org.openqa.selenium.iphone.*;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
//import org.openqa.selenium.android.AndroidDriver;
import java.lang.Thread;
import org.junit.Assert;
import org.junit.Test;
//import junit.framework.TestCase;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.NoSuchElementException;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.browserlaunchers.locators.*;
import org.openqa.selenium.WebDriverBackedSelenium;

public class Context_switcher_NewTab {

	public static void main(String[] args) throws Exception
	{

		FirefoxProfile ffProfile = new FirefoxProfile();
		ffProfile.setPreference("network.http.phishy-userpass-length", 255);
		WebDriver driver = new FirefoxDriver(ffProfile);
		//driver.get((Configuration.baseurl_dev02_roaming));
		driver.get("https://OrangeDigital:Or1971ngE@melt.adm.preprod.thundercontrol.com");
		System.out.println("*************Before clicking********************");
		Set<String> windowids = driver.getWindowHandles();
		Iterator<String> iter= windowids.iterator();
		
		while(iter.hasNext()){
			System.out.println(iter.next());
		}		
	
		WebElement ExpandMobileTree = driver.findElement(By.xpath(Configuration.ExpandMobile));
	       ExpandMobileTree.click();
	       Thread.sleep(3000);
	       
	       WebElement ExpandSegmentTree = driver.findElement(By.xpath(Configuration.ExpandSegment));
	       ExpandSegmentTree.click();
	       Thread.sleep(3000);
	       
	       WebElement Segment1 = driver.findElement(By.xpath(Configuration.MobileSegment));
	       Segment1.click();
	       Thread.sleep(3000);
	       
	       WebElement Header = driver.findElement(By.xpath(Configuration.Header));
	       Header.click();
	       Thread.sleep(3000);
	       
	       WebElement Favourites = driver.findElement(By.xpath(Configuration.Favourites));
	       Favourites.click();
	       Thread.sleep(3000);
	       
	       driver.findElement(By.xpath(Configuration.ExpandWeb)).click();
	       Thread.sleep(3000);
	       driver.findElement(By.xpath(Configuration.ExpandSegmentHome)).click();
	       
	       List <WebElement> links = driver.findElements(By.linkText("Homepage (desktop) - Segment 1"));
	       System.out.println(links.size());
	       String dyn_link = null;
	       System.out.println(links.get(0).getAttribute("href"));
	       dyn_link = links.get(0).getAttribute("href");
	       openTab(driver, dyn_link);
	     Set<String> handles = driver.getWindowHandles();
		    String current = driver.getWindowHandle();
	       handles.remove(current);
		    String newTab = handles.iterator().next();
		    Thread.sleep(9000);
		    driver.switchTo().window(newTab);
		    Thread.sleep(9000);
	       driver.findElement(By.linkText("header")).click();
	       Thread.sleep(9000);
	       driver.switchTo().window(current);
	       driver.navigate().refresh();	      
	       //driver.findElement(By.className("mceLayout")).isDisplayed();
	       
	       
	       
	}

	public static void openTab(WebDriver driver, String url)
	   {
		    String script = "var d=document,a=d.createElement('a');a.target='_blank';a.href='%s';a.innerHTML='.';d.body.appendChild(a);return a";
		    Object element = trigger(driver, String.format(script, url));
		    if (element instanceof WebElement) {
		        WebElement anchor = (WebElement) element; anchor.click();
		        trigger(driver, "var a=arguments[0];a.parentNode.removeChild(a);", anchor);
		    } else {
		        throw new JavaScriptException(element, "Unable to open tab", 1);
		    }       
		}
	   
	  public static Object trigger(WebDriver driver, String script) {
		    return ((JavascriptExecutor)driver).executeScript(script);
	   }
	   
	   public static void trigger(WebDriver driver, String script, WebElement element) {
		    ((JavascriptExecutor)driver).executeScript(script, element);
	
	//driver.quit();
	
	   }
		
	}


/*public static void assertLinkNotPresent(WebDriver driver, String text) {
try {
    driver.findElement(By.className("mceLayout"));
    fail("Link with text <" + text + "> is present");
} catch (NoSuchElementException ex) { 
    /* do nothing, link is not present, assert is passed */ 
//}		  


 // }

//private static void fail(String message) {
//System.out.println(message);
//System.exit(1);*/
