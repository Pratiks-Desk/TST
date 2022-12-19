package com.dynamic.project.selenium;

import java.util.Iterator;
import java.util.List;

import javax.security.auth.x500.X500Principal;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import net.bytebuddy.utility.dispatcher.JavaDispatcher.IsConstructor;

public class DropDownWithoutselecttag {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.airvistara.com/in/en");
		driver.findElement(By.xpath("//button[@id=\"acceptAllBtn\"]")).click();
		driver.findElement(By.xpath("//button[@class=\"modal-title close close-visiblity col-xs-2 domain-close\"]")).click();
		driver.findElement(By.xpath("//span[@class=\"dropdown-caret\"]//img")).click();
//		driver.findElements(By.xpath("//div[@id=\"header-dropdown\"]//li//span"));
	List<WebElement> elements = driver.findElements(By.xpath("//div[@id=\"header-dropdown\"]//li//span"));
	System.out.println(elements.size());
	for(WebElement x:elements) {
		
		if(x.getText().contains("epal")) {
			x.click();
			break;
		}
	}
	driver.findElement(By.xpath("//button[@class=\"modal-title close close-visiblity col-xs-2 domain-close\"]")).click();
	Actions a = new Actions(driver);
	a.sendKeys(Keys.PAGE_DOWN).build().perform();
	a.sendKeys(Keys.PAGE_DOWN).build().perform();

	a.sendKeys(Keys.PAGE_DOWN).build().perform();
	a.sendKeys(Keys.PAGE_DOWN).build().perform();
	a.sendKeys(Keys.PAGE_DOWN).build().perform();

	a.sendKeys(Keys.PAGE_DOWN).build().perform();


		driver.findElement(By.xpath("//a//img[@src=\"/content/dam/airvistara/global/english/common/image/twitter-1.png\"]"));
	}

}
