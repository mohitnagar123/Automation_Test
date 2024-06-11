package seleniumclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver(); 
		
		// navigate to facebook
				driver.get("https://www.facebook.com/");
				
				// click on create new account button
				driver.findElement(By.xpath("//a[contains(@id,'u_0_0')]")).click();
				
				//1 way
				
				//List<WebElement> birthMonth = driver.findElements(By.xpath("//select[@id='month']//option"));
				//System.out.println("Number of Dropdown values" +birthMonth.size());
				//birthMonth.get(8).click();
								
				
				WebElement birthMonth1=driver.findElement(By.xpath("//select[@id='month']//option"));
				Select month = new Select(birthMonth1);
				Thread.sleep(2000);
				month.selectByVisibleText("Apr");
				
				}

				

				
				
				 
	}


