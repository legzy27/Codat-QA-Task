package stepdefs;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Smoke {
    WebDriver driver;


    @Before
    public void beforeTest(){
        System.out.println("Before test run");
        driver = new ChromeDriver();
    }
    @Test
    public void SmokeTest() {
        System.out.println("Running smoke test..");
       // driver.get("https://codat-qa-task-d3c1.azurewebsites.net/");
    }
    @After
    public  void afterTest() {
        System.out.println("Before test run");
        driver.quit();

    }

}
