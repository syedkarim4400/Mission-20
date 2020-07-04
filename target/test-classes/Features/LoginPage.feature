Feature: Home Page
@test
Scenario: Verify user can login successfully

Given Launch "<URL>"
Then click on Signin link
Then click on Signin Button
Then enter username and password
Then click Signin button
Then Verify user can login successfully


