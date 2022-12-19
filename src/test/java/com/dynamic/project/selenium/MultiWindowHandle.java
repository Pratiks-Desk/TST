package com.dynamic.project.selenium;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class MultiWindowHandle {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
//<------------------------------------------------------------------------------------------------------------------------->//
/*TAB-1 || WINDOW-1 : */		
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://wetransfer.com/paper");
        System.out.println("1st-Tab & 1st-Window:\t" +driver.getTitle());
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@href=\"https://wetransfer.zendesk.com/hc/en-us\"]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//main//input[@name=\"query\"]")).sendKeys("Sending Keys on 1st Tab");
        Thread.sleep(3000);
//<------------------------------------------------------------------------------------------------------------------------->//
        //HANDLING SECOND WINDOW
        String parentwindowhandle = driver.getWindowHandle(); 	//it will return current windlow handle in string which is unique id for identidy window
      
//<------------------------------------------------------------------------------------------------------------------------->//
/*TAB-1 || WINDOW-2 : */
        JavascriptExecutor jsexe = (JavascriptExecutor) driver;
        jsexe.executeScript("window.open('https://www.blogger.com/about/?bpli=1','_blank');");
        
  Set<String> allwindowhandles = driver.getWindowHandles();
        
        for(String handle:allwindowhandles)
        {
        	if(!(handle.equals(allwindowhandles)))
        	{
        		driver.switchTo().window(handle);
        	}
        		
        }
      String child1 =  driver.getWindowHandle();
        Thread.sleep(4000);

        driver.findElement(By.xpath("//a[@href=\"/go/signin\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("Parem@gmal.com");
        Thread.sleep(2000);

        System.out.println("1st-Tab & 2nd-Window:\t" +driver.getTitle());	// our control is on 1st tab so we control throws on 2nd tab as follows
        Thread.sleep(4000);
//<------------------------------------------------------------------------------------------------------------------------->//
/*TAB-1 || WINDOW-3 : */   
        
        
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.google.co.in/");
        Thread.sleep(2000);
        
        String child2 = driver.getWindowHandle();
        System.out.println("1st-Tab & 3rd-Window:\t" +driver.getTitle()+ " ( "+child2+" )");
        driver.findElement(By.xpath("//input[@title=\"Search\"]")).sendKeys("Mobile");
        Thread.sleep(4000);
        List<WebElement> x = driver.findElements(By.xpath("//div[@class=\"OBMEnb\"]//li"));
        for(WebElement z:x)
        {
        	System.out.println(z.getText());
        }
        System.out.println(x.size()+ " RESULTS Found.");
        Thread.sleep(2000);

        driver.close();
//<------------------------------------------------------------------------------------------------------------------->//
       
        driver.switchTo().window(child1);
        System.out.println("Handle comes on:\t"+driver.getTitle());
        Thread.sleep(2000);

        driver.navigate().back();
        Thread.sleep(1000);

        driver.close();
        driver.switchTo().window(parentwindowhandle);
        Thread.sleep(2000);

        System.out.println("Handle comes on:\t"+driver.getTitle());
        driver.findElement(By.xpath("//a[@class=\"desktop__logo\"]")).click();

        System.out.println("\n\n\t\t BACK TO CODE..!");
//CLOSE 
        Thread.sleep(5000);
        driver.quit();
	}

}
