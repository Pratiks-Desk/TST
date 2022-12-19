package com.dynamic.project.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.dynamic.project.Utility;

public class ScreenShotInSelenium {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://google.co.in");
		Utility.takeScreenShot(driver, "googleHomepage"+System.currentTimeMillis());
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Mobile");	
		Thread.sleep(2000);
		Utility.takeScreenShot(driver, "googlesearch"+System.currentTimeMillis());

		driver.quit();
	}

}