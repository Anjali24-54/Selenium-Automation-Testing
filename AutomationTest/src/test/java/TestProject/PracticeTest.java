package TestProject;

// Import the necessary Selenium classes
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PracticeTest {
    public static void main(String[] args) {
        // Set the path for chromedriver if not using WebDriverManager
        System.setProperty("webdriver.chrome.driver", "C:\\selenium-java-eclipse\\Chrome-Driver\\chromedriver-win64\\chromedriver.exe");

        // Initialize ChromeDriver
        ChromeOptions options = new ChromeOptions();
        WebDriver driver = new ChromeDriver(options);

        // Navigate to Google homepage
        driver.get("https://www.google.com");

        // Find the search bar and type "Simplilearn login"
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Simplilearn login");
        searchBox.submit();

        // Wait for the search results to load
        try {
            Thread.sleep(4000); // Wait for 4 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Optionally, click the first link (you might need to adjust the locator)
        WebElement firstResult = driver.findElement(By.cssSelector("h3"));
        firstResult.click();

        // Wait for the login page to load
        try {
            Thread.sleep(4000); // Wait for 4 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Close the browser
        driver.quit();
    }
}
