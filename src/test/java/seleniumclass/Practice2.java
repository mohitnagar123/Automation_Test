package seleniumclass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice2 {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("Kota");
		
		List<WebElement> autoSuggestions = driver.findElements(By.xpath("//ul[@role='listbox']//li[@data-entityname=\"Kotak Mahindra Bank\"]"));
		for(int i=0; i<autoSuggestions.size(); i++){
		String expSuggestion = "Kotak Mahindra Bank";
		if(autoSuggestions.get(i).getText().equalsIgnoreCase(expSuggestion)) {
		autoSuggestions.get(i).click();
		}

		}

	}

}
