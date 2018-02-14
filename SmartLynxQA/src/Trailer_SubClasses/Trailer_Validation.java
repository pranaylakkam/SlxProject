package Trailer_SubClasses;



import javax.swing.plaf.basic.BasicTreeUI.MouseHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Terminal_SubClasses.Terminal_ScreenShots;
import Utility.ExcelUtils;

public class Trailer_Validation {
	 private static MouseHandler mouse= null;
	 private static WebElement Search = null;
	 private static WebElement createnew = null;
	 private static WebElement Number = null;
	 private static WebElement Description = null;
	 private static WebElement WareHouseidDropdown = null;
	 private static WebElement WareHouseidDropdownInput = null;
	 private static WebElement CompartmentAdd = null;
	 private static WebElement CompartmentNumber = null;
	 private static WebElement CompartmentCapacity = null;
	 private static WebElement CompartmentCapacity_Cell = null;
	 private static WebElement CompartmentTab=null;
	 private static WebElement CompartmentDelete=null;
	 private static WebElement RegionMapping = null;
	 private static WebElement Save = null;
	 private static WebElement SaveMessage = null;
	 private static WebElement RegionMappingCheckbox =null;
	 private static WebElement LoadedGrossWeight =null;
	 private static WebElement RegionMappingSearchbox= null;
	 private static WebElement ManualEntry = null;
	  
	 public static MouseHandler mouse (WebDriver driver) throws Exception {
			
		 WebElement Maintenace = driver.findElement(By.xpath("//li[2]/span"));
		
		 Maintenace.click();
		 
		  Terminal_ScreenShots.CaptureScreenshot(driver);
		  
		  int ok_size1=driver.findElements(By.xpath("//li[2]/span")).size();
			 
		Actions action2 = new Actions(driver);
		  
		  Thread.sleep(5000);

		  action2.moveToElement(driver.findElements(By.xpath("//a[contains(text(),'Trailer')]")).get(ok_size1-1)).click();

		  Thread.sleep(5000);
		  
		  driver.findElement(By.xpath("//a[contains(text(),'Trailer')]")).click();
		
	   	 
	   	 return mouse;
	   	  
	    }
	 
	 
	 public static WebElement Search(WebDriver driver) throws Exception{

      	 Search = driver.findElement(By.xpath(".//*[@id='txtSearchTrailerGrid']"));
      	 ExcelUtils.setCellData("Pass",7 , 7);
      	 
      	 return Search;
      	 
    }
	 public static WebElement createnew( WebDriver driver) throws Exception{
	    	
	    	createnew = driver.findElement(By.xpath(".//*[@id='btncreate']"));
	    	 ExcelUtils.setCellData("Pass",8 , 7);
	    	return createnew;
	    	
	    }
	 
	 public static void  ErrorMessage(WebDriver driver ) throws Exception{
		 
		  String ExpectedNumberMessage = ExcelUtils.getCellData(10 , 5);
		  String ActualNumberMessage = driver.findElement(By.xpath(".//*[@id='BaseTrailer_Name-error']")).getText();
		 
		  if(ExpectedNumberMessage.equals(ActualNumberMessage))
		  {
			  System.out.println(ActualNumberMessage);
			  
			  
			  ExcelUtils.setCellData(ActualNumberMessage,10 , 6);
			  ExcelUtils.setCellData("Pass",10 , 7);
			  
			  System.out.print(ExpectedNumberMessage);
		  }
		  else 
		  {
			  ExcelUtils.setCellData(ActualNumberMessage,10 , 6);
			  ExcelUtils.setCellData("Fail",10 , 7);
		  }
		  String ExpectedDescriptionMessage =  ExcelUtils.getCellData(11 , 5);;
		  String ActualDescriptionMessage = driver.findElement(By.xpath(".//*[@id='BaseTrailer_Description-error']")).getText();
		  
		  
		  if(ExpectedDescriptionMessage.equals(ActualDescriptionMessage))
		  {
			  System.out.println(ActualDescriptionMessage);
			  ExcelUtils.setCellData(ActualDescriptionMessage,11 , 6);
			  ExcelUtils.setCellData("Pass",11 , 7);
			  System.out.print(ExpectedDescriptionMessage);
		  }
		  else {
			  ExcelUtils.setCellData(ActualDescriptionMessage,11 , 6);
			  ExcelUtils.setCellData("Fail",11 , 7);
			  
		  }
		  
		  String ExpectedWarehouseIDMessage = "Warehouse ID is required" ;
		  String ActualWarehouseIDMessage = driver.findElement(By.xpath(".//*[@id='BaseTrailer_WarehouseId-error']")).getText();
		  
		  if(ExpectedWarehouseIDMessage.equals(ActualWarehouseIDMessage))
		  {
			  System.out.println(ActualWarehouseIDMessage);
			  ExcelUtils.setCellData(ActualWarehouseIDMessage,12 , 6);
			  ExcelUtils.setCellData("Pass",12 , 7);
		  }
		  else {
			  
			  ExcelUtils.setCellData(ActualWarehouseIDMessage,12 , 6);
			  ExcelUtils.setCellData("Fail",12 , 7);
		  }
		  
		 
	 }
	 
	 public static WebElement Number( WebDriver driver) throws Exception{
	    	
		 
		
		   Number = driver.findElement(By.xpath(".//*[@id='BaseTrailer_Name']"));
		
		   ExcelUtils.setCellData("Pass",13 , 7);
		   return Number;
	    	
	    }
	 
	 
	 
	  public static void Description( WebDriver driver) throws Exception{
	    	
		   Description = driver.findElement(By.xpath(".//*[@id='BaseTrailer_Description']"));
		//   Description = driver.findElement(By.xpath(".//*[@id='BaseProductCategory_Description']"));
		   
		  String Description1 = ExcelUtils.getCellData(14, 4);
		  ExcelUtils.setCellData("Pass",14, 7);
		  String Description2 = ExcelUtils.getCellData(16, 4);
		   Description.sendKeys(Description1);
		   Thread.sleep(3000);
		   Description.sendKeys(Keys.TAB);
		   String ExpectedDescriptionErrorMessage = ExcelUtils.getCellData(15 , 5);
	   	String	ActualDescriptionErrorMessage = driver.findElement(By.xpath(".//*[@id='BaseTrailer_Description-error']")).getText();
	   
	   	if(ExpectedDescriptionErrorMessage.equals(ActualDescriptionErrorMessage))
	   	{
	   		System.out.print(ActualDescriptionErrorMessage);
	   		ExcelUtils.setCellData(ActualDescriptionErrorMessage,15 , 6);
			  ExcelUtils.setCellData("pass",15 , 7);
	   		
	   	}
	   	else{
	   		System.out.print(ActualDescriptionErrorMessage);
	   		
	   		ExcelUtils.setCellData(ActualDescriptionErrorMessage,15 , 6);
			  ExcelUtils.setCellData("Fail",15 , 7);
	   		
	   	}
	   	Thread.sleep(3000);
	    Description.clear();
	    
		   Description.sendKeys(Description2);
		   ExcelUtils.setCellData("Pass",16 , 7);
	   	
	    }
		   
		   

	  public static WebElement WareHouseidDropdown(WebDriver driver){
			
		  WareHouseidDropdown = driver.findElement(By.xpath("//div[@id='tabDetails']/div/div/fieldset/fieldset/div[3]/div/span/span/span[2]/span"));
			
//			WebElement input = driver.findElement(By.xpath(".//*[@id='BaseProduct_DefaultProductCategoryId-list']/span/input"));
			
			return WareHouseidDropdown;
		}

	  public static WebElement WareHouseidDropdownInput(WebDriver driver){
			
		  WareHouseidDropdownInput = driver.findElement(By.xpath(".//input[@class='k-textbox']"));
			
//			WebElement input = driver.findElement(By.xpath(".//*[@id='BaseProduct_DefaultProductCategoryId-list']/span/input"));
			
			return WareHouseidDropdownInput;
		}
	 
	  
	  public static WebElement LoadedGrossWeight(WebDriver driver) throws Exception{
			
		  LoadedGrossWeight = driver.findElement(By.xpath(".//*[@id='BaseTrailer_LoadedGrossWeight']"));
		 
		  ExcelUtils.setCellData("Pass",18 , 7);
			return LoadedGrossWeight;
		}
	  
	  
	  public static WebElement ManualEntry(WebDriver driver) throws Exception{
			
		  ManualEntry = driver.findElement(By.xpath(".//*[@id='BaseTrailer_ManualEntry']"));
		  ExcelUtils.setCellData("Pass",19 , 7);
			
			return ManualEntry;
		}
	  
	  
	 
	  
	  public static WebElement CompartmentTab(WebDriver driver) throws Exception{
			
		  CompartmentTab = driver.findElement(By.xpath(".//*[@id='tab13']/div[2]/div/div/nav/ul/li[2]/a"));
			
		  ExcelUtils.setCellData("Pass",21 , 7);
			return CompartmentTab;
		}
	  
	  
	  
	  
	  public static WebElement CompartmentAdd(WebDriver driver) throws Exception{
			
		  CompartmentAdd = driver.findElement(By.xpath(".//*[@id='TrailerCompartmentsGrid']/div[1]/a"));
			
		  ExcelUtils.setCellData("Pass",22 , 7);
			return CompartmentAdd;
		}
	  
	  public static WebElement CompartmentNumber(WebDriver driver){
			
		  CompartmentNumber = driver.findElement(By.xpath(".//*[@id='CompartmentNumber']"));
			

			
			return CompartmentNumber;
		}
	  

	  
	  public static WebElement CompartmentCapacity_Cell(WebDriver driver){
			
		  CompartmentCapacity_Cell = driver.findElement(By.xpath(".//*[@id='TrailerCompartmentsGrid_active_cell']"));
			

			
			return CompartmentCapacity_Cell;
		}


	  
	  public static WebElement CompartmentCapacity(WebDriver driver) throws Exception{
			
		
		 
		
				int CompartmentNumber	=ExcelUtils.getCellDataNum(23, 4);
		  int Capacity =ExcelUtils.getCellDataNum(24, 4);
		int CompartmentNumber1 = ExcelUtils.getCellDataNum(23, 4);
		int ComapartmentNumber2 = ExcelUtils.getCellDataNum(29, 4);
		int ComapartmentNumber3 =ExcelUtils.getCellDataNum(30, 4);
		int Capacity2 = ExcelUtils.getCellDataNum(31, 4);
		
		
 			Trailer_Validation.CompartmentNumber(driver).sendKeys(String.valueOf(CompartmentNumber));
			Thread.sleep(2000);
			 ExcelUtils.setCellData("Pass",23 , 7);
			Trailer_Validation.CompartmentNumber(driver).sendKeys(Keys.TAB);
			  Thread.sleep(7000);
			 driver.findElement(By.xpath(".//td[2]/input")).sendKeys(String.valueOf(Capacity));;
			  Thread.sleep(7000);
			  ExcelUtils.setCellData("Pass",24 , 7);
			  Trailer_Validation.CompartmentAdd(driver).click();
			  Thread.sleep(2000);
			  ExcelUtils.setCellData("Pass",25 , 7);
			  Trailer_Validation.CompartmentNumber(driver).click();
			  Thread.sleep(2000);
			  ExcelUtils.setCellData("Pass",26 , 7);
			  
			  Trailer_Validation.CompartmentNumber(driver).sendKeys(String.valueOf(CompartmentNumber1));
			  Thread.sleep(2000);
			  ExcelUtils.setCellData("Pass",26 , 7);
			  Trailer_Validation.CompartmentNumber(driver).sendKeys(Keys.TAB);
			  Thread.sleep(2000);
			  WebElement Alertmessage = driver.findElement(By.xpath(".//*[@id='dvAlertContent']")); 
			  Thread.sleep(3000);
			  ExcelUtils.setCellData(Alertmessage.getText(),27 , 6);
			  System.out.println(Alertmessage.getText());
			  Thread.sleep(5000);
			  ExcelUtils.setCellData("Pass",27 , 7);
			  driver.findElement(By.xpath(".//*[@id='btnAlertOK']")).click();
			  Thread.sleep(2000);
			  ExcelUtils.setCellData("Pass",28 , 7);
			  Trailer_Validation.CompartmentNumber(driver).click();
			  Thread.sleep(3000);
			  ExcelUtils.setCellData("Pass",28 , 7);
			  Trailer_Validation.CompartmentNumber(driver).sendKeys(Keys.TAB);
			  Thread.sleep(3000);
			  WebElement ValidationMessage = driver.findElement(By.xpath(".//*[@id='CompartmentNumber_validationMessage']"));
			  System.out.print(ValidationMessage.getText());
			  Thread.sleep(1000);
			  ExcelUtils.setCellData(ValidationMessage.getText(),29, 6);
			  ExcelUtils.setCellData("Pass",29, 7);
		
			  
			  
			  	
			  
			  Trailer_Validation.CompartmentNumber(driver).sendKeys(String.valueOf(ComapartmentNumber2));
			  Thread.sleep(2000);
			   driver.findElement(By.xpath(".//div[@id='TrailerCompartmentsGrid']/div[3]/table/tbody/tr/td[2]")).click();
			  Thread.sleep(5000);
			  ExcelUtils.setCellData("Pass",22 , 7);
			  WebElement ValidationMessage1 = driver.findElement(By.xpath(".//*[@id='CompartmentNumber_validationMessage']"));
			  ExcelUtils.setCellData("Pass",22 , 7);
			  System.out.print(ValidationMessage1.getText());
			  ExcelUtils.setCellData(ValidationMessage1.getText(),30 , 6);
			  ExcelUtils.setCellData("Pass",30 , 7);
			 
			  
			  Trailer_Validation.CompartmentNumber(driver).sendKeys(String.valueOf(ComapartmentNumber3));
			  Thread.sleep(2000);
			  Trailer_Validation.CompartmentNumber(driver).sendKeys(Keys.TAB);
			  driver.findElement(By.xpath(".//td[2]/input")).sendKeys(String.valueOf(Capacity2));;
			  Thread.sleep(5000);
			  ExcelUtils.setCellData("Pass",31 , 7);
			  driver.findElement(By.xpath(".//a[contains(text(),'Delete')]")).click();
			  Thread.sleep(2000);
			  ExcelUtils.setCellData("Pass",32 , 7);
			  WebElement Confirmation = driver.findElement(By.xpath(".//*[@id='dvDirtyRecordDeleteConfirmationContent']"));
			  
			  System.out.println(Confirmation.getText());
			  ExcelUtils.setCellData(Confirmation.getText(),33 , 6);
			  ExcelUtils.setCellData("Pass",33 , 7);
			  driver.findElement(By.xpath(".//*[@id='dvDirtyRecordDeleteConfirmation']/div/div/div[1]/div/div[2]/button[2]")).click();
			  Thread.sleep(2000);
			  ExcelUtils.setCellData("Pass",35 , 7);
			  driver.findElement(By.xpath(".//a[contains(text(),'Delete')]")).click();
			  Thread.sleep(2000);
			  ExcelUtils.setCellData("Pass",36 , 7);
			  driver.findElement(By.xpath(".//*[@id='dvDirtyRecordDeleteConfirmation']/div/div/div[1]/div/div[2]/button[1]")).click();
			  Thread.sleep(3000);
			  ExcelUtils.setCellData("Pass",37 , 7);
	
			return CompartmentCapacity;
		}
	  
	  
	 // CompartmentCapacity(WebDriver driver)
	  
	  public static WebElement CompartmentDelete(WebDriver driver){
			
	//	CompartmentCapacity();
		
		
		
		CompartmentDelete = driver.findElement(By.xpath(".//*[@id='TrailerCompartmentsGrid_active_cell']/a"));
			
		//  int CompartmentNumber = (int) sheet.getRow(1).getCell(7).getNumericCellValue();
		//	Trailer_Validation.CompartmentNumber(driver).sendKeys(String.valueOf(CompartmentNumber));
			
			return CompartmentDelete;
		}  
	  



	public static WebElement RegionMapping(WebDriver driver) throws Exception{
			
		  RegionMapping = driver.findElement(By.xpath(".//*[@id='tab13']/div[2]/div/div/nav/ul/li[3]/a"));
		  ExcelUtils.setCellData("Pass",38 , 7);

			
			return RegionMapping;
		}
	  
	 
	  public static WebElement  RegionMappingSearchbox(WebDriver driver) throws Exception{
			
			 RegionMappingSearchbox = driver.findElement(By.xpath(".//*[@id='txtSearchRegionTrailersGrid']"));
			 ExcelUtils.setCellData("Pass",39 , 7);
				return   RegionMappingSearchbox;
			}
	  
	  
	  
	  public static WebElement RegionMappingCheckbox(WebDriver driver) throws Exception{
			
		  RegionMappingCheckbox = driver.findElement(By.xpath(".//*[@id='RegionTrailersGrid']/div[2]/table/tbody/tr/td[1]/input"));
			
		  ExcelUtils.setCellData("Pass",40 , 7);
			
			return RegionMappingCheckbox;
		}
	  
	  
	  
	  
	  
	  
	  public static WebElement Save(WebDriver driver) throws Exception{
			
		  Save = driver.findElement(By.xpath(".//*[@id='form0']/div/div/div/div/div/div/div[1]/div/div[2]/button"));
		  ExcelUtils.setCellData("Pass",41 , 7);
		  return Save;
		}
	  

	  public static WebElement SaveMessage(WebDriver driver) throws Exception{
			
		
		  SaveMessage = driver.findElement(By.xpath(".//*[@id='griddiv']/div/div/form/div/div/div[2]/div[1]/div/div/p"));
		  System.out.println(SaveMessage.getText());
		  ExcelUtils.setCellData(SaveMessage.getText(),42 , 6);
		  ExcelUtils.setCellData("Pass",42 , 7);
		  
		  return SaveMessage;
			
			
			
		}
	  
	  


	  
	/*  public static WebElement SaveMessage(WebDriver driver){
			
		  SaveMessage = driver.findElement(By.xpath(".//*[@id='griddiv']/div/div/form/div/div/div[2]/div[1]/div/div"));
		  
		  if(SaveMessage.isDisplayed())
		  {
			  System.out.println("sucessfullsave");
		  }
			return SaveMessage;
		}
	 */ 
}
