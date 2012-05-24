package tests.ePrivacy;

import java.util.Set;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.firefox.FirefoxDriver;

public class reminderBanner_dpp {

	FirefoxDriver driver = new FirefoxDriver();

	@Test
	public void main() {

		driver.manage().deleteAllCookies();

		driver.get("http://web.kl.dev.portaldev2.local/p/film/home?nocache=1");

		driver.manage().deleteAllCookies();

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

		driver.navigate().refresh();

		if (driver.findElement(By.xpath("//*[@id='cookieRemindBanner']"))
				.isDisplayed()) {
			System.out.println("reminder banner is displayed");
		} else {
			System.out.println("reminder banner NOT displayed");
			// return false;
		}

		if (driver.findElement(By.xpath("//a[contains(text(),'Find out more')]"))
				.isDisplayed()) {
			System.out.println("find out more link is displayed");
		} else {
			System.out.println("find out more link is NOT displayed");
		
			driver.navigate().refresh();
			driver.manage().deleteAllCookies();
			driver.findElement(
					By.xpath("//a[contains(text(),'Find out more')]")).click();
			System.out.println(driver.getCurrentUrl().contains(
					"/p/home/privacy"));
			
			driver.findElement(By.id("what-are-cookies")).isDisplayed();
			driver.findElement(By.id("why-allow-cookies")).isDisplayed();
			driver.findElement(By.id("what-if-i-block-cookies")).isDisplayed();
			driver.findElement(By.id("how-can-i-block-cookies")).isDisplayed();

		}

		Set<Cookie> allCookies3 = driver.manage().getCookies();
		for (Cookie loadedCookie : allCookies3) {
			System.out.println(String.format("%s -> %s",
					loadedCookie.getName(), loadedCookie.getValue()));
		}
		// Checking by name
		Cookie cookie1 = driver.manage().getCookieNamed("WT_FPC");

		if (cookie1.getName().startsWith("WT_FPC")) {
			System.out.println("cookie started with the string WT_FPC");
		} else {
			System.out.println("cookie did not start with the string WT_FPC");
		}

		System.out.println("Test complete");
		driver.quit();

	}

}