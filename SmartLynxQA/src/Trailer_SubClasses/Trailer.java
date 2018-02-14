package Trailer_SubClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import Utility.ExcelUtils;

public class Trailer {
	
	
	 public static void Execute(WebDriver driver) throws Exception{
	

	
			String sUserName = ExcelUtils.getCellData(3, 4);
          	String sPassword = ExcelUtils.getCellData(4, 4 );
   
		  String Number	=ExcelUtils.getCellData(13, 4);
			String WareHouseidDropdownInput = ExcelUtils.getCellData(17, 4);
			int LoadedGrossWeight = ExcelUtils.getCellDataNum(18, 4);
			String Edit_Description = ExcelUtils.getCellData(45, 4);
			int Edit_LoadedGrossWeight = ExcelUtils.getCellDataNum(47, 4);
			
			int EditNumber = ExcelUtils.getCellDataNum(51, 4);
	    	 int EditCapacity = ExcelUtils.getCellDataNum(52, 4);
		 
		 
		 
		 
		
	LogIn_page.txtbx_UserName(driver).sendKeys(sUserName);
	// Password in Login Page

	Trailer_ScreenShots.CaptureScreenshot(driver);
	Thread.sleep(2000);
	LogIn_page.txtbx_Password(driver).sendKeys(sPassword);
	Trailer_ScreenShots.CaptureScreenshot(driver);
	// Login button
	LogIn_page.btn_LogIn(driver).click();  
	  ExcelUtils.setCellData("Pass",5 , 6);
	// search box
	Thread.sleep(3000);
	Trailer_Validation.mouse(driver);
	
	
	Trailer_ScreenShots.CaptureScreenshot(driver);
	
	Thread.sleep(3000);
	//Trailer_Validation.Search(driver).click();
	Trailer_ScreenShots.CaptureScreenshot(driver);

    
	//Trailer_Validation.Search(driver).sendKeys((Search));
	Thread.sleep(3000);
	
	Trailer_Validation.createnew(driver).click();
	Trailer_ScreenShots.CaptureScreenshot(driver);
	Thread.sleep(3000);
	// Error Message Validation
	
	Trailer_Validation.Save(driver).submit();
	Trailer_ScreenShots.CaptureScreenshot(driver);
	
	
	Trailer_Validation.ErrorMessage(driver);
	Trailer_ScreenShots.CaptureScreenshot(driver);
	Thread.sleep(3000);
	
	
	
	
	Trailer_Validation.Number(driver).click();
	Trailer_ScreenShots.CaptureScreenshot(driver);
	// entering the new number the number field in the create trailer
    
    
	Trailer_Validation.Number(driver).sendKeys((Number));

	Trailer_ScreenShots.CaptureScreenshot(driver);


	Thread.sleep(3000);
	// enter the description in the description field in the create  trailer
	Trailer_Validation.Description(driver);
	Trailer_ScreenShots.CaptureScreenshot(driver);
	Trailer_Validation.WareHouseidDropdown(driver).click();
	Thread.sleep(3000);
	Trailer_ScreenShots.CaptureScreenshot(driver);
	
	Trailer_Validation.WareHouseidDropdownInput(driver).click();
	Thread.sleep(5000);
	Trailer_ScreenShots.CaptureScreenshot(driver);
	// Enter the dropdown input in the searchbox of the dropdown field create trailer
	
	Trailer_Validation.WareHouseidDropdownInput(driver).sendKeys(WareHouseidDropdownInput);
	Thread.sleep(5000);
	Trailer_ScreenShots.CaptureScreenshot(driver);
	Trailer_Validation.WareHouseidDropdownInput(driver).sendKeys(Keys.ENTER);
	Thread.sleep(3000);

	Trailer_Validation.LoadedGrossWeight(driver).sendKeys(String.valueOf(LoadedGrossWeight));
	Thread.sleep(3000);
	Trailer_Validation.ManualEntry(driver).click();
	Thread.sleep(3000);


	
	
	
	Trailer_ScreenShots.CaptureScreenshot(driver);
	Trailer_Validation.CompartmentTab(driver).click();
	Thread.sleep(3000);
	Trailer_ScreenShots.CaptureScreenshot(driver);
	Trailer_Validation.CompartmentAdd(driver).click();
	Thread.sleep(3000);
	Trailer_ScreenShots.CaptureScreenshot(driver);
	Trailer_Validation.CompartmentNumber(driver).click();
	Thread.sleep(3000);
	Trailer_ScreenShots.CaptureScreenshot(driver);
	Thread.sleep(3000);
	Trailer_Validation.CompartmentCapacity(driver);
	

	//Trailer_Validation.CompartmentCapacity(driver).sendKeys(Keys.ENTER);
	
	Thread.sleep(3000);
//	Trailer_Validation.CompartmentCapacity(driver).sendKeys("36");
	Trailer_Validation.RegionMapping(driver);
	Thread.sleep(3000);
	Trailer_ScreenShots.CaptureScreenshot(driver);
	//Trailer_Validation.CompartmentCapacity(driver).click();

	// click on the region mapping tab
	Trailer_Validation.RegionMapping(driver).click();
	Trailer_ScreenShots.CaptureScreenshot(driver);
	Thread.sleep(3000);
	//Trailer_Validation.RegionMappingSearchbox(driver).sendKeys("South Carolina");
	Thread.sleep(4000);
	//click region mapping checkbox
	Trailer_Validation.RegionMappingCheckbox(driver).click();
	// save button
	Thread.sleep(4000);
	Trailer_Validation.Save(driver).click();
	Trailer_ScreenShots.CaptureScreenshot(driver);
	Thread.sleep(3000);
	Trailer_Validation.SaveMessage(driver);
	
	// Edit TrailerScreen
	
	Trailer_Validation.SaveMessage(driver);
	Thread.sleep(3000);

//	Trailer_EditScreen.EditSearch(driver).sendKeys(ExcelUtils.getCellData(101, 4));
	
	Thread.sleep(7000);
	Trailer_EditScreen.Edit(driver).click();
	 ExcelUtils.setCellData("Pass",44 , 7);
	Trailer_ScreenShots.CaptureScreenshot(driver);
	Thread.sleep(3000);
	Trailer_EditScreen.Edit_Descritpion(driver).click();
	Thread.sleep(3000);
	  ExcelUtils.setCellData("Pass",45 , 7);
	Trailer_ScreenShots.CaptureScreenshot(driver);
	Trailer_EditScreen.Edit_Descritpion(driver).clear();
	Trailer_ScreenShots.CaptureScreenshot(driver);
	// enter the description in the description field in the create  trailer
	
	
	Trailer_EditScreen.Edit_Descritpion(driver).sendKeys(Edit_Description);
	   Thread.sleep(3000);
	  
	   
	   Trailer_EditScreen.Edit_WareHouseidDropdown(driver).click();
	   Thread.sleep(3000);
	   
		 int ok_size=driver.findElements(By.xpath(".//span[@class='k-list-filter']/input")).size();
  	 Thread.sleep(3000);
  		
  		
       driver.findElements(By.xpath(".//span[@class='k-list-filter']/input")).get(ok_size-1).sendKeys((WareHouseidDropdownInput));
     
  	 Thread.sleep(8000);
       driver.findElements(By.xpath(".//span[@class='k-list-filter']/input")).get(ok_size-1).sendKeys(Keys.ENTER);
  	 Thread.sleep(3000);

	   ExcelUtils.setCellData("Pass",46 , 7);
	 
	   Thread.sleep(3000);
	   
	   Trailer_EditScreen.Edit_LoadedGrossWeight(driver).clear();
	   Thread.sleep(3000);
	Trailer_EditScreen.Edit_LoadedGrossWeight(driver).sendKeys(String.valueOf(Edit_LoadedGrossWeight));
	  ExcelUtils.setCellData("Pass",47 , 7);
	   Thread.sleep(3000);
	Trailer_EditScreen.Edit_ManualEntry(driver).click();
	  ExcelUtils.setCellData("Pass",48 , 7);
	   Thread.sleep(3000);


	// clicking on the compartment tab
	Trailer_ScreenShots.CaptureScreenshot(driver);
	Trailer_EditScreen.Edit_CompartmentTab(driver).click();
	Thread.sleep(5000);
//	Trailer_EditScreen.Edit_Number(driver).click();
	
	
	
	Trailer_EditScreen.Delete(driver).click();
	Thread.sleep(2000);
	Trailer_EditScreen.Deleteok(driver).click();
	Thread.sleep(8000);
	
 
	
	ExcelUtils.setCellData("Pass",49, 7);
	// clicking on the add button
	Trailer_ScreenShots.CaptureScreenshot(driver);
	
	Trailer_EditScreen.Edit_CompartmentAdd(driver).click();
	Thread.sleep(3000);
	  ExcelUtils.setCellData("Pass",50 , 7);
	// clicking on the Edit_number field in compartment tab
	Trailer_ScreenShots.CaptureScreenshot(driver);
	Trailer_EditScreen.Edit_Number(driver).click();
	Thread.sleep(3000);

	Trailer_ScreenShots.CaptureScreenshot(driver);
	Trailer_EditScreen.Edit_Number(driver).clear();

	Thread.sleep(3000);
	Trailer_EditScreen.Edit_Number(driver).sendKeys(String.valueOf((EditNumber)));;
	  ExcelUtils.setCellData("Pass",51 , 7);
	  Trailer_EditScreen.Edit_Number(driver).sendKeys(Keys.TAB);;
		Thread.sleep(3000);
		Trailer_EditScreen.Edit_Capacity(driver).click();
	Trailer_ScreenShots.CaptureScreenshot(driver);
	Thread.sleep(3000);
	Trailer_EditScreen.Edit_Capacity(driver).sendKeys(String.valueOf((EditCapacity)));
	
	  ExcelUtils.setCellData("Pass",52 , 7);
	
	
	
	//int Edit_CapacityNumber = (int) sheet.getRow(1).getCell(11).getNumericCellValue();
	//Trailer_EditScreen.Edit_Number(driver).sendKeys(String.valueOf(Edit_CapacityNumber));
	////
	
	//Trailer_EditScreen.Edit_NumberExist(driver);
	Thread.sleep(5000);
	// clicking on the region tab
	Trailer_ScreenShots.CaptureScreenshot(driver);
	Trailer_EditScreen.Edit_RegionMappingTab(driver).click();
	 ExcelUtils.setCellData("Pass",53 , 7);
	Thread.sleep(5000);
	Trailer_EditScreen. Edit_RegionMappingSearchbox(driver).sendKeys("South Carolina");
	Trailer_ScreenShots.CaptureScreenshot(driver);
	 ExcelUtils.setCellData("Pass",54 , 7);
	// clicking on the checkbox
	Thread.sleep(5000);
	Trailer_EditScreen.Edit_RegionMappingCheckbox(driver).click();
	Trailer_ScreenShots.CaptureScreenshot(driver);
	Thread.sleep(5000);
	 ExcelUtils.setCellData("Pass",55 , 7);
	// clicking on the update button
	Trailer_EditScreen.Update(driver).submit();
	 ExcelUtils.setCellData("Pass",56 , 7);
	Trailer_ScreenShots.CaptureScreenshot(driver);
	Thread.sleep(3000);
	Trailer_EditScreen.UpdateMessage(driver);
	 ExcelUtils.setCellData("Pass",57 , 7);
	Trailer_ScreenShots.CaptureScreenshot(driver);
	// Delete functionlity
	Thread.sleep(5000);
		
	Trailer_ScreenShots.CaptureScreenshot(driver);
	Trailer_Delete.Delete(driver).click();
	Thread.sleep(3000);
	Trailer_Delete.confirmationContent(driver);
	Thread.sleep(3000);
	Trailer_ScreenShots.CaptureScreenshot(driver);
	//Trailer_Delete.Trailerconfirmationok(driver).click();
	Trailer_Delete.Trailerconfirmationcancel(driver).click();
	Thread.sleep(2000);
//	Trailer_Delete.TrailerDeleteMessage(driver);
	Trailer_Delete.Delete(driver).click();
	Trailer_Delete.Trailerconfirmationcancel(driver).click();
	Thread.sleep(3000);
	ExcelUtils.setCellData("Pass",63 , 7);
	Thread.sleep(2000);
	
	

	Trailer_ScreenShots.CaptureScreenshot(driver);
	// existing values
		

	Trailer_Existingvalues.ExistingValues(driver);
	Trailer_ScreenShots.CaptureScreenshot(driver);
	// Undelete 
	Trailer_UnDelete.UnDelete(driver);
	Trailer_ScreenShots.CaptureScreenshot(driver);
	
	 }
	
}
	 