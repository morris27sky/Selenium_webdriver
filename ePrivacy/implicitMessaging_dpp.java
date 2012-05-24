package tests.ePrivacy;

import java.util.Set;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.firefox.FirefoxDriver;

public class implicitMessaging_dpp {

	FirefoxDriver driver = new FirefoxDriver();

	@Test
	public void main() {

		driver.manage().deleteAllCookies();

		driver.get("http://web.kl.dev.portaldev2.local/p/film/home?nocache=1");

		driver.manage().deleteAllCookies();

		if (driver.findElement(By.xpath("//*[@id='cookieBannerD']"))
				.isDisplayed()) {
			System.out.println("Header message is displayed");
		} else {
			System.out.println("Header message is not displayed");
			// return false;
		}

		//hit close button
		driver.findElement(
				By.xpath("//div[@id='cookieBannerD']/div/div[2]/div/button"))
				.click();

		Set<Cookie> allCookies1 = driver.manage().getCookies();
		for (Cookie loadedCookie : allCookies1) {
			System.out.println(String.format("%s -> %s",
					loadedCookie.getName(), loadedCookie.getValue()));
		}
		Cookie Newscookie = driver.manage().getCookieNamed("AcceptanceCookie");

		if (Newscookie.getName().startsWith("AcceptanceCookie")) {
			System.out.println("cookie string is AcceptanceCookie");
		} else {
			System.out.println("cookie string is AcceptanceCookie");
		}

		Set<Cookie> allCookies = driver.manage().getCookies();
	       for (Cookie loadedCookie : allCookies) {
	           System.out.println(String.format("%s -> %s", loadedCookie.getName(), loadedCookie.getValue()));
	       }
	       //Checking by name
	       Cookie cookie = driver.manage().getCookieNamed("WT_FPC");
	       
	       if(cookie.getName().startsWith("WT_FPC")) {
	    	   System.out.println("cookie started with the string WT_FPC");
	       } else {
	    	   System.out.println("cookie did not start with the string WT_FPC");
	       }
	       
	       driver.manage().deleteAllCookies();
	       driver.navigate().refresh();
	       driver.manage().deleteAllCookies();
	       
	       //hit not sure about cookies button
	       driver.findElement(
					By.xpath("//div[@id='cookieBannerD']/div/div[2]/div[2]/button"))
					.click();
	       
	       Set<Cookie> allCookies2 = driver.manage().getCookies();
			for (Cookie loadedCookie : allCookies2) {
				System.out.println(String.format("%s -> %s",
						loadedCookie.getName(), loadedCookie.getValue()));
			}
			Cookie Newscookie1 = driver.manage().getCookieNamed("AcceptanceCookie");

			if (Newscookie1.getName().startsWith("AcceptanceCookie")) {
				System.out.println("cookie string is AcceptanceCookie");
			} else {
				System.out.println("cookie string is AcceptanceCookie");
			}

			Set<Cookie> allCookies3 = driver.manage().getCookies();
		       for (Cookie loadedCookie : allCookies3) {
		           System.out.println(String.format("%s -> %s", loadedCookie.getName(), loadedCookie.getValue()));
		       }
		       //Checking by name
		       Cookie cookie1 = driver.manage().getCookieNamed("WT_FPC");
		       
		       if(cookie1.getName().startsWith("WT_FPC")) {
		    	   System.out.println("cookie started with the string WT_FPC");
		       } else {
		    	   System.out.println("cookie did not start with the string WT_FPC");
		       }
		       
		System.out.println("Test complete");

		driver.quit();
	}

}
