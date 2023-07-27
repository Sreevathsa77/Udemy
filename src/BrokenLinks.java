import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;
public class BrokenLinks {
	public static void main(String[] args) throws MalformedURLException, IOException {
// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.m
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> links = driver.findElements(By.cssSelector("li[class='gf-li'] a"));
	    SoftAssert a = new SoftAssert();
		for (WebElement link : links)
		{
			String url = link.getAttribute("href");
			HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
			//Here URL-Class , open connection - method of URL classs with return type HTTPconnection 
			//HTTPconnection is type casted with URL
			conn.setRequestMethod("HEAD");
			conn.connect();
			int respCode = conn.getResponseCode();
			System.out.println(respCode);
			a.assertTrue(respCode < 400, "The link with Text" + link.getText() + " is broken with code" + respCode);
		}
		a.assertAll();
	}
	private static Object getReturnCode(WebElement link) {
// TODO Auto-generated method stub
		return null;
	}
}
