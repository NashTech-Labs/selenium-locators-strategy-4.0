import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumChromeNameLocatorTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/home/ankur/Documents/Selenium/chromedriver");
        //Setting up the driver and giving the pth to the driver file
        WebDriver driver = new ChromeDriver();
        //Initialize the driver

        driver.get("https://login.salesforce.com/?locale=in");
        //Hitting the URL you want to test

        driver.findElement(By.name("username")).sendKeys("test.email@gmail.com");
        driver.findElement(By.name("pw")).sendKeys("test.email@gmail.com");
        driver.findElement(By.name("Login")).click();
        //Finding the elements using the name locator

        driver.close();
        // To close window that has the focus
    }
}
