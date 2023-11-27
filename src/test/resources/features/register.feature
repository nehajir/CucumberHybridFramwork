Feature: Register Functionality

Scenario: User create an account only with madnatory fields
Given User has nevigated to register account page
When User enters details in field below
|Firstname |Aniket |
|Lastname |Khake|
|email|aniketkhake@gmail.com|
|phoneno|1234567890|
|password|12345|

And User selects privacy policy
And User clicks on continue button
Then User account should get created sucessfully

Scenario: User create a duplicate account
Given User has nevigated to register account page
When User enters details in field below
|Firstname |Aniket |
|Lastname |Khake|
|email|aniketkhake@gmail.com|
|phoneno|1234567890|
|password|12345|

And User selects privacy policy
And User clicks on continue button
Then User should get proper warning msg about duplicate account

Scenario: User create an account without filling any details
Given User has nevigated to register account page
When User dont enters any deatils into filed
And User clicks on continue button
Then User should get proper warning msg fro every madnatory field




