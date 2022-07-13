import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SampleTest {

    @Test
    public void test() {
        System.setProperty("webdriver.chrome.driver", "/Users/jagadeeshtummala/Downloads/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://www.facebook.com/login/");
        driver.quit();
        //Added to test polling
    }
}  