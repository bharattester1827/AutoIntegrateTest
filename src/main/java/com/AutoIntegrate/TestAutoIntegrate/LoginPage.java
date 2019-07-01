package com.AutoIntegrate.TestAutoIntegrate;

import org.openqa.selenium.By;

public class LoginPage extends Utils {
	LoadProp loadprop = new LoadProp();
	
	private By _username = By.id("");
	private By _password = By.id("");
	private By _logonbtn = By.id("");
	private By _headertitle = By.cssSelector("");

	
	
	
	public void Username() {
		clearAndEnterText(_username, loadprop.getproperty("Username"));
		
	}
	public void Password() {
		clearAndEnterText(_password,loadprop.getproperty("Password"));
	}	
	public void Loginbtn () {
		clickOnElement(_logonbtn);
	}
	public void HeaderTitle () {
		System.out.println(getTextFromElement(_headertitle));
	}

}
