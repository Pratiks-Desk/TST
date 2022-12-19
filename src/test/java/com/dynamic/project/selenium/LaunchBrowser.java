package com.dynamic.project.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByPartialLinkText;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("http://testleaf.herokuapp.com/");
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		String page_title= driver.getTitle();
		System.out.println("Title of our webpage is :\t " +page_title+ "\n\n");
		WebElement search = driver.findElement(By.xpath("//input"));  
		search.sendKeys("jab saiyaan aaye sham ko");
		WebElement pointsearch = driver.findElement(By.xpath("//button[@aria-label='Search']"));
		pointsearch.click();
		//driver.findElement(By.xpath("//")).clear();
		//driver.findElement(By.xpath("//a[@id='video-title']")).click();
		driver.findElements(By.xpath("//a[@title='Jab Saiyaan |Full Video| Gangubai Kathiawadi |Sanjay Leela Bhansali| Alia Bhatt |Shreya G|Shantanu M']")).get(0).click();
		
		//driver.quit();
	}

}
