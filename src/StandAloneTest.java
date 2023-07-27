
import org.testng.AssertJUnit;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.beust.jcommander.JCommander.Builder;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StandAloneTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/client");
		//LandingPage landingPage = new LandingPage(driver);
	    driver.findElement(By.id("userEmail")).sendKeys("sreevathsa@gmail.com");
	    driver.findElement(By.id("userPassword")).sendKeys("Abcd@123");
	   driver.findElement(By.id("login")).click();
	   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	   wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".col-lg-4")));
		
		List<WebElement> products = driver.findElements(By.cssSelector(".col-lg-4"));

		String productName = "ZARA COAT 3";

		
		WebElement prod = products.stream()
				.filter(product -> product.findElement(By.cssSelector("b")).getText().equals("ZARA COAT 3")).findFirst()
				.orElse(null);
		prod.findElement(By.cssSelector(".card-body button:last-of-type")).click();

	//	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#toast-container")));

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".ng-animating")));
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("[routerlink=\"/dashboard/cart\"]")).click();

		List<WebElement> cartProducts = driver.findElements(By.cssSelector(".cartSection h3"));
		Boolean match = cartProducts.stream()
				.anyMatch(cartProduct -> cartProduct.getText().equalsIgnoreCase(productName));
		Assert.assertTrue(match);

		driver.findElement(By.cssSelector(".totalRow button")).click();

		// WebElement country =
		// driver.findElement(By.cssSelector("input[placeholder='Select
		// Country']")).sendKeys("Ind");
		Actions a = new Actions(driver);
		a.sendKeys(driver.findElement(By.cssSelector("input[placeholder='Select Country']")), "india").build()
				.perform();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".ta-results")));
		driver.findElement(By.cssSelector(".ta-item:nth-of-type(2)")).click();
		Thread.sleep(3000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)");

		WebElement submit = driver.findElement(By.cssSelector(".btnn"));
		wait.until(ExpectedConditions.elementToBeClickable(submit));
		js.executeScript("arguments[0].click()", submit);
		
		String confirmMessage = driver.findElement(By.cssSelector(".hero-primary")).getText();
		AssertJUnit.assertTrue(confirmMessage.equalsIgnoreCase("Thankyou for the order."));

	}

}
