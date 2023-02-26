

Feature: Features to test the google login functionality
 

  
  Scenario: Validate google search is working
    Given Browser is now open 
    And Users is on goofle search page
    When User enter text in search box
    And hit enter
  
    Then User is enter to the search result
    

