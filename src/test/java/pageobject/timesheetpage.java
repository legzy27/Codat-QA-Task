package pageobject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


// Page object model(Page Navigation)
public class timesheetpage {


    public timesheetpage (WebDriver driver) {
        PageFactory.initElements(driver, this);

    }


     @FindBy(xpath = "//a[@href='/CreateOrEdit']")
    public WebElement clickCreate;

    @FindBy(id = "Timesheet_EmployeeId")
    public WebElement fillText;


    @FindBy(xpath = "/html/body/div/main/div[1]/div/form/div[3]/input")
    public WebElement clickButton;


    }