package com.magnitude.utils;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import com.magnitude.scripts.BaseClass;

public class CaptureScreenshot extends BaseClass{

	public static void Screenshot(String screenshotName) {
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		File dst = new File("ScreenshotFilePath\\"+screenshotName+".png");
		
		try {
			FileHandler.copy(src, dst);
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("Screenshot captured and details are: "+screenshotName+"");
		
	}
	
}
