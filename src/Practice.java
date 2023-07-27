import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		Thread.sleep(2000);
		driver.findElement(By.name("name")).sendKeys("SreeVathsa");
		driver.findElement(By.name("email")).sendKeys("sreevathsa@google.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("Hello");
		driver.findElement(By.className("form-check-input")).click();
		WebElement ele = driver.findElement(By.id("exampleFormControlSelect1"));
		Select gender = new Select(ele);
		gender.selectByVisibleText("Female");
		driver.findElement(By.id("inlineRadio2")).click();
		driver.findElement(By.name("bday")).sendKeys("20-02-1998");
		driver.findElement(By.cssSelector(".btn-success")).click();
		System.out.println(driver.findElement(By.cssSelector(".alert-success")).getText());
	}
}

/*
 * System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")
 * ).isEnabled());
 * 
 * System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
 * 
 * driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
 * 
 * System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
 * 
 * if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
 * 
 * {
 * 
 * System.out.println("its enabled");
 * 
 * Assert.assertTrue(true);
 * 
 * }
 * 
 * else
 * 
 * {
 * 
 * Assert.assertTrue(false);
 * 
 * }
 */
