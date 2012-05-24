package tests.ePrivacy;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class lightbox_memberLogin_cookiesEnabled_dpp {

	FirefoxDriver driver = new FirefoxDriver();

	@Test
	public void main() {

		driver.manage().deleteAllCookies();
		driver.get("http://secureweb.c1.dev.portaldev2.local/id/signin.php");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		System.out.println(driver.findElement(
				By.xpath("//*[@class='inner']/form/fieldset/p[1]")).getText());
		System.out.println("Test complete");
		driver.quit();
	}
}