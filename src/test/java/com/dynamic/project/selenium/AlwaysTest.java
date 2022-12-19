package com.dynamic.project.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AlwaysTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get("https://omayo.blogspot.com/");
//		 driver.findElement(By.xpath("//a[@id='b-getorpost']")).click();
		 WebElement dropdown = driver.findElement(By.xpath("//select[@id=\"multiselect1\"]"));
		 Select select = new Select(dropdown);
		 System.out.println(select.isMultiple());
		 select.selectByIndex(2);
		 select.selectByValue("audix");
		 select.selectByVisibleText("Volvo");
		 driver.quit();
//<--------------------------------------------------------------------------------------------------------------------->//

//		driver.get("https://www.udemy.com/courses/development/software-testing/");
//		System.out.println("We are on this Page : \t" + driver.getTitle());
//		Thread.sleep(1500);
//		System.out.println("\n\t\t We travales...");
//		Thread.sleep(1500);
//
//		driver.switchTo().activeElement().findElement(By.className("filter-panel--sidebar--L2lAU"));
//		System.out.println("Find it step-1..");
//		
//		driver.switchTo().activeElement().findElement(By.className("accordion-panel--panel--24beS"));
//		System.out.println("Find it step-2..");
//		driver.findElement(By.xpath("//button[@id=\"u243-accordion-panel-title--15\"]"));
//		System.out.println("Find it step-3..");
//
////<--------------------------------------------------------------------------------------------------------------------->//
//
//		WebElement filter = driver.findElement(By.xpath("//select[@name='sort']"));
//		Select chngorder = new Select(filter);
//		System.out.println(
//				"This Select method collect multiple option , is that true or false : \t" + chngorder.isMultiple());
//		chngorder.selectByValue("popularity");
//		// driver.navigate().back();
//		Thread.sleep(1500);
//
//		System.out.println("We select this sorting :\t"
//				+ driver.findElement(By.xpath("//select //option[@value=\"popularity\"]")).getText());
//		chngorder.selectByValue("newest");
//		// driver.navigate().back();
//		Thread.sleep(1500);
//
//		System.out.println("We select this sorting :\t"
//				+ driver.findElement(By.xpath("//select //option[@value=\"newest\"]")).getText());
//		Thread.sleep(1500);
//
//		chngorder.selectByValue("highest-rated");
//		System.out.println("We select this sorting :\t"
//				+ driver.findElement(By.xpath("//select //option[@value=\"highest-rated\"]")).getText());
//
////		driver.navigate().back();
////		driver.navigate().back();
////<--------------------------------------------------------------------------------------------------------------------->//
//
//		System.out.println("\n\t\t Congratulation we perform sorting successfully..!");
//
//		Thread.sleep(1500);
////<--------------------------------------------------------------------------------------------------------------------->//
//		driver.switchTo().defaultContent();
//		System.out.println("We Are one Defalt page");
////		driver.findElement(By.xpath(""));
////		Thread.sleep(1000);
////
////		driver.findElement(By.xpath(""));
////		Thread.sleep(1000);
////
////		driver.findElement(By.xpath(""));
////		Thread.sleep(1000);
////		
////		driver.findElement(By.xpath(""));
////		Thread.sleep(1000);
////		
////		driver.findElement(By.xpath(""));
////		Thread.sleep(1000);
//
//
////		driver.findElement(By.xpath(""));
////		driver.findElement(By.xpath(""));
////		driver.findElement(By.xpath(""));
////		driver.findElement(By.xpath(""));
//		Thread.sleep(2000);
//
//		driver.quit();

	}

}
