Feature: Login and search functionality

Scenario: Login with valid credentials
Given Open browser and Enter URL 
When  Enter Valid username "admin@gmail.com" email field
Then  Enter valid password "Admin@123" Password field
And   Click on login  
Then  User should logout 
