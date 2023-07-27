package IGS_Automation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Qandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	//	WebDriverManager.firefoxdriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://igs.qandle.com/#/dashboard/profile");
		driver.findElement(By.id("login-email")).sendKeys("sreevathsa.g@igsindia.net");
		driver.findElement(By.id("login-password")).sendKeys("Vathsa@123");
		driver.findElement(By.id("signInSubmit")).click();
		Thread.sleep(1000);
		// Qandle page is Dynamic 
		//System.out.println(driver.findElement(By.className("aInfo")).getText());
		
		String workingHour=driver.findElement(By.xpath("//div[@class='timer-time timer-container ng-scope']")).getText();
		System.out.println("Today's working hour is:"+workingHour);
		
		String clockInTime = driver.findElement(By.xpath("//div[@class='timer-time-set timer-box blue ng-binding']")).getText();
		System.out.println("Clock IN Time:"+clockInTime);
		
		
		String breakDuration = driver.findElement(By.xpath("//div/span[@class='b2 ng-binding']")).getText();
		System.out.println("Break Duration is:"+breakDuration);
		
		System.out.println("Average working hours of 7 days");
		String averageWorkingHours = driver.findElement(By.xpath("//div[@class='owl-item active']//div[@class='a-hrs blue b ng-binding'][1]")).getText();
		System.out.println("Average working hour is:"+averageWorkingHours);
		
		//md-select-value[@id='select_value_label_39']//span[@class='_md-select-icon']
		driver.findElement(By.xpath("//md-select-value[@id='select_value_label_39']//span[@class='_md-select-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//md-option[@id='select_option_41']/div[@class='_md-text ng-binding']")).click();
		
		System.out.println("Average working hours of 15 days");
		String averageWorkingHours1 = driver.findElement(By.xpath("//div[@class='owl-item active']//div[@class='a-hrs blue b ng-binding'][1]")).getText();
		System.out.println("Average working hour is:"+averageWorkingHours1);
		Assert.assertEquals(driver.findElement(By.xpath("//div[@class='owl-item active']//div[@class='a-hrs blue b ng-binding'][1]")).getText(), "10:13");
		
		driver.findElement(By.xpath("//span[@ng-show='!international.setting.enabled']")).click();
		
		// Leaves - Dynamic Values 
		
		Thread.sleep(2000);
		List<WebElement> leaves=driver.findElements(By.xpath("//div[@pagination-id='statusPaginate']"));
		for(WebElement option :leaves)
		{
		    System.out.println(option.getText());
		}

		
		// MY Attendance
		Thread.sleep(2000);
		driver.findElement(By.xpath("//md-list-item[@class='md-clickable'][2]")).click();
		
		List<WebElement> attendanceDetails=driver.findElements(By.xpath("//div[@class='atten_status no_margin_mob layout-margin layout-wrap layout-align-xs-center-center layout-align-start-center layout-row']"));
		for(WebElement attendance : attendanceDetails)
		{
			System.out.println(attendance.getText());
		}
				
		//Navigation 
		
		driver.navigate().to("https://rahulshettyacademy.com/dropdownsPractise/");
		Thread.sleep(2000);
	/*	driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();  */
		
		// Static Dropdowns - Will be with tagName Static
		
		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropDown = new Select(staticDropdown);
		dropDown.selectByIndex(1);
	    System.out.println(dropDown.getFirstSelectedOption().getText());
	    dropDown.selectByVisibleText("AED");
	    
	    Thread.sleep(3000);
	  /*  driver.findElement(By.id("#divpaxinfo")).click();
	    Thread.sleep(1000);
	    int i=1;
	    while(i<5) {
	    	driver.findElement(By.id("#hrefIncAdt")).click();
	    	i++;
	    }    */
	    
	    driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//a[@value='BLR']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//a[@value='HBX'])[2]")).click();
	    // driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
	    
		
		//Auto-Suggestive Drop Downs

	    driver.findElement(By.id("autosuggest")).sendKeys("ind");

	    Thread.sleep(3000);

	    List<WebElement> options =driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
	    for(WebElement option :options){
	    if(option.getText().equalsIgnoreCase("India"))
	   {
        option.click();
	    break;
	    }	    }
	    
	    driver.navigate().back();
		driver.close();
	}

}
