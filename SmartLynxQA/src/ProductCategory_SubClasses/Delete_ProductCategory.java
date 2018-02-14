package ProductCategory_SubClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utility.ExcelUtils;

public class Delete_ProductCategory {

	
	private static WebElement Delete = null;
	private static  WebElement productCategoryconfirmationok =null; 
	private static  WebElement productCategoryconfirmationcancel =null;
	private static WebElement productcategoryDeleteMessage = null;
	
	 public static WebElement Delete(WebDriver driver) throws Exception{

		 Delete = driver.findElement(By.xpath(".//*[@id='ProductCategoryGrid']/div[2]/table/tbody/tr[1]/td[5]/a"));
		 ExcelUtils.setCellData("Pass",24, 7); 
		 return Delete;
		 
		 }
	 
	 
	 public static WebElement productCategoryconfirmationok(WebDriver driver) throws Exception{
	 
				
         		
         // Accepting alert		
		 productCategoryconfirmationok = driver.findElement(By.xpath(".//*[@id='btnConfirmationOK']"));
		 ExcelUtils.setCellData("Pass",33, 7); 
		return productCategoryconfirmationok;
	 
	 }
	 
	 public static WebElement productCategoryconfirmationcancel (WebDriver driver) throws Exception{
		 
			
  		
         // Accepting alert		
		 productCategoryconfirmationcancel = driver.findElement(By.xpath(".//*[@id='dvDeleteConfirmation']/div/div/div[1]/div/div[2]/button[1]"));
		 ExcelUtils.setCellData("Pass",33, 7); 
		return productCategoryconfirmationcancel;
	 
	 }
	 
	 
	 
	 public static WebElement PropductCategoryDeleteMessage(WebDriver driver) throws Exception{
		 
			
	  		
         // Accepting alert		
		 productcategoryDeleteMessage = driver.findElement(By.xpath(".//*[@id='griddiv']/div/div/form/div/div/div[2]/div[1]/div/div/p"));
		 if(productcategoryDeleteMessage.isDisplayed()){
			 ExcelUtils.setCellData("Pass", 28, 7);
			 System.out.println(productcategoryDeleteMessage.getText());
			 ExcelUtils.setCellData(productcategoryDeleteMessage.getText(), 28, 6);
			 
		 }
         
		return productcategoryDeleteMessage;
	 
	 }
	 
	 
	 public static void confirmationContent (WebDriver driver) throws Exception{
		 
			Thread.sleep(2000);
		 String     ExpectedconfirmationText = "Confirmation"; 
		 String     ActualconfirmationText = driver.findElement(By.xpath(".//*[@id='dvDeleteConfirmation']/div/div/div[1]/div/div[1]/h2")).getText();
     
		 if(ExpectedconfirmationText.equals(ActualconfirmationText))
		 { ExcelUtils.setCellData("Pass",25, 7); 
		 ExcelUtils.setCellData(ActualconfirmationText,25, 6); 
		 	System.out.println(ActualconfirmationText);
		 }   
     
		// Thread.sleep(2000);
		 
		 
      // Accepting alert		
		 String     ExpectedconfirmationContent = "Are you sure you want to delete this Product Category?"; 
		 String     ActualconfirmationContent = driver.findElement(By.xpath(".//*[@id='dvDeleteConfirmationContent']")).getText();
     
		 if(ExpectedconfirmationContent.equals(ActualconfirmationContent))
		 {
			 ExcelUtils.setCellData(ActualconfirmationContent,26, 6); 
			 ExcelUtils.setCellData("Pass",26, 7); 
		 	System.out.println(ActualconfirmationContent);
		 }   
		 else
		 {
			 System.out.println(ActualconfirmationContent);
			 
			 
			 
		 }
	 
	 }
	
	
	
}
