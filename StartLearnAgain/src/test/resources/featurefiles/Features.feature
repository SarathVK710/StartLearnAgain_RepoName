Feature: Verify the OrangeHRM website

  @loginpage
 Scenario Outline: verify the login functionality
    Given open the OrangeHRM website
    When enter the "<username>" and "<password>"
    And click Login button
   Examples:
     | username | password |
     | Admin    | admin123 |


  @AmazonDropdown
  Scenario Outline: Validate the Dropdown values
    When get the all dropdown values
    And select "<category>" option
    Then click signin button
    Examples:
      | category |  |
      | Baby     |  |