package tests.Hompepage;

import java.util.Calendar;

import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Weather_TodaysDate_Functionality {
	
	@Test
    public void testTodaysWeather()
    {

     //WebDriver driver = new FirefoxDriver();
     FirefoxDriver driver = new FirefoxDriver();
     driver.get("http://www.orange.co.uk/");
     System.out.println("Current Url:"+driver.getCurrentUrl());


     WebElement Weather = driver.findElementByXPath("//*[@id='todays-weather']/h6");
     Weather.isDisplayed();
     System.out.println("Today's date displayed: "+Weather.getText());
     String text =  Weather.getText();
     System.out.println(text);

     String dateStr = text.substring(6);
     System.out.println(text.substring(6));

     String month = dateStr.substring(2);
     System.out.println(dateStr.substring(2));

     String day = dateStr.substring(0,2);
     System.out.println(dateStr.substring(0,2));

   int calMonth = Calendar.getInstance().get(Calendar.MONTH);
     int to_day = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
     System.out.println("Calendar Month: "+calMonth);
     System.out.println("Calendar Day: "+to_day);
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
     Assert.assertEquals(day.trim(), Integer.toString(to_day));
     driver.quit();
    
}

}