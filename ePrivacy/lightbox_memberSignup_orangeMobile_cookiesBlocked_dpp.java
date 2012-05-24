package tests.ePrivacy;

import java.io.File;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class lightbox_memberSignup_orangeMobile_cookiesBlocked_dpp {

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
		driver.get("http://secureweb.c1.dev.portaldev2.local/id/signin.php");
		driver.findElement(By.xpath("//a[contains(text(),'Orange mobile')]")).click();
		
		if (driver.findElement(By.xpath("//*[@class='LightBoxWindow']"))
				.isDisplayed()) {
			System.out.println("Lightbox is displayed");
		} else {
			System.out.println("Lightbox is not displayed");
			// return false;
		}

		driver.findElement(By.xpath("//*[@id='identity_lightbox_retry']"))
				.isDisplayed();
		driver.findElement(
				By.xpath("//a[contains(text(),'no thanks, take me back')]"))
				.isDisplayed();
		System.out.println(driver.findElement(
				By.xpath("//*[@class='LightBoxWindow']/div/h3")).getText());
		
		driver.findElement(
				By.xpath("//a[contains(text(),'no thanks, take me back')]"))
				.click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();	
		
		driver.findElement(By.xpath("//*[@id='identity_lightbox_retry']"))
				.click();
		driver.findElement(By.xpath("//*[@class='LightBoxWindow']"))
				.isDisplayed();
		System.out.println(driver.findElement(
				By.xpath("//*[@class='LightBoxWindow']/div/h3")).getText());
		driver.findElement(By.xpath("//*[@id='identity_lightbox_retry']"))
				.isDisplayed();
		driver.findElement(
				By.xpath("//a[contains(text(),'no thanks, take me back')]"))
				.isDisplayed();
		driver.findElement(
				By.xpath("//a[contains(text(),'no thanks, take me back')]"))
				.click();
		
		//mobile signup page
		
		driver.get("http://secureweb.c1.dev.portaldev2.local/id/mobilesignup.php");
driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		if (driver.findElement(By.xpath("//*[@class='LightBoxWindow']"))
				.isDisplayed()) {
			System.out.println("Lightbox is displayed");
		} else {
			System.out.println("Lightbox is not displayed");
			// return false;
		}

		driver.findElement(By.xpath("//*[@id='identity_lightbox_retry']"))
				.isDisplayed();
		driver.findElement(
				By.xpath("//a[contains(text(),'no thanks, take me back')]"))
				.isDisplayed();
		System.out.println(driver.findElement(
				By.xpath("//*[@class='LightBoxWindow']/div/h3")).getText());
		
		driver.findElement(By.xpath("//*[@id='identity_lightbox_retry']"))
				.click();
		driver.findElement(By.xpath("//*[@class='LightBoxWindow']"))
				.isDisplayed();
		System.out.println(driver.findElement(
				By.xpath("//*[@class='LightBoxWindow']/div/h3")).getText());
		driver.findElement(By.xpath("//*[@id='identity_lightbox_retry']"))
				.isDisplayed();
		driver.findElement(
				By.xpath("//a[contains(text(),'no thanks, take me back')]"))
				.isDisplayed();
		driver.findElement(
				By.xpath("//a[contains(text(),'no thanks, take me back')]"))
				.click();
		
		System.out.println("Test complete");
		driver.quit();
	}
}