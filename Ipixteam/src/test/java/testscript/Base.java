package testscript;

import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Base {
    public WebDriver driver;

    @BeforeTest
   /* public void initialiseBrowser() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver"); // Add the path
        driver = new ChromeDriver();
        driver.get("https://tracez-lms.ipixsolutions.net/");
        driver.manage().window().maximize();
        
        
        public void initialiseBrowser() {
            System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe"); 
            driver = new ChromeDriver();
            driver.get("https://www.britannica.com/topic/food");
            driver.manage().window().maximize();
        }
    */
    public void initialiseBrowser() {
            WebDriverManager.chromedriver().setup(); // Auto-downloads correct version
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://tracez-lms.ipixsolutions.net/");
        }
    
    

    @AfterTest
    public void driverQuitClose() {
        if (driver != null) {
        //    driver.quit();
        }
    }
}