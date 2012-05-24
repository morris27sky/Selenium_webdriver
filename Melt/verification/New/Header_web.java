package tests.Melt.verification.New;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.MoveMouseAction;
import org.openqa.selenium.interactions.Actions;

import java.lang.Thread;
import org.junit.Assert;
import org.junit.Test;
import junit.framework.TestCase;

import tests.Melt.verification.New.Configuration;

public class Header_web {

   public static void main(String[] args) throws Exception {

       FirefoxProfile ffProfile = new FirefoxProfile();
       ffProfile.setPreference("network.http.phishy-userpass-length", 255);
       WebDriver driver = new FirefoxDriver(ffProfile);
       //driver.get(Configuration.baseurl_dev02_roaming);
       driver.get("https://OrangeDigital:Or1971ngE@melt.adm.preprod.thundercontrol.com");
       driver.findElement(By.xpath(Configuration.Segment5Tree)).click();
       Thread.sleep(3000);
       
       driver.findElement(By.xpath(Configuration.header_web)).click();
       
       WebElement HeaderLink4 = driver.findElement(By.id(Configuration.InsertMedia));
       new Select(HeaderLink4).selectByValue(Configuration.Link);
       
       driver.findElement(By.xpath(Configuration.Add)).click();
       Thread.sleep(3000);
       
       //URL
       driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input")).sendKeys("http://www.orange.co.uk");
       //Text
       driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input")).sendKeys("change to white page");
       
       WebElement ColourSwitcherBlack = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[11]/select"));
       new Select(ColourSwitcherBlack).selectByValue(Configuration.ColourSwitcherBlack);
       
       driver.findElement(By.xpath(Configuration.Add)).click();
       Thread.sleep(3000);
       
       //URL
       driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input")).sendKeys("http://www.orange.co.uk");
       //Text
       driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input")).sendKeys("change to black page");
       //content hint
       WebElement ColourSwitcherWhite = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[11]/select"));
       new Select(ColourSwitcherWhite).selectByValue(Configuration.ColourSwitcherWhite);
       
       driver.findElement(By.xpath(Configuration.Add)).click();
       Thread.sleep(3000);
       
       //URL
       driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input")).sendKeys("http://www.orange.co.uk/setashomepage.htm");
       //Text
       driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input")).sendKeys("make this your homepage");
       //Title
       driver.findElement(By.xpath("//div[@class='editFormContainer']//li[5]/input")).sendKeys("make this your homepage");
       //content hint
       WebElement MakeMyHomepage = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[11]/select"));
       new Select(MakeMyHomepage).selectByValue(Configuration.MakeMyHomepage);
       
       driver.findElement(By.xpath(Configuration.Add)).click();
       Thread.sleep(3000);

       
       //URL
       driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input")).sendKeys("http://search.orange.co.uk/toolbarv3/toolbar.htm");
       //Text
       driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input")).sendKeys("download Orange toolbar");
       //Title
       driver.findElement(By.xpath("//div[@class='editFormContainer']//li[5]/input")).sendKeys("download Orange toolbar");
       //Rel attribute
       driver.findElement(By.xpath("//div[@class='editFormContainer']//li[10]/input")).sendKeys("nofollow");
       
       driver.findElement(By.xpath(Configuration.Save)).click();
       
       driver.findElement(By.xpath(Configuration.Publish)).click();

       driver.findElement(By.xpath(Configuration.PublishAll)).click();
       
       Thread.sleep(3000);
 
       driver.get("http://homepage.lbr.dev02.0itch.com/index5.html");
       
       driver.findElement(By.xpath("//a[contains(text(),'change to white page')]")).isDisplayed();
       driver.findElement(By.linkText("download Orange toolbar")).isDisplayed();
       driver.findElement(By.linkText("make this your homepage")).isDisplayed();

       driver.findElement(By.linkText("change to white page")).click();
       
       driver.findElement(By.id("black-white-choice")).isDisplayed();
       driver.findElement(By.id("white-homepage-thumb")).click();
       driver.findElement(By.id("choices-confirm")).click();
       
       Thread.sleep(3000);
       
       driver.findElement(By.xpath("//meta [@name='WT.ti' and @content='Orange homepage 5 white']")).isDisplayed();
       driver.findElement(By.xpath("//a[contains(text(),'change to black page')]")).isDisplayed();
       driver.findElement(By.linkText("download Orange toolbar")).isDisplayed();
       driver.findElement(By.linkText("make this your homepage")).isDisplayed();
       
       driver.quit();
       
              
   }
}