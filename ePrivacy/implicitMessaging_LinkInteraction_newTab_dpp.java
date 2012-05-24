package tests.ePrivacy;

import java.util.Iterator;
import java.util.Set;
import java.util.List;
import net.sourceforge.htmlunit.corejs.javascript.JavaScriptException;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.lang.Thread;

public class implicitMessaging_LinkInteraction_newTab_dpp {

	FirefoxDriver driver = new FirefoxDriver();

	@Test
	public void main() throws Exception {
		// public void main(String[] args) throws Exception {

		driver.manage().deleteAllCookies();

		driver.get("http://web.kl.dev.portaldev2.local/p/sport/home?nocache=1");
		System.out.println("*************Before clicking********************");
		Set<String> windowids = driver.getWindowHandles();
		Iterator<String> iter = windowids.iterator();

		while (iter.hasNext()) {
			System.out.println(iter.next());
		}

		driver.manage().deleteAllCookies();

		if (driver.findElement(By.xpath("//*[@id='cookieBannerD']"))
				.isDisplayed()) {
			System.out.println("Header message is displayed");
		} else {
			System.out.println("Header message is not displayed");
			// return false;
		}

		List<WebElement> links = driver.findElements(By
				.linkText("entertainment"));
		System.out.println(links.size());
		String dyn_link = null;
		System.out.println(links.get(0).getAttribute("href"));
		dyn_link = links.get(0).getAttribute("href");
		openTab(driver, dyn_link);
		Set<String> handles = driver.getWindowHandles();
		String current = driver.getWindowHandle();
		handles.remove(current);
		String newTab = handles.iterator().next();
		Thread.sleep(2000);
		driver.switchTo().window(newTab);

		Set<Cookie> allCookies1 = driver.manage().getCookies();
		for (Cookie loadedCookie : allCookies1) {
			System.out.println(String.format("%s -> %s",
					loadedCookie.getName(), loadedCookie.getValue()));
		}
		Cookie Newscookie = driver.manage().getCookieNamed("AcceptanceCookie");

		if (Newscookie.getName().startsWith("AcceptanceCookie")) {
			System.out.println("cookie string is AcceptanceCookie");
		} else {
			System.out.println("cookie string is AcceptanceCookie");
		}

		driver.switchTo().window(current);
		driver.findElement(By.xpath("//*[@id='cookieRemindBanner']"))
				.isDisplayed();

		System.out.println("Test complete");

		driver.quit();
	}

	public static void openTab(WebDriver driver, String url) {
		String script = "var d=document,a=d.createElement('a');a.target='_blank';a.href='%s';a.innerHTML='.';d.body.appendChild(a);return a";
		Object element = trigger(driver, String.format(script, url));
		if (element instanceof WebElement) {
			WebElement anchor = (WebElement) element;
			anchor.click();
			trigger(driver, "var a=arguments[0];a.parentNode.removeChild(a);",
					anchor);
		} else {
			throw new JavaScriptException(element, "Unable to open tab", 1);
		}
	}

	public static Object trigger(WebDriver driver, String script) {
		return ((JavascriptExecutor) driver).executeScript(script);
	}

	public static void trigger(WebDriver driver, String script,
			WebElement element) {
		((JavascriptExecutor) driver).executeScript(script, element);

	}

}
