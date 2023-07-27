import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C550525804944%7Cb%7Cfacebook%20%27%7C&placement=&creative=550525804944&keyword=facebook%20%27&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696220912%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-327195741349%26loc_physical_ms%3D1007768%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=Cj0KCQjwyOuYBhCGARIsAIdGQRML6hco6pQXiTHPDua1PHUBwzITQjx18UB3r7DOpvHBb33AiJuVEmgaAuqmEALw_wcB");
		driver.findElement(By.id("#email")
		driver.findElement(By.name("firstname")).sendKeys("Sree");
		driver.findElement(By.name("lastname")).sendKeys("Vathsa");
		driver.findElement(By.name("reg_email__")).sendKeys("9964745651");
		Thread.sleep(2000L);
		driver.findElement(By.id("//button[@id='u_0_s_pE']/")).click();

	}

}
