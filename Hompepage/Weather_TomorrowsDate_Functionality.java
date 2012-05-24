package tests.Hompepage;

import java.util.Calendar;

import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Weather_TomorrowsDate_Functionality {

	@Test
    public void testTWeather() throws Exception {

     //WebDriver driver = new FirefoxDriver();
     FirefoxDriver driver = new FirefoxDriver();

     driver.get("http://homepage.lbr.preprod.thundercontrol.com");
     System.out.println("Current Url:"+driver.getCurrentUrl());


     WebElement Weather = driver.findElementByXPath("//*[@id='tomorrows-weather']/h6");
     Weather.isDisplayed();
     System.out.println("Tomorrow's date displayed: "+Weather.getText());
     String text =  Weather.getText();

     String dateStr = text.substring(9);
     System.out.println(text.substring(9));

     String month = dateStr.substring(2);
     System.out.println(dateStr.substring(2));

     String day = dateStr.substring(0,2);
     System.out.println(dateStr.substring(0,2));

   int calMonth = Calendar.getInstance().get(Calendar.MONTH);
     int to_day = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
    int tomorrow = to_day+1;
     System.out.println("Calendar Month: "+calMonth);
     System.out.println("Calendar Day: "+to_day);
     System.out.println("Calendar tomorrows Day: "+tomorrow);
     
     String[] strMonths = new String[]{
     "January",
     "February",
     "March",
     "April",
     "May",
     "June",
     "Jul",
     "August",
     "September",
     "October",
     "November",
     "December"

     };
     
    String fullMonth = strMonths[calMonth];
     Assert.assertEquals(month.trim(), fullMonth);
     Assert.assertEquals(day.trim(), Integer.toString(tomorrow));
     driver.quit();
    
}

}
