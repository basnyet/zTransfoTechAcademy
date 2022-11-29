Feature: transfoTechAcademy registration Page

  As a customer register user before login process

Scenario Outline: Registration positive functionality test

Given user is in the home page
When user click Login/Register button
Then user can see Login Reistration page is displayed
And user scroll down to go registration field to fillup 
Then user enter legal <"EmailAddress"> 
And user enter <"UserName"> which user want to put
Then user enter <"Password"> which user want to put
And user enter <"ConfirmPassword">
Then user enter first name
And user enter last name name
Then user enter Display name
And user click to check radio button before click register
Then user click to uncheck radio button
And user click Register button to Register


Examples:
|EmailAddress|UserName|Password|ConfirmPassword|
|test12@gmail.com|test123|123@test|123@test|

Scenario Outline: Registration Negative functionality test

Given user is in the home page
When user click Login/Register button
Then user can see Login Reistration page is displayed
And user scroll down to go registration field to fillup 
Then user enter illegal <"EmailAddress"> 
And user enter <"UserName"> which is not requird
Then user enter <"Password"> which is not requird
And user enter <"ConfirmPassword">
Then user enter first name
And user enter last name name
Then user enter Display name
And user click to check radio button before click register
Then user click to uncheck radio button
And user click Register button to Register


Examples:
|EmailAddress|UserName|Password|ConfirmPassword|
|test12gmail.com|test1|123test|123@test|
|test12@gmailcom|test123|123@test||
|test12gmail.com|test123|123@test|123test|
|test12gmail.com|test1|123.test|123@test|
|test12gmail.com|test3|123$test|123@test|