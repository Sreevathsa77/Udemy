import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.spicejet.com/");
        //driver.findElement(By.cssSelector());
        driver.findElement(By.id("divpaxinfo")).click();
		   Thread.sleep(2000L);
		   int i=1;
		while(i<5)
		{
		driver.findElement(By.id("hrefIncAdt")).click();//4 times
		i++;
		}

		   System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		for(int j=1;j<5;i++)
		{
		driver.findElement(By.id("hrefIncAdt")).click();
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
	    System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	    
	}

}
