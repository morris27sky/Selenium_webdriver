package tests.Hompepage;

//import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

import org.openqa.selenium.interactions.Actions;

//import tests.Melt.verification.New.Configuration;

public class on_the_go {

	public static void main(String[] args) throws Exception {
		
		FirefoxProfile ffProfile = new FirefoxProfile();
		ffProfile.setPreference("network.http.phishy-userpass-length", 255);
		WebDriver driver = new FirefoxDriver(ffProfile);
		driver.get("http://homepage.lbr.preprod.thundercontrol.com");

		//************************ONYL RUN THIS TEST IN DEV02*****************************
		Actions builder = new Actions(driver);

		//Test on the go on slot 1 content explorer
	    builder.moveToElement(driver.findElement(By.xpath("//a[@id='ce_pane1_slot1_imagelink1']/img"))).build().perform();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//a[@id='ce_pane1_slot1_summarylink1']/span/img")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@id='mobile_number']")).sendKeys("07931660810");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@id='submit_button']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@id='pin_number']")).sendKeys("5555");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[@id='verify_container']/input")).click();
	    Thread.sleep(20000);
	    driver.findElement(By.xpath("//div[@id='tooltip_inner']")).isDisplayed();
	    driver.findElement(By.xpath("//img[@alt='close']")).click();
	    
	    //Test on the go on slot 2 content explorer
	    driver.findElement(By.xpath("//a[@id='ce_pane1_slot2_summarylink1']/span/img")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@id='send_button']")).isDisplayed();
	    driver.findElement(By.xpath("//input[@id='new_number']")).sendKeys("07931660810");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@id='new_button']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@id='pin_number']")).sendKeys("5555");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[@id='verify_container']/input")).click();
	    Thread.sleep(15000);
	    driver.findElement(By.xpath("//div[@id='tooltip_inner']")).isDisplayed();
	    driver.findElement(By.xpath("//img[@alt='close']")).click();
	    
	    //Test on the go on slot 3 content explorer
	    builder.moveToElement(driver.findElement(By.xpath("//a[@id='ce_pane1_slot3_imagelink1']/img"))).build().perform();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//a[@id='ce_pane1_slot3_summarylink1']/span/img")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@id='send_button']")).isDisplayed();
	    driver.findElement(By.xpath("//input[@id='new_number']")).sendKeys("07931660810");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@id='new_button']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@id='pin_number']")).sendKeys("5555");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[@id='verify_container']/input")).click();
	    Thread.sleep(15000);
	    driver.findElement(By.xpath("//div[@id='tooltip_inner']")).isDisplayed();
	    driver.findElement(By.xpath("//img[@alt='close']")).click();	    
	  
	    
	    
		Thread.sleep(4000);
		driver.quit();

	}
}
