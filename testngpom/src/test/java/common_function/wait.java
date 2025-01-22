package common_function;
import java.time.Duration;
import org.openqa.selenium.WebDriver;

public class wait {
	public static WebDriver driver;
	public static void time() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
}
