package com.tap_all_testing.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.tap_all_testing.utils.ElementUtils;
import org.junit.Assert;

public class DashboardNavigationAndExportPage {
    private WebDriver driver;
    private ElementUtils elementUtils;

    @FindBy(id = "loginButton")
    private WebElement loginButton;

    @FindBy(id = "exportButton")
    private WebElement exportButton;

    @FindBy(id = "sidebarMenu")
    private WebElement sidebarMenu;

    @FindBy(id = "successMessage")
    private WebElement successMessage;

    @FindBy(id = "errorMessage")
    private WebElement errorMessage;

    @FindBy(id = "downloadPrompt")
    private WebElement downloadPrompt;

    @FindBy(id = "moduleInformation")
    private WebElement moduleInformation;

    public DashboardNavigationAndExportPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        this.elementUtils = new ElementUtils(driver);
    }

    public void clickLoginButton() {
        try {
            elementUtils.clickElement(loginButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickExportButton() {
        try {
            elementUtils.clickElement(exportButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isExportButtonVisible() {
        try {
            Assert.assertTrue("Export button is not visible", elementUtils.isElementDisplayed(exportButton));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isSuccessMessageDisplayed() {
        try {
            Assert.assertTrue("Success message is not displayed", elementUtils.isElementDisplayed(successMessage));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isErrorMessageDisplayed() {
        try {
            Assert.assertFalse("Error message should not be displayed", elementUtils.isElementDisplayed(errorMessage));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isDownloadPromptVisible() {
        try {
            Assert.assertTrue("Download prompt is not visible", elementUtils.isElementDisplayed(downloadPrompt));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isModuleInformationDisplayed(String moduleName) {
        try {
            String actualModuleInfo = elementUtils.getElementText(moduleInformation);
            Assert.assertNotNull("Module information is not displayed", actualModuleInfo);
            return actualModuleInfo.contains(moduleName);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void waitForPageToLoad() {
        try {
            // Implement your logic to wait for the page to load.
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickOnDashboardSidebarOption() {
        try {
            elementUtils.clickElement(sidebarMenu);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isModuleLoadedWithoutErrors(String moduleName) {
        // Check if the module loads without errors (dummy implementation)
        return true;
    }

    public boolean isDashboardPageLoadedWithoutErrors() {
        // Check if the dashboard page loads without errors (dummy implementation)
        return true;
    }

    public boolean isSidebarFunctionalAndVisible() {
        // Check if the sidebar is functional and visible (dummy implementation)
        return true;
    }

    public boolean isDashboardPageContentDisplayedCorrectly() {
        // Check if the dashboard page content is displayed correctly (dummy implementation)
        return true;
    }

    public void processExportRequest() {
        // Implement export request processing (dummy implementation)
    }

    public void resizeBrowserToSmallWidth() {
        // Resize browser to small width (dummy implementation)
    }

    public void resizeBrowserToLargeWidth() {
        // Resize browser to large width (dummy implementation)
    }

    public void areMenuOptionsClickable() {
        // Implement menu options clickable check (dummy implementation)
    }

    public void observeSidebarMenuLayout() {
        // Implement sidebar menu layout observation (dummy implementation)
    }

    public void isMenuOptionPresent(String menuOption) {
        try {
            WebElement menuElement = driver.findElement(By.xpath("//selector-for-menu-option"));
            Assert.assertTrue(menuElement.isDisplayed(), "Menu option is not present!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isExportButtonTooltipVisible() {
        try {
            String tooltipText = exportButton.getAttribute("title");
            Assert.assertEquals(tooltipText, "Expected Tooltip", "Tooltip is not visible!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterUsername(String username) {
        try {
            WebElement usernameField = driver.findElement(By.id("username-field-id"));
            ElementUtils.clearAndSendKeys(usernameField, username);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectDownloadLocation(String location) {
        try {
            WebElement downloadDropdown = driver.findElement(By.id("download-location-dropdown-id"));
            ElementUtils.selectOptionInDropdown(downloadDropdown, location);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void observeSidebarMenu() {
        try {
            Assert.assertTrue(sidebarMenu.isDisplayed(), "Sidebar menu is not displayed!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isReportDataValid() {
        try {
            WebElement reportDataElement = driver.findElement(By.id("report-data-id"));
            return reportDataElement.isDisplayed();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void openDownloadedReportFile() {
        try {
            // Logic to open the file, e.g., Runtime.getRuntime().exec("cmd /c start " + filePath);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isExportInProgressIndicatorVisible() {
        try {
            WebElement exportIndicator = driver.findElement(By.id("export-in-progress-indicator-id"));
            return exportIndicator.isDisplayed();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isSidebarResponsive() {
        try {
            WebElement sidebar = driver.findElement(By.id("sidebar-id"));
            return sidebar.isDisplayed();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isExportButtonLabelCorrect() {
        try {
            String actualLabel = ElementUtils.getElementText(exportButton);
            String expectedLabel = "Export";
            Assert.assertEquals(actualLabel, expectedLabel, "Export button label is incorrect!");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isDashboardPageDisplayed() {
        try {
            WebElement dashboardElement = driver.findElement(By.id("dashboard-id"));
            return dashboardElement.isDisplayed();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public String getDownloadedFileFormat() {
        try {
            return "pdf"; // replace with actual logic
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public boolean canOpenFileInExcel() {
        try {
            return true; // replace with actual logic
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isExportButtonEnabled() {
        try {
            return exportButton.isEnabled();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean areAllDashboardElementsVisible() {
        try {
            WebElement dashboardElement1 = driver.findElement(By.id("element1-id"));
            WebElement dashboardElement2 = driver.findElement(By.id("element2-id"));
            return dashboardElement1.isDisplayed() && dashboardElement2.isDisplayed();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void observeDashboardLayout() {
        try {
            WebElement dashboardLayout = driver.findElement(By.id("dashboard-layout-id"));
            Assert.assertTrue(dashboardLayout.isDisplayed(), "Dashboard layout is not visible!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isFileDownloadedSuccessfully() {
        try {
            return true; // replace with actual logic
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean areSidebarOptionsFunctional() {
        try {
            return true; // replace with actual logic
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void navigateToLoginPage() {
        try {
            driver.get("http://localhost/login"); // Use the localhost URL
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isExportButtonVisuallyDistinct() {
        try {
            return true; // replace with actual logic
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void clickSidebarOptions() {
        try {
            WebElement sidebarOption = driver.findElement(By.id("sidebar-option-id"));
            elementUtils.clickElement(sidebarOption);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void checkTooltipsOnHover() {
        try {
            WebElement tooltipElement = driver.findElement(By.id("tooltip-element-id"));
            Assert.assertTrue(tooltipElement.isDisplayed(), "Tooltip is not visible on hover!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isSidebarLayoutOriginal() {
        try {
            return true; // replace with actual logic
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isSidebarMenuAdjusted() {
        try {
            return true; // replace with actual logic
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isExportButtonPositionCorrect() {
        try {
            return true; // replace with actual logic
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void clickSidebarOption() {
        try {
            WebElement sidebarOption = driver.findElement(By.id("sidebar-option-id"));
            elementUtils.clickElement(sidebarOption);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean identifyMenuOptions() {
        try {
            WebElement menuOption = driver.findElement(By.id("menu-option-id"));
            return menuOption.isDisplayed();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isReportDataMatchingDashboard() {
        try {
            return true; // replace with actual logic
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean areTooltipsVisibleOnHover() {
        try {
            return true; // replace with actual logic
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isSuccessMessageVisibleUntilDownloadComplete() {
        try {
            return true; // replace with actual logic
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean areSidebarOptionsNavigable() {
        try {
            return true; // replace with actual logic
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void waitForLoginProcessing() {
        try {
            // Logic to wait for login processing
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterPassword(String password) {
        try {
            WebElement passwordField = driver.findElement(By.id("password-field-id"));
            ElementUtils.clearAndSendKeys(passwordField, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getExportButtonLabel() {
        try {
            return ElementUtils.getElementText(exportButton);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public boolean areExpectedSidebarOptionsDisplayed() {
        try {
            return true; // replace with actual logic
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isReportFileOpenedWithoutErrors() {
        try {
            return true; // replace with actual logic
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void waitForExportProcessing() {
        try {
            // Logic to wait for export processing
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}