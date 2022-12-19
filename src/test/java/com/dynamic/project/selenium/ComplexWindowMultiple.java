package com.dynamic.project.selenium;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class ComplexWindowMultiple {

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
        driver.findElement(By.xpath("//input[@title=\"Search\"]")).sendKeys("Mobile");
        System.out.println("1st-Tab & 3rd-Window:\t" +driver.getTitle());
        Thread.sleep(4000);


		//<------------------------------------------------------------------------------------------------------------------------->//
        /*TAB-1 || WINDOW -4: */
        jsexe.executeScript("window.open('https://www.facebook.com/','_blank');");
        
        for(String handle:allwindowhandles)
        {
        	if(!(handle.equals(allwindowhandles))&&!(handle.equals(child1))&&!(handle.equals(child2)))
        	{
        		driver.switchTo().window(handle);
        	}
        		
        }
        
        String child3 =  driver.getWindowHandle();
        driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("ParamEdu@hotmail.com");
        driver.findElement(By.xpath("//input[@name=\"pass\"]")).sendKeys("123456");
        System.out.println("1st-Tab & 4th-Window:\t" +driver.getTitle());
        Thread.sleep(2000);

//<------------------------------------------------------------------------------------------------------------------------->//
/*TAB-1 || WINDOW-5 : */ 
       jsexe.executeScript("window.open('https://twitter.com/i/flow/login','_blank');");
       System.out.println("1st-Tab & 5th-Window:\t" +driver.getTitle());
       
       
       for(String handle:allwindowhandles)
       {
       	if(!(handle.equals(allwindowhandles))&&!(handle.equals(child1))&&!(handle.equals(child2))&&!(handle.equals(child3)))
       	{
       		driver.switchTo().window(handle);
       	}
       		
       }
       
       String child4 =  driver.getWindowHandle();
       driver.findElement(By.xpath("//input[@name=\"text\"]")).sendKeys("iAM Indian");
       Thread.sleep(4000);
//<------------------------------------------------------------------------------------------------------------------------->//
/*TAB-1 || WINDOW-6 : */      
        jsexe.executeScript("window.open('https://nss.gov.in/','_blank');");
        
        for(String handle:allwindowhandles)
        {
        	if(!(handle.equals(allwindowhandles))&&!(handle.equals(child1))&&!(handle.equals(child2))&&!(handle.equals(child3))&&!(handle.equals(child4)))
        	{
        		driver.switchTo().window(handle);
        	}
        		
        }
        
        String child5 =  driver.getWindowHandle();
        driver.findElement(By.xpath("//a[@title=\"Site Search\"]")).click();
        driver.findElement(By.xpath("")).sendKeys("INDIA is My Country..!");
        System.out.println("1st-Tab & 6th-Window:\t" +driver.getTitle());
        Thread.sleep(4000);
//<------------------------------------------------------------------------------------------------------------------------->//
        
/*TAB-2 || WINDOW-1 : */
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("http://demo.guru99.com/test/newtours/register.php");		//-----------1
        
        String secondParent =  driver.getWindowHandle();
        driver.findElement(By.xpath("//input[@name=\"firstName\"]")).sendKeys("User-Admin");
        Thread.sleep(1500);
        driver.findElement(By.xpath("//input[@name=\"lastName\"]")).sendKeys("Root");
        System.out.println("2nd-Tab & 1st-Window:\t" +driver.getTitle());
        Thread.sleep(2000);
//<------------------------------------------------------------------------------------------------------------------------->//
/*TAB-1 || WINDOW-7 : */     
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://testuserautomation.github.io/DropDown/");	
        
        String child6 =  driver.getWindowHandle();
        WebElement single= driver.findElement(By.xpath("//select[@name=\"Cities\"]"));//-----------2
        Select singleSelect = new Select(single);
        singleSelect.selectByIndex(2);
        Thread.sleep(800);
        singleSelect.selectByValue("California");
        
        Thread.sleep(1000);
        WebElement multi = driver.findElement(By.xpath(""));
        Select multiselect = new Select(multi);
        multiselect.selectByIndex(0);
        Thread.sleep(1000);
        multiselect.selectByIndex(2);
        Thread.sleep(1000);
        multiselect.selectByVisibleText("");
        System.out.println("1St-Tab & 8th-Window:\t" +driver.getTitle());
        Thread.sleep(2000);
//<------------------------------------------------------------------------------------------------------------------------->//

	}

}
