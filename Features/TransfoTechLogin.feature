Feature: TransfoTech Academy Login/registration 


@RegressionTest
Scenario Outline: test login functionality 

	as a user try to login with out registration using different user name and password

	Given user is in the home Page
	When user click login button 
	Then user type "<UserName>" and "<Password>" 
	And user click remember me radio button 
	Then user click login button to go in
	Then page should not login
	
	Examples: 
		|UserName|              Password|
		|testtester12@gmail.com|test123|
		|testtester1gmail.com|test123|
		|                      |test|
		|testtester12@gmailcom|     |
		
		
		
