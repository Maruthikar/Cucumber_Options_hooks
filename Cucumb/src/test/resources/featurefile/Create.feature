Feature: Registration functionality

@Registration

Scenario Outline: User creates an account only with mandatory fields
Given User navigates to login page
Then User clicks on Create new accouunt option
Then User enters "<first>","<surname>","<email>","<reenter>","<password>","<date>","<month>","<year>","<gender>" in registration details 
And User clicks on Sign up
Then User account should get created successfully

Examples:
|first|surname|email|reenter|password|date|month|year|gender|
|maruthi|gudisa|maruthikar225@gmail.com|maruthikar225@gmail.com|Maruthi@123|25|06|1996|male|



