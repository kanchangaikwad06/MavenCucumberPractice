@Facebook
Feature: sign Up functionality with Parameters


 @SignUp
  Scenario Outline: SignUp Fuctionality
    Given Launch Chrome and open Facebook Url 
    When User Click on Create New Account 
    When User enter First Name<firstName>
    When User enter Last Name<lastName>
 
  
    Examples: 
      |firstName| lastName | 
      |Kanchan  | Gaikwad | 
