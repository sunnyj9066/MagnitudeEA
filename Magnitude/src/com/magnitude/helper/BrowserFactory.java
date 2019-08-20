package com.magnitude.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.magnitude.scripts.BaseClass;

public class BrowserFactory extends BaseClass{
	
	public static String ChromeDriverPath = "C:\\Users\\Sunny\\eclipse-workspace\\Magnitude\\Drivers\\chromedriver.exe";
	public static String FirefoxDriverPath = "C:\\Users\\Sunny\\eclipse-workspace\\Magnitude\\Drivers\\geckodriver.exe";
	public static String EdgeDriverPath = "C:\\Users\\Sunny\\eclipse-workspace\\Magnitude\\Drivers\\MicrosoftWebDriver.exe";
	
	public static WebDriver launchbrowser(String BrowserName) {
		
		if(BrowserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", ChromeDriverPath);
			driver = new ChromeDriver();
		}else if(BrowserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", FirefoxDriverPath);
			driver = new FirefoxDriver();
		}else if(BrowserName.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", EdgeDriverPath);
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		return driver;
		
	}

}
