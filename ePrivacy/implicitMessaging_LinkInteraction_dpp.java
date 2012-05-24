package tests.ePrivacy;

import java.util.Set;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.firefox.FirefoxDriver;

public class implicitMessaging_LinkInteraction_dpp {

	FirefoxDriver driver = new FirefoxDriver();

	@Test
	public void main() {

		driver.manage().deleteAllCookies();

		driver.get("http://web.kl.dev.portaldev2.local/p/sport/home?nocache=1");

		driver.manage().deleteAllCookies();

		if (driver.findElement(By.xpath("//*[@id='cookieBannerD']"))
				.isDisplayed()) {
			System.out.println("Header message is displayed");
		} else {
			System.out.println("Header message is not displayed");
			// return false;
		}

		driver.findElement(By.xpath("//a[contains(text(),'entertainment')]"))
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

		driver.findElement(By.xpath("//*[@id='cookieRemindBanner']"))
				.isDisplayed();

		System.out.println("Test complete");

		driver.quit();
	}

}
