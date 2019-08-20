package com.magnitude.scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
//import org.testng.annotations.Parameters;

import com.magnitude.POM.HomePage;
import com.magnitude.POM.LoginPage;
import com.magnitude.commonMethods.CommonMethods;
import com.magnitude.helper.BrowserFactory;
import com.magnitude.utils.ExcelReader;

public class BaseClass {
	
	public static String ScreenshotFilePath = "C:\\Users\\Sunny\\eclipse-workspace\\Magnitude\\Screenshots";
	public static String ExcelFilePath = "C:\\Users\\Sunny\\eclipse-workspace\\Magnitude\\Data\\ExcelData.xlsx";
	public static WebDriver driver;
	public static LoginPage loginpage;
	public static HomePage homepage;

//	@Parameters({"baseUrl"})
	@BeforeSuite
	public void Setup() {
		
		BrowserFactory.launchbrowser("chrome");
		driver.get("https://eademo2.everyangle.com");
		CommonMethods.ImplicitWait(20);
		
	}
	
	@AfterSuite
	public void quit() {
		CommonMethods.ImplicitWait(20);
		driver.quit();
	}

}
