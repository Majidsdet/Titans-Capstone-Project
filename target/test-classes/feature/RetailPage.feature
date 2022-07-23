@retail 
Feature: RetailPage

 	Background: 
    Given User is on Retail website
    And User click on MyAccount
    When User click on Login
    And User enter username ‘userName’ and password 'password’
    And User click on Login button
    Then User should be logged in to MyAccount dashboard


#		@affiliate
  Scenario: Register as an Affiliate user with Cheque Payment Method
    When User click on ‘Register for an Affiliate Account’ link
    And User fill affiliate form with below information
      | company | website | taxid | paymentmethod | payeename |
      | RLC     | RLC.com |  4567 | cheque        | RLC user  |
    And User check on About us check box
    And User click on continue button
    Then User should see a success message

 #@editaffiliate
  Scenario: Edit your affiliate information from Cheque payment method to Bank Transfer
    When User click on ‘Edit your affiliate informationlink
    And user click on Bank Transfer radio button
    And User fill Bank information with below information
      | bankName  | abaNumber | swiftCode | accountName | accountNumber |
      | statebank |     56789 |      8987 | robert      |          7634 |
    And User click on continue button
    Then User should see a success message
#	@editAccount
  Scenario: Edit your account Information
    When User click on ‘Edit your account information’ link
    And User modify below information
      | firstname | lastName | email             | telephone  |
      | David     | Dawson   | Ddawson@gmail.com | 9876789123 |
    And User click on continue button
    Then User should see a message ‘Success: Your account has been successfully updated.’
