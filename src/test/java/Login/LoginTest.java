package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginTest {
    //import the selenium webDriver
    private WebDriver driver;
    public void setUp() throws InterruptedException {
        System.setProperty ("webdriver.chrome.driver", "C:\\Users\\SOREMI TAIWO OLAMIDE\\Documents\\POSTMAN_AUTOMATION_TEST\\Resources\\chromedriver.exe");
        driver = new ChromeDriver();
        //input project URL = Postman login URL
        driver.get ("https://identity.getpostman.com/login?addAccount=1");
        //waiting for globally
        driver.manage ().timeouts ().implicitlyWait (10, TimeUnit.SECONDS);
        //maximize the window
        driver.manage ().window ().maximize ();
        //get page title
        System.out.println (driver.getTitle ());
        //locate email field
        driver.findElement (By.xpath ("//*[@id=\"username\"]")).sendKeys ("Too_great1@yahoo.com");
        //locate password field
        driver.findElement (By.xpath ("//*[@id=\"password\"]")).sendKeys ("Username#abc");
        //click on sign in button
        driver.findElement (By.xpath ("/html/body/div/div[3]/div[1]/form/div[4]/button")).click ();
        Thread.sleep (10000);
        //close the browser after test
        driver.quit();
    }

    //initiate the test run command
    public static void main(String[] args) throws InterruptedException {
        LoginTest test = new LoginTest ();
        test.setUp ();
    }
}

