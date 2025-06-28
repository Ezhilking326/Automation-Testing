@tag
Feature: Bikewala Website

  @tag1
  Scenario: Passion plus bike
    Given enter into bikewala
    Given I want to search passion plus bike in search box
    And click and print bike overview
    Then go to price details and print
    Then go to mileage details and print
    Then print the specs and features

  @tag2
  Scenario: OLA
    Given navigates to home page
    Then select find new bikes from menu
    Then view brand and click ola
    Then filter by budget and price range
    Then change body style as scooter
    Then apply filter and print all bike under one lakh

  @tag3
  Scenario: Honda
    Given select find new scooter from menu
    Then filter by values
    Then apply filter and print all scooters
