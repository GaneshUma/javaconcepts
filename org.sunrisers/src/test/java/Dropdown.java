import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","E:\\Chrome_Drivers\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Democsr");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		driver.findElement(By.xpath("//img[@src='/opentaps_images/integratingweb/crm.png']")).click();
		
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("IPM");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Chandru");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("kvr");
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();;
		
		
	}

}
