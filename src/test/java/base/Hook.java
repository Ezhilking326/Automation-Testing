package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook {

    private static WebDriver driver;

    @Before
    public void setup() {
    	driver = new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.get("https://www.bikewale.com/");
       
    }

    @After
    public void teardown() {
        if (driver != null) {
            driver.quit();
            
        }
    }

    public static WebDriver getDriver() {
        return driver;
    }
}




