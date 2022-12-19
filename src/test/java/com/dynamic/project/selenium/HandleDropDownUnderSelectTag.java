package com.dynamic.project.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDownUnderSelectTag {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

//---------------------------------------------------------------------------------------------------------------//

		driver.get("https://testpages.herokuapp.com/basic_html_form.html");
		WebElement multi_dropdown = driver.findElement(By.xpath("//select[@multiple='multiple']"));
		Select select_multi = new Select(multi_dropdown);
		WebElement sim_dropdownElement = driver.findElement(By.xpath("//select[@name='dropdown']"));
		Select select_sim = new Select(sim_dropdownElement);

		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Vikrant");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("1234");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//textarea[@name=\"comments\"]")).sendKeys(
				"I really enjoyed your website and creativity. Your dedication, enthusiasm and commitment to your work.");
		WebElement checkbox = driver.findElement(By.xpath("//input[@type=\"checkbox\"]"));
		WebElement radio = driver.findElement(By.xpath("//input[@type=\"radio\"]"));

		Thread.sleep(1000);
//---------------------------------------------------------------------------------------------------------------//
		// Checkbox Management
		// value="cb1"
		checkbox.findElement(By.xpath("//input[@value=\"cb3\"]")).click();
		Thread.sleep(1000);
		checkbox.findElement(By.xpath("//input[@value=\"cb1\"]")).click();
		Thread.sleep(1000);
		checkbox.findElement(By.xpath("//input[@value=\"cb2\"]")).click();
		Thread.sleep(1000);
		checkbox.findElement(By.xpath("//input[@value=\"cb3\"]")).click();
		Thread.sleep(1000);
//---------------------------------------------------------------------------------------------------------------//
		// Radio Buttons Management
		// value="rd1"
		radio.findElement(By.xpath("//input[@value=\"rd3\"]")).click();
		Thread.sleep(1000);
		radio.findElement(By.xpath("//input[@value=\"rd1\"]")).click();
		Thread.sleep(1000);
		radio.findElement(By.xpath("//input[@value=\"rd2\"]")).click();
		Thread.sleep(1000);

//---------------------------------------------------------------------------------------------------------------//

		System.out.println("\n<--------------------------------------------------------------------------->\n");
//---------------------------------------------------------------------------------------------------------------//
		// Sigle Select Dropdown
		Thread.sleep(1000);

		System.out.println("This Multi-Select dropdown any default value : \t" + multi_dropdown.isSelected());
		System.out.println("This Multi-Select dropdown select multiple options:\t" + select_multi.isMultiple());
		select_multi.deselectByValue("ms4");
		Thread.sleep(1000);
		select_multi.selectByValue("ms3");
		Thread.sleep(900);
		select_multi.selectByValue("ms1");
		Thread.sleep(900);
		select_multi.deselectByValue("ms3");
		Thread.sleep(900);
		select_multi.selectByValue("ms4");
		Thread.sleep(800);
		select_multi.selectByValue("ms2");
		Thread.sleep(900);
		select_multi.selectByValue("ms3");
		Thread.sleep(900);
		select_multi.deselectByValue("ms3");
		Thread.sleep(900);
		select_multi.deselectByValue("ms2");

// ---------------------------------------------------------------------------------------------------------------//
		System.out.println("\n<--------------------------------------------------------------------------->\n");
		// ---------------------------------------------------------------------------------------------------------------//
//		Sigle Select Dropdown
		System.out.println("This single select dropdown any default value : \t" + sim_dropdownElement.isSelected());
		System.out.println("This single select dropdown select multiple options:\t" + select_sim.isMultiple());
		Thread.sleep(1000);
		select_sim.selectByIndex(1);
		Thread.sleep(800);
		select_sim.selectByIndex(3);
		Thread.sleep(900);
		select_sim.selectByIndex(0);
		Thread.sleep(800);
		select_sim.selectByIndex(2);
		Thread.sleep(900);
		select_sim.selectByIndex(4);
		Thread.sleep(1000);
		select_sim.selectByIndex(5);

//---------------------------------------------------------------------------------------------------------------//

		Thread.sleep(2000);
		for (WebElement ele: select_multi.getAllSelectedOptions())
		{
			System.out.println(ele.getText());
		}
		
		
//---------------------------------------------------------------------------------------------------------------//

//		driver.findElement(By.xpath("//input[@value='submit']"));		//Submiting the form

//---------------------------------------------------------------------------------------------------------------//

		driver.quit();
	}

}
