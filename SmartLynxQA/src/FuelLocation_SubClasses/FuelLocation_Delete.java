package FuelLocation_SubClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utility.ExcelUtils;

public class FuelLocation_Delete {
	
	private static WebElement Delete = null;
	private static  WebElement confirmationok =null; 
	private static  WebElement confirmationcancel =null;
	private static WebElement FuelLocationDeleteMessage = null;
	

	 public static WebElement Delete(WebDriver driver) throws Exception{

		 Delete = driver.findElement(By.xpath(".//*[@id='FuelingLocationGrid']/div[2]/table/tbody/tr[1]/td[6]/a"));
		 ExcelUtils.setCellData("pass",45, 7);
		 return Delete;
		 
		 }
	 
	 
	 public static WebElement confirmationok (WebDriver driver) throws Exception{
	 
				
        		
        // Accepting alert		
       confirmationok = driver.findElement(By.xpath(".//*[@id='btnConfirmationOK']"));
       ExcelUtils.setCellData("Pass",47, 7);
		return confirmationok;
	 
	 }
	 
	 public static WebElement confirmationcancel (WebDriver driver) throws Exception{
		 
			
 		
        // Accepting alert		
       confirmationcancel = driver.findElement(By.xpath(".//*[@id='dvDeleteConfirmation']/div/div/div[1]/div/div[2]/button[1]"));
       ExcelUtils.setCellData("Pass",50, 7);
		return confirmationcancel;
	 
	 }
	 
	 public static WebElement FuelLocationDeleteMessage(WebDriver driver) throws Exception{
		 
			
	  		
         // Accepting alert		
		 FuelLocationDeleteMessage = driver.findElement(By.xpath(".//*[@id='griddiv']/div/div/form/div/div/div[2]/div[1]/div/div/p"));
		 if(FuelLocationDeleteMessage.isDisplayed()){
			 
			 ExcelUtils.setCellData("Pass",48, 7);
			 ExcelUtils.setCellData(FuelLocationDeleteMessage.getText(),48, 6);
			 System.out.println(FuelLocationDeleteMessage.getText());
		 }
         
		return FuelLocationDeleteMessage;
	 
	 }
	 
	 
	 public static void confirmationContent (WebDriver driver) throws Exception{
		 
			Thread.sleep(2000);
		 String     ExpectedconfirmationText = "Confirmation"; 
		 String     ActualconfirmationText = driver.findElement(By.xpath(".//*[@id='dvDeleteConfirmation']/div/div/div[1]/div/div[1]/h2")).getText();

		 if(ExpectedconfirmationText.equals(ActualconfirmationText))
		 {
		 	System.out.println(ActualconfirmationText);
		 }   

		// Thread.sleep(2000);
		 
		 
// Accepting alert		
		 String     ExpectedconfirmationContent = ExcelUtils.getCellData(46, 5);
		 String     ActualconfirmationContent = driver.findElement(By.xpath(".//*[@id='dvDeleteConfirmationContent']")).getText();

		 if(ExpectedconfirmationContent.equals(ActualconfirmationContent))
		 {
		 	System.out.println(ActualconfirmationContent);
		 	 ExcelUtils.setCellData(ActualconfirmationContent,46, 6);
		 	 ExcelUtils.setCellData("Pass",46, 7);
		 	
		 }   
		 else
		 {
			 System.out.println(ActualconfirmationContent);
			 ExcelUtils.setCellData(ActualconfirmationContent,46, 6);
			 ExcelUtils.setCellData("Fail",46, 7);
			 
			 
		 }
	 }
	 

}
