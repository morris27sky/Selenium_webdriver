package tests.Melt.verification.New;

import java.io.File;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Configuration {

	
	WebDriver driver = new FirefoxDriver();
	   
    //base urls
    	public static final String baseurl = "https://OrangeDigital:Or1971ngE@adm.preprod.thundercontrol.com";
    	public static final String baseurl_site = "http://m.orange.co.uk/?beta=1";
    	public static final String baseurl_dev02 = "https://OrangeDigital:Or1971ngE@adm.dev02.0itch.com";
    	public static final String baseurl_roaming = "https://OrangeDigital:Or1971ngE@melt.adm.preprod.thundercontrol.com";
    	public static final String baseurl_preprod = "https://OrangeDigital:Or1971ngE@adm.preprod.thundercontrol.com";
    	public static final String baseurl_preprod_roaming = "https://OrangeDigital:Or1971ngE@melt.adm.preprod.thundercontrol.com";
    	public static final String deezer_baseurl = "http://third-par-elasticl-16353it61anrd-1054036656.eu-west-1.elb.amazonaws.com/deezerindirectoffer/";
		public static final String baseurl_dev02_roaming = "https://OrangeDigital:Or1971ngE@melt.adm.dev02.0itch.com";
		public static final String web_url_preprod = "http://homepage.lbr.preprod.thundercontrol.com/index5.html";
	    //public static final String web_url_live = "http://www.orange.co.uk";
		public static final String web_url_live = "http://homepage.lbr.preprod.thundercontrol.com";
	  //Link description
        public static final String Link_description = "//div[@class='editFormContainer']//li[8]/textarea";
        
     //segment tree
      //Segment 1 Tree (Left)
        public static final String Segment1Tree = "//a[contains(text(),'Homepage - Segment 1')]";
      //Segment 2 Tree (Left)
        public static final String Segment2Tree = "//a[contains(text(),'Homepage - Segment 2')]";
      //Segment 3 Tree (Left)
        public static final String Segment3Tree = "//a[contains(text(),'Homepage - Segment 3')]";
      //Segment 4 Tree (Left)
        public static final String Segment4Tree = "//a[contains(text(),'Homepage - Segment 4')]";
      //Segment 5 Tree (Left)
        public static final String Segment5Tree = "//a[contains(text(),'Homepage - Segment 5')]";
      //Segment 6 Tree (Left)
        public static final String Segment6Tree = "//a[contains(text(),'Homepage - Segment 6')]";
      //Segment 20 Tree (Left)
        public static final String Segment20Tree = "//a[contains(text(),'Homepage - Segment 20')]";
        
      //Click segment 4 to edit
        public static final String EditSegment4 = "//a[contains(text(),'Content Explorer - segment 4')]";
      //header_web
        public static final String header_web = "//a[contains(text(),'header')]";
      //Insert package
        public static final String InsertPackage  = "//div[@id='contents']/form/div/p/a";
      //insert package bottom
        public static final String InsertPackageBottom  = "//div[@id='contents']/form/div[3]/p/a";
      //Create a new package
        public static final String CreateNewPackage = "//a[contains(text(),'Create a new package')]";
      // Create a new package bottom
        public static final String CreateNewPackageBottom = "//div[@id='packagePicker_bottom']/div/p/a";      
      //New Package
        public static final String NewPackage = "//a[contains(text(),'New package')]";
      //Save
        public static final String Save = "//input[@name='save']";
      //Publish
        public static final String Publish = "//input[@id='publish']";
      //Publish All
        public static final String PublishOne = "//input[@name='publish']";
      //Publish All
        public static final String PublishAll = "//input[@name='publish_all']";
      //Back after publishing
        public static final String Back = "//input[@value='Back']";
      //Remove package
        public static final String Remove = "//a[contains(text(),'TestPane')]/parent::p/parent::li/following-sibling::li/div[@class='buttons']/a[3]";   
      //Last visited package -  Content Explorer segment 4
        public static final String LastVisitedPackage = "//a[contains(text(),'Content Explorer - segment 4')]";
      //Last visited package -  Content Explorer segment 4
        public static final String LastVisited_mega_menu = "//a[contains(text(),'Mega Menu')]";
      //Last visited package -  Content Explorer segment 4
        public static final String MoreFromOrange_Web = "//a[contains(text(),'More From Orange - segment 5')]";
        
      //recently visited package -  Test pane
        public static final String CE_TestPane = "//a[contains(text(),'TestPane')]";
      //insert media top
        public static final String InsertMedia ="addnew_top";
      //insert media bottom
        public static final String InsertMediaBottom ="addnew_bottom";
      //insert feed section
        public static final String InsertFeed = "//div[@class='editFormContainer']//li[3]/select";
      //Feed article - Latest
        public static final String LatestFeed = "media_OD\\MELT\\Models\\ArticleLatestMediaModel";
      //link with image
        public static final String LinkWithImage = "media_OD\\MELT\\Models\\LinkWithImageMediaModel";
      //Feed Video - Most Recent
        public static final String FeedVideoMostRecent = "media_OD\\MELT\\Models\\VideoMostRecentMediaModel";
      //Feed Article - MostPopular
        public static final String FeedArticleMostPopular = "media_OD\\MELT\\Models\\ArticleMostPopularMediaModel";
      //Feed Article - Latest
        public static final String FeedArticleLatest = "media_OD\\MELT\\Models\\ArticleLatestMediaModel";
      //Feed Article - Headline Package
        public static final String FeedArticleHeadlinePackage = "media_OD\\MELT\\Models\\ArticleHeadlinePackageMediaModel";
      //Sports Live Scores
        public static final String SportsLiveScores = "media_OD\\MELT\\Models\\SportLiveScoreMediaModel";
      //link
        public static final String Link = "media_OD\\MELT\\Models\\LinkMediaModel";
      //Text
        public static final String Text = "media_OD\\MELT\\Models\\TextMediaModel";
    //Ads 
      //Top Ads
        public static final String TopAd = "//a[contains(text(),'Top Ad')]";  
      //Bottom Ads
        public static final String BottomAd = "//a[contains(text(),'Bottom Ad')]";  
      //Celebrities.Bottom
        public static final String CelebritiesBottom = "2416";
      //Home.TouchScreen.Top
        public static final String HomeTouchScreenTop = "12176292";
      //Advertiser
        public static final String InsertAdvertiser = "//div[@class='editFormContainer']//ul/li[3]/select";
      //Tag
        public static final String InsertTag = "//div[@class='editFormContainer']//ul/li[4]/select";
      //Advert
        public static final String Advert = "media_OD\\MELT\\Models\\AdvertMediaModel";
      //Adinfuse
        public static final String Adinfuse = "adinfuse";
      //Adinfuse (Adrouter)
        public static final String AdinfuseAdrouter = "adinfuse-adrouter";
      //Content type hint
        public static final String ContentTypeHint = "//div[@id='contents']/form/ul/li[6]/select";
      //Colour Switcher
        public static final String ColourSwitcherBlack = "hd_colourswitch_black";
        public static final String ColourSwitcherWhite = "hd_colourswitch_white";
      //Make My Homepage
        public static final String MakeMyHomepage = "hd_makehome_link";
      //Controlled search
        public static final String ControlledSearch = "ce_slot_editorial_search";
        
      //mega menu 
        //shop
        public static final String shop = "//a[@id='mm_tab_1']/strong/span";
        //your account
        public static final String your_acc = "//a[@id='mm_tab_1']/strong/span";
        //email & comms
        public static final String email_comms = "//a[@id='mm_tab_1']/strong/span";
        //mobile services
        public static final String mob_services = "//a[@id='mm_tab_1']/strong/span";
        //business
        public static final String business = "//a[@id='mm_tab_1']/strong/span";
        //help & support
        public static final String help_support = "//a[@id='mm_tab_1']/strong/span";
        //news
        public static final String mm_news = "//a[@id='mm_tab_1']/strong/span";
        //entertainment
        public static final String ents = "//a[@id='mm_tab_1']/strong/span";
        //lifestyle
        public static final String lifestyle = "//a[@id='mm_tab_1']/strong/span";
        
      //mega menu hint
        public static final String mm_wiki = "mm_wiki";
        public static final String mm_highlight = "mm_highlight";
        public static final String mm_link_space = "mm_link_space";
        //ask a question
        public static final String ask_question = "mm_column_help_form";

      //Feed section - Celebs & style
        public static final String CelebStyle = "web_celebsandstyle";
      //Feed section - News
        public static final String News = "news";
      //Feed section - celebrity roundup
        public static final String CelebrityRoundup = "celebrity_roundup";
      //Feed section - film
        public static final String Film = "film";
      //Feed section - sports
        public static final String Sports = "sports";
      //Feed section - sport snooker
        public static final String sports_snooker ="sports_snooker";
      //Feed section - sports racing
        public static final String sports_racing = "sports_racing";
      //Add
        public static final String Add = "//input[@value='Add']";
      //Add bottom
        public static final String AddBottom = "//DIV[@id='container']/DIV[@id='contents']/FORM/DIV[3]/INPUT";
      //Weather
        public static final String weather = "ce_slot_weather";
      //File picker OK button
        public static final String OK = "//input[@id='filePickerOkButton']";
      //Checkbox
        public static final String CheckBox = "//input[@name='filePickerContentsCheckbox']";
      //Expand tree - Platform:Mobile
        public static final String ExpandMobile = "//div[@id='container']/div[2]/ul/li[3]/p/a";
      //Expand tree - Channel:Home
        public static final String ExpandSegment = "//div[@id='container']/div[2]/ul/li[3]/ul/li/p/a";
      //Expand tree - Platform:Web
        public static final String ExpandWeb = "//div[@id='container']/div[2]/ul/li[2]/p/a";
      //Expand tree - Channel:Home
        public static final String ExpandSegmentHome = "//div[@id='container']/div[2]/ul/li[2]/ul/li/p/a";
        
        
        
        
    
      //Mobile Homepage
        //Mobile - Segment 1
        public static final String MobileSegment1 = "//a[contains(text(),'mobile home - Segment 1')]";
      //Mobile - mobile home - New Page
        public static final String MobileSegment = "//a[contains(text(),'mobile home - New Page')]";
        //Your header   
        public static final String Header = "//a[contains(text(),'Header')]";
        //Your Relationship   
        public static final String YourRelationship = "//a[contains(text(),'Your Relationship')]";
        //Your content explorer   
        public static final String ContentExplorer = "//a[contains(text(),'Content Explorer')]";
        //Your Premium content   
        public static final String PremiumContent = "//a[contains(text(),'Premium Content')]";
        //Your weather   
        public static final String Weather = "//a[contains(text(),'Weather')]";
        //Your Travel   
        public static final String Travel = "//a[contains(text(),'Travel')]";  
        //Your Ads   
        public static final String Ads = "//a[contains(text(),'Ads')]";  
        //Your MoreFromOrange   
        public static final String MoreFromOrange = "//a[contains(text(),'More from Orange')]";  
        //Your TrendingSearch   
        public static final String TrendingSearch = "//a[contains(text(),'Trending in search')]";  
        //Your Trending 
        public static final String Trending = "//a[contains(text(),'Trending')]";  
        
      //Header Packages
        //Favourites
        public static final String Favourites = "//a[contains(text(),'Favourites')]/parent::p/parent::li/following-sibling::li/div[@class='buttons']/a[6]";
        //Your orange
        public static final String YourOrange = "//a[contains(text(),'your Orange')]/parent::p/parent::li/following-sibling::li/div[@class='buttons']/a[6]";
        //Apps TV music
        public static final String AppsTvMusic = "//a[contains(text(),'apps, TV, music')]/parent::p/parent::li/following-sibling::li/div[@class='buttons']/a[6]";
        //Menu
        public static final String Menu = "//a[contains(text(),'menu')]/parent::p/parent::li/following-sibling::li/div[@class='buttons']/a[6]";
        //Search
        public static final String Search = "//a[contains(text(),'search')]/parent::p/parent::li/following-sibling::li/div[@class='buttons']/a[6]";
        
      //Header Content Type Hint
        //Favourites hints
        public static final String Favourites_hint = "h_favourites";
        //Your orange hints
        public static final String YourOrange_hint = "h_yourorange";
        //Apps,Tv,Music hints
        public static final String AppsTvMusic_hint = "h_appstv";
        //Menu hints
        public static final String Menu_hint = "h_menu";
        //Search hints
        public static final String Search_hint = "h_search";
        //Header Menu scoped hint
        public static final String MenuScoped_hint = "h_menu_scoped";
        //Recently viewed - favourites
        public static final String HL_Favourites_LV = "//a[contains(text(),'Favourites')]";
        //Recently viewed - Content explorer package 1
        public static final String CE_package1 = "//a[contains(text(),'Content explorer package 1')]";
        //Recently viewed - Content explorer package 2
        public static final String CE_package2 = "//a[contains(text(),'Content explorer package 2')]";
        //Recently viewed - Content explorer package 3
        public static final String CE_package3 = "//a[contains(text(),'Content explorer package 3')]";
        //Recently viewed - Content explorer package 4
        public static final String CE_package4 = "//a[contains(text(),'Content explorer package 4')]";
        //Recently viewed - Content explorer package 5
        public static final String CE_package5 = "//a[contains(text(),'Content explorer package 5')]";
        //Recently viewed - Content explorer package 6
        public static final String CE_package6 = "//a[contains(text(),'Content explorer package 6')]";

      //Context switcher
        public static final String Mobile = "mobile-home";
        public static final String Web = "web-home";
        public static final String Mobile_Roaming = "mobile-roaming";
        public static final String Web_Roaming = "web-roaming";
        
      //Fixed homepage (shiva scipts)
        
    	//public static final String baseUrl = "http://www.orange.co.uk";
    	public static final String baseUrl = "http://homepage.lbr.preprod.thundercontrol.com/";
    	
    	//Content Explorer
    	public static final String contentExplorer = "content-explorer";
    	public static final String  arrows = "ce-arrows";
    	public static final String nextButton = "ce-next";
    	public static final String leftButton = "content-cloak-left";
    	public static final String content = "ce-content";
    	public static final String panes = "ce-panes";
    	public static final String innerPanes = "//div[@id='ce-content']/ul/li";
    	
    	//Content Explorer Pane names
    	public static final String panesNavigationBar = "ce-nav";
    	public static final String paneLatest = "pane_navlink_latest";
    	public static final String paneNews = "pane_navlink_news";
    	public static final String paneCelebrityandStyle = "pane_navlink_celebs_&_style";
    	public static final String paneOrangeWednesdays = "pane_navlink_Orange_Wednesdays_&_film";
    	public static final String paneWeather = "pane_navlink_weather";
    	public static final String paneSport = "pane_navlink_sport";
    	public static final String paneTV = "pane_navlink_TV";
    	// Content Explorer current class 
    	public static final String paneLatest_Current = "//div[@id='ce-nav']/ul/li[1]/a[contains(@class,'current no-homelink')]";
    	public static final String panenews_Current = "//div[@id='ce-nav']/ul/li[2]/a[contains(@class,'current')]";
    	public static final String paneweather_Current = "//div[@id='ce-nav']/ul/li[3]/a[contains(@class,'current')]";
    	public static final String panesport_Current = "//div[@id='ce-nav']/ul/li[4]/a[contains(@class,'current')]";
    	public static final String paneCelebrityandStyle_Current = "//div[@id='ce-nav']/ul/li[5]/a[contains(@class,'current')]";
    	public static final String paneTV_Current = "//div[@id='ce-nav']/ul/li[6]/a[contains(@class,'current')]";
    	public static final String paneOrangeWednesdays_Current = "//div[@id='ce-nav']/ul/li[7]/a[contains(@class,'current')]";
    	public static final String filmfinder = "//*[@id='film-finder']";
    	
    	// Content Explorer - navigation to right
    	public static final String rightToNews = "right_arrow_to_news";
    	public static final String rightToSport = "right_arrow_to_sport";
    	public static final String rightToWeather = "right_arrow_to_weather";
    	public static final String rightToCelebsandStyle ="right_arrow_to_celebs_&_style";
    	public static final String rightToTv= "right_arrow_to_TV";
    	public static final String rightToOrangeWednesdays = "right_arrow_to_Orange_Wednesdays_&_film";
    	
    	// Content Explorer - navigation to left
    	public static final String leftToTV = "left_arrow_to_TV";
    	public static final String leftToCelebrity = "left_arrow_to_celebs_&_style";
    	public static final String leftToSport = "left_arrow_to_sport";
    	public static final String leftToWeather = "left_arrow_to_weather";
    	public static final String leftTonews = "left_arrow_to_news";
    	public static final String leftTolatest = "left_arrow_to_latest";
    	
    	//content Explorer homelink 
    	public static final String homeLinkLatest = "ce-homelink";
    	public static final String homeLinkNews = "pane_navlink_news_homelink";
    	public static final String homeLinkWeather = "pane_navlink_weather_homelink";
    	public static final String homeLinkSport = "pane_navlink_sport_homelink";
    	public static final String homeLinkCelebsStyle = "pane_navlink_celebs_&_style_homelink";
    	public static final String homeLinkTV = "pane_navlink_TV_homelink";
    	public static final String homeLink = "pane_navlink_Orange_Wednesdays_&_film";
    	
    	// Panes and slots
    	public static final String paneContent = "ce-panes";
    	public static final String pane1Slot1= "//*[@id='ce-panes']/li[1]/div/div[1]/div";
    	public static final String pane1Slot2 = "//*[@id='ce-panes']/li[1]/div/div[2]/div";
    	public static final String pane1Slot3 = "//*[@id='ce-panes']/li[1]/div/div[3]";
    	public static final String pane1Slot4 = "//*[@id='ce-panes']/li[1]/div/div[4]/div";

    	//Megamenu
    	public static final String menuShop = "mm_tab_1";
    	public static final String menuYourAccount = "mm_tab_2";
    	public static final String menuEmailCommunicate = "mm_tab_3";
    	public static final String menuMobileServices = "mm_tab_4";
    	public static final String menuBusiness = "mm_tab_5";
    	public static final String menuHelpSupport = "mm_tab_6";
    	public static final String menuNews = "mm_tab_7";
    	public static final String menuEntertainment = "mm_tab_8";
    	public static final String menuLifeStyle = "mm_tab_9";
        
        public void  screenShot() throws InterruptedException
        {
            Date newDate = new java.util.Date();
            String testName = "ScreenShotSave";
             try
                {
              
                ((FirefoxDriver) driver).getScreenshotAs(OutputType.FILE);

                Thread.sleep(10000);
                File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
                // Now you can do whatever you need to do with it, for example copy somewhere
                Thread.sleep(14000);
                FileUtils.copyFile(scrFile, new File("/Users/chrismorris/fixed_screenshots/"+newDate+"_"+testName+".png"));

                }

                catch(Exception e){
                    e.printStackTrace();
                }
                Thread.sleep(10000);
           
        }

    }