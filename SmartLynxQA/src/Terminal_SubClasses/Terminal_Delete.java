package Terminal_SubClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Terminal_Delete {
	
	
	private static WebElement Delete = null;
	private static  WebElement Terminalconfirmationok =null; 
	private static  WebElement Terminalconfirmationcancel =null;
	private static WebElement TerminalDeleteMessage = null;
	
	 public static WebElement Delete(WebDriver driver){

		 Delete = driver.findElement(By.xpath("//*[@id='TerminalGrid']/div[2]/table/tbody/tr[1]/td[6]/a"));
		 
		 return Delete;
		 
		 }
	 
	 
	 public static WebElement Terminalconfirmationok(WebDriver driver){
	 
				
         		
         // Accepting alert		
		 Terminalconfirmationok = driver.findElement(By.xpath(".//*[@id='btnConfirmationOK']"));
         
		return Terminalconfirmationok;
	 
	 }
	 
	 public static WebElement Terminalconfirmationcancel (WebDriver driver){
		 
			
  		
         // Accepting alert		
		 Terminalconfirmationcancel = driver.findElement(By.xpath(".//*[@id='dvDeleteConfirmation']/div/div/div[1]/div/div[2]/button[1]"));
         
		return Terminalconfirmationcancel;
	 
	 }
	 
	 public static WebElement TerminalDeleteMessage(WebDriver driver){
		 
			
  		
         // Accepting alert		
		 TerminalDeleteMessage = driver.findElement(By.xpath(".//*[@id='griddiv']/div/div/form/div/div/div[2]/div[1]/div/div/p"));
		 if(TerminalDeleteMessage.isDisplayed()){
			 System.out.println("deleted sucessfully");
		 }
         
		return TerminalDeleteMessage;
	 
	 }
	 
	 public static void confirmationContent (WebDriver driver) throws InterruptedException{
		 
			Thread.sleep(2000);
		 String     ExpectedconfirmationText = "Confirmation"; 
		 String     ActualconfirmationText = driver.findElement(By.xpath(".//*[@id='dvDeleteConfirmation']/div/div/div[1]/div/div[1]/h2")).getText();
  
		 if(ExpectedconfirmationText.equals(ActualconfirmationText))
		 {
		 	System.out.println(ActualconfirmationText);
		 }   
  
		// Thread.sleep(2000);
		 
		 
   // Accepting alert		
		 String     ExpectedconfirmationContent = "Are you sure you want to delete this Terminal?"; 
		 String     ActualconfirmationContent = driver.findElement(By.xpath(".//*[@id='dvDeleteConfirmationContent']")).getText();
  
		 if(ExpectedconfirmationContent.equals(ActualconfirmationContent))
		 {
		 	System.out.println(ActualconfirmationContent);
		 }   
		 else
		 {
			 System.out.println(ActualconfirmationContent);
			 
			 
			 
		 }
	 
	 }
	

}
