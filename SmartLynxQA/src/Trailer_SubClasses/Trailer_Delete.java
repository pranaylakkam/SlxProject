package Trailer_SubClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utility.ExcelUtils;

public class Trailer_Delete {
	private static WebElement Delete = null;
	private static  WebElement Trailerconfirmationok =null; 
	private static  WebElement Trailerconfirmationcancel =null;
	private static WebElement TrailerDeleteMessage = null;
	
	 public static WebElement Delete(WebDriver driver) throws Exception{

		 Delete = driver.findElement(By.xpath(".//*[@id='TrailerGrid']/div[2]/table/tbody/tr[1]/td[6]/a/i"));
		 
		 ExcelUtils.setCellData("Pass",59 , 7);
		 
		 return Delete;
		 
		 }
	 
	 
	 public static WebElement Trailerconfirmationok(WebDriver driver) throws Exception{
	 
				
         		
         // Accepting alert		
		 Trailerconfirmationok = driver.findElement(By.xpath(".//*[@id='btnConfirmationOK']"));
		 ExcelUtils.setCellData("Pass",61 , 7);
         
		return Trailerconfirmationok;
	 
	 }
	 
	 public static WebElement Trailerconfirmationcancel (WebDriver driver) throws Exception{
		 
			
  		
         // Accepting alert		
		 Trailerconfirmationcancel = driver.findElement(By.xpath(".//*[@id='dvDeleteConfirmation']/div/div/div[1]/div/div[2]/button[1]"));
		 ExcelUtils.setCellData("Pass",64 , 7);
		return Trailerconfirmationcancel;
	 
	 }
	 
	 public static WebElement TrailerDeleteMessage(WebDriver driver) throws Exception{
		 
			
  		
         // Accepting alert		
		 TrailerDeleteMessage = driver.findElement(By.xpath(".//*[@id='griddiv']/div/div/form/div/div/div[2]/div[1]/div/div/p"));
		 if(TrailerDeleteMessage.isDisplayed()){
			 System.out.println("deleted sucessfully");
			 
			 ExcelUtils.setCellData(TrailerDeleteMessage.getText(),62 , 5);
			 ExcelUtils.setCellData("Pass",62 , 7);
				 
		 }
         
		return TrailerDeleteMessage;
	 
	 }
	 
	 public static void confirmationContent (WebDriver driver) throws Exception{
		 
			Thread.sleep(2000);
		 String     ExpectedconfirmationText = "Confirmation"; 
		 String     ActualconfirmationText = driver.findElement(By.xpath(".//*[@id='dvDeleteConfirmation']/div/div/div[1]/div/div[1]/h2")).getText();
  
		 if(ExpectedconfirmationText.equals(ActualconfirmationText))
		 {
		 	System.out.println(ActualconfirmationText);
		 	// ExcelUtils.setCellData(TrailerDeleteMessage.getText(),53 , 6);
		 	 //ExcelUtils.setCellData(TrailerDeleteMessage.getText(),53 , 6);
		 	
		 }   
  
		// Thread.sleep(2000);
		 
		 
   // Accepting alert		
		 String     ExpectedconfirmationContent = ExcelUtils.getCellData(60,5 );
		 String     ActualconfirmationContent = driver.findElement(By.xpath(".//*[@id='dvDeleteConfirmationContent']")).getText();
  
		 if(ExpectedconfirmationContent.equals(ActualconfirmationContent))
		 {
		 	System.out.println(ActualconfirmationContent);
		 	 ExcelUtils.setCellData(ActualconfirmationContent,60 , 6);
		 	 ExcelUtils.setCellData("Pass",60 , 7);
		 }   
		 else
		 {
			 System.out.println(ActualconfirmationContent);
			 
			 
			 
		 }
	 
	 }
	 
	 
	 
	 
	 
	  
	 

}
