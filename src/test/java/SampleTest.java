import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleTest {

    public static void main(String[] args) {

        // System Property for Chrome Driver
        System.setProperty("webdriver.chrome.driver", "/Users/jagadeeshtummala/Downloads/chromedriver");

        // Instantiate a ChromeDriver class.
        WebDriver driver=new ChromeDriver();

        // Launch Website
        driver.navigate().to("https://www.facebook.com/login/");


        driver.quit();

    }

}  