package tests.Melt.verification.New;

import java.io.File;
import java.net.URISyntaxException;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.MoveMouseAction;
import org.openqa.selenium.interactions.Actions;

public class more_from_orange_single_container_web {

	public static void main(String[] args) throws Exception {
		FirefoxProfile ffProfile = new FirefoxProfile();
		ffProfile.setPreference("network.http.phishy-userpass-length", 255);
		WebDriver driver = new FirefoxDriver(ffProfile);

		//driver.get(Configuration.baseurl_dev02);
		driver.get("https://OrangeDigital:Or1971ngE@melt.adm.preprod.thundercontrol.com");
		driver.findElement(By.xpath(Configuration.Segment5Tree)).click();
		// Edit package
		driver.findElement(By.xpath(Configuration.MoreFromOrange_Web)).click();

		driver.findElement(By.xpath(Configuration.InsertPackage)).click();
		driver.findElement(By.xpath(Configuration.CreateNewPackage)).click();
		driver.findElement(By.xpath(Configuration.NewPackage)).click();
		driver.findElement(
				By.xpath("//div[@id='contents']/form/ul/li[2]/input")).clear();
		driver.findElement(
				By.xpath("//div[@id='contents']/form/ul/li[2]/input"))
				.sendKeys("More From Orange - promos 08/02 - single container");
		driver.findElement(By.xpath(Configuration.Save)).click();

		// Add links
		WebElement MenuLink1 = driver.findElement(By
				.id(Configuration.InsertMedia));
		new Select(MenuLink1).selectByValue(Configuration.LinkWithImage);

		driver.findElement(By.xpath(Configuration.Add)).click();
		Thread.sleep(3000);

		// URL
		driver.findElement(
				By.xpath("//div[@class='editFormContainer']//li[3]/input"))
				.sendKeys(
						"http://best-value-broadband.orange.co.uk/b/broadbandsignup/");
		// Text
		driver.findElement(
				By.xpath("//div[@class='editFormContainer']//li[4]/textarea"))
				.sendKeys("Exclusive £60 M&S voucher");
		// description
		driver.findElement(
				By.xpath("//div[@class='editFormContainer']//li[8]/textarea"))
				.sendKeys(
						"Sign up to our award-winning home broadband and calls, from just £5 per month");
		// alt
		driver.findElement(
				By.xpath("//div[@class='editFormContainer']//li[12]/input"))
				.sendKeys("Home broadband");
		driver.findElement(By.xpath("//input[@value='Browse...']")).click();
		Thread.sleep(9000);
		// driver.findElement(By.xpath("//input[@id='filePickerUpload']")).sendKeys("/Users/chrismorris/Desktop/planet.jpg");
		// driver.findElement(By.id("tagText")).sendKeys("planet");
		// driver.findElement(By.id("upload")).click();

		Thread.sleep(5000);
		driver.quit();

	}
}
