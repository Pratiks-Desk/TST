package com.dynamic.project.selenium;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MapView {

	public static void main(String[] args) {

		System.out.println("Enter The Address : \t");
		Scanner sc_addrss = new Scanner(System.in);
		String my_addrss = sc_addrss.nextLine();
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		sc_addrss.close();
		driver.get("https://www.google.com/maps/");
		driver.findElement(By.xpath("//input[@id=\"searchboxinput\"]")).sendKeys(my_addrss);
		driver.findElement(By.xpath("//button[@id=\"searchbox-searchbutton\"]")).click();
		driver.findElement(By.xpath("//div[contains(@aria-label,\"Results for\")]//div[contains(@aria-label,)]"));
	}

}
