package tests.ePrivacy;

import java.util.Set;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.firefox.FirefoxDriver;

public class reminderBanner_aws {

	FirefoxDriver driver = new FirefoxDriver();

	@Test
	public void main() {

		driver.manage().deleteAllCookies();
		
		driver.get("http://homepage.lbr.dev06.0itch.com");
		driver.manage().addCookie(new Cookie("oukPrivacyGroup", "implicit"));
		driver.navigate().refresh();
		
		Set<Cookie> allCookies1 = driver.manage().getCookies();
		for (Cookie loadedCookie : allCookies1) {
			System.out.println(String.format("%s -> %s",
					loadedCookie.getName(), loadedCookie.getValue()));
		}
		Cookie Newscookie = driver.manage().getCookieNamed("oukPrivacyGroup");

		if (Newscookie.getName().startsWith("oukPrivacyGroup")) {
			System.out.println("cookie string is oukPrivacyGroup");
		} else {
			System.out.println("cookie string is oukPrivacyGroup");
		}

		driver.findElement(
				By.xpath("//*[@id='cookieBannerD']"))
				.isDisplayed();
		driver.findElement(
				By.cssSelector("button.cookieButtonClose"))
				.click();
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