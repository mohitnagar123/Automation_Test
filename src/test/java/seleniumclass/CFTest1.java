package seleniumclass;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CFTest1 {

	public static void main(String[] args) throws Exception {
		
			WebDriver driver= new ChromeDriver(); 
			driver.manage().window().maximize();
			driver.get("https://www.google.com/");
			
			
			// navigate to website
			driver.navigate().to("http://34.123.146.206/");
			
			// enter loginid
			driver.findElement(By.xpath("//input[@name= \"username\"]")).sendKeys("lalit@123");
			
			// enter password
			driver.findElement(By.xpath("//input[@name= \"password\"]")).sendKeys("1234567");
			
			// click on login button
			driver.findElement(By.xpath("//i[@class=\"fas fa-arrow-right\"]")).click();
			
			Thread.sleep(2000);
			//click on user management
			driver.findElement(By.xpath("//a[@class=\"nav-btn nav-link collapsed\"and @data-target=\"#collapseTwo\"]")).click();
			
			// click on user
			driver.navigate().to("http://34.123.146.206/admin/user-overview/Active");
			
			JavascriptExecutor newDriver = (JavascriptExecutor)driver;
			Thread.sleep(12000);
			
			newDriver.executeScript("window.scrollBy(0,1000)");
			// click on Add User
			
			driver.navigate().to("http://34.123.146.206/admin/user");
			
			Thread.sleep(1000);
			newDriver.executeScript("window.scrollBy(0,1000)");
			
			
			driver.findElement(By.xpath("//input[@id=\"Full Name\"]")).sendKeys("Test Akshit");
			
			//driver.findElement(By.xpath("//button[@class=\"btn cmnbtn btn-primary\" and @type=\"submit\"]")).click();
			
			Select dropdown = new Select(driver.findElement(By.id("react-select-20-input"))); 
			
			//driver.findElement(By.xpath("//input[@id=\"Personal Email\"]")).sendKeys("test@yopmail.com");
			
			
			
			
			
	}

}
