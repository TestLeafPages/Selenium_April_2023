Feature: Leaftaps Login page automation
Background:
Given Open the Chrome browser
And Load the application URL as 'http://leaftaps.com/opentaps/control/main'
@Smoke
Scenario: TC001 - Positive Login Flow - Demosalesmanager
And Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When Click on the Login Button
Then Verify the welcome message in the homepage
@Regression
Scenario Outline: TC002 - Positive Login Flow - Multiple users
And Enter the username as <username>
And Enter the password as <password>
When Click on the Login Button
Then Verify the welcome message in the homepage
Examples:
|username|password|
|'DemoSalesManager'|'crmsfa'|
|'DemoCSR'|'crmsfa'|

Scenario: TC003 - Negative Login Flow - Invalid Password
And Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa123'
When Click on the Login Button
But Verify the error message in the homepage
@Smoke @Regression
Scenario: TC004 - Positive Flow message verification
And Enter the username as 'Demosalesmanager' and Password as 'crmsfa'
When Click on the Login Button
Then Get the Welcome Message
And Verify the Welcome Message




