package seleniumclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstClass {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver Driver= new ChromeDriver(); 
		
		Driver.get("https://www.google.com/");
		
		Thread.sleep(2000);
		
       Driver.navigate().to("https://www.facebook.com/");
       Thread.sleep(2000);
       
       String Str = Driver.getTitle();
       
       if(Str.equals("Facebook - log in or sign up"))
       {
    	   System.out.println("Pass");
    	   
    	   
       }
       else {
    	   System.out.println("Fail");
       }
	}

}
