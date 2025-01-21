package comutility.common_function;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class Browser {
	public static WebDriver driver;
	public static void setUp(String browser) {
		
		if(browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
			System.out.println("program run in Chrome driver");
		}
		else if(browser.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();
			System.out.println("program  run in Edge driver");
		}
		else if(browser.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
			System.out.println("program should be run in Chrome driver");
		}
		/*else if(browser1.equalsIgnoreCase("Opera")) {
			driver = new OperaDriver();

			System.out.println("program  run in Opera driver");
		}*/
		else if(browser.equalsIgnoreCase("InternetExplorer")) {
			driver = new InternetExplorerDriver();

			System.out.println("program in InternetExplorer driver");
		}
		else {
		    System.out.println("Invalid browser name!");
		    //throw new IllegalArgumentException("Browser not supported: " + browser);
		}
		
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void testMethod() {
		Browser.setUp("Chrome");
	}

}
