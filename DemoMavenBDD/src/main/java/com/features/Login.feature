Feature: JBK offline application

Scenario: Login Test

Given User should be on login page
When User enter valid credential
Then User should be on home page


Scenario: Logo Test
Given User should be on login page
Then User see JBK logo

