package IGS_Automation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Leaves {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://igs.qandle.com/#/dashboard/profile");
		driver.findElement(By.id("login-email")).sendKeys("sreevathsa.g@igsindia.net");
		driver.findElement(By.id("login-password")).sendKeys("Vathsa@123");
		driver.findElement(By.id("signInSubmit")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@ng-show='!international.setting.enabled']")).click();
		
		List<WebElement> leaves=driver.findElements(By.xpath("//div[@pagination-id='statusPaginate']"));
		for(WebElement option :leaves)
		{
		    System.out.println(option.getText());
		}

		

	
	}

}
