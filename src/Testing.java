import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testing {
	public static void main(String[] args) throws InterruptedException {

		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/"); 
	    driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
	   // System.out.println(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());
	    assertTrue(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());
	    driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
	   // System.out.println(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());
        assertFalse(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());
        System.out.println(driver.findElement(By.xpath("//input[@type='checkbox']")).si);
        driver.close();
	}}
