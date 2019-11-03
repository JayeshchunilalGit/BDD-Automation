@britishtest
Feature: british airways registration

Scenario: british airways registration by filling all the mandatory fields
Given launch british airways url "https://britishairways.com"
And click on registration link 
Then check for registration page is opened 
Then enter the email ID "jayesh.chunilal@hotmail.com"
Then confirm email ID "jayesh.chunilal@hotmail.com"
Then enter a password "Krishna1z"
Then re-enter your password "krishna1z"
Then give a title "MR"
Then give a first name "jayesh"
Then give a last name "chunilal"
Then click on register with ba.com
Then click the join now button
Then select the radio button "Join the Executive Club"
Then enter the address "11 Turton Road"
Then enter the town "Wembley"
Then enter the postcode "HA0 2BS"
Then select the country "United Kingdom"
Then enter day "08"
Then enter month "April"
Then enter year "1992"
Then select gender "Male"
Then select preferred language "English"