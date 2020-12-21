import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumChromeIDLocatorTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/home/ankur/Documents/Selenium/chromedriver");
        //Setting up the driver and giving the pth to the driver file
        WebDriver driver = new ChromeDriver();
        //Initialize the driver
        driver.get("https://login.salesforce.com/?locale=in");
        //Hitting the URL you want to test

        driver.findElement(By.id("username")).sendKeys("test.email@gmail.com");
        driver.findElement(By.id("password")).sendKeys("test.email@gmail.com");
        driver.findElement(By.id("Login")).click();
        //Finding the elements using the id locator

        driver.close();
        // To close window that has the focus
    }
}
