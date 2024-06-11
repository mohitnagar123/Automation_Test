package seleniumclass;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptInCode {

	public static void main(String[] args) throws Exception {
		
		
		WebDriver driver= new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.facebook.com/");
		// javascript executor interface
		
		JavascriptExecutor newDriver = (JavascriptExecutor)driver;
		
		Thread.sleep(3000);
		newDriver.executeScript("document.getElementById('email').value='abc@gmail.com'");
		
		Thread.sleep(3000);
		newDriver.executeScript("document.getElementById('pass').value='125412'");
		
		// Scroll down
		Thread.sleep(3000);
		newDriver.executeScript("window.scrollBy(0,300)");
		
		// Scroll up
		Thread.sleep(3000);
		newDriver.executeScript("window.scrollBy(300,0)");
		
	}

}
