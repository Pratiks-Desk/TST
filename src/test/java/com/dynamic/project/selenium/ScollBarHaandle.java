package com.dynamic.project.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScollBarHaandle {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// Another Scroll site - https://www.album.alexflueras.ro/index.php
		driver.get("https://demo.guru99.com/test/guru99home/scrolling.html");
		
		WebElement fsele = driver.findElement(By.partialLinkText("SAP MM"));

		WebElement sxele = driver.findElement(By.partialLinkText("VBScript"));
		WebElement seele = driver.findElement(By.partialLinkText("ACCOUNTING"));
		WebElement thele = driver.findElement(By.partialLinkText("LIVE TESTING"));
		WebElement ftele = driver.findElement(By.partialLinkText("MOBILE TESTING"));

		WebElement ffele = driver.findElement(By.partialLinkText("Ethical Hacking"));
				
		JavascriptExecutor jsexe = (JavascriptExecutor) driver;
		Thread.sleep(1000);
		jsexe.executeScript("arguments[0].scrollIntoView();", seele);
		Thread.sleep(1000);
		jsexe.executeScript("arguments[0].scrollIntoView();", thele);
		Thread.sleep(1000);
		jsexe.executeScript("arguments[0].scrollIntoView();", ftele);
		Thread.sleep(1000);
		jsexe.executeScript("arguments[0].scrollIntoView();", ffele);
		Thread.sleep(1000);
		jsexe.executeScript("arguments[0].scrollIntoView();", sxele);
		Thread.sleep(1000);
		jsexe.executeScript("arguments[0].scrollIntoView();", thele);
		Thread.sleep(1000);
		jsexe.executeScript("arguments[0].scrollIntoView();", ftele);
		Thread.sleep(1000);
		jsexe.executeScript("arguments[0].scrollIntoView();", fsele);
		Thread.sleep(1000);
		jsexe.executeScript("arguments[0].scrollIntoView();", ftele);
		Thread.sleep(1000);
		jsexe.executeScript("arguments[0].scrollIntoView();", sxele);
		Thread.sleep(1000);
		jsexe.executeScript("arguments[0].scrollIntoView();", thele);
		Thread.sleep(1000);
		jsexe.executeScript("arguments[0].scrollIntoView();", ftele);
		
		Thread.sleep(1000);
		System.out.println("Sucessfully scrolled..!");
		
		Thread.sleep(2000);
		driver.close();
	}

}
