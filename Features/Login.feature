@Facebook
Feature: Title of your feature
  I want to use this template for my feature file

  @Login
  Scenario: Login Fuctionality
    Given Launch Chrome Browser and open Facebook Url
    When User enter Username
    And User enter Password
    And User click on login button
    Then User should be able to Login successfully

  @SignUp
  Scenario: SignUp Fuctionality
    Given Launch Chrome Browser and open Facebook Url
    When User Click on Create New Account Button
    Then User should be able to SignUp successfully
