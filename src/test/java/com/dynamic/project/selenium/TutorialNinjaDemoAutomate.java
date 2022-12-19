package com.dynamic.project.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TutorialNinjaDemoAutomate {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.tutorialsninja.com/demo/");
		driver.findElement(By.xpath("//a[@title='My Account']")).click();	////input[starts-with(@name,'sea')]
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abj@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		////input[contains(@type,'ext')]  or //input[contains(@name,'arch')]	//input[ancestor::div[@class='row']
		
		
		//
	}

}
