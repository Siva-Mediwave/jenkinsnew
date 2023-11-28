@publish
Feature: publish login 

Scenario: publish Login 
	Given user Launch the URL  
	When user enter the Email Address in text box Field 
	And user Enter the Password in text box Field 
	Then user Click the Login Button and It Navigates to Current New Resources page 
	
Scenario: create new resources 
	Given user click the Create new resources button 
	When user select the resources type and enter the resource title 
	And user select the Topic and age group 
	And user select the Upload Documents and click the Upload Button 
	And user view list of Current Tags and select the Tags 
	And user Enter the Tags and Add the tags 
	And user Select the Publish Radio button and Approver button 
	And user click Submit for Approval and success message pop up 
	And user click the account and Logout button and Logout successfully
	And user login as approver by using email and password and click login button
	And user click the Recently Added notification button 
	And user click the Approve button and Success message pops up
	And user click logout button and logging out from approver 
	And user login as Content creator by using email and password 
	And user click my notification button and select the recently added resources 
	And user click the publish button and click okay button
	And user click the unpublish button and click okay button
	And user click the logout button in the dashboard
	