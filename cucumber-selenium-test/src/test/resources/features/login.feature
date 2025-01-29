# Author: jstenle@gmail.com
# Keywords Summary: Testes de login na aplicação.
# Feature: List of scenarios.
# Scenario: Business rule through list of steps with arguments.
# Given: Some precondition step
# When: Some key actions
# Then: To observe outcomes or validation
# And, But: To enumerate more Given, When, Then steps
# Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
# Examples: Container for a table
# Background: List of steps run before each of the scenarios
# """ (Doc Strings)
# | (Data Tables)
# @ (Tags/Labels): To group Scenarios
# <> (placeholder)

# Sample Feature Definition Template
@LoginFeature
Feature: Login Functionality
  I want to use this template for my feature file to validate user login.

  @SuccessfulLogin
  Scenario: Successful login and navigation
    Given I am on the login page
    When I enter valid credentials
    Then I should be redirected to the secure area
    And I should see the message "You logged into a secure area!"
    When I click on Elemental Selenium link
    Then I should be redirected to the Elemental Selenium page