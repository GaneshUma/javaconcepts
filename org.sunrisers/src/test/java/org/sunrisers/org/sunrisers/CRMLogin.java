package org.sunrisers.org.sunrisers;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CRMLogin {
	
	public static void main (String args[]) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "E:\\Chrome_Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		driver.get("https://ui.cogmento.com");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("ganeshmisson@gmail.com");
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("11@Selenium");
		
		driver.findElement(By.xpath("//div[text()='Login']")).click();
		
		Thread.sleep(1000);
		WebElement button =driver.findElement(By.xpath("//*[@class='plus inverted icon'][2]"));
		js.executeScript("arguments[0].click();", button);
		
	}
	

}
