package seleniumclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ObjectRepository {

	public static void main(String[] args) throws Exception {
		
		// Specify the location of the properties file
		File src1 = new File ("C:\\Users\\MY PC\\eclipse-workspace\\seleniumclass\\Repository\\config.properties");
		File src2 = new File ("C:\\Users\\MY PC\\eclipse-workspace\\seleniumclass\\Repository\\locators.properties");
		File src3 = new File ("C:\\Users\\MY PC\\eclipse-workspace\\seleniumclass\\Repository\\testdata.properties");

		
		// fileinputstream class load the file
		FileInputStream config1 = new FileInputStream(src1);
		FileInputStream locators1 = new FileInputStream(src2);
		FileInputStream testdata1 = new FileInputStream(src3);
		
		
		// Properties class reads the properties file
		Properties config2 = new Properties();
		config2.load(config1); // read config.properties
		
		Properties locators2 = new Properties();
		locators2.load(locators1);
		
		Properties testdata2 = new Properties();
		testdata2.load(testdata1);
		
		
		
		
		WebDriver driver= new ChromeDriver();  // object creation
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get(config2.getProperty("URL"));
		driver.findElement(By.xpath(locators2.getProperty("Email"))).sendKeys(testdata2.getProperty("TestDataEmail"));
		driver.findElement(By.xpath(locators2.getProperty("Password"))).sendKeys(testdata2.getProperty("TestDataPassword"));
		
		
		
	}

}
