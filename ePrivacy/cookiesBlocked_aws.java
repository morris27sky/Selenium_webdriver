package tests.ePrivacy;

//import java.util.Set;

import java.io.File;

import org.junit.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.Cookie;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class cookiesBlocked_aws {

	@Test
	public void main() {
////////////////////////Run this in Terminal to open firefox profile manager where you can then create your firefox profile//////////////////////
////////////////////////$/Applications/Firefox.app/Contents/MacOS/firefox-bin -p///////////////////////////////////////////////
		System.setProperty("webdriver.firefox.profile", "MySeleniumProfile");
		FirefoxProfile ffProfile = new FirefoxProfile(
				new File(
						"/Users/shivaraju/Library/Application Support/Firefox/Profiles/an7y7mgy.firefoxCookieDisabled"));
		WebDriver driver = new FirefoxDriver(ffProfile);

		driver.manage().deleteAllCookies();
		driver.get("http://homepage.lbr.dev06.0itch.com");
		if (driver.findElement(By.xpath("//*[@id='cookieBannerD']"))
				.isDisplayed()) {
			System.out.println("Cookie disabled header message is displayed");
		} else {
			System.out.println("Cookies disabled header message is not displayed");
			// return false;
		}

		driver.findElement(By.cssSelector("button.cookieButtonClose")).isDisplayed();
		driver.findElement(By.cssSelector("button.cookieFindOutMore")).isDisplayed();
		driver.findElement(By.cssSelector("button.cookieButtonClose")).click();
		driver.navigate().refresh();
		driver.findElement(By.cssSelector("button.cookieFindOutMore")).click();
		System.out.println(driver.findElement(By.cssSelector("#what-are-cookies span:first-child")).getText());
		System.out.println(driver.getCurrentUrl().contains("/p/home/learnmore_cookies_blocked"));
		System.out.println("Test complete");
		driver.quit();

	}

}