package testNG_package;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChatGpt1 {

    public static void main(String[] args) {
        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        try {
            // Open Google
            driver.get("https://google.com");

            // Enter "Facebook" into the search bar
            driver.findElement(By.name("q")).sendKeys("Facebook");

            // Wait and click the search button
            driver.findElement(By.name("btnK")).click();

            // Click the Facebook link in the search results
            driver.findElement(By.xpath("//h3[normalize-space()='Facebook - log in or sign up']")).click();

        } catch (Exception e) {
            // Handle any exceptions
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            // Quit the driver to close the browser
            driver.quit();
        }
    }
}

