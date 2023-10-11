Feature: Test of Registration Page

  Background:
  Given Browser is open

    Scenario Outline: Register with valid email and password
      When I click account Button
      And I fill login register email with "<email>"
      And I fill login register password input with "<password>"
      And I click register Button on Register Page
      Then I am on My Account Page
      Examples:
        | email                 | password |
        | pawelborek2@gmail.com | P@SSword1@34%656      |