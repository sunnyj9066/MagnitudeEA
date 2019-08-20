package com.magnitude.commonMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.magnitude.scripts.BaseClass;

public class CommonMethods extends BaseClass{
	
	public static void ImplicitWait(long Time) {
		driver.manage().timeouts().implicitlyWait(Time, TimeUnit.SECONDS);
	}
	
	public static WebElement ExplicitWait(WebElement element, long Time) {
		WebDriverWait wait = new WebDriverWait(driver, Time);
		wait.until(ExpectedConditions.visibilityOf(element));
		return element;
	}

}
