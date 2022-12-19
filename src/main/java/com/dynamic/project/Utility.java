package com.dynamic.project;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility {
	
	public static void takeScreenShot(WebDriver driver,String filename) {
 		TakesScreenshot takeScreenShot = (TakesScreenshot) driver;
 		File ss = takeScreenShot.getScreenshotAs(OutputType.FILE);
 		try {
			FileUtils.copyFile(ss, new File("src/test/resources/Screenshot/"+filename+".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


}