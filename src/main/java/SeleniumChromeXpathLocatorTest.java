import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumChromeXpathLocatorTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/home/ankur/Documents/Selenium/chromedriver");
        //Setting up the driver and giving the pth to the driver file
        WebDriver driver = new ChromeDriver();
        //Initialize the driver

        driver.get("https://login.salesforce.com/?locale=in");
        //Hitting the URL you want to test

        driver.findElement(By.xpath("//*[@id=\'username\']")).sendKeys("test@gmaail.com");
        driver.findElement(By.xpath("//*[@id=\'password\']")).sendKeys("incorrectPassword");
        driver.findElement(By.xpath("//*[@id=\'Login\']")).click();
        System.out.println(driver.findElement(By.cssSelector("#error")).getText());
        //Finding the elements using the xpath locator
        System.out.println();

        driver.close();
        // To close window that has the focus
    }
}
