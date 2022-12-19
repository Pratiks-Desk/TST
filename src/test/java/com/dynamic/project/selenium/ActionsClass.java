package com.dynamic.project.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.co.in/");
        WebElement elem = driver.findElement(By.xpath("//input[@name='q']"));

		Actions actions = new Actions(driver);
        Thread.sleep(500);
        actions.moveToElement(elem).click().keyDown("p").keyUp("p").build().perform();
        Thread.sleep(500);
        actions.moveToElement(elem).click() .keyDown("a").keyUp("a").build().perform();
        Thread.sleep(500);
        actions.moveToElement(elem).click().keyDown("r").keyUp("r").build().perform();
        Thread.sleep(500);
        actions.moveToElement(elem).click().keyDown("a").keyUp("a").build().perform();
        Thread.sleep(500);
        actions.moveToElement(elem).click().keyDown("m").keyUp("m").build().perform();
        Thread.sleep(500);
        actions.moveToElement(elem).click().keyDown(" ").keyUp(" ").build().perform();
        Thread.sleep(500);
        actions.moveToElement(elem).click().keyDown("e").keyUp("e").build().perform();
        Thread.sleep(500);
        actions.moveToElement(elem).click().keyDown("d").keyUp("d").build().perform();
        Thread.sleep(500);
        actions.moveToElement(elem).click().keyDown("u").keyUp("u").build().perform();
        Thread.sleep(500);
        actions.moveToElement(elem).click().keyDown(" ").keyUp(" ").build().perform();
        Thread.sleep(500);
        actions.moveToElement(elem).click().keyDown("t").keyUp("t").build().perform();
        Thread.sleep(500);
        actions.moveToElement(elem).click().keyDown("e").keyUp("e").build().perform();
        Thread.sleep(500);
        actions.moveToElement(elem).click().keyDown("c").keyUp("c").build().perform();
        Thread.sleep(500);
        actions.moveToElement(elem).click() .keyDown("h").keyUp("h").build().perform();
        Thread.sleep(500);
        actions.moveToElement(elem).click().keyDown(" ").keyUp(" ").build().perform();
        Thread.sleep(500);
        actions.moveToElement(elem).click().keyDown("p").keyUp("p").build().perform();
        Thread.sleep(500);
        actions.moveToElement(elem).click() .keyDown("u").keyUp("u").build().perform();
        Thread.sleep(500);
        actions.moveToElement(elem).click().keyDown("n").keyUp("n").build().perform();
        Thread.sleep(500);
        actions.moveToElement(elem).click() .keyDown("e").keyUp("e").build().perform();
       
        Thread.sleep(500);
        actions.moveToElement(elem).click() .keyDown(" ").keyUp(" ").build().perform();
        Thread.sleep(500);
        actions.moveToElement(elem).click().keyDown("T").keyUp("T").build().perform();
        Thread.sleep(500);
        actions.moveToElement(elem).click().keyDown("h").keyUp("h").build().perform();
        Thread.sleep(500);
        actions.moveToElement(elem).click() .keyDown("a").keyUp("a").build().perform();
        Thread.sleep(500);
        actions.moveToElement(elem).click().keyDown("n").keyUp("n").build().perform();
        Thread.sleep(500);
        actions.moveToElement(elem).click() .keyDown("k").keyUp("k").build().perform();
        Thread.sleep(500);
        actions.moveToElement(elem).click() .keyDown(" ").keyUp(" ").build().perform();
        Thread.sleep(500);

        actions.moveToElement(elem).click() .keyDown("U").keyUp("U").build().perform();
      
//        actions.moveToElement(elem).click() .keyDown("!").keyUp("!").build().perform();


        Thread.sleep(2000); 
        System.out.println("Thank You..!");
//        driver.quit();
//		Actions actions = new Actions(driver);
//		WebElement target=	driver.findElement(By.xpath("//input[@name=\"q\"]"));
//		target.sendKeys(Keys.SHIFT,"a");
	}

}
