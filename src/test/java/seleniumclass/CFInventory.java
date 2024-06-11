package seleniumclass;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CFInventory {

	@Test
	public static void main(String[] args) throws Exception {
		
		Logger log = LogManager.getLogger(LoggerTest.class);
		
		WebDriver driver= new ChromeDriver(); 
		
		log.info("Chrome launched");
		driver.manage().window().maximize();
		log.info("Maximize the window");
		driver.get("https://www.google.com/");
		 log.info("URL navigated google");
		
		// navigate to website
		driver.navigate().to("http://34.123.146.206/");
		 log.info("URL navigated Jarvis");
		
		// enter loginid
		driver.findElement(By.xpath("//input[@name= \"username\"]")).sendKeys("lalit@123");
		 log.info("Email entered");
		
		// enter password
		driver.findElement(By.xpath("//input[@name= \"password\"]")).sendKeys("1234567");
		log.info("Password Entered");
		
		// click on login button
		driver.findElement(By.xpath("//i[@class=\"fas fa-arrow-right\"]")).click();
		
		log.info("Login");
		Thread.sleep(2000);
		
		//click on Inventory
		driver.findElement(By.xpath(" //a[@data-target=\"#collapseTwom8\"]")).click();
		log.info("Click on Inventory");
		
		// click on vendor
		driver.navigate().to("http://34.123.146.206/admin/pms-vendor-overview");
		
        // click on add vendor
		driver.navigate().to("http://34.123.146.206/admin/pms-vendor-master");
		
		// Enter vendor name
		
		driver.findElement(By.xpath("//input[@id=\"Vendor Name \"]")).sendKeys("Test Shivam");
		
		//select vendor category
		Thread.sleep(4000);
		Select dropdown = new Select(driver.findElement(By.id("react-select-2-input")));  
		
		dropdown.selectByVisibleText("influencer");  
		
		// Enter Mobile Number
		
		driver.findElement(By.xpath("//input[@id=\"Mobile\"]")).sendKeys("6587458745");
		
		// Enter Email
		
		driver.findElement(By.xpath("//input[@id=\"Email\"]")).sendKeys("testshivam@yopmail.com");
		
		
		
		//Add vendor type
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//button[@aria-label=\"Add Vendor Type..\"]")).click();
		
		//Enter type name
		//driver.findElement(By.xpath("//input[@id=\"name\"]")).sendKeys("Test Ram");
		
		//Enter Description
		//driver.findElement(By.xpath("//input[@id=\"description\"]")).sendKeys("Give your customers the best payment experience");
		
		//click on submit button
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//button[@class=\"MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium css-1hw9j7s\" and @type=\"submit\"]")).click();
		
		//click on view button
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@aria-label=\"Vendor Type Info..\"]")).click();
		
		//click on close button
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//button[@class=\"MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textError MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-root MuiButton-text MuiButton-textError MuiButton-sizeMedium MuiButton-textSizeMedium css-1ap6el4\"]")).click();
		
		//click on edit button 
		driver.findElement(By.xpath("//div[@id=\"row-4\"]")).click();
		driver.findElement(By.xpath("//button[@class=\"btn btn-outline-primary btn-sm user-button\"]")).click();
		
		Thread.sleep(2000);
		//clear name
		driver.findElement(By.xpath("//input[@id=\"name\"]")).clear();
		
		// upload files
		WebElement chooseFile = driver.findElement(By.id("PAN Image"));
		chooseFile.sendKeys("/Users/ankita/Downloads/edureka.png");
		
		
		
	}

}
