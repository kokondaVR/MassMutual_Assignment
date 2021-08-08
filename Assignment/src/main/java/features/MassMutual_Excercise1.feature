@Excercise1
Feature: Solution to Excercise1

Background: Pre-scenario steps
Given We open the url "https://www.excercise1.com/values"

  @Objectives
  Scenario: Verify values on the landing page
    And We verify the right count of "5" values appear on the screen
    And We verify the values are formatted as currencies
    And We verify the values on the screen are greater than "0"
		And We verify the total balance is correct based on the values listed on the screen
		And We verify the total balance matches the sum of the values
		And Logout