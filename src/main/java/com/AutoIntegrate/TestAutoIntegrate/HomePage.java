package com.AutoIntegrate.TestAutoIntegrate;

import org.openqa.selenium.By;

public class HomePage extends Utils {
	
	
	
	String homepagetitle = "";
	private By _headertitle = By.xpath("");

	
	public void HomePageTitle () {
		System.out.println(getTextFromElement(_headertitle));
	//	Assert.assertEquals(_headertitle, homepagetitle);
	}
	
	
}
