package tests.ePrivacy;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class lightbox_memberSignup_orangeHomeBroadband_cookiesEnabled_dpp {

	FirefoxDriver driver = new FirefoxDriver();

	@Test
	public void main() {

		driver.get("http://secureweb.c1.dev.portaldev2.local/id/signin.php");
		driver.findElement(By.xpath("//a[contains(text(),'Orange home broadband')]")).click();
		System.out.println(driver.getCurrentUrl().contains(
		"/id/broadbandsignup.php"));
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		System.out.println(driver.getCurrentUrl().contains(
		"/id/broadbandsignup.php?rm=IdentityFormSubmit"));
		System.out.println("Test complete");
		driver.quit();
	}
}