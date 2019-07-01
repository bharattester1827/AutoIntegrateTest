package com.AutoIntegrate.TestAutoIntegrate;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	
	LoginPage loginpage= new LoginPage();
	HomePage homepage = new HomePage();

	
	@Given("^User is on Login page when browser opened$")
	public void user_is_on_Login_page_when_browser_opened() {
	    System.out.println("User is already on Login Page.");
	}
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
	@When("^User enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_and(String Username, String Password) {
	    loginpage.Username();
	    loginpage.Password();
	}

	@When("^Click on login button$")
	public void click_on_login_button() {
	   loginpage.Loginbtn();
	}

	@Then("^User is able to view homepage$")
	public void user_is_able_to_view_homepage() {
	   homepage.HomePageTitle();
	}

	
}
