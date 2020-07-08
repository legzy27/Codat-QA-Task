package stepdefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import pageobject.timesheetpage;
public class SteDefinition {




    public static WebDriver driver = new ChromeDriver();


    @Before
    @Given("^I navigate to codat home page$")
    public void i_navigate_to_codat_home_page() throws Exception {
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        driver.get("https://codat-qa-task-d3c1.azurewebsites.net/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        String pageSource = driver.getPageSource();
        boolean result = pageSource.contains("Home");
        System.out.print(result);

    }


    @Then("^I click on create new timesheet$")
    public void i_click_on_create_new_timesheet() throws Exception {
        timesheetpage page = new timesheetpage(driver);
        page.clickCreate.click();


    }

    @Then("^I fill in the timesheet and click save$")
    public void i_fill_in_the_timesheet_and_click_save() throws Exception {
        timesheetpage page = new timesheetpage(driver);
        page.fillText.sendKeys("CDTAlex");
        page.clickButton.click();
        Thread.sleep(1000);
        driver.close();

    }




}