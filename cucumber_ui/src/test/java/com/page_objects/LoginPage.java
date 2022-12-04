package com.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	private static LoginPage loginInstance;
	
	private LoginPage() {
		
	}
	
	public static LoginPage getInstance() {
		
		if(loginInstance==null) {
			loginInstance= new LoginPage();
		}
		return loginInstance;
		
		
	}
	
	
	@FindBy(name = "username")
	public static WebElement USERNAME;
	
	@FindBy(xpath = "//input[@type='password']")
	public static WebElement PASSWORD;
	
	@FindBy(xpath = "//button[@type='submit']")
	public static WebElement LOGIN_BUTTON;

	
	
}
