package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

	public WebDriver driver;
	

	public WebDriver webDriverManager() throws IOException {
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//src//test//resources//global.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String url = prop.getProperty("QaURL");
		
		if (driver == null) {
			if(prop.getProperty("browser").equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
			}
			driver.get(url);
		}
		return driver;
	}
}
