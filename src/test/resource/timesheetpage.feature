Feature: Navigate to https://codat-qa-task-d3c1.azurewebsites.net/ and create time sheet

  Background: User navigates to home page click on create timesheet
              fill in the form and click save button gets error message

  @smoketests
  Scenario: User navigate to home page create timesheet and click to save get error message
    Given I navigate to codat home page
    Then I click on create new timesheet
    Then I fill in the timesheet and click save







