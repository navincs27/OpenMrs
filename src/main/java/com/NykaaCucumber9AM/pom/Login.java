package com.NykaaCucumber9AM.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.NykaaCucumber9AM.base.BaseClass;

public class Login extends BaseClass {
	
	public Login() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text() = 'login']")
	private WebElement login;


	public WebElement getLogin() {
		return login;
	}

}
