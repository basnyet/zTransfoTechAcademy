Feature: TransfoTech Academy contact us 


Scenario Outline: Fillup all blank form and submit information 

	As a tester test providing Negative information


	Given user is in the home page 
	When user click contact us button
	When user type first name 
	And user type last name 
	Then user type invalid email "<EmailAddress>" 
	And user type invalid phone "<PhoneNumber>" 
	Then user type state name 
	And user click full stack QA Engineeing radio button  
	And user click submit button to submit information 
	Then user can see massage Email is invalid! 
	Then user can see massage invalid phone number
	
	Examples: 
		|EmailAddress                 |PhoneNumber|
		|automation_tester4@gmailcom|1234567890| 
#		|automation_tester4@gmail.com|123467890|
#		|automation_tester4gmail.com|12345678901|
#		|automation_tester4@gmail.com|          |
#		|                            |1234567890|
		
