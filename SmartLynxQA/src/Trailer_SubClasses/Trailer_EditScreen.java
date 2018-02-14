package Trailer_SubClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import Utility.ExcelUtils;

public class Trailer_EditScreen {
	
	 private static WebElement Edit = null;
	 private static WebElement Edit_Descritpion = null;
	 private static WebElement Edit_WareHouseidDropdown = null;
	 private static WebElement Edit_WareHouseidDropdownInput = null;
	 private static WebElement Update = null;
	 private static WebElement UpdateMessage = null;
	 private static WebElement Edit_CompartmentTab= null;
	 private static WebElement Edit_CompartmentAdd= null;
	 private static WebElement Edit_Number= null;
	// private static WebElement Edit_NumberExist= null;
	 private static WebElement Edit_RegionMappingTab=null;
	 private static WebElement Edit_RegionMappingCheckbox=null; 
	 private static WebElement Edit_LoadedGrossWeight = null;
	private static WebElement Edit_ManualEntry = null;
	private static WebElement Edit_Capacity = null;
	 private static WebElement EditSearch= null;
	 private static WebElement Edit_RegionMappingSearchbox = null;
	 private static WebElement Delete =null;
	 private static WebElement Deleteok =null;
	 public static WebElement Edit(WebDriver driver) {
			// TODO Auto-generated method stub
			 Edit  = driver.findElement(By.xpath(".//*[@id='TrailerGrid']/div[2]/table/tbody/tr[1]/td[5]/a"));
			   return Edit;
		
			
			
		}
	 
	 public static WebElement EditSearch(WebDriver driver) throws Exception{

      	 EditSearch = driver.findElement(By.xpath(".//*[@id='txtSearchTrailerGrid']"));
      	 ExcelUtils.setCellData("Pass",7 , 7);
      	 
      	 return EditSearch;
      	 
    }
	 
	 
	 
	 public static WebElement Edit_Descritpion( WebDriver driver){
		   Edit_Descritpion  = driver.findElement(By.xpath(".//*[@id='BaseTrailer_Description']"));
		   return Edit_Descritpion;
		   
	   }
	 public static WebElement  Edit_WareHouseidDropdown(WebDriver driver){
			
		 Edit_WareHouseidDropdown = driver.findElement(By.xpath("//div[@id='tabDetails']/div/div/fieldset/fieldset/div[3]/div/span/span/span[2]/span"));
			return  Edit_WareHouseidDropdown;
		}
	 
	 public static WebElement  Edit_WareHouseidDropdownInput(WebDriver driver){
			
		 Edit_WareHouseidDropdownInput = driver.findElement(By.xpath(".//span[@class='k-list-filter']/input"));
			return  Edit_WareHouseidDropdownInput;
		}
	 
	 
	 public static WebElement   Edit_ManualEntry(WebDriver driver){
			
		 Edit_ManualEntry = driver.findElement(By.xpath(".//*[@id='BaseTrailer_ManualEntry']"));
			return   Edit_ManualEntry;
		}
	 
	 
	 
	 public static WebElement  Edit_CompartmentTab(WebDriver driver){
			
		 Edit_CompartmentTab = driver.findElement(By.xpath(".//*[@id='tab13']/div[2]/div/div/nav/ul/li[2]/a"));
		 
		 
			return  Edit_CompartmentTab;
	 }

	 public static WebElement  Edit_CompartmentAdd(WebDriver driver){
			
		 Edit_CompartmentAdd = driver.findElement(By.xpath(".//*[@id='TrailerCompartmentsGrid']/div[1]/a"));
			return Edit_CompartmentAdd;
		}
	 
	 
	 public static WebElement  Edit_Number(WebDriver driver){
			
		 Edit_Number = driver.findElement(By.xpath(".//*[@id='CompartmentNumber']"));
		 
		 return Edit_Number;
			
			
			
		}
	 
	 public static  WebElement  Edit_Capacity(WebDriver driver) throws InterruptedException{
			
		Edit_Capacity =driver.findElement(By.xpath(".//td[2]/input"));
			
		 
		 return Edit_Capacity;
		  
		 	}
	 public static WebElement Edit_RegionMappingTab(WebDriver driver){
			
		 Edit_RegionMappingTab = driver.findElement(By.xpath(".//*[@id='tab13']/div[2]/div/div/nav/ul/li[3]/a"));
			return  Edit_RegionMappingTab;
		}
	 public static WebElement  Edit_RegionMappingSearchbox(WebDriver driver){
			
		 Edit_RegionMappingSearchbox = driver.findElement(By.xpath("//*[@id='RegionTypeAhead']"));
			return   Edit_RegionMappingSearchbox;
		}
	 
	 
	 
	 public static WebElement  Edit_RegionMappingCheckbox(WebDriver driver){
			
		 Edit_RegionMappingCheckbox = driver.findElement(By.xpath("//*[@id='RegionTrailersGrid']/div[2]/table/tbody/tr[1]/td[1]/input"));
			return   Edit_RegionMappingCheckbox;
		}
	 
	  public static WebElement Edit_LoadedGrossWeight(WebDriver driver){
			
		  Edit_LoadedGrossWeight = driver.findElement(By.xpath(".//*[@id='BaseTrailer_LoadedGrossWeight']"));
			
			
			return Edit_LoadedGrossWeight;
		}
	 
	  public static WebElement Delete(WebDriver driver){
			
		 Delete =  driver.findElement(By.xpath(".//a[contains(text(),'Delete')]"));
		
			
			
			return 		 Delete;
		} 
	 
	  public static WebElement Deleteok(WebDriver driver){
			
		 Deleteok=  driver.findElement(By.xpath(".//*[@id='dvDirtyRecordDeleteConfirmation']/div/div/div[1]/div/div[2]/button[2]"));
			

			return 		 Deleteok;
		} 
	 
	  
	  
	  
	  
	 
	 public static WebElement Update(WebDriver driver){
			
		 Update = driver.findElement(By.xpath(".//*[@id='form0']/div/div/div/div/div/div/div[1]/div/div[2]/button"));
			return  Update;
		}
	 
	 public static WebElement UpdateMessage(WebDriver driver) throws Exception{
			
		 UpdateMessage = driver.findElement(By.xpath(".//*[@id='griddiv']/div/div/form/div/div/div[2]/div[1]/div/div/p"));
		 if(UpdateMessage.isDisplayed())
		 {
			 System.out.println(UpdateMessage.getText());
			 
			 ExcelUtils.setCellData(UpdateMessage.getText(),57 , 6);
			 
		 }
		
	 return  UpdateMessage;
	 }
	 
	 
}
