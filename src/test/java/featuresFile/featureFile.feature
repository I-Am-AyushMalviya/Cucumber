Feature: Search and Place Order for products

#Background:
#Given validate the browser
#When Browser is Triggered
#Then check if browser is started

@Normal
Scenario: Search Experience For Product in both Home and Offer Page
Given user is on Greenkart Landing Page
When User Searches with shortname "Bea"
Then User searched for "Bea" shortname in offerpage
And validate product name in offeres page and landing page



@DataTable
Scenario: User is mad at us
Given User is mad
When User us normal
Then do zumba with the following data
|Ayush Malviya|Satish Malviya|Shobha Malviya|


@DataParamaterization
Scenario Outline: Scenario Parameterization
Given User is mad
When User us normal
Then do data parameterization with user name as <username> and password as <password>
Examples:
|username|password|
|User One|qwerty|
|User Two|qwerty|
|User Three|qwerty|

