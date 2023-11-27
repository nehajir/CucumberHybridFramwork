Feature: Search Functionality
Scenario: User searches for valid product
Given User opan an applications
When User enters valid product "HP" into searchbox filed
And User clicks on search button
Then User should get valid product display in search result


Scenario: User searches for invalid product
Given User opan an applications
When User enters invalid product "Honda" into searchbox filed
And User clicks on search button
Then User should get message about no product matching

Scenario: User searched without any product
Given User opan an applications
When User  dont enters any product name  into searchbox filed
And User clicks on search button
Then User should get message about no product matching