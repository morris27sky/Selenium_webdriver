package tests.MobileHP.iPhone;

import java.io.File;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.android.AndroidDriver;


public class Constants {
   
    AndroidDriver driver = new AndroidDriver();
   
    //Menu item 6
        //Search Tab
        public static  final String SearchTab = "//ul[@id='thb']/li[6]/a";
        public static  final String SearchBox = "//div[@id='m6']/div/div/form/div/div";
        public static  final String SearchBoxTextArea = "//div[@id='m6']/div/div/form/div/div/div[1]/input";
       
    //Menu item 5
        //Menu Tab
        public static  final String MenuTab = "//ul[@id='thb']/li[5]/a";
            //Menu News and Weather link
        public static final String MenuContent_News = "//div[@id='st-']/div/ul[2]/li[1]/a";
        public static final String MenuContent_News_BreadCrumb ="//div[@id='thbc_menu']/div/ul/li[2]/a";
        public static final String News_and_Weather_Homepage = "//div[@id='st-newsandweather']/div[2]/ul[2]/li[1]/a";
            // Sports link
        public static final String MenuContent_Sports = "//div[@id='st-']/div/ul[2]/li[2]/a";
        public static final String MenuContent_Sports_BreadCrumb = "//div[@id='thbc_menu']/div/ul/li[2]/a";
        public static final String Sports_Homepage = "//div[@id='st-sport']/div[2]/ul[2]/li[1]/a";
            //Entertainment link
        public static final String MenuContent_Entertainment = "//div[@id='st-']/div/ul[2]/li[3]/a";
        public static final String MenuContent_Entertainment_BreadCrumb = "//div[@id='thbc_menu']/div/ul/li[2]/a";
        public static final String Entertainment_Homepage = "//div[@id='st-entertainment']/div[2]/ul[2]/li[1]/a";
            //Apps TV & Music link
        public static final String Menu_apps_TV_Music = "//div[@id='st-']/div/ul[2]/li[4]/a";
        public static final String MenuContent_apps_TV_Music_BreadCrumb = "//div[@id='thbc_menu']/div/ul/li[2]/a";
        public static final String apps_Homepage = "//div[@id='st-whatshot']/div[2]/ul[2]/li[1]/a";
            //Travel link
        public static final String MenuContent_Travel_Maps = "//div[@id='st-']/div/ul[2]/li[5]/a";
        public static final String MenuContent_Travel_Maps_BreadCrumb = "//div[@id='thbc_menu']/div/ul/li[2]/a";
        public static final String Live_Train_Times_Homepage = "//div[@id='st-travelandmaps']/div[2]/ul[2]/li[1]/a";
            // Social link
        public static final String MenuContent_Social = "//div[@id='st-']/div/ul[2]/li[6]/a";
        public static final String MenuContent_Social_BreadCrumb = "//div[@id='thbc_menu']/div/ul/li[2]/a";
        public static final String Orange_Social_Life_Homepage = "//div[@id='st-socialnetworks']/div[2]/ul[2]/li[1]/a";
            // help and support link
        public static final String MenuContent_Help_Support = "//div[@id='st-']/div/ul[2]/li[7]/a";
        public static final String MenuContent_Help_Support_BreadCrumb = "MenuContent_Help_Support";
        public static final String Help_Support_Homepage = "//div[@id='st-helpandcosts']/div[2]/ul[2]/li[1]/a";
       
    //Menu item 4
        //Apps TV & Music Tab
        public static  final String AppsTvMusicTab = "//UL[@id='thb']/LI[4]/A";
       
            //Image1
        public static final String m4Image1 = "//DIV[@id='m4']/DIV/DIV/DIV/DIV[1]/A/IMG";
       
            //Image2
        public static final String m4Image2 = "//DIV[@id='m4']/DIV/DIV/DIV/DIV[2]/A/IMG";
       
            //Image3
        public static final String m4Image3 = "//DIV[@id='m4']/DIV/DIV/DIV/DIV[3]/A/IMG";
   
            //Image4
        public static final String m4Image4 = "//DIV[@id='m4']/DIV/DIV/DIV/DIV[4]/A/IMG";
       
            //Apps TV Music Link1
        public static final String m4Link1 = "//DIV[@id='m4']/DIV/DIV/UL/LI[1]/A";

    //Menu item 3
        //Your Orange Tab
        public static final String YourOrangeTab = "//UL[@id='thb']/LI[3]/A";
       
    //Your Orange Tab Link1
        public static final String m3Link1 = "//DIV[@id='m3']/DIV/DIV/UL/LI[1]/A";
       
    //Menu item 2   
               
        //Favourites Tab
        public static final String FavouritesTab = "//ul[@id='thb']/li[2]";
        public static final String AddToBookMarks = "//div[@id='thfp-main']/div/p[1]";
        public static final String BookMarksTitle = "//input[@id='inputTitle']";
        public static final String BookMarksUrl = "//input[@id='inputUrl']";
        public static final String AddButton = "//a[@id='addUrl']";
        public static final String Bookmarks = "//a[@id='thf-bm']";
        public static final String Bestoftheweb = "//a[@id='thf-or']";
        public static final String YourSubscriptsions = "//div[@id='thfp-main']/div/ul/li[3]/a";
        public static final String FavouritesBreadCrumb = "//div[@id='thbc_fav']/div/ul/li/a";
        public static final String Facebook = "//div[@id='thfp-or']/div[2]/ul/li[1]/a[2]";
       
    //Menu item 1
        //Orange Logo Tab
        public static final String OrangeLogo = "//UL[@id='thb']/LI[@id='li1']/A/IMG[@id='i1']";

    //Header Logos
        //Search
        public static final String Headerlogo_Search = "//UL[@id='thb']/LI[6]/A/IMG[@id='i6']";
        //Menu
        public static final String Headerlogo_Menu = "//UL[@id='thb']/LI[5]/A/IMG[@id='i5']";
        //Apps
        public static final String Headerlogo_Apps = "//UL[@id='thb']/LI[4]/A/IMG[@id='i4']";
        //YourOrange
        public static final String Headerlogo_YourOrange = "//UL[@id='thb']/LI[3]/A/IMG[@id='i3']";
        //Favourites
        public static final String Headerlogo_Favourites = "//UL[@id='thb']/LI[2]/A/IMG[@id='i2']";
        
    //Clear Search Form
        public static final String Clear = "//DIV[@id='m6']/DIV/DIV/FORM/DIV/DIV/DIV[2]";
        
    //Search Results page
        //In News sectoon
        public static final String inNews = "//DIV[@id='body']/DIV[5]/DIV/DIV[1]";
        	//Dropdown link 1
        public static final String dropDownlink1 = "//DIV[@id='body']/DIV[5]/DIV/DIV[2]/DIV[1]/A";
        	//Dropdown link 2
        public static final String dropDownlink2 = "//DIV[@id='body']/DIV[5]/DIV/DIV[2]/DIV[2]/A";
        	//Dropdown link 3
        public static final String dropDownlink3 = "//DIV[@id='body']/DIV[5]/DIV/DIV[2]/DIV[3]/A";
        	//More Results
        public static final String MoreResults = "//DIV[@id='body']/DIV[5]/DIV/DIV[2]/DIV[4]/A";
     
     //Your relationship
        //scroll area (grey)
        public static final String ScrollArea = "//*[@id='rel-scroll']/ul";
        //scroll header text1 (welcome msg)
        public static final String ScrollText1 = "//div[@id='rel-scroll']/ul/li/div/h2";
        //scroll header text2 (swapables)
        public static final String ScrollText2 = "//*[@id='rel-scroll']/ul/li[1]/div[2]/a/p";
     
     //More from orange
        //images1
        public static final String Image1 = "//*[@id='more-scroll']/div/article[1]/a/img";
        //images2
        public static final String Image2 = "//*[@id='more-scroll']/div/article[2]/a/img";
        //images3
        public static final String Image3 = "//*[@id='more-scroll']/div/article[3]/a/img";

        
        public void  screenShot() throws InterruptedException
        {
            Date newDate = new java.util.Date();
            String testName = "ScreenShotSave";
             try
                {
              
                driver.getScreenshotAs(OutputType.FILE);

                Thread.sleep(10000);
                File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
                // Now you can do whatever you need to do with it, for example copy somewhere
                Thread.sleep(14000);
                FileUtils.copyFile(scrFile, new File("/Users/chrismorris/MHP_screenshots/"+newDate+"_"+testName+".png"));

                }

                catch(Exception e){
                    e.printStackTrace();
                }
                Thread.sleep(10000);

             
           
           
        }

    }