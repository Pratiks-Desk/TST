package com.dynamic.project.selenium;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YoutubeAutomate {
	public static String my_song;

	public static void main(String[] args) throws InterruptedException {

		// -------------------------------------------------------------------------------------------------------------------------------------------------------------------//

		// Setting Properties

	}
	public static void yt() {
		
	}

	public static void youtubeStaticSong() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		WebElement search_input = driver.findElement(By.xpath("//input[@name=\"search_query\"]"));
		search_input.sendKeys("Aigiri Nandini With Lyrics");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id=\"search-icon-legacy\"]")).click();
		Thread.sleep(5000);
		driver.findElement(By.partialLinkText("Aigiri Nandini With Lyrics")).click();

		Thread.sleep(25000);
		ytownerName();
	}

	public static void youtubeDynamicSong() throws InterruptedException {
		String ytmysong;
		System.out.println("Enter Name of Song , which you want to play :\t");
		Scanner sc_ytsong = new Scanner(System.in);
		ytmysong = sc_ytsong.nextLine();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		WebElement search_input = driver.findElement(By.xpath("//input[@name=\"search_query\"]"));
		search_input.sendKeys(ytmysong);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id=\"search-icon-legacy\"]")).click();
		Thread.sleep(5000);
		driver.findElement(By.partialLinkText(ytmysong)).click();

		Thread.sleep(25000);
		sc_ytsong.close();
		ytownerName();
		ytShareLink();
	}

	public static void ytownerName() {
		WebDriver driver = new ChromeDriver();
		WebElement yt_ownername_ele = driver.findElement(By.xpath("//div[@id='owner']//div[@id='text-container']//a"));
		String ytownerName = yt_ownername_ele.getText();
		System.out.println("Ownership Of this channel is : \t" + ytownerName);
	}

	public static void ytComments() {
		WebDriver driver = new ChromeDriver();
		List<WebElement> yt_comments_ele = driver.findElements(By.xpath(
				"//ytd-item-section-renderer[@section-identifier='comment-item-section']//div[@id='contents']//yt-formatted-string[@id='content-text']"));
		int yt_comments_count_ele = yt_comments_ele.size();
		System.out.println("Total No. of comments for current video : \t" + yt_comments_count_ele);
	}

	public static void ytLikes() {
		WebDriver driver = new ChromeDriver();
		WebElement yt_likes_ele = driver.findElement(By.xpath("//div[@id='segmented-like-button']//button//span"));
		String ytlikescount = yt_likes_ele.getText();
		System.out.println("No. of likes for this video : \t" + ytlikescount);
	}

	public static void ytShareLink() {
		WebDriver driver = new ChromeDriver();
		WebElement yt_sharelink_ele = driver.findElement(By.xpath("//yt-button-shape//button[@aria-label='Share']"));
		yt_sharelink_ele.click();
		WebElement ytsharelink_ele = driver.findElement(By.xpath("//yt-button-shape//button[@aria-label='Copy']"));
		ytsharelink_ele.click();
		String ytsharelinkinput = driver.findElement(By.xpath("//input[@id='share-url']")).getText();
		System.out.println("Link of current video :\t" + ytsharelinkinput);
		driver.findElement(By.xpath("//button[@aria-label=\"Cancel\"]")).click(); // closing share link
	}

}
