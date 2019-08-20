package com.magnitude.POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.magnitude.scripts.BaseClass;

public class HomePage extends BaseClass{
	
	@FindBy(xpath="//img[@src='/images/master/ealogo.svg']")
	public WebElement EALogo;

}
