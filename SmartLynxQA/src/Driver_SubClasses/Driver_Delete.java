package Driver_SubClasses;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Driver_Delete {
	
	
	private static WebElement Delete = null;
	private static  WebElement Driverconfirmationok =null; 
	private static  WebElement Driverconfirmationcancel =null;
	private static WebElement DriverDeleteMessage = null;
	
	 public static WebElement Delete(WebDriver driver){

		 Delete = driver.findElement(By.xpath(".//*[@id='DriverGrid']/div[2]/table/tbody/tr[1]/td[5]/a"));
		 
		 return Delete;
		 
		 }
	 
	 
	 public static WebElement Driverconfirmationok(WebDriver driver){
	 
				
         		
         // Accepting alert		
		 Driverconfirmationok = driver.findElement(By.xpath(".//*[@id='btnConfirmationOK']"));
         
		return Driverconfirmationok;
	 
	 }
	 
	 public static WebElement Driverconfirmationcancel (WebDriver driver){
		 
			
  		
         // Accepting alert		
		 Driverconfirmationcancel = driver.findElement(By.xpath(".//*[@id='dvDeleteConfirmation']/div/div/div[1]/div/div[2]/button[1]"));
         
		return Driverconfirmationcancel;
	 
	 }
	 
	 public static WebElement DriverDeleteMessage(WebDriver driver){
		 
			
  		
         // Accepting alert		
		 DriverDeleteMessage = driver.findElement(By.xpath(".//*[@id='griddiv']/div/div/form/div/div/div[2]/div[1]/div/div/p"));
		 if(DriverDeleteMessage.isDisplayed()){
			 System.out.println(DriverDeleteMessage.getText());
		 }
         
		return DriverDeleteMessage;
	 
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
		 String     ExpectedconfirmationContent = "Are you sure you want to delete this Driver?"; 
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