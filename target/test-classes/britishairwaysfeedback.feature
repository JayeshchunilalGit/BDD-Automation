@britishtest
Feature: Feedback britishairways.com

Scenario: Feedback on britishairways.com by filling all the mandatory fields
Given launch british airways url "https://britishairways.com"
And click on "Customer Commitment" link
Then click on "Find out more" link
Then click on "Contact our Customer Relations team" link
Then click on "No, continue as a guest" radio button
Then click on "Continue as a guest" link
