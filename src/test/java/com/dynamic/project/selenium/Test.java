package com.dynamic.project.selenium;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) throws InterruptedException {

//Calling Browser and Youtube
		System.setProperty("webdriver.chrome.drive", "src/test/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
//Searching for youtube search		
		WebElement search_input = driver.findElement(By.xpath("//input[@name=\"search_query\"]"));
//Sending string of song
		search_input.sendKeys("Abhir Gulal");
		Thread.sleep(2000);
//Clicking search icon		
		driver.findElement(By.xpath("//button[@id=\"search-icon-legacy\"]")).click();
		Thread.sleep(5000);
//Seachimg the required songs link n=by their name.
		driver.findElement(By.partialLinkText("Abhir Gulal")).click();

		Thread.sleep(10000);
/*Song is playing now*/

//collecting the like database for current video i.e. how many people give likes to current video		
		WebElement yt_likes_ele = driver.findElement(By.xpath("//div[@id='segmented-like-button']//button//span"));
		String ytlikescount = yt_likes_ele.getText();
		System.out.println("No. of likes for this video : \t" + ytlikescount);

		Thread.sleep(3000);
//Collecting comment DB for this video.ie who many people gives their comment on the current video.
		

//		Thread.sleep(3000);
//Getting iformation about the owner of channel on which the current video is playing
		WebElement yt_ownername_ele = driver.findElement(By.xpath("//div[@id='owner']//div[@id='text-container']//a"));
		String ytownerName = yt_ownername_ele.getText();
		System.out.println("Ownership Of this channel is : \t" + ytownerName);
		Thread.sleep(3000);
//Getting Share link of current video
		
		
//		
		driver.quit();

		
	}

}
