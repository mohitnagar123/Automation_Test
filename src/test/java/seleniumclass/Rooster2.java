package seleniumclass;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rooster2 {

	public static void main(String[] args) throws Exception {
		WebDriver driver= new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		
		// navigate to website
		driver.navigate().to("https://app.rooster.org/sign-in");
		
		JavascriptExecutor newDriver = (JavascriptExecutor)driver;
		// click on Get started
		driver.findElement(By.xpath("//a[@href=\"/create-account\"]")).click();
		
		// fill form
		
		driver.findElement(By.xpath("//input[@name=\"firstName\"]")).sendKeys("Mohit");

		driver.findElement(By.xpath("//input[@name=\"lastName\"]")).sendKeys("Kumar");
		
		driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("mohit@yopmail.com");
		
		driver.findElement(By.xpath("//div[@class=\"selected-flag\"]")).click();
		
		
		
		driver.findElement(By.xpath("//li[@data-flag-key=\"flag_no_84\"]")).click();
		
		driver.findElement(By.xpath("//input[@class=\"form-control \"]")).sendKeys("9858745874");
		
		driver.findElement(By.xpath("//input[@name=\"company.name\"]")).sendKeys("ABC Industry");
		
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("ABC@123");
		
		driver.findElement(By.xpath("//span[@class=\"ant-input-suffix\"]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class=\"ant-input-suffix\"]")).click();
		
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
		newDriver.executeScript("window.scrollBy(0,1000)");
		
	}

}
