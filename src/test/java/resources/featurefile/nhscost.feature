Feature: Check what help person from welsh can get

  @sanity
  Scenario: I enter all the details to check what help i get
    Given I am person from welsh
    And I am on start page
    When I click on start button
    And I select country and click on next button
    And I click on welsh
    And I select gp welsh
    And I select dental
    And I enter day "2" month "2" year "2000"
    And I select partner
    And I Select benefits
    And I Select, i am not pregnant
    And I select no injury
    And I Select no diabetes
    And I select no glaucoma
    And I select no care home
    And I select yes for savings
    Then I should get result what help i can get









