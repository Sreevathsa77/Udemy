import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://igs.qandle.com/#/dashboard/profile");
		driver.findElement(By.id("login-email")).sendKeys("sreevathsa.g@igsindia.net");
		Thread.sleep(1000);
		driver.findElement(By.id("login-password")).sendKeys("Vathsa@123");
		Thread.sleep(1000);
		driver.findElement(By.id("signInSubmit")).click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		
}
}
