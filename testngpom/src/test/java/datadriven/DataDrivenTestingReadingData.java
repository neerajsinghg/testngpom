package datadriven;

import org.testng.annotations.Test;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenTestingReadingData {
	
	WebDriver driver;
	@Test(dataProvider = "TestDataFeed")
	
	public void Login(String uname, String password) {
		//System.out.println(uname + "and" + password);		
	}
	@DataProvider
	public Object[][] TestDataFeed() throws IOException{
		
		ExcelDataSheet config = new ExcelDataSheet("D:\\dataDriventest.xlsx");
		int rows = config.GetRowCount(0);
		Object[][] userandpass = new Object[rows][2];
		
		for(int i=0;i<rows; i++) {
			userandpass[i][0] = config.getData(0, i, 0);
			userandpass[i][1] = config.getData(0, i, 1);
		}
		return userandpass;	
	}

}
