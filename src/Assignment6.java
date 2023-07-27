import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
    driver.findElement(By.cssSelector("#checkBoxOption1")).click();
    String Text=driver.findElement(By.cssSelector("label[for=\"bmw\"]")).getText();
    System.out.println(Text);
    Thread.sleep(2000);
    WebElement dropdown=driver.findElement(By.id("dropdown-class-example"));
    
    Select s = new Select(dropdown);
    s.selectByVisibleText(Text);
    driver.findElement(By.id("name")).sendKeys(Text);
    driver.findElement(By.id("alertbtn")).click();
   String alertText = driver.switchTo().alert().getText();
   System.out.println(alertText);
   if(alertText.contains(Text))
   {
	   System.out.println("Successful");
   }
     else {
    	 System.out.println("Unsuccessful");
		   
   }
    
    
	}

}
