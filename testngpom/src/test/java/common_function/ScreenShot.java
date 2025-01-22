package common_function;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
public class ScreenShot {
	String filePath = "C:\\Users\\ADMIN\\Desktop\\Appium\\testngpom\\screenshots";
	// Method to take a screenshot
	public static void takeScreenshot(WebDriver driver, String filePath) {
		// Step 1: Cast WebDriver to TakesScreenshot
		TakesScreenshot screenshot = (TakesScreenshot) driver;

		// Step 2: Get the screenshot as a file
		File srcFile = screenshot.getScreenshotAs(OutputType.FILE);

		// Step 3: Define where to save the screenshot
		File destFile = new File(filePath);

		try {
			// Step 4: Copy the screenshot file to the desired location
			FileUtils.copyFile(srcFile, destFile);
			System.out.println("Screenshot saved successfully at: " + filePath);
		} catch (IOException e) {
			System.out.println("Error while saving screenshot: " + e.getMessage());
		}
	}
}

