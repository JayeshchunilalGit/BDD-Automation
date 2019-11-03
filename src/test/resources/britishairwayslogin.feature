@britishTest
Feature: british airways login

Background:
Given launch british airways url "https://www.britishairways.com"

Scenario Outline:  british airways login 
When enter the login id <loginid>
Then enter password for login <password>
And check for the <status>

Examples:
|loginid             |password    |status | 
|malar.cse@gmail.com |v1n0thm@1@r |success|
|malar.cse@gmail.com |kjsahdkjsa  |fail   |
