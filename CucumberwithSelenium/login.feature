Feature: To check login functionality of Gmail page
Scenario: Login to gmail inbox and signup
Given :  User is on gmail home page
Then : Enter username =archana
And : Enter Password=archana123
And : Click on signUp
But : Check user is on home page
When : user is on home page and signedup sucessfully,close the browser
  