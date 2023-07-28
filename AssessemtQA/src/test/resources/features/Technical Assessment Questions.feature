Feature : Technical Assessment Questions

  Background:
    Given I navigate to website using link


    @Q1
    Scenario: Q1 Create customers
      When I login as Bank Manager
      When I click Add customer button
      And I enter details customer Christopher Connely
      And I enter details customer Frank Christopher
      And I enter details customer Christopher Minka
      And I enter details customer Connely Jackson
      And I enter details customer Jackson Frank
      And I enter details customer Minka Jackson
      And I enter details customer Jackson Connely
      When I click Customer Tab button
      Then I verify all the customers are inserted in the table
      And I verify delete customer Jackson Frank and Christopher Connely



      @Q2
    Scenario: Q2 Perform debit and credit transaction
      When I login as Customer
      And I choose name as Hermoine Granger
      And I click login button
      And I choose 1003 from drop down
      When I click on deposit and enter amount 50000
      Then I verify current balance 50000
      When I click on withdraw and enter amount 3000
      Then I verify current balance 47000
      When I click on withdraw and enter amount 2000
      Then I verify current balance 45000
      When I click on deposit and enter amount 5000
      Then I verify current balance 50000
      When I click on withdraw and enter amount 10000
      Then I verify current balance 40000
      When I click on withdraw and enter amount 15000
      Then I verify current balance 25000
      When I click on deposit and enter amount 1500
      Then I verify current balance 26500
      And I verify current balance is tally with Balance section  in the Customer Homepage



