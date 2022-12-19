package com.dynamic.project.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLeafAutomate {
	static String title_page;
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://testleaf.herokuapp.com/");
		title_page = driver.getTitle() ;
		System.out.println(title_page);
		driver.findElement(By.partialLinkText("Drop down")).click();
		title_page = driver.getTitle() ;
		System.out.println(title_page);
		
	}

}
