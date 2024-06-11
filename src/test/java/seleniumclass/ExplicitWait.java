package seleniumclass;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) throws Exception {
		WebDriver driver= new ChromeDriver(); 
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");

		// Explicit wait 
		
 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
 wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("passContainer")));
 
 
 
	}

}
