Feature: TransfoTech map feature 

@SmokeTest
Scenario: Test Map can see larger view 

	Given user is in Home Page 
	When user scroll down to the buttom of the page 
	Then user click view larger Map on top of the map 
	And user can see displayed large map  
