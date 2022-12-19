package com.dynamic.project.selenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));		
driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.findElement(By.id("alertButton")).click();

		Alert simpleAlert = driver.switchTo().alert();
//		Thread.sleep(1500);
		simpleAlert.accept();
		

		WebElement trav = driver.findElement(By.id("timerAlertButton"));
		trav.click();
//		Thread.sleep(6000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(6));

		wait.until(ExpectedConditions.alertIsPresent());
			Alert timerAlert = driver.switchTo().alert();

		timerAlert.accept();
		driver.close();
	}

}
