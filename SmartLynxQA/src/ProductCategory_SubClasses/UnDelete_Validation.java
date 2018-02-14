package ProductCategory_SubClasses;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utility.ExcelUtils;

public class UnDelete_Validation {
	

	
	 public static void UnDelete(WebDriver driver) throws Exception{
          String Description =ExcelUtils.getCellData(39, 4);
		  int MaxUserAutoClose = ExcelUtils.getCellDataNum(40, 4);
	      int MaxPMServerAutoClose = ExcelUtils.getCellDataNum(41, 4); 
	
			
 WebElement	createnew = driver.findElement(By.xpath(".//*[@id='btncreate']"));
 
 ExcelUtils.setCellData("Pass", 5, 7); 
 ProductCatagory_ScreenShots.CaptureScreenshot(driver); 
 createnew.click();
 ProductCatagory_ScreenShots.CaptureScreenshot(driver);
 Thread.sleep(5000);
  
  driver.findElement(By.xpath(".//*[@id='BaseProductCategory_Description']")).sendKeys(Description);
  ExcelUtils.setCellData("Pass", 39, 7); 
  ProductCatagory_ScreenShots.CaptureScreenshot(driver);
  
  ProductCatagory_ScreenShots.CaptureScreenshot(driver);
  driver.findElement(By.xpath(".//*[@id='BaseProductCategory_MaxManualAdjustment']"));
  Thread.sleep(2000);
  ProductCatagory_ScreenShots.CaptureScreenshot(driver);
  driver.findElement(By.xpath(".//*[@id='BaseProductCategory_MaxManualAdjustment']")).clear();
  ProductCatagory_ScreenShots.CaptureScreenshot(driver);
 
  driver.findElement(By.xpath(".//*[@id='BaseProductCategory_MaxManualAdjustment']")).sendKeys(String.valueOf(MaxUserAutoClose));
  ExcelUtils.setCellData("Pass", 40, 7); 
  ProductCatagory_ScreenShots.CaptureScreenshot(driver);
  Thread.sleep(2000);
  ProductCatagory_ScreenShots.CaptureScreenshot(driver);
  
 driver.findElement(By.xpath(".//*[@id='BaseProductCategory_MaxProductMovementAutoCloseAdjustment']"));
  ProductCatagory_ScreenShots.CaptureScreenshot(driver);
  Thread.sleep(2000);
  ProductCatagory_ScreenShots.CaptureScreenshot(driver);
  driver.findElement(By.xpath(".//*[@id='BaseProductCategory_MaxProductMovementAutoCloseAdjustment']")).clear();
  ProductCatagory_ScreenShots.CaptureScreenshot(driver);
  
  driver.findElement(By.xpath(".//*[@id='BaseProductCategory_MaxProductMovementAutoCloseAdjustment']")).sendKeys(String.valueOf(MaxPMServerAutoClose));
  ProductCatagory_ScreenShots.CaptureScreenshot(driver);
  ExcelUtils.setCellData("Pass", 41, 7); 
  Thread.sleep(2000);
		  WebElement Save  = driver.findElement(By.xpath(".//*[@id='form0']/div/div/div/div/div/div/div[1]/div/div[2]/button"));
		  ProductCatagory_ScreenShots.CaptureScreenshot(driver);
		  Save.click();
		  ExcelUtils.setCellData("Pass", 42, 7); 
		  ProductCatagory_ScreenShots.CaptureScreenshot(driver);
		  Thread.sleep(2000);
		  
		  
		  WebElement UnDelete = driver.findElement(By.xpath(".//*[@id='form0']/div/div/div/div/div/div/div[2]/div[1]/div/div/p"));
		  
		  if(UnDelete.isDisplayed())
		  {
			  Thread.sleep(3000);
			  ProductCatagory_ScreenShots.CaptureScreenshot(driver);
			  
		      System.out.println(UnDelete.getText());
		  
		  
		      ExcelUtils.setCellData(UnDelete.getText(), 43, 6); 
		      ExcelUtils.setCellData("Pass", 43, 7); 
		  	  ExcelUtils.setCellData("Pass", 44, 7); 
			  ProductCatagory_ScreenShots.CaptureScreenshot(driver);
		  }
		  
		  ProductCatagory_ScreenShots.CaptureScreenshot(driver);
		  WebElement Update = driver.findElement(By.xpath(".//*[@id='form0']/div/div/div/div/div/div/div[1]/div/div[2]/button"));
		  ProductCatagory_ScreenShots.CaptureScreenshot(driver);
		  Update.click();
		  ExcelUtils.setCellData("Pass", 45, 7); 
		Thread.sleep(5000);
		 
		 WebElement UpdatedMessage = driver.findElement(By.xpath(".//*[@id='griddiv']/div/div/form/div/div/div[2]/div[1]/div/div/p"));
		 if(UpdatedMessage.isDisplayed())
		 {ProductCatagory_ScreenShots.CaptureScreenshot(driver);
		 ExcelUtils.setCellData(UpdatedMessage.getText(), 46, 6); 	
		 System.out.println(UpdatedMessage.getText());
		 ExcelUtils.setCellData("Pass", 46, 7); 
		 }
		 
		 
		 
		 Thread.sleep(3000);
		 
			driver.findElement(By.xpath(".//*[@id='txtSearchProductCategoryGrid']")).click();
			
			 String Search =ExcelUtils.getCellData(39, 4);
		   	driver.findElement(By.xpath(".//*[@id='txtSearchProductCategoryGrid']")).sendKeys(Search);
		   	
			Thread.sleep(3000);
			
			
			WebElement Verify = driver.findElement(By.xpath(".//*[@id='ProductCategoryGrid']/div[2]"));
			Verify.getText();
			
			System.out.println(Verify.getText());
			
			
		
			
			if(Verify.getText().isEmpty()){
				System.out.println("Fail ");
		         String Description1 =ExcelUtils.getCellData(39, 4);
				 int MaxUserAutoClose1 = ExcelUtils.getCellDataNum(40, 4);
			        int MaxPMServerAutoClose1 = ExcelUtils.getCellDataNum(41, 4); 
			
					
		 WebElement	createnew1 = driver.findElement(By.xpath(".//*[@id='btncreate']"));
		 
		 ExcelUtils.setCellData("Pass", 5, 7); 
		 ProductCatagory_ScreenShots.CaptureScreenshot(driver); 
		 createnew1.click();
		 ProductCatagory_ScreenShots.CaptureScreenshot(driver);
		  Thread.sleep(5000);
		  
		   driver.findElement(By.xpath(".//*[@id='BaseProductCategory_Description']")).sendKeys(Description1);
		   ExcelUtils.setCellData("Pass", 39, 7); 
		  ProductCatagory_ScreenShots.CaptureScreenshot(driver);
		  
		  ProductCatagory_ScreenShots.CaptureScreenshot(driver);
		  driver.findElement(By.xpath(".//*[@id='BaseProductCategory_MaxManualAdjustment']"));
		  Thread.sleep(2000);
		  ProductCatagory_ScreenShots.CaptureScreenshot(driver);
		  driver.findElement(By.xpath(".//*[@id='BaseProductCategory_MaxManualAdjustment']")).clear();
		  ProductCatagory_ScreenShots.CaptureScreenshot(driver);
		 
		  driver.findElement(By.xpath(".//*[@id='BaseProductCategory_MaxManualAdjustment']")).sendKeys(String.valueOf(MaxUserAutoClose1));
		  ExcelUtils.setCellData("Pass", 40, 7); 
		  ProductCatagory_ScreenShots.CaptureScreenshot(driver);
		  Thread.sleep(2000);
		  ProductCatagory_ScreenShots.CaptureScreenshot(driver);
		  
		 driver.findElement(By.xpath(".//*[@id='BaseProductCategory_MaxProductMovementAutoCloseAdjustment']"));
		  ProductCatagory_ScreenShots.CaptureScreenshot(driver);
		  Thread.sleep(2000);
		  ProductCatagory_ScreenShots.CaptureScreenshot(driver);
		  driver.findElement(By.xpath(".//*[@id='BaseProductCategory_MaxProductMovementAutoCloseAdjustment']")).clear();
		  ProductCatagory_ScreenShots.CaptureScreenshot(driver);
		  
		  driver.findElement(By.xpath(".//*[@id='BaseProductCategory_MaxProductMovementAutoCloseAdjustment']")).sendKeys(String.valueOf(MaxPMServerAutoClose1));
		  ProductCatagory_ScreenShots.CaptureScreenshot(driver);
		  ExcelUtils.setCellData("Pass", 41, 7); 
		  Thread.sleep(2000);
				  WebElement Save1  = driver.findElement(By.xpath(".//*[@id='form0']/div/div/div/div/div/div/div[1]/div/div[2]/button"));
				  ProductCatagory_ScreenShots.CaptureScreenshot(driver);
				  Save1.click();
				  ExcelUtils.setCellData("Pass", 42, 7); 
				  ProductCatagory_ScreenShots.CaptureScreenshot(driver);
				  Thread.sleep(2000);
				  
				  
				  WebElement UnDelete1 = driver.findElement(By.xpath(".//*[@id='form0']/div/div/div/div/div/div/div[2]/div[1]/div/div/p"));
				  
				  if(UnDelete1.isDisplayed())
				  {
					  Thread.sleep(3000);
					  ProductCatagory_ScreenShots.CaptureScreenshot(driver);
					  
				  System.out.println(UnDelete1.getText());
				  
				  
				  ExcelUtils.setCellData(UnDelete1.getText(), 43, 6); 
				  ExcelUtils.setCellData("Pass", 43, 7); 
				  
					  driver.findElement(By.xpath(".//*[@id='BaseProductCategory_IsRecordActive']")).click();
					  
					  
					  
					  
					  
					  
					  ExcelUtils.setCellData("Pass", 44, 7); 
					  ProductCatagory_ScreenShots.CaptureScreenshot(driver);
					  }
				  
				  ProductCatagory_ScreenShots.CaptureScreenshot(driver);
				  WebElement Update1 = driver.findElement(By.xpath(".//*[@id='form0']/div/div/div/div/div/div/div[1]/div/div[2]/button"));
				  ProductCatagory_ScreenShots.CaptureScreenshot(driver);
				  Update1.click();
				  ExcelUtils.setCellData("Pass", 45, 7); 
				Thread.sleep(5000);
				 
				 WebElement UpdatedMessage1 = driver.findElement(By.xpath(".//*[@id='griddiv']/div/div/form/div/div/div[2]/div[1]/div/div/p"));
				 if(UpdatedMessage1.isDisplayed())
				 {ProductCatagory_ScreenShots.CaptureScreenshot(driver);
				 ExcelUtils.setCellData(UpdatedMessage1.getText(), 46, 6); 	
				 System.out.println(UpdatedMessage1.getText());
				 ExcelUtils.setCellData("Pass", 46, 7); 
				 }
				 
				 
				 
				 Thread.sleep(3000);
				 
					driver.findElement(By.xpath(".//*[@id='txtSearchProductCategoryGrid']")).click();
					
					 String Search1 =ExcelUtils.getCellData(39, 4);
				   	driver.findElement(By.xpath(".//*[@id='txtSearchProductCategoryGrid']")).sendKeys(Search1);
				   	
					Thread.sleep(3000);
					
					
					WebElement Verify1 = driver.findElement(By.xpath(".//*[@id='ProductCategoryGrid']/div[2]"));
					Verify1.getText();
					
					System.out.println(Verify1.getText());
					
					
			
					
					if(Verify1.getText().isEmpty()){
						System.out.println("Fail ");
						
						
					}
					else
					{
						System.out.print("working");
					}
				 
				
			}
			
		 
		 
		 
		 
		 
		 
		 
	
	 
	 
	 
	 
	 
	 
	 
	 }
	 }


