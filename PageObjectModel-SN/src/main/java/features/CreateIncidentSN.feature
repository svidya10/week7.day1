Feature: Leaftaps Create Lead functionality

#Background: 
#Given Launch the Browser
#And Load the application url
#And Enter Username as 'DemoCSR'
#And Enter password as 'crmsfa'

Scenario Outline: TC002 Create Lead - Positive
Then Click on Login
Then Click on 'CRM/SFA'
Then Click on 'Contacts'
Then Click on 'Create Contact'
Given Enter firstname as <firstName>
Given Enter lastname as <lastName>
When Click on Submit button
Then View Lead Page should be displayed

Examples:
|firstName|lastName|
|'Vidya'|'S'|

Scenario: TC003 Create Lead - Negative
Then Click on Login
Then Click on 'CRM/SFA'
Then Click on 'Contacts'
Then Click on 'Create Contact'
And Enter firstname as 'Vidya'
And Enter lastname as ''
When Click on Submit button
Then View Lead Page should be displayed