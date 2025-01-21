package comutility.common_function;

import org.openqa.selenium.WebDriver;

public class TearDown {
	static WebDriver driver;

	 public static void closeBrowser() {
	        if (driver != null) {
	            driver.quit();
	        }

}
}
