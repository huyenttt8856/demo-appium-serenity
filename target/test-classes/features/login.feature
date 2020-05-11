Feature: Login to app doulingo

  @test
  Scenario Outline: User login to app
    Given I launch doulingo application
    When I tap on login button
    And I put in email '<email>'
    And I put in password '<password>'
    And I tap on signin button
    And I tap on homemassage button
    Then It will display homescreen

    Examples: 
      | email              | password     |
      | hlinh632@gmail.com | huyen1571998 |