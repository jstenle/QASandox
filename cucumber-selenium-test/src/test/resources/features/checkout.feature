# Author: jstenle@gmail.com
# Keywords Summary : Testes de checkout em um e-commerce de exemplo.
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
# """ (Comments)

# Sample Feature Definition Template
@CheckoutFeature
Feature: Checkout Functionality

  I want to use this template for my feature file to validate the checkout process.

  @SuccessfulCheckout
   Scenario: Successful checkout process
    Given I am on the login page of saucedemo
    When I enter valid credentials in saucedemo
    And I am on the saucedemo home page
    When I add a product to the cart
    And I proceed to checkout
    And I fill in the payment information
    Then I should see a confirmation message