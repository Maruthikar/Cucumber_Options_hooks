Feature: Login and search functionality

Scenario: Login with valid credentials
Given Open browser and Enter Valid URL 
When  Enter Valid username email field
Then  Enter valid password 
And   Click on login button 
Then  User should login successfully
And User should logout successfully
