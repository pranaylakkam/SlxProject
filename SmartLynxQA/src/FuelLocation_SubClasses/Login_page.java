package FuelLocation_SubClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login_page {
	
	private static WebElement Element =null;
	
	public static WebElement txtbx_Username(WebDriver driver) throws Exception{
		
		Element = driver.findElement(By.name("username"));
		Thread.sleep(3000);
		return Element;
		
		
	}
	
	public static WebElement txtbx_Password(WebDriver driver) throws Exception{
		
		Element = driver.findElement(By.name("password"));
		Thread.sleep(3000);
		return Element;
		
	}
	
	public static WebElement btn_Login(WebDriver driver) throws Exception{
		
		Element=driver.findElement(By.name("login"));
		Thread.sleep(3000);
		return Element;
		
	}
	
	

}
