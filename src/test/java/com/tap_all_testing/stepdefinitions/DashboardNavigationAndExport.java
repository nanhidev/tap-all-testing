package com.tap_all_testing.stepdefinitions;
import com.tap_all_testing.utils.ElementUtils;
import org.junit.Assert;
import com.tap_all_testing.driverfactory.DriverFactory;
import com.tap_all_testing.pages.DashboardNavigationAndExportPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class DashboardNavigationAndExport extends DriverFactory {
DashboardNavigationAndExportPage dashboardPage = new DashboardNavigationAndExportPage(driver);
@Given("the user is on the Login Page")
public void the_user_is_on_the_login_page() {
driver = DriverFactory.getDriver();
dashboardPage.navigateToLoginPage();
}
@When("I enter {string}")
public void i_enter_username(String username) {
dashboardPage.enterUsername(username);
}
// DUPLICATE: @When("I enter {string}")
// DUPLICATE: public void i_enter_password(String password) {
// DUPLICATE: dashboardPage.enterPassword(password);
// DUPLICATE: }
@When("I click the {string} button")
public void i_click_the_button(String buttonName) {
dashboardPage.clickButton(buttonName);
}
@When("I wait for the system to process the login request")
public void i_wait_for_the_system_to_process_the_login_request() {
dashboardPage.waitForLoginProcessing();
}
@Then("the user should be redirected to the Dashboard page")
public void the_user_should_be_redirected_to_the_dashboard_page() {
dashboardPage.isDashboardPageDisplayed();
}
@Then("no error messages are displayed")
public void no_error_messages_are_displayed() {
dashboardPage.isErrorMessageDisplayed();
}
@Then("the Dashboard page should load completely with all elements visible")
public void the_dashboard_page_should_load_completely_with_all_elements_visible() {
dashboardPage.areAllDashboardElementsVisible();
}
@When("I observe the sidebar menu on the Dashboard")
public void i_observe_the_sidebar_menu_on_the_dashboard() {
dashboardPage.observeSidebarMenu();
}
@When("I identify all available menu options")
public void i_identify_all_available_menu_options() {
dashboardPage.identifyMenuOptions();
}
@When("I check for the presence of options like {string}, {string}, {string}")
public void i_check_for_the_presence_of_options(String menuOption1, String menuOption2, String menuOption3) {
dashboardPage.isMenuOptionPresent(menuOption1);
dashboardPage.isMenuOptionPresent(menuOption2);
dashboardPage.isMenuOptionPresent(menuOption3);
}
@When("I verify that each option is clickable")
public void i_verify_that_each_option_is_clickable() {
dashboardPage.areMenuOptionsClickable();
}
@When("I hover over each option to check for tooltips")
public void i_hover_over_each_option_to_check_for_tooltips() {
dashboardPage.checkTooltipsOnHover();
}
@When("I ensure that the sidebar is responsive and adjusts to screen size")
public void i_ensure_that_the_sidebar_is_responsive_and_adjusts_to_screen_size() {
dashboardPage.isSidebarResponsive();
}
@Then("all expected sidebar options are displayed")
public void all_expected_sidebar_options_are_displayed() {
dashboardPage.areExpectedSidebarOptionsDisplayed();
}
@Then("each option is clickable and leads to the corresponding module")
public void each_option_is_clickable_and_leads_to_the_corresponding_module() {
dashboardPage.areSidebarOptionsNavigable();
}
@Then("tooltips appear on hover (if applicable)")
public void tooltips_appear_on_hover_if_applicable() {
dashboardPage.areTooltipsVisibleOnHover();
}
@When("the user clicks on the {string} sidebar option")
public void the_user_clicks_on_the_sidebar_option(String sidebarOption) {
dashboardPage.clickSidebarOption(sidebarOption);
}
@When("waits for the page to load")
public void waits_for_the_page_to_load() {
dashboardPage.waitForPageToLoad();
}
@Then("{string} module information should be displayed")
public void module_information_should_be_displayed(String moduleName) {
dashboardPage.isModuleInformationDisplayed(moduleName);
}
@Then("{string} module should load without errors")
public void module_should_load_without_errors(String module) {
dashboardPage.isModuleLoadedWithoutErrors(module);
}
@Then("the user is redirected back to the Dashboard page")
public void the_user_is_redirected_back_to_the_dashboard_page() {
dashboardPage.isDashboardPageDisplayed();
}
@When("the user observes the Dashboard page layout")
public void the_user_observes_the_dashboard_page_layout() {
dashboardPage.observeDashboardLayout();
}
@When("the user looks for the Export button")
public void the_user_looks_for_the_export_button() {
dashboardPage.isExportButtonVisible();
}
@When("the user checks the button's label and design")
public void the_user_checks_the_button_label_and_design() {
dashboardPage.isExportButtonLabelCorrect();
}
@When("the user verifies the button's position on the page")
public void the_user_verifies_the_button_position_on_the_page() {
dashboardPage.isExportButtonPositionCorrect();
}
@When("the user ensures the button is enabled and clickable")
public void the_user_ensures_the_button_is_enabled_and_clickable() {
dashboardPage.isExportButtonEnabled();
}
@When("the user checks for any tooltips or help text associated with the button")
public void the_user_checks_for_any_tooltips_or_help_text_associated_with_the_button() {
dashboardPage.isExportButtonTooltipVisible();
}
@Then("the Export button should be present on the Dashboard page")
public void the_export_button_should_be_present_on_the_dashboard_page() {
dashboardPage.isExportButtonVisible();
}
@Then("the button should be clearly labeled {string}")
public void the_button_should_be_clearly_labeled(String buttonLabel) {
Assert.assertEquals(buttonLabel, dashboardPage.getExportButtonLabel());
}
@Then("the button should be visually distinct and clickable")
public void the_button_should_be_visually_distinct_and_clickable() {
dashboardPage.isExportButtonVisuallyDistinct();
}
@Then("tooltips or help text should appear on hover")
public void tooltips_or_help_text_should_appear_on_hover() {
dashboardPage.isExportButtonTooltipVisible();
}
@When("the user clicks the Export button")
public void the_user_clicks_the_export_button() {
dashboardPage.clickExportButton();
}
@When("the system processes the export request")
public void the_system_processes_the_export_request() {
dashboardPage.processExportRequest();
}
@Then("a download prompt should appear for the user")
public void a_download_prompt_should_appear_for_the_user() {
dashboardPage.isDownloadPromptVisible();
}
@When("the user selects the download location (if prompted)")
public void the_user_selects_the_download_location_if_prompted() {
dashboardPage.selectDownloadLocation();
}
@Then("the file is downloaded successfully")
public void the_file_is_downloaded_successfully() {
dashboardPage.isFileDownloadedSuccessfully();
}
@Then("the downloaded file format should be {string}")
public void the_downloaded_file_format_should_be(String fileFormat) {
Assert.assertEquals(fileFormat, dashboardPage.getDownloadedFileFormat());
}
@When("the user opens the downloaded report file")
public void the_user_opens_the_downloaded_report_file() {
dashboardPage.openDownloadedReportFile();
}
@Then("the report file opens without errors")
public void the_report_file_opens_without_errors() {
dashboardPage.isReportFileOpenedWithoutErrors();
}
@Then("the report contains valid and relevant data")
public void the_report_contains_valid_and_relevant_data() {
dashboardPage.isReportDataValid();
}
@Then("all expected headers are present in the report")
public void all_expected_headers_are_present_in_the_report() {
dashboardPage.areExpectedHeadersPresent();
}
@Then("the data matches the information displayed on the Dashboard")
public void the_data_matches_the_information_displayed_on_the_dashboard() {
dashboardPage.isReportDataMatchingDashboard();
}
@Then("the file can be opened in Excel without issues")
public void the_file_can_be_opened_in_excel_without_issues() {
dashboardPage.canOpenFileInExcel();
}
@When("I resize the browser window to a smaller width")
public void i_resize_the_browser_window_to_a_smaller_width() {
dashboardPage.resizeBrowserToSmallWidth();
}
@Then("the sidebar menu adjusts appropriately to smaller screen sizes")
public void the_sidebar_menu_adjusts_appropriately_to_smaller_screen_sizes() {
dashboardPage.isSidebarMenuAdjusted();
}
@When("I click on the sidebar options")
public void i_click_on_the_sidebar_options() {
dashboardPage.clickSidebarOptions();
}
@Then("all sidebar options remain functional when clicked")
public void all_sidebar_options_remain_functional_when_clicked() {
dashboardPage.areSidebarOptionsFunctional();
}
@When("I resize the browser back to a larger width")
public void i_resize_the_browser_back_to_a_larger_width() {
dashboardPage.resizeBrowserToLargeWidth();
}
@Then("the sidebar returns to its original layout on larger screens")
public void the_sidebar_returns_to_its_original_layout_on_larger_screens() {
dashboardPage.isSidebarLayoutOriginal();
}
@When("the user clicks the Export button on the Dashboard")
public void the_user_clicks_the_export_button_on_the_dashboard() {
dashboardPage.clickExportButton();
}
@When("the user waits for the system to process the export request")
public void the_user_waits_for_the_system_to_process_the_export_request() {
dashboardPage.waitForExportProcessing();
}
@Then("a success message should be displayed after the export is completed")
public void a_success_message_should_be_displayed_after_the_export_is_completed() {
dashboardPage.isSuccessMessageDisplayed();
}
@Then("visual indicators should show that the export is in progress")
public void visual_indicators_should_show_that_the_export_is_in_progress() {
dashboardPage.isExportInProgressIndicatorVisible();
}
@Then("the download prompt should appear after the success message")
public void the_download_prompt_should_appear_after_the_success_message() {
dashboardPage.isDownloadPromptVisible();
}
@Then("the success message should remain visible until the download is complete")
public void the_success_message_should_remain_visible_until_the_download_is_complete() {
dashboardPage.isSuccessMessageVisibleUntilDownloadComplete();
}

@Given("the user clicks on the dashboard sidebar option")
public void the_user_clicks_on_the_dashboard_sidebar_option() {
dashboardPage.clickOnDashboardSidebarOption();
}
@When("I clickElement the login button")
public void i_click_the_login_button() {
dashboardPage.clickLoginButton();
}
@Then("the {string} module should load without errors")
public void the_module_should_load_without_errors(String moduleName) {
Assert.assertTrue("The module " + moduleName + " did not load without errors.",
dashboardPage.isModuleLoadedWithoutErrors(moduleName));
}
@Then("the dashboard page should load without errors")
public void the_dashboard_page_should_load_without_errors() {
Assert.assertTrue("The dashboard page did not load without errors.",
dashboardPage.isDashboardPageLoadedWithoutErrors());
}
@Then("the {string} module information should be displayed")
public void the_module_information_should_be_displayed(String moduleName) {
Assert.assertTrue("The module information for " + moduleName + " is not displayed.",
dashboardPage.isModuleInformationDisplayed(moduleName));
}
@Then("the sidebar should remain functional visible")
public void the_sidebar_should_remain_functional_visible() {
Assert.assertTrue("The sidebar is not functional or visible.",
dashboardPage.isSidebarFunctionalAndVisible());
}
@And("I observe the sidebar menu layout")
public void i_observe_the_sidebar_menu_layout() {
dashboardPage.observeSidebarMenuLayout();
}
@Then("the dashboard page content should be displayed correctly")
public void the_dashboard_page_content_should_be_displayed_correctly() {
Assert.assertTrue("The dashboard page content is not displayed correctly.",
dashboardPage.isDashboardPageContentDisplayedCorrectly());
}
}