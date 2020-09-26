package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginTests {
    //import selenium webdriver
    private WebDriver driver;

    //import chrome driver
    public void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        //Get url
        driver.get("https://github.com/login");
        //page wait for complete loading
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //Maximize page
        driver.manage().window().maximize();
        //get page title
        System.out.println(driver.getTitle());
        //get username
        driver.findElement(By.id("login_field")).sendKeys("beckyudogu");
        //get password
        driver.findElement(By.id("password")).sendKeys("RebUdo123");
        //get sign-in button
        driver.findElement(By.name("commit")).click();
        //wait
        Thread.sleep(10000);
        //close window
        driver.quit();

    }

    public static void main(String args[]) throws InterruptedException {

        LoginTests tests = new LoginTests();
        tests.setUp();
    }
}