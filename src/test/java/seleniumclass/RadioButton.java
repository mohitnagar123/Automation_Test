package seleniumclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
	
	 // navigate to facebook
	// click on create new account button
	// click on female radio button
	// verify that radio button is enabled

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver= new ChromeDriver(); // object creation
		
		// navigate to facebook
		driver.get("https://www.facebook.com/");
		
		// click on create new account button
		driver.findElement(By.xpath("//a[contains(@id,'u_0_0')]")).click();
		
		Thread.sleep(2000);
		// click on female radio button
		driver.findElement(By.xpath("//input[@value='1']")).click();
		
		// verify that radio button is enabled
		
		System.out.println(driver.findElement(By.xpath("//input[@value='1']")).isEnabled());
		
		//close window
		driver.close(); 
		
	}
}