@system
Feature: systemadmin login 

Scenario: systemadmin Login 
	Given user launch the app 
	When user enter the Email Address in text field 
	And user enter the Password in text field 
	Then user click the Login Button and it navigates to Trust management 
	
Scenario: Deactivate and activate 
Given user click the deactivate button and confirm pop up occurs
When user click the yes button and success message pops up
And user click the current resources list button and take screenshot 
And user click the Trust management button and navigates to trust management page 
And user click the activate button and confirm pop up occurs 
And user click Yes Button and success message pop up
And user click the Current resources List button and Take screenshot