package seleniumclass;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.navigate().to("https://www.redbus.in/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@id=\"src\"]")).sendKeys("Kota");

		//auto suggestion
		
		List<WebElement> autoSuggestions = driver.findElements(By.xpath("//ul[@class=\"sc-dnqmqq eFEVtU\"]//li[@class=\"sc-iwsKbI jTMXri cursorPointing\"]"));
		for(int i=0; i<autoSuggestions.size(); i++){
		String expSuggestion = "Kota(Rajasthan)";
		if(autoSuggestions.get(i).getText().equalsIgnoreCase(expSuggestion)) {
		autoSuggestions.get(i).click();
		}

		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//div[@tabindex=\"2\"]")).sendKeys("Indore");
		
		List<WebElement> autoSuggestions1 = driver.findElements(By.xpath("//ul[@class=\"sc-dnqmqq eFEVtU\"] //li[@class=\"sc-iwsKbI jTMXri\"]"));
		for(int i=0; i<autoSuggestions1.size(); i++){
		String expSuggestion = "Vijay Nagar";
		if(autoSuggestions1.get(i).getText().equalsIgnoreCase(expSuggestion)) {
		autoSuggestions1.get(i).click();
		}
		
		}
		
		driver.findElement(By.xpath("//i[@class=\"sc-cSHVUG NyvQv icon icon-datev2\"]")).click();
		
		driver.findElement(By.xpath("//text[@class=\"dateText\"]")).click();
		
	}

}
