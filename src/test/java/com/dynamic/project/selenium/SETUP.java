package com.dynamic.project.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SETUP {
	public static String its_url;

	public static void main(String[] args) {

		
	}
	public static void setChrome() {
		System.setProperty("webdriver.chrome.drive", "src/test/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(its_url);
	}
	
	public static void get_yt() {
		its_url = "https://www.youtube.com/";
		setChrome();
		
	}
	

}
