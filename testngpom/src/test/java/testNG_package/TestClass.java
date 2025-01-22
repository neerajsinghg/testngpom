package testNG_package;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClass {
	WebDriver driver;
	
	@BeforeTest
	public void openBrowser()  {		
		driver = new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		}
	@Test
	public void searchFacebook() throws InterruptedException {
		driver.findElement(By.name("q")).sendKeys("Facebook");
		Thread.sleep(3000);
	driver.findElement(By.name("btnK")).click();
	Thread.sleep(1000);
	
	
	driver.findElement(By.xpath("(//h3[normalize-space()='Facebook - log in or sign up']")).click();
		
	}
	
	@AfterMethod
	@AfterTest
	public void tearDown() {
		
		//driver.quit();
	}

}
