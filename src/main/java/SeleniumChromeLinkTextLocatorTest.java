import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumChromeLinkTextLocatorTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/home/ankur/Documents/Selenium/chromedriver");
        //Setting up the driver and giving the pth to the driver file
        WebDriver driver = new ChromeDriver();
        //Initialize the driver

        driver.get("https://facebook.com");
        //Hitting the URL you want to test

        driver.findElement(By.linkText("Forgotten password?")).click();
        //Finding the elements using the linkText locator

        driver.close();
        // To close window that has the focus
    }
}
