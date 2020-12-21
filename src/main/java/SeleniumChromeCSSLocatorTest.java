import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumChromeCSSLocatorTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/home/ankur/Documents/Selenium/chromedriver");
        //Setting up the driver and giving the pth to the driver file
        WebDriver driver = new ChromeDriver();
        //Initialize the driver

        driver.get("https://login.salesforce.com/?locale=in");
        //Hitting the URL you want to test

        driver.findElement(By.cssSelector("#username")).sendKeys("sample@gmail.com");
        driver.findElement(By.cssSelector("#password")).sendKeys("password");
        driver.findElement(By.cssSelector("#Login")).click();
        //Finding the elements using the cssSelector locator
        driver.close();
        // To close window that has the focus
    }
}
