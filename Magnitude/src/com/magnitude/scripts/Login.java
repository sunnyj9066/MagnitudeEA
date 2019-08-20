package com.magnitude.scripts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Listeners;
//import org.testng.Assert;
//import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.magnitude.POM.HomePage;
import com.magnitude.POM.LoginPage;
import com.magnitude.commonMethods.CommonMethods;
import com.magnitude.utils.CaptureScreenshot;
import com.magnitude.utils.ExcelReader;
import com.magnitude.utils.TestNGListener;

@Listeners(TestNGListener.class)
public class Login extends BaseClass{
	
	
//	@Parameters({"userName","Password"})
	@Test
	public void LoginApplication() {
	System.out.println("Logging into application");
	  
	  try {
		  loginpage = PageFactory.initElements(driver, LoginPage.class);
		  homepage = PageFactory.initElements(driver, HomePage.class);
		  WebElement userNameTB = CommonMethods.ExplicitWait(loginpage.userNameTextBox, 20);
		  userNameTB.sendKeys();
		  WebElement passwordTB = CommonMethods.ExplicitWait(loginpage.passwordTextBox, 20);
		  passwordTB.sendKeys();
		  WebElement loginBtn = CommonMethods.ExplicitWait(loginpage.LoginBtn, 20);
		  loginBtn.click();
		  WebElement EALogo = CommonMethods.ExplicitWait(homepage.EALogo, 60);
		  Boolean value = EALogo.isDisplayed();
		  Assert.assertTrue(value, "Home page is not displayed");
		  Thread.sleep(5);
		  CaptureScreenshot.Screenshot("HomePage");
		  
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	}
}
