@unpublish
Feature: unpublish login 

Scenario: unpublish Login 
	Given user launch the url 
	When user Enter the Email Address in User Field 
	And user Enter the Password in password Field 
	Then user Click the Login Button and It Navigates to current new resources page 
	
Scenario: create new resources 
	Given user click the create new resources button 
	When user select the Resources Type and Enter the resource title
	And user select the topic and Age group 
	And user select the upload documents and click the upload button 
	And user view list of current tags and select the tags
	And user enter the tags and add the tags
	And user select the publish radio button and approver button 
	And user click submit for approval and success message pop up 
	And user click the account and logout button and logout successfully
	