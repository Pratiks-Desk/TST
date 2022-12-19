package com.dynamic.project.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukariDotComAutoMate {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("Webdriver.chrome.driver","src/test/resources/chromrdriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.album.alexflueras.ro/index.php");
		driver.manage().window().maximize();
		WebElement scrollRight = driver.findElement(By.xpath("//*[@id='a21']"));
		WebElement scrollLeft  = driver.findElement(By.xpath("//*[@id='a1']"));
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		//Scroll Right 
		jse.executeScript("arguments[0].scrollIntoView();",scrollRight);
		Thread.sleep(2000);
		//Scroll Left
		jse.executeScript("arguments[0].scrollIntoView();",scrollLeft);
		Thread.sleep(2000);

		}
	}


