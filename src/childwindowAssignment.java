import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class childwindowAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Multiple Windows")).click();
		driver.findElement(By.cssSelector("a[target='_blank']")).click();
		Set<String> pages = driver.getWindowHandles();
		Iterator<String> it = pages.iterator();
		String childid = it.next();
		String childid2 = it.next();
		driver.switchTo().window(childid2);
		System.out.println(driver.findElement(By.className("example")).getText().split(" ")[1]);
		driver.switchTo().window(childid);
		System.out.println(
				driver.findElement(By.xpath("//h3[contains(text(),'Opening a new window')]")).getText().split("a")[1]
						.trim());


	}

}
