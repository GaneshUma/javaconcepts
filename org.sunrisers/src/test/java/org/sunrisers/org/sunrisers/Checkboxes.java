package org.sunrisers.org.sunrisers;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxes {

	public static void main (String args[]) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver","E:\\Chrome_Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/radio.html");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//List<WebElement> checkbox  = driver.findElements(By.xpath("//input[@name='webform' and @type='checkbox']"));	
		
		List check = driver.findElements(By.xpath("//input[@name='webform' and @type='checkbox']"));
		int totalcms = check.size();
	
		for ( int i=0;i <= totalcms-1 ; i++)
		{
			
			String val =  ((WebElement) check.get(i)).getAttribute("value");
			
			if (val.equalsIgnoreCase("//input[@name='webform' and @type='checkbox'] "))
				// equalsIgnoreCase is ignore case (upper/ lower)   
				    {       
				                 // Selecting the check box if its value is same as that we are looking for
				((WebElement) check.get(i)).click();
				        break;
				     }
		}
		
		
		/*
		 * for (WebElement el : checkbox) { if (el.getText() != null) {
		 * System.out.println("check boxes"+el); el.click(); } }
		 */
	}

}



