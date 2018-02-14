package Product_Subclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Delete_Product {
	private static WebElement Delete = null;
	private static  WebElement confirmationok =null; 
	private static  WebElement confirmationcancel =null;
	
	 public static WebElement Delete(WebDriver driver){

		 Delete = driver.findElement(By.xpath("//*[@id='ProductGrid']/div[2]/table/tbody/tr[1]/td[6]/a"));
		 
		 return Delete;
		 
		 }
	 
	 
	 public static WebElement confirmationok (WebDriver driver){
	 
				
         		
         // Accepting alert		
        confirmationok = driver.findElement(By.xpath(".//*[@id='btnConfirmationOK']"));
         
		return confirmationok;
	 
	 }
	 
	 public static WebElement confirmationcancel (WebDriver driver){
		 
			
  		
         // Accepting alert		
        confirmationcancel = driver.findElement(By.xpath(".//*[@id='dvDeleteConfirmation']/div/div/div[1]/div/div[2]/button[1]"));
         
		return confirmationcancel;
	 
	 }
	 
	 public static void confirmationContent (WebDriver driver) throws InterruptedException{
		 
			Thread.sleep(2000);
		 String     ExpectedconfirmationText = "Confirmation"; 
		 String     ActualconfirmationText = driver.findElement(By.xpath(".//*[@id='dvDeleteConfirmation']/div/div/div[1]/div/div[1]/h2")).getText();
        
		 if(ExpectedconfirmationText.equals(ActualconfirmationText))
		 {
		 	System.out.println(ActualconfirmationText);
		 }   
        
		 Thread.sleep(2000);
		 
		 
         // Accepting alert		
		 String     ExpectedconfirmationContent = "Are you sure you want to delete this Product?"; 
		 String     ActualconfirmationContent = driver.findElement(By.xpath(".//*[@id='dvDeleteConfirmationContent']")).getText();
        
		 if(ExpectedconfirmationContent.equals(ActualconfirmationContent))
		 {
		 	System.out.println(ActualconfirmationContent);
		 }   
        
        
        
        
        
        
        
        
		
	 } 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 

}
