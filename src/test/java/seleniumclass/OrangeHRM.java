package seleniumclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM {

	public static void main(String[] args) throws Exception {
		WebDriver driver= new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.google.com/");

		// navigate to website
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
				
		// Login In
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder=\"Username\"]")).sendKeys("Admin");	
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("admin123");	
		
		//click on login button
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\"]")).click();
		
		//click on Myinfo
		
		Thread.sleep(2000);
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewPersonalDetails/empNumber/7");
		
		//Employee Full Name
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class=\"oxd-input oxd-input--active orangehrm-firstname\" and @name=\"firstName\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class=\"oxd-input oxd-input--active orangehrm-firstname\" and @name=\"firstName\"]")).clear();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//input[@name=\"firstName\"]")).sendKeys("Mohit125");
		

		
		
	}

}
