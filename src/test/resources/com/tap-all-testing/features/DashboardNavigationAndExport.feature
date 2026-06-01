
@feature_dashboard_navigation_export
Feature: DashboardNavigationAndExport

Background: 
  Given the user is on the Login Page

@valid-login
Scenario Outline: Dashboard Navigation and Export Functionality
  When I enter "<username>"
  And I enter "<password>"
  And I click the "Login" button
  And I wait for the system to process the login request
  Then the user should be redirected to the Dashboard page
  And no error messages are displayed
  And the Dashboard page should load completely with all elements visible

Examples:
  | username         | password       |
  | valid_username   | valid_password  |

  @verify_sidebar_options
  Scenario Outline: Verify that all sidebar menu options are visible and accessible on the Dashboard page
    When I observe the sidebar menu on the Dashboard
    And I identify all available menu options
    And I check for the presence of options like <menu_option_1>, <menu_option_2>, <menu_option_3>
    And I verify that each option is clickable
    And I hover over each option to check for tooltips
    And I ensure that the sidebar is responsive and adjusts to screen size
    Then all expected sidebar options are displayed
    And each option is clickable and leads to the corresponding module
    And tooltips appear on hover (if applicable)

  Examples:
    | menu_option_1 | menu_option_2 | menu_option_3 |
    | Recruitment    | Reports       | Settings       |

  @verify_sidebar_navigation
  Scenario Outline: Dashboard Navigation and Export Functionality
    When the user clicks on the "<sidebar_option>" sidebar option
    And waits for the page to load
    Then the "<module_name>" module information should be displayed

  Examples:
    | sidebar_option | module_name   |
    | Recruitment    | Recruitment    |
    | Reports        | Reports        |

  @navigate_to_dashboard
  Scenario Outline: Dashboard Navigation and Export Functionality
    When the user clicks on the "<sidebar_option>" sidebar option
    Then the "<module>" module should load without errors
    And the user is redirected back to the Dashboard page
    When the user clicks on the "Dashboard" sidebar option
    Then the Dashboard page should load without errors
    And the Dashboard page content should be displayed correctly
    And the sidebar should remain functional and visible

    Examples:
      | sidebar_option | module      |
      | Settings       | Settings    |

@verify_export_button
Scenario Outline: Dashboard Navigation and Export Functionality
  When the user observes the Dashboard page layout
  And the user looks for the Export button
  And the user checks the button's label and design
  And the user verifies the button's position on the page
  And the user ensures the button is enabled and clickable
  And the user checks for any tooltips or help text associated with the button
  Then the Export button should be present on the Dashboard page
  And the button should be clearly labeled "<button_label>"
  And the button should be visually distinct and clickable
  And tooltips or help text should appear on hover

Examples:
  | button_label |
  | Export       |

@export-report
Scenario Outline: Dashboard Navigation and Export Functionality
  When the user clicks the "Export" button
  And the system processes the export request
  Then a download prompt should appear for the user
  And the user selects the download location (if prompted)
  And the file is downloaded successfully
  Then the downloaded file format should be <file_format>

Examples:
  | file_format   |
  | .xlsx         |
  | .csv          |
  | .pdf          |

@verify_report_validity
Scenario Outline: Dashboard Navigation and Export Functionality
  When the user opens the downloaded report file
  Then the report file opens without errors
  And the report contains valid and relevant data
  And all expected headers are present in the report
  And the data matches the information displayed on the Dashboard
  And the file can be opened in Excel without issues

Examples:
  | report_file         |
  | <downloaded_report> |

@responsive-sidebar
Scenario Outline: Dashboard Navigation and Export Functionality
  When I resize the browser window to a smaller width
  And I observe the sidebar menu layout
  Then the sidebar menu adjusts appropriately to smaller screen sizes
  When I click on the sidebar options
  Then all sidebar options remain functional when clicked
  When I resize the browser back to a larger width
  And I observe the sidebar menu layout again
  Then the sidebar returns to its original layout on larger screens

Examples:
  |  |
  |  |

  @successful_export
  Scenario Outline: Dashboard Navigation and Export Functionality
    When the user clicks the "Export" button on the Dashboard
    And the user waits for the system to process the export request
    Then a success message should be displayed after the export is completed
    And visual indicators should show that the export is in progress
    And the download prompt should appear after the success message
    And the success message should remain visible until the download is complete

  Examples:
    | action                       |
    | Click the "Export" button   |
    | Wait for the system         |
    | Observe success messages     |
    | Check for visual indicators   |
    | Verify the download prompt   |
    | Confirm success message      |
