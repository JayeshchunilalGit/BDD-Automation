@britishtest
Feature: book a flight with britishairways.com

Scenario: book a flight with britishairways.com
Given launch british airways url "https://britishairways.com"
And click on "book" link
Then click on "book a flight" 
Then click on "more destination" europe
Then click on "one way" radio button
Then select travel class "first class" 
Then click on "Find lowest price"