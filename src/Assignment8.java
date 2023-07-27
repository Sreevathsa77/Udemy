import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment8 {

	public static void main(String[] args) throws InterruptedException, IOException {
		
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
			driver.findElement(By.id("autocomplete")).sendKeys("Ind");
			Thread.sleep(2000);
		    driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
		    driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
		    System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value")); 
		    File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		    FileUtils.copyFile(src,new File("C://Users/Admin/Desktop/Automation/Automation.png"));

		       

	}

}
