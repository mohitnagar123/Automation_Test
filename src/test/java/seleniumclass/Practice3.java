package seleniumclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		// navigate to website
		driver.navigate().to("https://www.lambdatest.com/lp/web-automation-tools?utm_source=google&utm_medium=cpc&utm_campaign=LambdaTest_Search_Generic_Automation_Testing_India_N&utm_term=automation%20testing%20websites&utm_id=20624956738&utm_content=WebsiteAutomation-Exact&gad_source=1&gclid=Cj0KCQjw3tCyBhDBARIsAEY0XNngDzhkWFV4HHKMKAITa-ZIsS-NW1ZZffLkkz7wpAKdU0fjU53JDHwaAvMEEALw_wcB");
		
		// Click on Sign up for free button
		
		driver.findElement(By.xpath("//div[@class=\"inline-block border border-black hover:border-purple-27 rounded overflow-hidden smtablet:block mr-20 smtablet:mr-0\"]")).click();
		
		// enter email id
		
		driver.findElement(By.xpath("//input[@aria-label=\"Business Email*\"]")).sendKeys("test@yopmail.com");
		// enter password
		
		driver.findElement(By.xpath("//input[@aria-label=\"Desired Password\"]")).sendKeys("123467854");

		// click on show password button
		driver.findElement(By.xpath("//div[@class=\"absolute right-0 top-0 xxld:h-60 w-60 h-40 block text-center\"]")).click();
		Thread.sleep(2000);
		// click on hide password button
		
		driver.findElement(By.xpath("//div[@class=\"absolute right-0 top-0 xxld:h-60 w-60 h-40 block text-center\"]")).click();
		
		// click on sign up button
		
		driver.findElement(By.xpath("//button[@data-testid=\"signup-button\"]")).click();
		driver.findElement(By.xpath("//input[@aria-label=\"Business Email*\"]")).clear();
		
		driver.findElement(By.xpath("//input[@aria-label=\"Business Email*\"]")).sendKeys("test@gmail.com");
	}

}
