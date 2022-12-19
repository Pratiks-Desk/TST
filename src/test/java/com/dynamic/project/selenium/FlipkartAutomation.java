package com.dynamic.project.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartAutomation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		WebDriver flipkart_driver = new ChromeDriver();
		flipkart_driver.get("https://www.flipkart.com/");
		flipkart_driver.manage().window().maximize();
		flipkart_driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Laptop");
		flipkart_driver.findElement(By.xpath("//button[@type='submit']//button[@type='submit']")).click();
	}

}
