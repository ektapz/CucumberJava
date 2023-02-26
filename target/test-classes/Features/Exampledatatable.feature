Feature: Features to test Datatable project example

  Scenario Outline: Validate the datatable  scenario outline
    Given Browser is open
    And User in on login page
    When User enter <username> and <password>
    And user click on login
    Then user is navigate to the home page

    Examples: 
      | username | password |
      | EKTA     |    12345 |
      | Ellie    |    12345 |
