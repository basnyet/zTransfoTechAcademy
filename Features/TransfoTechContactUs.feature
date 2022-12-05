Feature: TransfoTech Academy contact us 


Scenario Outline: Fillup all blank form and submit information 

	As a tester test providing Negative information


	Given user is in the home page 
	When user click contact us button
	When user type first name 
	And user type last name 
	Then user type invalid "<Email Address>" 
	And user type invalid "<Phone Number>" 
	Then user type state name 
	And user click full stack QA Engineeing radio button 
	Then user un-click full stack QA Engineeing radio button 
	And user click Business Analyst radio button 
	Then user un-click Business Analyst radio button 
	And user click Master Ethical radio button 
	Then user un-click Master Ethical radio button 
	And user click Salesforce Admin and Development radio button 
	Then user un-click Salesforce Admin and Development radio button 
	And user click full stack QA Engineeing radio button at last 
	Then user type some Massage in massage box 
	And user click submit button to submit information 
	Then user can see massage Email is invalid! 
	Then user can see massage invalid phone number
	
	Examples: 
		|Email Address                 |Phone Number|
		|automation_tester4@gmailcom|1234567890| 
#		|automation_tester4@gmail.com|123467890|
#		|automation_tester4gmail.com|12345678901|
#		|automation_tester4@gmail.com|          |
#		|                            |1234567890|
		
