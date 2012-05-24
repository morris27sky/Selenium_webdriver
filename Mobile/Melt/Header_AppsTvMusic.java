package tests.Mobile.Melt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.ui.Select;

import tests.Melt.verification.New.Configuration;

public class Header_AppsTvMusic {

	   public static void main(String[] args) throws Exception {

	       FirefoxProfile ffProfile = new FirefoxProfile();
	       ffProfile.setPreference("network.http.phishy-userpass-length", 255);
	       WebDriver driver = new FirefoxDriver(ffProfile);
	       driver.get(Configuration.baseurl);
	       Thread.sleep(3000);

	       WebElement ExpandMobileTree = driver.findElement(By.xpath(Configuration.ExpandMobile));
	       ExpandMobileTree.click();
	       Thread.sleep(3000);
	       
	       WebElement ExpandSegmentTree = driver.findElement(By.xpath(Configuration.ExpandSegment));
	       ExpandSegmentTree.click();
	       Thread.sleep(6000);
	       
	       WebElement Segment1 = driver.findElement(By.xpath(Configuration.MobileSegment));
	       Segment1.click();
	       Thread.sleep(6000);
	       
	       WebElement Header = driver.findElement(By.xpath(Configuration.Header));
	       Header.click();
	       Thread.sleep(6000);
	       
	       WebElement AppsTvMusic = driver.findElement(By.xpath(Configuration.AppsTvMusic));
	       AppsTvMusic.click();
	       Thread.sleep(6000);
	       
	       WebElement ContentTypeHint_1 = driver.findElement(By.xpath(Configuration.ContentTypeHint)); 

	       Select selectBoxControlledSearch = new Select(ContentTypeHint_1);

	       selectBoxControlledSearch.selectByValue(Configuration.AppsTvMusic_hint);
	       Thread.sleep(6000);
	       
	       WebElement saveHeader = driver.findElement(By.xpath(Configuration.Save));
	       saveHeader.click();
	       Thread.sleep(3000);
	       
	       WebElement Link1 = driver.findElement(By.id(Configuration.InsertMedia)); 

	       Select selectList1 = new Select(Link1);
	       //select link
	       selectList1.selectByValue(Configuration.Link);
	       
	       WebElement AddLink = driver.findElement(By.xpath(Configuration.Add));
	       AddLink.click();
	       Thread.sleep(6000);

	       WebElement urlText1 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input"));
	       urlText1.sendKeys("http://store.orangeworld.co.uk/");
	       WebElement LinkText1 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input"));
	       LinkText1.sendKeys("games");
	       WebElement reportingEnable1 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[8]/input"));
	       reportingEnable1.click();
	       WebElement reportingCampaign1 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[9]/input"));
	       reportingCampaign1.sendKeys("premium");
	       WebElement reportingID1 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[10]/input"));
	       reportingID1.sendKeys("header");
	       WebElement AddLink1 = driver.findElement(By.xpath(Configuration.Add));
	       AddLink1.click();
	       Thread.sleep(3000);
	       
	       WebElement urlText2 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input"));
	       urlText2.sendKeys("http://store.orangeworld.co.uk/apps");
	       WebElement LinkText2 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[4]/input"));
	       LinkText2.sendKeys("apps");
	       WebElement reportingEnable2 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[8]/input"));
	       reportingEnable2.click();
	       WebElement reportingCampaign2 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[9]/input"));
	       reportingCampaign2.sendKeys("premium");
	       WebElement reportingID2 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[10]/input"));
	       reportingID2.sendKeys("header");
	
	       WebElement saveLinks = driver.findElement(By.xpath(Configuration.Save));
	       saveLinks.click();
	       Thread.sleep(3000);
	       
	       WebElement LinkWithimage = driver.findElement(By.id(Configuration.InsertMedia)); 

	       Select selectList2 = new Select(LinkWithimage);
	       //select link with image
	       selectList2.selectByValue(Configuration.LinkWithImage);
	       
	       WebElement AddLink2 = driver.findElement(By.xpath(Configuration.Add));
	       AddLink2.click();
	       Thread.sleep(6000);      
	       
	       WebElement urlText4 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input"));
	       urlText4.sendKeys("http://orange.vringo.co.uk/c/coldplayparadise");
	       Thread.sleep(9000);

	       WebElement textarea1 = driver.findElement(By.xpath("(//*[@class='mceEditor defaultSkin'])[1]//iframe"));
	       String id = textarea1.getAttribute("id");
	       final WebDriver frame = driver.switchTo().frame(id);  
	       final WebElement editorBody = frame.findElement(By.xpath("//*"));  
	       editorBody.sendKeys("vringo");  
	       driver.switchTo().defaultContent();
	       
	       WebElement browse = driver.findElement(By.xpath("//input[@value='Browse...']"));
	       browse.click();
	       Thread.sleep(9000);
	       
	       WebElement searchInpute = driver.findElement(By.xpath("//*[@id='searchInput']"));       
	       searchInpute.sendKeys("Coldplay_paradise144.jpg");
	       Thread.sleep(8000);

	       WebElement checkbox = driver.findElement(By.xpath(Configuration.CheckBox));
	       checkbox.click();
	       Thread.sleep(9000);
	       
	       WebElement OK = driver.findElement(By.xpath(Configuration.OK));
	       OK.click();
	       Thread.sleep(9000);

	       WebElement reportingEnable3 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[8]/input"));
	       reportingEnable3.click();
	       WebElement reportingCampaign3 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[9]/input"));
	       reportingCampaign3.sendKeys("premium");
	       WebElement reportingID3 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[10]/input"));
	       reportingID3.sendKeys("header");
	       WebElement altImage3 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[15]/input"));
	       altImage3.sendKeys("vringo");
	       
	       WebElement AddLink3 = driver.findElement(By.xpath(Configuration.Add));
	       AddLink3.click();
	       Thread.sleep(3000);
	       
	       WebElement urlText5 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input"));
	       urlText5.sendKeys("http://orangeworld.co.uk/p/musicandtones/home");
	       Thread.sleep(9000);

	       WebElement textarea4 = driver.findElement(By.xpath("(//*[@class='mceEditor defaultSkin'])[1]//iframe"));
	       String id1 = textarea4.getAttribute("id");
	       final WebDriver frame1 = driver.switchTo().frame(id1);  
	       final WebElement editorBody1 = frame1.findElement(By.xpath("//*"));  
	       editorBody1.sendKeys("Chart");  
	       driver.switchTo().defaultContent();
	       
	       WebElement browse1 = driver.findElement(By.xpath("//input[@value='Browse...']"));
	       browse1.click();
	       Thread.sleep(9000);
	       
	       WebElement searchInpute1 = driver.findElement(By.xpath("//*[@id='searchInput']"));  
	       searchInpute1.clear();
	       searchInpute1.sendKeys("Woman_hair_music144.jpg");
	       Thread.sleep(8000);

	       WebElement checkbox1= driver.findElement(By.xpath(Configuration.CheckBox));
	       checkbox1.click();
	       Thread.sleep(9000);
	       
	       WebElement OK1= driver.findElement(By.xpath(Configuration.OK));
	       OK1.click();
	       Thread.sleep(9000);

	       WebElement reportingEnable4 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[8]/input"));
	       reportingEnable4.click();
	       WebElement reportingCampaign4 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[9]/input"));
	       reportingCampaign4.sendKeys("premium");
	       WebElement reportingID4 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[10]/input"));
	       reportingID4.sendKeys("header");
	       WebElement altImage4 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[15]/input"));
	       altImage4.sendKeys("Chart");
	       
	       WebElement AddLink4 = driver.findElement(By.xpath(Configuration.Add));
	       AddLink4.click();
	       Thread.sleep(3000);
	       
	       WebElement urlText6 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input"));
	       urlText6.sendKeys("http://store.orangeworld.co.uk/en/themepages/default.aspx?tpagesid=2902&tagid=2888");
	       Thread.sleep(9000);

	       WebElement textarea5 = driver.findElement(By.xpath("(//*[@class='mceEditor defaultSkin'])[1]//iframe"));
	       String id2 = textarea5.getAttribute("id");
	       final WebDriver frame2 = driver.switchTo().frame(id2);  
	       final WebElement editorBody2 = frame2.findElement(By.xpath("//*"));  
	       editorBody2.sendKeys("games");  
	       driver.switchTo().defaultContent();
	       
	       WebElement browse2 = driver.findElement(By.xpath("//input[@value='Browse...']"));
	       browse2.click();
	       Thread.sleep(9000);
	       
	       WebElement searchInpute2 = driver.findElement(By.xpath("//*[@id='searchInput']")); 
	       searchInpute2.clear();
	       searchInpute2.sendKeys("Tetris144.jpg");
	       Thread.sleep(8000);

	       WebElement checkbox2= driver.findElement(By.xpath(Configuration.CheckBox));
	       checkbox2.click();
	       Thread.sleep(9000);
	       
	       WebElement OK2= driver.findElement(By.xpath(Configuration.OK));
	       OK2.click();
	       Thread.sleep(9000);

	       WebElement reportingEnable5 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[8]/input"));
	       reportingEnable5.click();
	       WebElement reportingCampaign5 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[9]/input"));
	       reportingCampaign5.sendKeys("premium");
	       WebElement reportingID5 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[10]/input"));
	       reportingID5.sendKeys("header");
	       WebElement altImage5 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[15]/input"));
	       altImage5.sendKeys("games");     
	       
	       WebElement AddLink5 = driver.findElement(By.xpath(Configuration.Add));
	       AddLink5.click();
	       Thread.sleep(3000);
	       
	       WebElement urlText7 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[3]/input"));
	       urlText7.sendKeys("http://store.orangeworld.co.uk/en/apps/chart.aspx?&tagid=2889");
	       Thread.sleep(9000);

	       WebElement textarea6 = driver.findElement(By.xpath("(//*[@class='mceEditor defaultSkin'])[1]//iframe"));
	       String id3 = textarea6.getAttribute("id");
	       final WebDriver frame3 = driver.switchTo().frame(id3);  
	       final WebElement editorBody3 = frame3.findElement(By.xpath("//*"));  
	       editorBody3.sendKeys("Chart Apps");  
	       driver.switchTo().defaultContent();
	       
	       WebElement browse3 = driver.findElement(By.xpath("//input[@value='Browse...']"));
	       browse3.click();
	       Thread.sleep(9000);
	       
	       WebElement searchInpute3 = driver.findElement(By.xpath("//*[@id='searchInput']"));       
	       searchInpute3.clear();
	       searchInpute3.sendKeys("Chart_apps144.jpg");
	       Thread.sleep(8000);

	       WebElement checkbox3= driver.findElement(By.xpath(Configuration.CheckBox));
	       checkbox3.click();
	       Thread.sleep(9000);
	       
	       WebElement OK3= driver.findElement(By.xpath(Configuration.OK));
	       OK3.click();
	       Thread.sleep(9000);

	       WebElement reportingEnable6 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[8]/input"));
	       reportingEnable6.click();
	       WebElement reportingCampaign6 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[9]/input"));
	       reportingCampaign6.sendKeys("premium");
	       WebElement reportingID6 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[10]/input"));
	       reportingID6.sendKeys("header");
	       WebElement altImage6 = driver.findElement(By.xpath("//div[@class='editFormContainer']//li[15]/input"));
	       altImage6.sendKeys("Chart Apps");
	       
	       WebElement saveItem1 = driver.findElement(By.xpath(Configuration.Save));
	       saveItem1.click();
	       Thread.sleep(9000);      
}
}