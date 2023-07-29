package hellocucumber;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Hooks {
    private static WebDriver driver;

    private static WebDriverWait wait;

    @Before
    public static void setUp(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();

        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.manage().window().maximize();

        System.out.println("INFO: BROWSER IS READY");
    }

    @After
    public static void tearDown(){
        driver.close();
        driver.quit();

        System.out.println("INFO: Browser is down");
    }

    public static WebDriver getDriver(){
        return driver;
    }


}
