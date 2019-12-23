Feature: move to cart without adding item -Negative test case

Scenario: move to cart without adding item
Given Alex has registered in test me app
When Alex search a product like headphones
And Alex try to proceed to payment without adding any item in the cart
Then test me app does not display the cart icon



