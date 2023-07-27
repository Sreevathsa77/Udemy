import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assessment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		WebDriverWait w = new WebDriverWait(driver, 5);
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.xpath("(//span[@class='checkmark'])[2]")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
		driver.findElement(By.id("okayBtn")).click();
		WebElement dropdown = driver.findElement(By.xpath("//select[@class='form-control']"));
		Select dd = new Select(dropdown);
		dd.selectByValue("consult");
		driver.findElement(By.id("signInBtn")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.className("navbar-brand")));
		List<WebElement> products = driver.findElements(By.cssSelector(".card-footer .btn"));
		for (int i = 0; i < products.size(); i++) {
			products.get(i).click();
		}
		driver.findElement(By.partialLinkText("Checkout")).click();
		driver.findElement(By.cssSelector("button.btn-success")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@type='button'])[3]")));
		driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
		driver.quit();
		
		/* WebElement dropdown1 = driver.findElement(By.xpath("//select[@class='form-control']")); 
		  Select dd1 =new Select(dropdown1);
		 dd1.selectByValue("consult"); */
		 

	}

}
