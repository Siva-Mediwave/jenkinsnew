@cancel
Feature: Approver login 

Scenario: Approver Login 
	Given user launch the URL
	When user Enter the Email Address in User text box 
	And user Enter the Password in password text box 
	Then user Click the Login Button and It Navigates to current resource list page
	
	Scenario: Cancel page 
	Given user click the my notification button in dashboard and navigates to my notifiaction
	When user click the recently added notification button 
	And user click the approve button and success message pops up 
	And user click the approved notification button and navigates to cancel approve page 
	And user click the cancel approve button and select okay button 
	
