@timesheets
Feature: This feature is to get pending timesheet
Scenario Outline: This test is to verify the pending timesheet
Given the user is on the homepage
And the user click on the time option from the menu
And the user enter the name as "John Smith"
And click on the view button
Then the user should see the message as "<message>"
Examples:
|message|
|No Timesheets Found|