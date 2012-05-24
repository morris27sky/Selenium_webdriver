package tests.Melt.verification.New;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.MoveMouseAction;
import org.openqa.selenium.interactions.Actions;


public class mega_menu_web {

	public static void main(String[] args) throws Exception {

	       FirefoxProfile ffProfile = new FirefoxProfile();
	       ffProfile.setPreference("network.http.phishy-userpass-length", 255);
	       WebDriver driver = new FirefoxDriver(ffProfile);
	       Actions builder = new Actions(driver);
	      driver.get(Configuration.web_url_live);
      
	  driver.findElement(By.xpath(Configuration.Segment5Tree)).click();
      //Edit package
      driver.findElement(By.xpath(Configuration.LastVisited_mega_menu)).click();
      ////////////////////////////////////////////////////////Mega menu - lifestyle tab//////////////////////////////////////////////////////////

      //create Mega menu - lifestyle tab 
      driver.findElement(By.xpath(Configuration.InsertPackage)).click();
      driver.findElement(By.xpath(Configuration.CreateNewPackage)).click();
      driver.findElement(By.xpath(Configuration.NewPackage)).click();
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[2]/input")).clear();
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[2]/input")).sendKeys("Mega menu - lifestyle tab");
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[3]/input")).clear();
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[3]/input")).sendKeys("lifestyle");
      driver.findElement(By.xpath(Configuration.Save)).click();
      driver.findElement(By.xpath(Configuration.InsertPackage)).click();
      driver.findElement(By.xpath(Configuration.CreateNewPackage)).click();
      driver.findElement(By.xpath(Configuration.NewPackage)).click();
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[2]/input")).clear();
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[2]/input")).sendKeys("Mega menu - lifestyle - Column 1");
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[3]/input")).clear();
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[3]/input")).sendKeys("Mega menu - lifestyle - Column 1");
      
      //Add links
      WebElement MenuLink1 = driver.findElement(By.id(Configuration.InsertMedia));
      new Select(MenuLink1).selectByValue(Configuration.Link);
      
      driver.findElement(By.xpath(Configuration.Add)).click();
      Thread.sleep(3000);
      
      //URL
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input")).sendKeys("http://www.orange.co.uk/wikipedia");
      //Text
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input")).sendKeys("Wikipedia");
      //content hint
      WebElement wiki = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[11]/select"));
      new Select(wiki).selectByValue(Configuration.mm_wiki);
      
      driver.findElement(By.xpath(Configuration.Add)).click();
      Thread.sleep(3000);
      
      //URL
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input")).sendKeys("http://web.orange.co.uk/p/travel/home");
      //Text
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input")).sendKeys("travel");
      
      driver.findElement(By.xpath(Configuration.Add)).click();
      Thread.sleep(3000);
      
      //URL
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input")).sendKeys("http://web.orange.co.uk/p/sport/home");
      //Text
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input")).sendKeys("sport");
      
      driver.findElement(By.xpath(Configuration.Add)).click();
      Thread.sleep(3000);

      
      //URL
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input")).sendKeys("http://web.orange.co.uk/p/lifestyle/home");
      //Text
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input")).sendKeys("lifestyle");
      //content hint
      WebElement highlight = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[11]/select"));
      new Select(highlight).selectByValue(Configuration.mm_highlight);
      
      driver.findElement(By.xpath(Configuration.Save)).click();
      Thread.sleep(9000);
      
      driver.findElement(By.xpath("//a[contains(text(),'Mega menu - lifestyle tab')]")).click();
      
      //Add link
      WebElement MenuLink2 = driver.findElement(By.id(Configuration.InsertMedia));
      new Select(MenuLink2).selectByValue(Configuration.Link);
      
      driver.findElement(By.xpath(Configuration.Add)).click();
      Thread.sleep(3000);
      
      //URL
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input")).sendKeys("http://web.orange.co.uk/p/lifestyle/home");
      //Text
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input")).sendKeys("lifestyle");
      
      driver.findElement(By.xpath(Configuration.Save)).click();
      driver.findElement(By.xpath(Configuration.Publish)).click();
      driver.findElement(By.xpath(Configuration.PublishAll)).click();
      driver.get("http://homepage.lbr.preprod.thundercontrol.com/index5.html");
      builder.moveToElement(driver.findElement(By.xpath(Configuration.lifestyle))).build().perform();
      
      
      ////////////////////////////////////////////////////////Mega menu - entertainment tab//////////////////////////////////////////////////////////
      
      driver.get(Configuration.baseurl_preprod_roaming);
      driver.findElement(By.xpath(Configuration.Segment5Tree)).click();
      //Edit package
      driver.findElement(By.xpath(Configuration.LastVisited_mega_menu)).click();
      
      //create Mega menu - entertainment tab
      driver.findElement(By.xpath(Configuration.InsertPackage)).click();
      driver.findElement(By.xpath(Configuration.CreateNewPackage)).click();
      driver.findElement(By.xpath(Configuration.NewPackage)).click();
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[2]/input")).clear();
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[2]/input")).sendKeys("Mega menu - entertainment tab");
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[3]/input")).clear();
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[3]/input")).sendKeys("entertainment");
      driver.findElement(By.xpath(Configuration.Save)).click();
      
      driver.findElement(By.xpath(Configuration.InsertPackage)).click();
      driver.findElement(By.xpath(Configuration.CreateNewPackage)).click();
      driver.findElement(By.xpath(Configuration.NewPackage)).click();
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[2]/input")).clear();
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[2]/input")).sendKeys("Mega menu - entertainment tab - Column 2");
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[3]/input")).clear();
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[3]/input")).sendKeys("Mega menu - entertainment tab - Column 2");
      
      //Add links
      WebElement MenuLink3 = driver.findElement(By.id(Configuration.InsertMedia));
      new Select(MenuLink3).selectByValue(Configuration.Link);
      
      driver.findElement(By.xpath(Configuration.Add)).click();
      Thread.sleep(3000);
      
      //URL
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input")).sendKeys("http://web.orange.co.uk/p/web_musicstore/thisweek");
      //Text
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input")).sendKeys("mobile downloads");
      
      driver.findElement(By.xpath(Configuration.Add)).click();
      Thread.sleep(3000);
      
      //URL
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input")).sendKeys("http://web.orange.co.uk/p/games/");
      //Text
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input")).sendKeys("games");
      
      driver.findElement(By.xpath(Configuration.Add)).click();
      Thread.sleep(3000);
      
      //URL
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input")).sendKeys("http://www.orangerockcorps.co.uk/");
      //Text
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input")).sendKeys("RockCorps");
      
      driver.findElement(By.xpath(Configuration.Add)).click();
      Thread.sleep(3000);

      
      //URL
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input")).sendKeys("http://web.orange.co.uk/p/monkey/");
      //Text
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input")).sendKeys("Monkey");
      
      driver.findElement(By.xpath(Configuration.Add)).click();
      Thread.sleep(3000);
      
      //URL
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input")).sendKeys("http://web.orange.co.uk/p/musichub/");
      //Text
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input")).sendKeys("music");
      
      driver.findElement(By.xpath(Configuration.Save)).click();
      
      driver.findElement(By.xpath("//a[contains(text(),'Mega menu - entertainment tab')]")).click();
      
      driver.findElement(By.xpath(Configuration.InsertPackage)).click();
      driver.findElement(By.xpath(Configuration.CreateNewPackage)).click();
      driver.findElement(By.xpath(Configuration.NewPackage)).click();
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[2]/input")).clear();
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[2]/input")).sendKeys("Mega menu - entertainment tab - Column 1");
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[3]/input")).clear();
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[3]/input")).sendKeys("Mega menu - entertainment tab - Column 1");
      
      //Add links
      WebElement MenuLink4 = driver.findElement(By.id(Configuration.InsertMedia));
      new Select(MenuLink4).selectByValue(Configuration.Link);
      
      driver.findElement(By.xpath(Configuration.Add)).click();
      Thread.sleep(3000);
      
      //URL
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input")).sendKeys("http://web.orange.co.uk/p/tv/home");
      //Text
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input")).sendKeys("tv");
      
      driver.findElement(By.xpath(Configuration.Add)).click();
      Thread.sleep(3000);
      
      //URL
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input")).sendKeys("http://web.orange.co.uk/p/film/togo");
      //Text
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input")).sendKeys("Orange Wednesdays & film");
      
      driver.findElement(By.xpath(Configuration.Add)).click();
      Thread.sleep(3000);
      
      //URL
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input")).sendKeys("http://web.orange.co.uk/celebsandstyle/home");
      //Text
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input")).sendKeys("celebs & style");
      
      driver.findElement(By.xpath(Configuration.Add)).click();
      Thread.sleep(3000);

      
      //URL
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input")).sendKeys("http://web.orange.co.uk/p/news/entertainment");
      //Text
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input")).sendKeys("entertainment news");
      
      driver.findElement(By.xpath(Configuration.Add)).click();
      Thread.sleep(3000);
      
      //URL
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input")).sendKeys("http://web.orange.co.uk/p/entertainment/home");
      //Text
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input")).sendKeys("entertainment");
      //content hint
      WebElement entertainment = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[11]/select"));
      new Select(entertainment).selectByValue(Configuration.mm_highlight);
      
      driver.findElement(By.xpath(Configuration.Save)).click();
      Thread.sleep(9000);
    
      driver.findElement(By.xpath("//a[contains(text(),'Mega menu - entertainment tab')]")).click();

      //Add links
      WebElement MenuLink5 = driver.findElement(By.id(Configuration.InsertMedia));
      new Select(MenuLink5).selectByValue(Configuration.Link);
      
      driver.findElement(By.xpath(Configuration.Add)).click();
      Thread.sleep(3000);
      
      //URL
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input")).sendKeys("http://web.orange.co.uk/p/entertainment/home");
      //Text
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input")).sendKeys("entertainment");
      
      driver.findElement(By.xpath(Configuration.Save)).click();
      driver.findElement(By.xpath(Configuration.Publish)).click();
      driver.findElement(By.xpath(Configuration.PublishAll)).click();
      driver.get("http://homepage.lbr.preprod.thundercontrol.com/index5.html");
      builder.moveToElement(driver.findElement(By.xpath(Configuration.ents))).build().perform();

      ////////////////////////////////////////////////////////Mega menu - news tab//////////////////////////////////////////////////////////

      driver.get(Configuration.baseurl_preprod_roaming);
      driver.findElement(By.xpath(Configuration.Segment5Tree)).click();
      //Edit package
      driver.findElement(By.xpath(Configuration.LastVisited_mega_menu)).click();
      
      //create Mega menu - entertainment tab
      driver.findElement(By.xpath(Configuration.InsertPackage)).click();
      driver.findElement(By.xpath(Configuration.CreateNewPackage)).click();
      driver.findElement(By.xpath(Configuration.NewPackage)).click();
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[2]/input")).clear();
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[2]/input")).sendKeys("Mega menu - news tab");
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[3]/input")).clear();
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[3]/input")).sendKeys("news");
      driver.findElement(By.xpath(Configuration.Save)).click();
      
      driver.findElement(By.xpath(Configuration.InsertPackage)).click();
      driver.findElement(By.xpath(Configuration.CreateNewPackage)).click();
      driver.findElement(By.xpath(Configuration.NewPackage)).click();
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[2]/input")).clear();
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[2]/input")).sendKeys("Mega menu - news tab - Column 3");
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[3]/input")).clear();
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[3]/input")).sendKeys("Mega menu - news tab - Column 3");

      //Add links
      WebElement MenuLink6 = driver.findElement(By.id(Configuration.InsertMedia));
      new Select(MenuLink6).selectByValue(Configuration.Link);
      
      driver.findElement(By.xpath(Configuration.Add)).click();
      Thread.sleep(3000);
      
      //URL
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input")).sendKeys("http://web.orange.co.uk/p/news/in_depth");
      //Text
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input")).sendKeys("in depth");
      
      driver.findElement(By.xpath(Configuration.Add)).click();
      Thread.sleep(3000);
      
      //URL
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input")).sendKeys("http://web.orange.co.uk/p/news/pictures");
      //Text
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input")).sendKeys("pictures");
      
      driver.findElement(By.xpath(Configuration.Add)).click();
      Thread.sleep(3000);
      
      //URL
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input")).sendKeys("http://web.orange.co.uk/p/news/video");
      //Text
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input")).sendKeys("videos");
      
      driver.findElement(By.xpath(Configuration.Save)).click();
      Thread.sleep(9000);
      
      driver.findElement(By.xpath("//a[contains(text(),'Mega menu - news tab')]")).click();
      
      driver.findElement(By.xpath(Configuration.InsertPackage)).click();
      driver.findElement(By.xpath(Configuration.CreateNewPackage)).click();
      driver.findElement(By.xpath(Configuration.NewPackage)).click();
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[2]/input")).clear();
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[2]/input")).sendKeys("Mega menu - news tab - Column 2");
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[3]/input")).clear();
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[3]/input")).sendKeys("Mega menu - news tab - Column 2");
      
      //Add links
      WebElement MenuLink7 = driver.findElement(By.id(Configuration.InsertMedia));
      new Select(MenuLink7).selectByValue(Configuration.Link);
      
      driver.findElement(By.xpath(Configuration.Add)).click();
      Thread.sleep(3000);
      
      //URL
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input")).sendKeys("http://orangeuk.accuweather.com/orange/index.asp");
      //Text
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input")).sendKeys("weather");
      
      driver.findElement(By.xpath(Configuration.Add)).click();
      Thread.sleep(3000);
      
      //URL
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input")).sendKeys("http://web.orange.co.uk/p/news/technology");
      //Text
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input")).sendKeys("technology");
      
      driver.findElement(By.xpath(Configuration.Add)).click();
      Thread.sleep(3000);
      
      //URL
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input")).sendKeys("http://web.orange.co.uk/p/news/quirkies");
      //Text
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input")).sendKeys("quirkies");
      
      driver.findElement(By.xpath(Configuration.Add)).click();
      Thread.sleep(3000);
      
      //URL
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input")).sendKeys("http://web.orange.co.uk/p/sport/headlines");
      //Text
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input")).sendKeys("sport");
      
      driver.findElement(By.xpath(Configuration.Save)).click();
      Thread.sleep(9000);
      
      driver.findElement(By.xpath("//a[contains(text(),'Mega menu - news tab')]")).click();
      
      driver.findElement(By.xpath(Configuration.InsertPackage)).click();
      driver.findElement(By.xpath(Configuration.CreateNewPackage)).click();
      driver.findElement(By.xpath(Configuration.NewPackage)).click();
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[2]/input")).clear();
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[2]/input")).sendKeys("Mega menu - news tab - Column 1");
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[3]/input")).clear();
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[3]/input")).sendKeys("Mega menu - news tab - Column 1");
      
      //Add links
      WebElement MenuLink8 = driver.findElement(By.id(Configuration.InsertMedia));
      new Select(MenuLink8).selectByValue(Configuration.Link);
      
      driver.findElement(By.xpath(Configuration.Add)).click();
      Thread.sleep(3000);
      //URL
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input")).sendKeys("http://web.orange.co.uk/p/news/finance");
      //Text
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input")).sendKeys("finance");
      
      driver.findElement(By.xpath(Configuration.Add)).click();
      Thread.sleep(3000);
      
      //URL
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input")).sendKeys("http://web.orange.co.uk/p/news/entertainment");
      //Text
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input")).sendKeys("entertainment");
      
      driver.findElement(By.xpath(Configuration.Add)).click();
      Thread.sleep(3000);

      
      //URL
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input")).sendKeys("http://web.orange.co.uk/p/news/uk_world");
      //Text
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input")).sendKeys("uk & world");
      
      driver.findElement(By.xpath(Configuration.Add)).click();
      Thread.sleep(3000);
      
      //URL
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input")).sendKeys("http://web.orange.co.uk/p/news/");
      //Text
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input")).sendKeys("news");
      //content hint
      WebElement news = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[11]/select"));
      new Select(news).selectByValue(Configuration.mm_highlight);
      
      driver.findElement(By.xpath(Configuration.Save)).click();
      Thread.sleep(9000);
      
      driver.findElement(By.xpath("//a[contains(text(),'Mega menu - news tab')]")).click();
      
      //Add links
      WebElement MenuLink9 = driver.findElement(By.id(Configuration.InsertMedia));
      new Select(MenuLink9).selectByValue(Configuration.Link);
      
      driver.findElement(By.xpath(Configuration.Add)).click();
      Thread.sleep(3000);
      
      //URL
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input")).sendKeys("http://web.orange.co.uk/p/news/");
      //Text
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input")).sendKeys("news");
      
      driver.findElement(By.xpath(Configuration.Save)).click();
      driver.findElement(By.xpath(Configuration.Publish)).click();
      driver.findElement(By.xpath(Configuration.PublishAll)).click();
      driver.get("http://homepage.lbr.preprod.thundercontrol.com/index5.html");
      builder.moveToElement(driver.findElement(By.xpath(Configuration.mm_news))).build().perform();

      ////////////////////////////////////////////////////////Mega menu - help & support tab//////////////////////////////////////////////////////////

      driver.get(Configuration.baseurl_preprod_roaming);
      driver.findElement(By.xpath(Configuration.Segment5Tree)).click();
      //Edit package
      driver.findElement(By.xpath(Configuration.LastVisited_mega_menu)).click();
      
      //create Mega menu - entertainment tab
      driver.findElement(By.xpath(Configuration.InsertPackage)).click();
      driver.findElement(By.xpath(Configuration.CreateNewPackage)).click();
      driver.findElement(By.xpath(Configuration.NewPackage)).click();
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[2]/input")).clear();
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[2]/input")).sendKeys("Mega menu - help & support tab");
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[3]/input")).clear();
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[3]/input")).sendKeys("help & support");
      driver.findElement(By.xpath(Configuration.Save)).click();
      
      driver.findElement(By.xpath(Configuration.InsertPackage)).click();
      driver.findElement(By.xpath(Configuration.CreateNewPackage)).click();
      driver.findElement(By.xpath(Configuration.NewPackage)).click();
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[2]/input")).clear();
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[2]/input")).sendKeys("Mega menu - help & support tab - Ask a question form");
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[3]/input")).clear();
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[3]/input")).sendKeys("Mega menu - help & support tab - Ask a question form");
      WebElement MenuLink10 = driver.findElement(By.xpath("//div[@id='asmContainer0']/select"));
      new Select(MenuLink10).selectByValue(Configuration.ask_question);
      driver.findElement(By.xpath(Configuration.Save)).click();
      
      driver.findElement(By.xpath("//a[contains(text(),'Mega menu - help & support tab')]")).click();

      driver.findElement(By.xpath(Configuration.InsertPackage)).click();
      driver.findElement(By.xpath(Configuration.CreateNewPackage)).click();
      driver.findElement(By.xpath(Configuration.NewPackage)).click();
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[2]/input")).clear();
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[2]/input")).sendKeys("Mega menu - help & support tab - Column 3");
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[3]/input")).clear();
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[3]/input")).sendKeys("Mega menu - help & support tab - Column 3");
      
      //Add links
      WebElement MenuLink11 = driver.findElement(By.id(Configuration.InsertMedia));
      new Select(MenuLink11).selectByValue(Configuration.Link);
      
      driver.findElement(By.xpath(Configuration.Add)).click();
      Thread.sleep(3000);
      //URL
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input")).sendKeys("-");
      //Text
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input")).sendKeys("-");
      //content hint
      WebElement help = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[11]/select"));
      new Select(help).selectByValue(Configuration.mm_link_space);
      
      driver.findElement(By.xpath(Configuration.Add)).click();
      Thread.sleep(3000);
      
      //URL
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input")).sendKeys("https://kareena.orange.co.uk/simswap/go/swap");
      //Text
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input")).sendKeys("SIM swap");
      
      driver.findElement(By.xpath(Configuration.Save)).click();

      driver.findElement(By.xpath("//a[contains(text(),'Mega menu - help & support tab')]")).click();

      driver.findElement(By.xpath(Configuration.InsertPackage)).click();
      driver.findElement(By.xpath(Configuration.CreateNewPackage)).click();
      driver.findElement(By.xpath(Configuration.NewPackage)).click();
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[2]/input")).clear();
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[2]/input")).sendKeys("Mega menu - help & support tab - Column 2");
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[3]/input")).clear();
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[3]/input")).sendKeys("Mega menu - help & support tab - Column 2");
      
      //Add links
      WebElement MenuLink12 = driver.findElement(By.id(Configuration.InsertMedia));
      new Select(MenuLink12).selectByValue(Configuration.Link);
      
      driver.findElement(By.xpath(Configuration.Add)).click();
      Thread.sleep(6000);
      //URL
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input")).sendKeys("http://www.orange.co.uk/contact/");
      //Text
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input")).sendKeys("contact us");
      
      driver.findElement(By.xpath(Configuration.Add)).click();
      Thread.sleep(3000);
      
      //URL
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input")).sendKeys("https://kareena.orange.co.uk/youraccount/paygsimactivation/activation");
      //Text
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input")).sendKeys("activate pay as you go SIM");
      
      driver.findElement(By.xpath(Configuration.Add)).click();
      Thread.sleep(3000);

      
      //URL
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input")).sendKeys("http://www.orange.co.uk/activate");
      //Text
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input")).sendKeys("activate pay monthly SIM");
      
      driver.findElement(By.xpath(Configuration.Add)).click();
      Thread.sleep(3000);
      
      //URL
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input")).sendKeys("http://help.orange.co.uk/orangeuk/support/personal/iPhone");
      //Text
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input")).sendKeys("iPhone help");
      
      driver.findElement(By.xpath(Configuration.Add)).click();
      Thread.sleep(3000);
      
      //URL
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input")).sendKeys("http://help.orange.co.uk/orangeuk/support/personal/all-business?WT.mc_id=web_portal_megamenu_business_help_0411");
      //Text
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input")).sendKeys("business help");
      
      driver.findElement(By.xpath(Configuration.Save)).click();

      driver.findElement(By.xpath("//a[contains(text(),'Mega menu - help & support tab')]")).click();
      
      driver.findElement(By.xpath(Configuration.InsertPackage)).click();
      driver.findElement(By.xpath(Configuration.CreateNewPackage)).click();
      driver.findElement(By.xpath(Configuration.NewPackage)).click();
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[2]/input")).clear();
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[2]/input")).sendKeys("Mega menu - help & support tab - Column 2");
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[3]/input")).clear();
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[3]/input")).sendKeys("Mega menu - help & support tab - Column 2");
      
      //Add links
      WebElement MenuLink13 = driver.findElement(By.id(Configuration.InsertMedia));
      new Select(MenuLink13).selectByValue(Configuration.Link);
      
      driver.findElement(By.xpath(Configuration.Add)).click();
      Thread.sleep(3000);
      //URL
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input")).sendKeys("http://help.orange.co.uk/orangeuk/support/personal/joining-Orange");
      //Text
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input")).sendKeys("joining Orange?");
      
      driver.findElement(By.xpath(Configuration.Add)).click();
      Thread.sleep(3000);
      
      //URL
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input")).sendKeys("http://help.orange.co.uk/orangeuk/support/personal/all_mobile_broadband");
      //Text
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input")).sendKeys("mobile broadband");
      
      driver.findElement(By.xpath(Configuration.Add)).click();
      Thread.sleep(3000);

      
      //URL
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input")).sendKeys("http://help.orange.co.uk/orangeuk/support/personal/all_broadband");
      //Text
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input")).sendKeys("broadband & home phone");
      
      driver.findElement(By.xpath(Configuration.Add)).click();
      Thread.sleep(3000);
      
      //URL
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input")).sendKeys("http://help.orange.co.uk/orangeuk/support/personal/all_mobile");
      //Text
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input")).sendKeys("mobile");
      
      driver.findElement(By.xpath(Configuration.Add)).click();
      Thread.sleep(3000);
      
      //URL
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input")).sendKeys("http://help.orange.co.uk/orangeuk/support/personal/");
      //Text
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input")).sendKeys("help & support");
      //content hint
      WebElement help1 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[11]/select"));
      new Select(help1).selectByValue(Configuration.mm_highlight);
      
      driver.findElement(By.xpath(Configuration.Save)).click();
      Thread.sleep(9000);
      
      driver.findElement(By.xpath("//a[contains(text(),'Mega menu - help & support tab')]")).click();

      //Add links
      WebElement MenuLink14 = driver.findElement(By.id(Configuration.InsertMedia));
      new Select(MenuLink14).selectByValue(Configuration.Link);
      
      driver.findElement(By.xpath(Configuration.Add)).click();
      Thread.sleep(3000);
      
      //URL
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input")).sendKeys("http://help.orange.co.uk/orangeuk/support/personal/");
      //Text
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input")).sendKeys("help & support");
      
      driver.findElement(By.xpath(Configuration.Save)).click();
      driver.findElement(By.xpath(Configuration.Publish)).click();
      driver.findElement(By.xpath(Configuration.PublishAll)).click();
      driver.get("http://homepage.lbr.preprod.thundercontrol.com/index5.html");
      builder.moveToElement(driver.findElement(By.xpath(Configuration.help_support))).build().perform();
      
      ////////////////////////////////////////////////////////Mega menu - business tab//////////////////////////////////////////////////////////

      driver.get(Configuration.baseurl_preprod_roaming);
      driver.findElement(By.xpath(Configuration.Segment5Tree)).click();
      //Edit package
      driver.findElement(By.xpath(Configuration.LastVisited_mega_menu)).click();
      
      //create Mega menu - entertainment tab
      driver.findElement(By.xpath(Configuration.InsertPackage)).click();
      driver.findElement(By.xpath(Configuration.CreateNewPackage)).click();
      driver.findElement(By.xpath(Configuration.NewPackage)).click();
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[2]/input")).clear();
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[2]/input")).sendKeys("Mega menu - business tab");
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[3]/input")).clear();
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[3]/input")).sendKeys("business");
      driver.findElement(By.xpath(Configuration.Save)).click();
      
      driver.findElement(By.xpath(Configuration.InsertPackage)).click();
      driver.findElement(By.xpath(Configuration.CreateNewPackage)).click();
      driver.findElement(By.xpath(Configuration.NewPackage)).click();
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[2]/input")).clear();
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[2]/input")).sendKeys("Mega menu - business tab - Column 3");
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[3]/input")).clear();
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[3]/input")).sendKeys("Mega menu - business tab - Column 3");
      
      //Add links
      WebElement MenuLink15 = driver.findElement(By.id(Configuration.InsertMedia));
      new Select(MenuLink15).selectByValue(Configuration.LinkWithImage);
      
      driver.findElement(By.xpath(Configuration.Add)).click();
      Thread.sleep(3000);
      
      //URL
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input")).sendKeys("http://business.orange.co.uk/home/small/products-and-services/phones-and-devices/mobile-phones/htc-sensation?WT.mc_id=web_portal_megamenu_htcsensation_1108");
      //Text
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/textarea")).sendKeys("HTC Sensation");
      //alt
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[12]/input")).sendKeys("HTC Sensation");      
      driver.findElement(By.xpath("//input[@value='Browse...']")).click();
      Thread.sleep(5000);
      driver.findElement(By.xpath("//*[@id='searchInput']")).sendKeys("Sensation_Banner_127x130_v0_01.JPG");
      Thread.sleep(6000);
      driver.findElement(By.xpath(Configuration.CheckBox)).click();      
      driver.findElement(By.xpath(Configuration.OK)).click();
      driver.findElement(By.xpath(Configuration.Save)).click();
      
      driver.findElement(By.xpath("//a[contains(text(),'Mega menu - business tab')]")).click();

      driver.findElement(By.xpath(Configuration.InsertPackage)).click();
      driver.findElement(By.xpath(Configuration.CreateNewPackage)).click();
      driver.findElement(By.xpath(Configuration.NewPackage)).click();
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[2]/input")).clear();
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[2]/input")).sendKeys("Mega menu - business tab - Column 2");
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[3]/input")).clear();
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[3]/input")).sendKeys("Mega menu - business tab - Column 2");
      
      //Add links
      WebElement MenuLink16 = driver.findElement(By.id(Configuration.InsertMedia));
      new Select(MenuLink16).selectByValue(Configuration.Link);
      
      driver.findElement(By.xpath(Configuration.Add)).click();
      Thread.sleep(3000);
      //URL
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input")).sendKeys("http://business.orange.co.uk/home/public?WT.mc_id=web_portal_megamenu_public_0411");
      //Text
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input")).sendKeys("public sector");
      
      driver.findElement(By.xpath(Configuration.Add)).click();
      Thread.sleep(3000);
      
      //URL
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input")).sendKeys("http://business.orange.co.uk/home/corporate?WT.mc_id=web_portal_megamenu_corporate_0411");
      //Text
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input")).sendKeys("corporate business");
      
      driver.findElement(By.xpath(Configuration.Add)).click();
      Thread.sleep(3000);
      
      //URL
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input")).sendKeys("http://business.orange.co.uk/home/medium?WT.mc_id=web_portal_megamenu_medium_0411");
      //Text
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input")).sendKeys("medium business");
      
      driver.findElement(By.xpath(Configuration.Save)).click();

      driver.findElement(By.xpath("//a[contains(text(),'Mega menu - business tab')]")).click();

      driver.findElement(By.xpath(Configuration.InsertPackage)).click();
      driver.findElement(By.xpath(Configuration.CreateNewPackage)).click();
      driver.findElement(By.xpath(Configuration.NewPackage)).click();
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[2]/input")).clear();
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[2]/input")).sendKeys("Mega menu - business tab - Column 1");
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[3]/input")).clear();
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[3]/input")).sendKeys("Mega menu - business tab - Column 1");
      driver.findElement(By.xpath(Configuration.Save)).click();
      
      //Add links
      WebElement MenuLink17 = driver.findElement(By.id(Configuration.InsertMedia));
      new Select(MenuLink17).selectByValue(Configuration.Link);
      
      driver.findElement(By.xpath(Configuration.Add)).click();
      Thread.sleep(3000);
      //URL
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input")).sendKeys("http://business.orange.co.uk/home/small?WT.mc_id=web_portal_megamenu_small_0411");
      //Text
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input")).sendKeys("small business");
      
      driver.findElement(By.xpath(Configuration.Add)).click();
      Thread.sleep(3000);
      
      //URL
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input")).sendKeys("http://business.orange.co.uk/home/soletrader?WT.mc_id=web_portal_megamenu_soletrader_0411");
      //Text
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input")).sendKeys("sole trader");
      
      driver.findElement(By.xpath(Configuration.Add)).click();
      Thread.sleep(3000);

      
      //URL
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input")).sendKeys("http://business.orange.co.uk/home?WT.mc_id=web_portal_megamenu_home_0411");
      //Text
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input")).sendKeys("Orange business");
      //content hint
      WebElement business = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[11]/select"));
      new Select(business).selectByValue(Configuration.mm_highlight);
      
      driver.findElement(By.xpath(Configuration.Save)).click();
      
      driver.findElement(By.xpath("//a[contains(text(),'Mega menu - business tab')]")).click();
      
    //Add links
      WebElement MenuLink18 = driver.findElement(By.id(Configuration.InsertMedia));
      new Select(MenuLink18).selectByValue(Configuration.Link);
      
      driver.findElement(By.xpath(Configuration.Add)).click();
      Thread.sleep(3000);
      
      //URL
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input")).sendKeys("http://business.orange.co.uk/home?WT.mc_id=web_portal_megamenu_home_0411");
      //Text
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input")).sendKeys("business");
      
      driver.findElement(By.xpath(Configuration.Save)).click();
      driver.findElement(By.xpath(Configuration.Publish)).click();
      driver.findElement(By.xpath(Configuration.PublishAll)).click();
      driver.get("http://homepage.lbr.preprod.thundercontrol.com/index5.html");
      builder.moveToElement(driver.findElement(By.xpath(Configuration.business))).build().perform();

      ////////////////////////////////////////////////////////Mega menu - mobile services tab//////////////////////////////////////////////////////////

      driver.get(Configuration.baseurl_preprod_roaming);
      driver.findElement(By.xpath(Configuration.Segment5Tree)).click();
      //Edit package
      driver.findElement(By.xpath(Configuration.LastVisited_mega_menu)).click();
      
      //create Mega menu - entertainment tab
      driver.findElement(By.xpath(Configuration.InsertPackage)).click();
      driver.findElement(By.xpath(Configuration.CreateNewPackage)).click();
      driver.findElement(By.xpath(Configuration.NewPackage)).click();
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[2]/input")).clear();
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[2]/input")).sendKeys("Mega menu - mobile services tab");
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[3]/input")).clear();
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[3]/input")).sendKeys("mobile services");
      driver.findElement(By.xpath(Configuration.Save)).click();
      
      driver.findElement(By.xpath(Configuration.InsertPackage)).click();
      driver.findElement(By.xpath(Configuration.CreateNewPackage)).click();
      driver.findElement(By.xpath(Configuration.NewPackage)).click();
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[2]/input")).clear();
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[2]/input")).sendKeys("Mega menu - mobile services tab - Column 4");
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[3]/input")).clear();
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[3]/input")).sendKeys("Mega menu - mobile services tab - Column 4");
      
      //Add links
      WebElement MenuLink19 = driver.findElement(By.id(Configuration.InsertMedia));
      new Select(MenuLink19).selectByValue(Configuration.LinkWithImage);
      
      driver.findElement(By.xpath(Configuration.Add)).click();
      Thread.sleep(3000);
      
      //URL
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input")).sendKeys("http://studio.orange.co.uk/shop/dolphin7/?WT.mc_id=ON_OUK_P_7SIM_&WT.tsrc=Portal");
      //Text
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/textarea")).sendKeys("Dolphin 7");
      //alt
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[12]/input")).sendKeys("Dolphin 7");      
      driver.findElement(By.xpath("//input[@value='Browse...']")).click();
      Thread.sleep(5000);
      driver.findElement(By.xpath("//*[@id='searchInput']")).sendKeys("dolphin-plan-meganav-1.JPG");
      Thread.sleep(6000);
      driver.findElement(By.xpath(Configuration.CheckBox)).click();      
      driver.findElement(By.xpath(Configuration.OK)).click();
      driver.findElement(By.xpath(Configuration.Save)).click();
      
      driver.findElement(By.xpath("//a[contains(text(),'Mega menu - mobile services tab')]")).click();

      driver.findElement(By.xpath(Configuration.InsertPackage)).click();
      driver.findElement(By.xpath(Configuration.CreateNewPackage)).click();
      driver.findElement(By.xpath(Configuration.NewPackage)).click();
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[2]/input")).clear();
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[2]/input")).sendKeys("Mega menu - mobile services tab - Column 3");
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[3]/input")).clear();
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[3]/input")).sendKeys("Mega menu - mobile services tab - Column 3");

      //Add links
      WebElement MenuLink20 = driver.findElement(By.id(Configuration.InsertMedia));
      new Select(MenuLink20).selectByValue(Configuration.Link);
      
      driver.findElement(By.xpath(Configuration.Add)).click();
      Thread.sleep(3000);
      //URL
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input")).sendKeys("http://www.orange.co.uk/swapables/");
      //Text
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input")).sendKeys("Swapables");
      
      driver.findElement(By.xpath(Configuration.Add)).click();
      Thread.sleep(3000);
      
      //URL
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input")).sendKeys("http://help.orange.co.uk/multimedia/");
      //Text
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input")).sendKeys("Orange multimedia");
      
      driver.findElement(By.xpath(Configuration.Add)).click();
      Thread.sleep(3000);
      
      //URL
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input")).sendKeys("http://www1.orange.co.uk/service_plans/");
      //Text
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input")).sendKeys("mobile service plans");
      
      driver.findElement(By.xpath(Configuration.Add)).click();
      Thread.sleep(3000);
      
      //URL
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input")).sendKeys("http://search.orange.co.uk/ouk/portal/coveragechecker.html");
      //Text
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input")).sendKeys("UK mobile coverage");
      
      driver.findElement(By.xpath(Configuration.Add)).click();
      Thread.sleep(3000);
      
      //URL
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input")).sendKeys("http://www2.orange.co.uk/servlet/Satellite?c=OUKPage&pagename=PersonalIR&cid=1121947450627");
      //Text
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input")).sendKeys("using your mobile abroad");
      
      driver.findElement(By.xpath(Configuration.Save)).click();
      Thread.sleep(9000);
      
      driver.findElement(By.xpath("//a[contains(text(),'Mega menu - mobile services tab')]")).click();

      driver.findElement(By.xpath(Configuration.InsertPackage)).click();
      driver.findElement(By.xpath(Configuration.CreateNewPackage)).click();
      driver.findElement(By.xpath(Configuration.NewPackage)).click();
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[2]/input")).clear();
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[2]/input")).sendKeys("Mega menu - mobile services tab - Column 2");
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[3]/input")).clear();
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[3]/input")).sendKeys("Mega menu - mobile services tab - Column 2");
      
      //Add links
      WebElement MenuLink21 = driver.findElement(By.id(Configuration.InsertMedia));
      new Select(MenuLink21).selectByValue(Configuration.Link);
      
      driver.findElement(By.xpath(Configuration.Add)).click();
      Thread.sleep(3000);
      //URL
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input")).sendKeys("http://www2.orange.co.uk/servlet/Satellite?c=OUKPage&cid=1221370667891&pagename=OUKPersonal");
      //Text
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input")).sendKeys("payment services");
      
      driver.findElement(By.xpath(Configuration.Add)).click();
      Thread.sleep(3000);
      
      //URL
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input")).sendKeys("http://www2.orange.co.uk/servlet/Satellite?c=OUKPage&cid=1134489826477&pagename=OUKPersonal");
      //Text
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input")).sendKeys("insurance & protection");
      
      driver.findElement(By.xpath(Configuration.Add)).click();
      Thread.sleep(3000);
      
      //URL
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input")).sendKeys("http://www2.orange.co.uk/servlet/Satellite?c=OUKPage&cid=1134489826351&pagename=OUKPersonal");
      //Text
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input")).sendKeys("mobile data services");
      
      driver.findElement(By.xpath(Configuration.Add)).click();
      Thread.sleep(3000);
      
      //URL
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input")).sendKeys("http://www2.orange.co.uk/servlet/Satellite?c=OUKPage&cid=1134489826235&pagename=OUKPersonal");
      //Text
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input")).sendKeys("contacts & address book");
      
      driver.findElement(By.xpath(Configuration.Add)).click();
      Thread.sleep(3000);
      
      //URL
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input")).sendKeys("http://www2.orange.co.uk/servlet/Satellite?c=OUKPage&cid=1134489826135&pagename=OUKPersonal");
      //Text
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input")).sendKeys("mobile email");
      
      driver.findElement(By.xpath(Configuration.Save)).click();
      Thread.sleep(9000);
      
      driver.findElement(By.xpath("//a[contains(text(),'Mega menu - mobile services tab')]")).click();

      driver.findElement(By.xpath(Configuration.InsertPackage)).click();
      driver.findElement(By.xpath(Configuration.CreateNewPackage)).click();
      driver.findElement(By.xpath(Configuration.NewPackage)).click();
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[2]/input")).clear();
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[2]/input")).sendKeys("Mega menu - mobile services tab - Column 1");
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[3]/input")).clear();
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[3]/input")).sendKeys("Mega menu - mobile services tab - Column 1");
      
      //Add links
      WebElement MenuLink22 = driver.findElement(By.id(Configuration.InsertMedia));
      new Select(MenuLink22).selectByValue(Configuration.Link);
      
      driver.findElement(By.xpath(Configuration.Add)).click();
      Thread.sleep(3000);
      //URL
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input")).sendKeys("http://www1.orange.co.uk/entertainment/OrangeWorld/featuredContentEntertainment.php");
      //Text
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input")).sendKeys("mobile entertainment");
      
      driver.findElement(By.xpath(Configuration.Add)).click();
      Thread.sleep(3000);
      
      //URL
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input")).sendKeys("http://www1.orange.co.uk/entertainment/OrangeWorld/featuredContentInformation.php");
      //Text
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input")).sendKeys("information services");
      
      driver.findElement(By.xpath(Configuration.Add)).click();
      Thread.sleep(3000);
      
      //URL
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input")).sendKeys("http://www2.orange.co.uk/servlet/Satellite?c=OUKPage&cid=1134489819130&pagename=OUKPersonal");
      //Text
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input")).sendKeys("messaging");
      
      driver.findElement(By.xpath(Configuration.Add)).click();
      Thread.sleep(3000);
      
      //URL
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input")).sendKeys("http://www2.orange.co.uk/servlet/Satellite?c=OUKPage&cid=1134489819065&pagename=OUKPersonal");
      //Text
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input")).sendKeys("calling");
      
      driver.findElement(By.xpath(Configuration.Add)).click();
      Thread.sleep(3000);
      
      //URL
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input")).sendKeys("http://help.orange.co.uk/guide-to-mobile-services/");
      //Text
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input")).sendKeys("mobile services");
      //content hint
      WebElement mobile_services = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[11]/select"));
      new Select(mobile_services).selectByValue(Configuration.mm_highlight);
      
      driver.findElement(By.xpath(Configuration.Save)).click();
      Thread.sleep(9000);
      
      driver.findElement(By.xpath("//a[contains(text(),'Mega menu - mobile services tab')]")).click();
      
      //Add links
      WebElement MenuLink23 = driver.findElement(By.id(Configuration.InsertMedia));
      new Select(MenuLink23).selectByValue(Configuration.Link);
      
      driver.findElement(By.xpath(Configuration.Add)).click();
      Thread.sleep(3000);
      
      //URL
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input")).sendKeys("http://studio.orange.co.uk/guide-to-mobile-services/");
      //Text
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input")).sendKeys("mobile services");
      
      driver.findElement(By.xpath(Configuration.Save)).click();
      driver.findElement(By.xpath(Configuration.Publish)).click();
      driver.findElement(By.xpath(Configuration.PublishAll)).click();
      driver.get("http://homepage.lbr.preprod.thundercontrol.com/index5.html");
      builder.moveToElement(driver.findElement(By.xpath(Configuration.mob_services))).build().perform();
      
      ////////////////////////////////////////////////////////Mega menu - email & communicate tab//////////////////////////////////////////////////////////

      driver.get(Configuration.baseurl_preprod_roaming);
      driver.findElement(By.xpath(Configuration.Segment5Tree)).click();
      //Edit package
      driver.findElement(By.xpath(Configuration.LastVisited_mega_menu)).click();
      
      //create Mega menu - entertainment tab
      driver.findElement(By.xpath(Configuration.InsertPackage)).click();
      driver.findElement(By.xpath(Configuration.CreateNewPackage)).click();
      driver.findElement(By.xpath(Configuration.NewPackage)).click();
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[2]/input")).clear();
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[2]/input")).sendKeys("Mega menu - email & communicate tab");
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[3]/input")).clear();
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[3]/input")).sendKeys("email & communicate");
      driver.findElement(By.xpath(Configuration.Save)).click();
      
      driver.findElement(By.xpath(Configuration.InsertPackage)).click();
      driver.findElement(By.xpath(Configuration.CreateNewPackage)).click();
      driver.findElement(By.xpath(Configuration.NewPackage)).click();
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[2]/input")).clear();
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[2]/input")).sendKeys("Mega menu - email & communicate tab - Column 2");
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[3]/input")).clear();
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[3]/input")).sendKeys("Mega menu - email & communicate tab - Column 2");
      
      //Add links
      WebElement MenuLink24 = driver.findElement(By.id(Configuration.InsertMedia));
      new Select(MenuLink24).selectByValue(Configuration.Link);
      
      driver.findElement(By.xpath(Configuration.Add)).click();
      Thread.sleep(3000);
      //URL
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input")).sendKeys("http://web.orange.co.uk/p/messenger/home");
      //Text
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input")).sendKeys("Orange Messenger");
      
      driver.findElement(By.xpath(Configuration.Add)).click();
      Thread.sleep(3000);
      
      //URL
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input")).sendKeys("http://web.orange.co.uk/p/photography/home");
      //Text
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input")).sendKeys("photography");
      
      driver.findElement(By.xpath(Configuration.Add)).click();
      Thread.sleep(3000);
      
      //URL
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input")).sendKeys("http://web.orange.co.uk/p/socialise/home");
      //Text
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input")).sendKeys("socialise");
      
      driver.findElement(By.xpath(Configuration.Save)).click();
      
      driver.findElement(By.xpath("//a[contains(text(),'Mega menu - email & communicate tab')]")).click();
      
      driver.findElement(By.xpath(Configuration.InsertPackage)).click();
      driver.findElement(By.xpath(Configuration.CreateNewPackage)).click();
      driver.findElement(By.xpath(Configuration.NewPackage)).click();
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[2]/input")).clear();
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[2]/input")).sendKeys("Mega menu - email & communicate tab - Column 1");
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[3]/input")).clear();
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[3]/input")).sendKeys("Mega menu - email & communicate tab - Column 1");
      
      //Add links
      WebElement MenuLink25 = driver.findElement(By.id(Configuration.InsertMedia));
      new Select(MenuLink25).selectByValue(Configuration.Link);
      
      driver.findElement(By.xpath(Configuration.Add)).click();
      Thread.sleep(3000);
      //URL
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input")).sendKeys("http://web.orange.co.uk/p/contacts/home");
      //Text
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input")).sendKeys("Contacts Backup");
      
      driver.findElement(By.xpath(Configuration.Add)).click();
      Thread.sleep(3000);
      
      //URL
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input")).sendKeys("http://web.orange.co.uk/p/email/home");
      //Text
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input")).sendKeys("email");
      
      driver.findElement(By.xpath(Configuration.Add)).click();
      Thread.sleep(3000);
      
      //URL
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input")).sendKeys("http://web.orange.co.uk/p/communicate/home");
      //Text
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input")).sendKeys("email & communicate");
      //content hint
      WebElement email_comms = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[11]/select"));
      new Select(email_comms).selectByValue(Configuration.mm_highlight);
      
      driver.findElement(By.xpath(Configuration.Save)).click();
      Thread.sleep(9000);
      
      driver.findElement(By.xpath("//a[contains(text(),'Mega menu - email & communicate tab')]")).click();

      //Add links
      WebElement MenuLink26 = driver.findElement(By.id(Configuration.InsertMedia));
      new Select(MenuLink26).selectByValue(Configuration.Link);
      
      driver.findElement(By.xpath(Configuration.Add)).click();
      Thread.sleep(3000);
      //URL
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input")).sendKeys("http://web.orange.co.uk/p/communicate/home");
      //Text
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input")).sendKeys("email & communicate");
      
      driver.findElement(By.xpath(Configuration.Save)).click();
      driver.findElement(By.xpath(Configuration.Publish)).click();
      driver.findElement(By.xpath(Configuration.PublishAll)).click();
      driver.get("http://homepage.lbr.preprod.thundercontrol.com/index5.html");
      builder.moveToElement(driver.findElement(By.xpath(Configuration.email_comms))).build().perform();
       
      ////////////////////////////////////////////////////////Mega menu - your account tab//////////////////////////////////////////////////////////

      driver.get(Configuration.baseurl_preprod_roaming);
      driver.findElement(By.xpath(Configuration.Segment5Tree)).click();
      //Edit package
      driver.findElement(By.xpath(Configuration.LastVisited_mega_menu)).click();
      
      //create Mega menu - entertainment tab
      driver.findElement(By.xpath(Configuration.InsertPackage)).click();
      driver.findElement(By.xpath(Configuration.CreateNewPackage)).click();
      driver.findElement(By.xpath(Configuration.NewPackage)).click();
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[2]/input")).clear();
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[2]/input")).sendKeys("Mega menu - your account tab");
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[3]/input")).clear();
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[3]/input")).sendKeys("your account");
      driver.findElement(By.xpath(Configuration.Save)).click();
      
      driver.findElement(By.xpath(Configuration.InsertPackage)).click();
      driver.findElement(By.xpath(Configuration.CreateNewPackage)).click();
      driver.findElement(By.xpath(Configuration.NewPackage)).click();
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[2]/input")).clear();
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[2]/input")).sendKeys("Mega menu - your account tab - Column 2");
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[3]/input")).clear();
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[3]/input")).sendKeys("Mega menu - your account tab - Column 2");
      
      //Add links
      WebElement MenuLink27 = driver.findElement(By.id(Configuration.InsertMedia));
      new Select(MenuLink27).selectByValue(Configuration.Link);
      
      driver.findElement(By.xpath(Configuration.Add)).click();
      Thread.sleep(3000);
      //URL
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input")).sendKeys("https://kareena.orange.co.uk/youraccount/paygsimactivation/activation");
      //Text
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input")).sendKeys("activate pay as you go SIM");
      
      driver.findElement(By.xpath(Configuration.Add)).click();
      Thread.sleep(3000);
      
      //URL
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input")).sendKeys("http://www.orange.co.uk/activate");
      //Text
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input")).sendKeys("activate pay monthly SIM");
      
      driver.findElement(By.xpath(Configuration.Add)).click();
      Thread.sleep(3000);
      
      //URL
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input")).sendKeys("http://www.orange.co.uk/orangecash");
      //Text
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input")).sendKeys("Orange Cash");
      
      driver.findElement(By.xpath(Configuration.Add)).click();
      Thread.sleep(3000);
      
      //URL
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input")).sendKeys("https://www.orangecreditcard.co.uk/orange/partnermicrosite/WelcomeSilver.aspx?OriginCode=OW0429");
      //Text
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input")).sendKeys("Orange Credit Card");
      
      driver.findElement(By.xpath(Configuration.Save)).click();
      Thread.sleep(9000);
      
      driver.findElement(By.xpath("//a[contains(text(),'Mega menu - your account tab')]")).click();
      
      driver.findElement(By.xpath(Configuration.InsertPackage)).click();
      driver.findElement(By.xpath(Configuration.CreateNewPackage)).click();
      driver.findElement(By.xpath(Configuration.NewPackage)).click();
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[2]/input")).clear();
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[2]/input")).sendKeys("Mega menu - your account tab - Column 1");
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[3]/input")).clear();
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[3]/input")).sendKeys("Mega menu - your account tab - Column 1");
      
      //Add links
      WebElement MenuLink28 = driver.findElement(By.id(Configuration.InsertMedia));
      new Select(MenuLink28).selectByValue(Configuration.Link);
      
      driver.findElement(By.xpath(Configuration.Add)).click();
      Thread.sleep(3000);
      //URL
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input")).sendKeys("https://membercentre.orange.co.uk/MCPres/login.do");
      //Text
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input")).sendKeys("home broadband");
      
      driver.findElement(By.xpath(Configuration.Add)).click();
      Thread.sleep(3000);
      
      //URL
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input")).sendKeys("https://services.orange.co.uk/launchpad/launch?ServiceId=sss");
      //Text
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input")).sendKeys("mobile or mobile broadband");
      
      driver.findElement(By.xpath(Configuration.Add)).click();
      Thread.sleep(3000);
      
      //URL
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input")).sendKeys("http://www.orange.co.uk/youraccount/");
      //Text
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input")).sendKeys("your account");
      //content hint
      WebElement your_account = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[11]/select"));
      new Select(your_account).selectByValue(Configuration.mm_highlight);
      
      driver.findElement(By.xpath(Configuration.Save)).click();
      Thread.sleep(9000);
      
      driver.findElement(By.xpath("//a[contains(text(),'Mega menu - your account tab')]")).click();

      //Add links
      WebElement MenuLink29 = driver.findElement(By.id(Configuration.InsertMedia));
      new Select(MenuLink29).selectByValue(Configuration.Link);
      
      driver.findElement(By.xpath(Configuration.Add)).click();
      Thread.sleep(3000);
      //URL
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input")).sendKeys("http://www.orange.co.uk/youraccount/");
      //Text
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input")).sendKeys("your account");
      
      driver.findElement(By.xpath(Configuration.Save)).click();
      driver.findElement(By.xpath(Configuration.Publish)).click();
      driver.findElement(By.xpath(Configuration.PublishAll)).click();
      driver.get("http://homepage.lbr.preprod.thundercontrol.com/index5.html");
      builder.moveToElement(driver.findElement(By.xpath(Configuration.your_acc))).perform();
      
      ////////////////////////////////////////////////////////Mega menu - shop tab//////////////////////////////////////////////////////////

      driver.get(Configuration.baseurl_preprod_roaming);
      driver.findElement(By.xpath(Configuration.Segment5Tree)).click();
      //Edit package
      driver.findElement(By.xpath(Configuration.LastVisited_mega_menu)).click();
      
      //create Mega menu - entertainment tab
      driver.findElement(By.xpath(Configuration.InsertPackage)).click();
      driver.findElement(By.xpath(Configuration.CreateNewPackage)).click();
      driver.findElement(By.xpath(Configuration.NewPackage)).click();
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[2]/input")).clear();
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[2]/input")).sendKeys("Mega menu - shop tab");
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[3]/input")).clear();
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[3]/input")).sendKeys("shop");
      driver.findElement(By.xpath(Configuration.Save)).click();
      
      driver.findElement(By.xpath(Configuration.InsertPackage)).click();
      driver.findElement(By.xpath(Configuration.CreateNewPackage)).click();
      driver.findElement(By.xpath(Configuration.NewPackage)).click();
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[2]/input")).clear();
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[2]/input")).sendKeys("Mega menu - shop tab - Column 5");
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[3]/input")).clear();
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[3]/input")).sendKeys("Mega menu - shop tab - Column 5");
      
      //Add links
      WebElement MenuLink30 = driver.findElement(By.id(Configuration.InsertMedia));
      new Select(MenuLink30).selectByValue(Configuration.LinkWithImage);
      
      driver.findElement(By.xpath(Configuration.Add)).click();
      Thread.sleep(3000);
      
      //URL
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input")).sendKeys("http://studio.orange.co.uk/shop/dolphin7/?WT.mc_id=ON_OUK_P_7SIM_&WT.tsrc=Portal");
      //Text
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/textarea")).sendKeys("Dolphin 7");
      //alt
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[12]/input")).sendKeys("Dolphin 7");      
      driver.findElement(By.xpath("//input[@value='Browse...']")).click();
      Thread.sleep(5000);
      driver.findElement(By.xpath("//*[@id='searchInput']")).sendKeys("dolphin-plan-meganav-1.JPG");
      Thread.sleep(6000);
      driver.findElement(By.xpath(Configuration.CheckBox)).click();      
      driver.findElement(By.xpath(Configuration.OK)).click();
      driver.findElement(By.xpath(Configuration.Save)).click();
      Thread.sleep(9000);
      
      driver.findElement(By.xpath("//a[contains(text(),'Mega menu - shop tab')]")).click();

      driver.findElement(By.xpath(Configuration.InsertPackage)).click();
      driver.findElement(By.xpath(Configuration.CreateNewPackage)).click();
      driver.findElement(By.xpath(Configuration.NewPackage)).click();
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[2]/input")).clear();
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[2]/input")).sendKeys("Mega menu - shop tab - Column 4");
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[3]/input")).clear();
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[3]/input")).sendKeys("Mega menu - shop tab - Column 4");

      //Add links
      WebElement MenuLink31 = driver.findElement(By.id(Configuration.InsertMedia));
      new Select(MenuLink31).selectByValue(Configuration.Link);
      
      driver.findElement(By.xpath(Configuration.Add)).click();
      Thread.sleep(3000);
      //URL
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input")).sendKeys("http://shop.orange.co.uk/shop/business?WT.mc_id=web_portal_megamenu_sbs_0411");
      //Text
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input")).sendKeys("business shop");
      
      driver.findElement(By.xpath(Configuration.Add)).click();
      Thread.sleep(3000);
      
      //URL
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input")).sendKeys("http://shop.orange.co.uk/mobile-phones/upgrades");
      //Text
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input")).sendKeys("upgrade online");
      
      driver.findElement(By.xpath(Configuration.Add)).click();
      Thread.sleep(3000);
      
      //URL
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input")).sendKeys("http://shop.orange.co.uk/ipad/");
      //Text
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input")).sendKeys("iPad");
      
      driver.findElement(By.xpath(Configuration.Add)).click();
      Thread.sleep(3000);
      
      //URL
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input")).sendKeys("http://shop.orange.co.uk/mobile-broadband");
      //Text
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input")).sendKeys("mobile broadband");
      
      driver.findElement(By.xpath(Configuration.Add)).click();
      Thread.sleep(3000);
      
      //URL
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input")).sendKeys("http://shop.orange.co.uk/broadband/");
      //Text
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input")).sendKeys("home broadband");
      
      driver.findElement(By.xpath(Configuration.Save)).click();
      Thread.sleep(9000);
      
      driver.findElement(By.xpath("//a[contains(text(),'Mega menu - shop tab')]")).click();

      driver.findElement(By.xpath(Configuration.InsertPackage)).click();
      driver.findElement(By.xpath(Configuration.CreateNewPackage)).click();
      driver.findElement(By.xpath(Configuration.NewPackage)).click();
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[2]/input")).clear();
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[2]/input")).sendKeys("Mega menu - shop tab - Column 3");
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[3]/input")).clear();
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[3]/input")).sendKeys("Mega menu - shop tab - Column 3");
      
      //Add links
      WebElement MenuLink32 = driver.findElement(By.id(Configuration.InsertMedia));
      new Select(MenuLink32).selectByValue(Configuration.Link);
      
      driver.findElement(By.xpath(Configuration.Add)).click();
      Thread.sleep(3000);
      //URL
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input")).sendKeys("http://freesim.orange.co.uk/");
      //Text
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input")).sendKeys("free SIM");
      
      driver.findElement(By.xpath(Configuration.Add)).click();
      Thread.sleep(3000);
      
      //URL
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input")).sendKeys("http://shop.orange.co.uk/mobile-phones/sim-only/pay-as-you-go");
      //Text
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input")).sendKeys("pay as you go SIM");
      
      driver.findElement(By.xpath(Configuration.Add)).click();
      Thread.sleep(3000);
      
      //URL
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input")).sendKeys("http://shop.orange.co.uk/mobile-phones/price-plans/pay-monthly/sim-only");
      //Text
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input")).sendKeys("pay monthly SIM");
      
      driver.findElement(By.xpath(Configuration.Add)).click();
      Thread.sleep(3000);
      
      //URL
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input")).sendKeys("http://shop.orange.co.uk/mobile-phones/plans/paygPlanList.jsp");
      //Text
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input")).sendKeys("pay as you go plans");
      
      driver.findElement(By.xpath(Configuration.Add)).click();
      Thread.sleep(3000);
      
      //URL
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input")).sendKeys("http://shop.orange.co.uk/mobile-phones/price-plans/pay-monthly");
      //Text
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input")).sendKeys("pay monthly plans");
      
      driver.findElement(By.xpath(Configuration.Save)).click();
      Thread.sleep(9000);
      
      driver.findElement(By.xpath("//a[contains(text(),'Mega menu - shop tab')]")).click();

      driver.findElement(By.xpath(Configuration.InsertPackage)).click();
      driver.findElement(By.xpath(Configuration.CreateNewPackage)).click();
      driver.findElement(By.xpath(Configuration.NewPackage)).click();
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[2]/input")).clear();
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[2]/input")).sendKeys("Mega menu - shop tab - Column 2");
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[3]/input")).clear();
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[3]/input")).sendKeys("Mega menu - shop tab - Column 2");
      
      //Add links
      WebElement MenuLink33 = driver.findElement(By.id(Configuration.InsertMedia));
      new Select(MenuLink33).selectByValue(Configuration.Link);
      
      driver.findElement(By.xpath(Configuration.Add)).click();
      Thread.sleep(3000);
      //URL
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input")).sendKeys("http://shop.orange.co.uk/mobile-phones/coming-soon-phones");
      //Text
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input")).sendKeys("coming soon phones");
      
      driver.findElement(By.xpath(Configuration.Add)).click();
      Thread.sleep(3000);
      
      //URL
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input")).sendKeys("http://shop.orange.co.uk/mobile-phones/pay-as-you-go");
      //Text
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input")).sendKeys("pay as you go phones");
      
      driver.findElement(By.xpath(Configuration.Add)).click();
      Thread.sleep(3000);
      
      //URL
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input")).sendKeys("http://shop.orange.co.uk/mobile-phones/pay-monthly");
      //Text
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input")).sendKeys("pay monthly phones");
      
      driver.findElement(By.xpath(Configuration.Add)).click();
      Thread.sleep(3000);
      
      //URL
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input")).sendKeys("http://shop.orange.co.uk/mobile-phones/windows-phone-7");
      //Text
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input")).sendKeys("Windows Phone 7");
      
      driver.findElement(By.xpath(Configuration.Add)).click();
      Thread.sleep(3000);
      
      //URL
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input")).sendKeys("http://shop.orange.co.uk/mobile-phones/pay-monthly?act=filterHandset&brand=600002?cmsPageId=iPhone");
      //Text
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input")).sendKeys("iPhone");
      
      driver.findElement(By.xpath(Configuration.Save)).click();
      Thread.sleep(9000);
      
      driver.findElement(By.xpath("//a[contains(text(),'Mega menu - shop tab')]")).click();

      driver.findElement(By.xpath(Configuration.InsertPackage)).click();
      driver.findElement(By.xpath(Configuration.CreateNewPackage)).click();
      driver.findElement(By.xpath(Configuration.NewPackage)).click();
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[2]/input")).clear();
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[2]/input")).sendKeys("Mega menu - shop tab - Column 1");
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[3]/input")).clear();
      driver.findElement(By.xpath("//div[@id='contents']/form/ul/li[3]/input")).sendKeys("Mega menu - shop tab - Column 1");
      
      //Add links
      WebElement MenuLink34 = driver.findElement(By.id(Configuration.InsertMedia));
      new Select(MenuLink34).selectByValue(Configuration.Link);
      
      driver.findElement(By.xpath(Configuration.Add)).click();
      Thread.sleep(3000);
      //URL
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input")).sendKeys("http://shop.orange.co.uk/mobile-phones/all");
      //Text
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input")).sendKeys("mobile phones");
      
      driver.findElement(By.xpath(Configuration.Add)).click();
      Thread.sleep(3000);
      
      //URL
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input")).sendKeys("http://shop.orange.co.uk/mobile-phones/offers/broadband");
      //Text
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input")).sendKeys("broadband offers");
      
      driver.findElement(By.xpath(Configuration.Add)).click();
      Thread.sleep(3000);
      
      //URL
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input")).sendKeys("http://shop.orange.co.uk/mobile-phones/offers/pay-as-you-go");
      //Text
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input")).sendKeys("pay as you go offers");
      
      driver.findElement(By.xpath(Configuration.Add)).click();
      Thread.sleep(3000);
      
      //URL
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input")).sendKeys("http://shop.orange.co.uk/mobile-phones/offers/pay-monthly");
      //Text
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input")).sendKeys("pay monthly offers");
      
      driver.findElement(By.xpath(Configuration.Add)).click();
      Thread.sleep(3000);
      
      //URL
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input")).sendKeys("http://shop.orange.co.uk/");
      //Text
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input")).sendKeys("the Orange shop");
      //content hint
      WebElement shop = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[11]/select"));
      new Select(shop).selectByValue(Configuration.mm_highlight);
      
      driver.findElement(By.xpath(Configuration.Save)).click();
      Thread.sleep(9000);
      
      driver.findElement(By.xpath("//a[contains(text(),'Mega menu - shop tab')]")).click();

      //Add links
      WebElement MenuLink35 = driver.findElement(By.id(Configuration.InsertMedia));
      new Select(MenuLink35).selectByValue(Configuration.Link);
      
      driver.findElement(By.xpath(Configuration.Add)).click();
      Thread.sleep(3000);
      //URL
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input")).sendKeys("http://shop.orange.co.uk/");
      //Text
      driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input")).sendKeys("shop");
      
      driver.findElement(By.xpath(Configuration.Save)).click();
      driver.findElement(By.xpath(Configuration.Publish)).click();
      driver.findElement(By.xpath(Configuration.PublishAll)).click();
      driver.get("http://homepage.lbr.preprod.thundercontrol.com/index5.html");
      builder.moveToElement(driver.findElement(By.xpath(Configuration.shop))).perform();
           
      Thread.sleep(2000);
      driver.quit();

      
	}
}

