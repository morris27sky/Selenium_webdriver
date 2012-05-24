package tests.Melt.verification.New;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.MoveMouseAction;
import org.openqa.selenium.interactions.Actions;


public class more_from_orange_web {

	public static void main(String[] args) throws Exception {

	       FirefoxProfile ffProfile = new FirefoxProfile();
	       ffProfile.setPreference("network.http.phishy-userpass-length", 255);
	       WebDriver driver = new FirefoxDriver(ffProfile);
	      // driver.get(Configuration.baseurl_dev02_roaming);
	       driver.get("https://OrangeDigital:Or1971ngE@melt.adm.preprod.thundercontrol.com");
	  //Actions builder = new Actions(driver);
      
	  driver.findElement(By.xpath(Configuration.Segment5Tree)).click();
      //Edit package
      driver.findElement(By.xpath(Configuration.MoreFromOrange_Web)).click();
      
      driver.findElement(By.xpath(Configuration.InsertPackage)).click();
      driver.findElement(By.xpath(Configuration.CreateNewPackage)).click();
      driver.findElement(By.xpath(Configuration.NewPackage)).click();
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[2]/input")).clear();
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[2]/input")).sendKeys("More From Orange - promos 08/02");
      driver.findElement(By.xpath(Configuration.Save)).click();
      
      //Add links
      WebElement MenuLink1 = driver.findElement(By.id(Configuration.InsertMedia));
      new Select(MenuLink1).selectByValue(Configuration.LinkWithImage);
      
      driver.findElement(By.xpath(Configuration.Add)).click();
      Thread.sleep(3000);
      
      //URL
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input")).sendKeys("http://best-value-broadband.orange.co.uk/b/broadbandsignup/");
      //Text
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/textarea")).sendKeys("Exclusive £60 M&S voucher");
      //description
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[8]/textarea")).sendKeys("Sign up to our award-winning home broadband and calls, from just £5 per month");
      //alt
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[12]/input")).sendKeys("Home broadband");      
      driver.findElement(By.xpath("//input[@value='Browse...']")).click();
      Thread.sleep(5000);
      driver.findElement(By.xpath("//*[@id='searchInput']")).sendKeys("moregreatstuff_homebroadband-1.JPG");
      Thread.sleep(6000);
      driver.findElement(By.xpath(Configuration.CheckBox)).click();      
      driver.findElement(By.xpath(Configuration.OK)).click();
      
      driver.findElement(By.xpath(Configuration.Add)).click();
      Thread.sleep(5000);
      
      //URL
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input")).sendKeys("http://www.orange.co.uk/orangecash");
      //Text
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/textarea")).sendKeys("Orange Cash");
      //description
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[8]/textarea")).sendKeys("Load, shop, get rewarded. A prepaid card that rewards you for being with Orange");
      //alt
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[12]/input")).sendKeys("Orange Cash");      
      driver.findElement(By.xpath("//input[@value='Browse...']")).click();
      Thread.sleep(3000);
      driver.findElement(By.xpath("//*[@id='searchInput']")).clear();
      driver.findElement(By.xpath("//*[@id='searchInput']")).sendKeys("01-orange-cash.jpg");
      Thread.sleep(6000);
      driver.findElement(By.xpath(Configuration.CheckBox)).click();      
      driver.findElement(By.xpath(Configuration.OK)).click();
      
      driver.findElement(By.xpath(Configuration.Add)).click();
      Thread.sleep(5000);
      
      //URL
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input")).sendKeys("http://www.orangerecycle.co.uk/?utm_source=orange.co.uk%2Fmobilerewards&utm_medium=banner&utm_campaign=mobilerewards");
      //Text
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/textarea")).sendKeys("Recycle and Reward");
      //description
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[8]/textarea")).sendKeys("Got an old phone in your drawer? Send it to us and get up to £250");
      //alt
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[12]/input")).sendKeys("Recycle and Reward");      
      driver.findElement(By.xpath("//input[@value='Browse...']")).click();
      Thread.sleep(3000);
      driver.findElement(By.xpath("//*[@id='searchInput']")).clear();
      driver.findElement(By.xpath("//*[@id='searchInput']")).sendKeys("recycle-and-reward.jpg");
      Thread.sleep(6000);
      driver.findElement(By.xpath(Configuration.CheckBox)).click();      
      driver.findElement(By.xpath(Configuration.OK)).click();
      
      driver.findElement(By.xpath(Configuration.Save)).click();
     
      Thread.sleep(2000);
      driver.quit();
	}
	
}