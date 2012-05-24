package tests.ePrivacy;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ABC_Testing_aws {

	FirefoxDriver driver = new FirefoxDriver();

	@Test
	public void main() throws Exception {

		driver.manage().deleteAllCookies();
		driver.get("http://homepage.lbr.dev06.0itch.com");
		driver.manage().addCookie(
				new Cookie("oukPrivacyGroup", "control",
						"homepage.lbr.dev06.0itch.com", "/", null));
		driver.navigate().refresh();

		if (!driver.findElement(By.xpath("//*[@id='cookieBannerD']"))
				.isDisplayed()) {
			System.out.println("header message is NOT displayed");
		} else {
			System.out.println("header message is displayed-throw exception");
			throw new Exception("header message is displayed");

		}

		driver.manage().deleteAllCookies();
		driver.manage().addCookie(
				new Cookie("oukPrivacyGroup", "implicit",
						"homepage.lbr.dev06.0itch.com", "/", null));
		driver.navigate().refresh();

		if (driver.findElement(By.xpath("//*[@id='cookieBannerD']"))
				.isDisplayed()) {
			System.out.println("header message is displayed");
		} else {
			System.out.println("header message is NOT displayed-throw exception");
			throw new Exception("header message is NOT displayed");

		}

		driver.manage().deleteAllCookies();
		driver.manage().addCookie(
				new Cookie("oukPrivacyGroup", "explicit",
						"homepage.lbr.dev06.0itch.com", "/", null));
		driver.navigate().refresh();

		if (driver.findElement(By.xpath("//*[@class='LightBoxWindow']"))
				.isDisplayed()) {
			System.out.println("Lightbox is displayed");
		} else {
			System.out.println("Lightbox is NOT displayed-throw exception");
			throw new Exception("Lightbox is NOT displayed");

		}

		System.out.println("Test complete");
		driver.quit();

	}

}