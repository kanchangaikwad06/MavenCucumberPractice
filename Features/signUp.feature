@Facebook
Feature: sign Up functionality with Parameters


 @SignUp
  Scenario Outline: SignUp Fuctionality
    Given Launch Chrome Browser 
    When User enter Url "https://www.facebook.com/"
    When User Click on Create New Account 
    When User enter first name as "Kanchan"
    And User enter last name as "Gaikwad"
    When User enter Mobile Number as "9876543267"
    When User enter new password as "test@3452"
    
 
  