package tests.ePrivacy;

import org.junit.Test;
import org.openqa.selenium.By;

import org.openqa.selenium.firefox.FirefoxDriver;

public class moreInfo_dpp {

	FirefoxDriver driver = new FirefoxDriver();

	@Test
	public void main() {

		driver.get("http://web.jl.dev.portaldev2.local/p/home/moreinfo?nocache=1");

		driver.findElement(By.id("what-are-cookies")).isDisplayed();
		driver.findElement(By.id("why-allow-cookies")).isDisplayed();
		driver.findElement(By.id("what-if-i-block-cookies")).isDisplayed();
		driver.findElement(By.id("how-can-i-block-cookies")).isDisplayed();

		System.out.println("Verify computer browser area");

		driver.findElement(By.xpath("//div[@class='browser-block-item rb bb']"))
				.isDisplayed();
		driver.findElement(
				By.xpath("//div[@class='browser-block-item rb bb']/div[@class='logo ie7']"))
				.isDisplayed();

		driver.findElement(By.xpath("//div[@class='browser-block-item rb bb']"))
				.isDisplayed();
		driver.findElement(
				By.xpath("//div[@class='browser-block-item rb bb']/div[@class='logo ie8']"))
				.isDisplayed();

		driver.findElement(By.xpath("//div[@class='browser-block-item bb']"))
				.isDisplayed();
		driver.findElement(
				By.xpath("//div[@class='browser-block-item bb']/div[@class='logo chrome']"))
				.isDisplayed();

		driver.findElement(By.xpath("//div[@class='browser-block-item rb']"))
				.isDisplayed();
		driver.findElement(
				By.xpath("//div[@class='browser-block-item rb']/div[@class='logo safari']"))
				.isDisplayed();

		driver.findElement(By.xpath("//div[@class='browser-block-item rb']"))
				.isDisplayed();
		driver.findElement(
				By.xpath("//div[@class='browser-block-item rb']/div[@class='logo firefox']"))
				.isDisplayed();

		System.out.println("Verify mobile browser area");

		driver.findElement(By.xpath("//div[@id='skip-to-mobile']/a"))
				.isDisplayed();
		driver.findElement(By.xpath("//div[@id='skip-to-mobile']/a")).click();
		driver.findElement(By.xpath("//div[@id='mobile-browsers']"))
				.isDisplayed();

		driver.findElement(By.xpath("//div[@class='browser-block-item rb']"))
				.isDisplayed();
		driver.findElement(
				By.xpath("//div[@class='browser-block-item rb']/div[@class='logo safari']"))
				.isDisplayed();

		driver.findElement(By.xpath("//div[@class='browser-block-item rb']"))
				.isDisplayed();
		driver.findElement(
				By.xpath("//div[@class='browser-block-item rb']/div[@class='logo android']"))
				.isDisplayed();

		driver.findElement(By.xpath("//div[@class='browser-block-item']"))
				.isDisplayed();
		driver.findElement(
				By.xpath("//div[@class='browser-block-item']/div[@class='logo wm7']"))
				.isDisplayed();

		System.out.println("Test finished.");

		driver.quit();

	}
}