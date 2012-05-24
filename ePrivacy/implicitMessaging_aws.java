package tests.ePrivacy;

import java.util.Set;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.firefox.FirefoxDriver;

public class implicitMessaging_aws {

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
		
		//driver.navigate().refresh();

		System.out.println("Test complete");
		driver.quit();

	}

}