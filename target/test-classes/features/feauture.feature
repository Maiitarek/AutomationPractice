Feature: Create New User, authenticate user, make purchase


  @testCase1
  Scenario: when a user fills in the registration form with all required data then user is created successfully
    Given a user is navigated to the automation practices URL
    Then the user is created successfully

  @testCase2
  Scenario: when a user enters their email and password, there has to be an existing email registered with the same email
    Given a user clicks on the sign in button
    Then the user is authenticated successfully
    Then the user clicks on blouses in the women category
    Then the user selects desired product
    Then the user proceeds with the checkout procedure
    Then the user selects bank wire payment
    Then the user verifies that the order was placed successfully



