Feature: Login Functionality

Scenario: User login with valid credentials
Given User has navigated to login page
When User enters valid email "nehajirwankar9156@gmail.com" in emailbox
And User enters valid password "12345" in passwordbox
And User clicks on login button
Then User should get logged into applicarion

Scenario: Login with invalid credentials
Given User has navigated to login page
When User enters invalid email "neehaajirwankar@gmail.com" into email box
And User enters invalid password "915676"into password box
And User clicks on login button
Then User should get proper warning message about credentials mismatch


#Scenario: Login With valid email and invalid password
#Given User has navigated to login page
#When User enters valid email "nehajirwankar9156@gmail.com" in emailbox
#And User enters invalid password "915676"into password box
#And User clicks on login button
#Then  User should get proper warning message about credentials mismatch

#Scenario: Login with invalid email and valid password
#Given User has navigated to login page
#When User enters invalid email "nehajirwankarrr@gmail.com" into email box
#And User enters valid password"12345"in passwordbox
#And User clicks on login button
#Then  User should get proper warning message about credentials mismatch

#Scenario: Login with no credentials
#Given User has navigated to login page
#When User dont enters email into emailbox
#And User dont enters password into passwordbox
#And User clicks on login button
#Then  User should get proper warning message about credentials mismatch

