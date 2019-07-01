@AutoIntegrateTest
Feature: Login Test

Background: User is on Login Page

Given User is on Login page when browser opened


Scenario: User login with valid credentials
When User enter "Username" and "Password"
And Click on login button
Then User is able to view homepage

@LoginwithInvalidcredentials
Scenario Outline: User login with invalid credentials
When User enter "<Username>" and "<Password>"
And Click on login btn
Then User will able to view "<ErrorMessage>"

Examples: 
	| Username 				| Password				| ErrorMessage											|
	| validusername		| invalidpassword	| Username or Password is incorrect	|
	| invalidusername	| validpassword		|	Username or Password is incorrect	|
	| blank						| validpassword		|	Username required									|
	| validusername		| blank						| Password required									|
	| blank						| blank						|	Username and Password required		|
	
	
@Loginandthenbackwordandforwardpage
Scenario: after login navigate to backpage and then forward page.
When User entered valid "Username" and "Password"
And Clicks on login btn
Then User is successfully logged
When User click on back button 
And User click on forward button
Then User should be logged


@ForgetUsernameLink
Scenario: forget username link
When User click on forget username link
And User navigate to verification page
And User enter valid detials for verified
Then User username should be displayed

@forgetpasswordlink
Scenario: forget password link
When User click on forget password link
And User navigate to email page
And User enter valid email address
Then User should get email for reset password

