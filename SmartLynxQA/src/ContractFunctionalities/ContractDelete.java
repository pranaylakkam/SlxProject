package ContractFunctionalities;


	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;

import Utility.ExcelUtils;

	public class ContractDelete {
		
		private static WebElement Delete = null;
		private static  WebElement Contractconfirmationok =null; 
		private static  WebElement Contractconfirmationcancel =null;
		private static WebElement ContractDeleteMessage = null;
		
		 public static WebElement Delete(WebDriver driver) throws Exception{

			 Delete = driver.findElement(By.xpath(".//*[@id='ContractGrid']/div[2]/table/tbody/tr[1]/td[5]/a"));
			 ExcelUtils.setCellData("Pass", 46, 7);
			 return Delete;
			 
			 }
		 
		 
		 public static WebElement Contractconfirmationok(WebDriver driver) throws Exception{
		 
					
	         		
	         // Accepting alert		
			 Contractconfirmationok = driver.findElement(By.xpath(".//*[@id='btnConfirmationOK']"));
			 ExcelUtils.setCellData("Pass", 48, 7);
			return Contractconfirmationok;
		 
		 }
		 
		 public static WebElement Contractconfirmationcancel (WebDriver driver) throws Exception{
			 
				
	  		
	         // Accepting alert		
			 Contractconfirmationcancel = driver.findElement(By.xpath(".//*[@id='dvDeleteConfirmation']/div/div/div[1]/div/div[2]/button[1]"));
			 ExcelUtils.setCellData("Pass", 61, 7);
			return Contractconfirmationcancel;
		 
		 }
		 
		 public static WebElement ContractDeleteMessage(WebDriver driver) throws Exception{
			 
				
	  		
	         // Accepting alert		
			 ContractDeleteMessage = driver.findElement(By.xpath(".//*[@id='griddiv']/div/div/form/div/div/div[2]/div[1]/div/div/p"));
			 if(ContractDeleteMessage.isDisplayed()){
				 ExcelUtils.setCellData("Pass", 38, 7);
				 System.out.println(ContractDeleteMessage.getText());
				 ExcelUtils.setCellData(ContractDeleteMessage.getText(), 49, 6);
				 
			 }
	         
			return ContractDeleteMessage;
		 
		 }
		 
		 public static void confirmationContent (WebDriver driver) throws Exception{
			 
				Thread.sleep(2000);
			 String     ExpectedconfirmationText = "Confirmation"; 
			 String     ActualconfirmationText = driver.findElement(By.xpath(".//*[@id='dvDeleteConfirmation']/div/div/div[1]/div/div[1]/h2")).getText();
	  
			 if(ExpectedconfirmationText.equals(ActualconfirmationText))
			 {
			 	System.out.println(ActualconfirmationText);
			 	 ExcelUtils.setCellData(ActualconfirmationText, 47, 6);
			 	
			 	ExcelUtils.setCellData("Pass", 47, 7);
			 }   
	  
			 
			// Thread.sleep(2000);
			 
			 
	   // Accepting alert		
			 String     ExpectedconfirmationContent = ExcelUtils.getCellData(48, 5); 
			 String     ActualconfirmationContent = driver.findElement(By.xpath(".//*[@id='dvDeleteConfirmationContent']")).getText();
	  
			 if(ExpectedconfirmationContent.equals(ActualconfirmationContent))
			 {
			 	System.out.println(ActualconfirmationContent);
			 	 ExcelUtils.setCellData(ActualconfirmationContent, 47, 6);
			 	ExcelUtils.setCellData("Pass", 47, 7);
			 }   
			 else
			 {
				 System.out.println(ActualconfirmationContent);
				 
				 
				 
			 }
		 
		 }
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 

}
