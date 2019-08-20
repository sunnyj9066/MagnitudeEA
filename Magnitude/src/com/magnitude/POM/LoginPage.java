package com.magnitude.POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	@FindBy(id="UserName")
	public WebElement userNameTextBox;
	
	@FindBy(id="Password")
	public WebElement passwordTextBox;
	
	@FindBy(id="LoginButton")
	public WebElement LoginBtn;

}
