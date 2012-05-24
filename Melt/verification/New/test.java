package tests.Melt.verification.New;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class test {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get((Configuration.baseurl));
		
		System.out.println("*************Before clicking********************");
		Set<String> windowids = driver.getWindowHandles();
		Iterator<String> iter= windowids.iterator();
		while(iter.hasNext()){
			System.out.println(iter.next());
		}

	driver.findElement(By.linkText("Homepage - Segment 6")).click();
		//driver.findElement(By.xpath("")).click();
		
		System.out.println("**************After clicking the tab link********************");
		
		 windowids = driver.getWindowHandles();
		 iter= windowids.iterator();
		 String mainWindowId=iter.next();
		 String tabbedWindowId=iter.next();
		 System.out.println(mainWindowId);
		 System.out.println(tabbedWindowId);
		Thread.sleep(3000L);
		// switch over to popup/tab
		/*driver.switchTo().window(tabbedWindowId);
		driver.findElement(By.xpath("")).click();
		System.out.println("********* AFTER CLICKING THE POPUP LINK");
		 windowids = driver.getWindowHandles();
		 iter= windowids.iterator();
		 iter.next();
		 iter.next();
		 String popupwindowid=iter.next();
		 System.out.println(mainWindowId);
		 System.out.println(tabbedWindowId);
		 System.out.println(popupwindowid);
		 driver.switchTo().window(popupwindowid);
		 driver.findElement(By.xpath("")).click();
		 
		 
		 driver.close(); // close the popup
		 driver.switchTo().window(tabbedWindowId);
		 driver.close(); // tab - new window
		 driver.switchTo().window(mainWindowId);
		 driver.close(); // main window
*/
		 
		
	}

}