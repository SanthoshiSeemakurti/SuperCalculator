Feature: Calculator Functionality
  As a user can perform add, multiply, subtract, mode, divide two numbers using the calculator.
  As a user the calculator functions as expected.

  @calc
  Scenario: User should be able to perform all operations with two numbers

    Given the user is on Super calculator page
    When the user enters two values
    And the user chooses addOperation
    And the user clicks on the Go bottom
    Then the user gets the result


  Scenario: User should be able to divide two numbers

  Given the user is on Super calculator page
  When the user enters two values
  And the user chooses division operation
  And the user clicks on the Go bottom
  Then the user gets the result


Scenario: User should be able to modulo of two numbers

  Given the user is on Super calculator page
  When the user enters two values
  And the user chooses modulo operation
  And the user clicks on the Go bottom
  Then the user gets the result


Scenario: User should be able to multiply two numbers

  Given the user is on Super calculator page
  When the user enters two values
  And the user chooses multiplication operation
  And the user clicks on the Go bottom
  Then the user gets the result



Scenario: User should be able to do subtract two numbers
    Given the user is on Super calculator page
    When the user enters two values
    And the user chooses subtraction operation
    And the user clicks on the Go bottom
    Then the user gets the result