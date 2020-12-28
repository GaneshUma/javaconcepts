package org.sunrisers.org.sunrisers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_twitter {
	

	public static void main (String args[]) throws InterruptedException	
	{
		System.setProperty("webdriver.chrome.driver","E:\\Chrome_Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://twitter.com/i/flow/signup");
		driver.manage().window().maximize();
	    Thread.sleep(5000);
		Select monthvalue= new Select(driver.findElement(By.xpath("//select[@id='Month']")));
		monthvalue.selectByValue("10");
	}
}


