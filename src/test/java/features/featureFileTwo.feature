Feature: place order for products


@featureTwo
Scenario Outline: Search experience for product search in both home page and offer page
Given User is on GreenCart landing page
When user searched with shortname <Example> and extracts the actual name of the product
And Added "3" items of the selected product to cart
Then User proceed to checkout and validate the <Example> item in checkout Page
And verify user has the ability to enter promo code and place the order

Examples:
|Example|
|Tom|
|Beet|
|Broc|