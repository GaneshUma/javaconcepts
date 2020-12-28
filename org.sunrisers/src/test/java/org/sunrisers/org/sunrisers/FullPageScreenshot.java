package org.sunrisers.org.sunrisers;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class FullPageScreenshot {

	public static void main (String args[]) throws InterruptedException, IOException
	{
    	System.setProperty("webdriver.chrome.driver", "E:\\Chrome_Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://devqa.io/head-of-qa-roles-and-responsibilities");
		Thread.sleep(5000);
		Screenshot fpScreenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
		ImageIO.write(fpScreenshot.getImage(),"JPEG",new File("E:\\Java_All_in_one\\FPScreenshot\\FullPageScreenshot.jpeg"));

	}

}
