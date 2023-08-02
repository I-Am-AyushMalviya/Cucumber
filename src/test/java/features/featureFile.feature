Feature: Search and place order for products


@featureOne
Scenario Outline: Search experience for product search in both home page and offer page
Given User is on GreenCart landing page
When user searched with shortname <Example> and extracts the actual name of the product
Then user searches with same shortname <Example> in offer page
And checks if product exists 

Examples:

|Example|
|Tom|
|Beet|
|Broc|